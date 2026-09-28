package org.apache.commons.csv;

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        boolean boolean8 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withRecordSeparator("Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuotePolicy(quote15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat44.withCommentStart('4');
        java.lang.String str51 = cSVFormat44.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat44.withQuoteChar((java.lang.Character) ',');
        java.lang.Character char54 = cSVFormat53.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '4' + "'", char54 == '4');
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        java.lang.String str18 = cSVFormat6.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withQuoteChar('a');
        boolean boolean21 = cSVFormat6.getIgnoreEmptyLines();
        java.lang.Character char22 = cSVFormat6.getEscape();
        org.apache.commons.csv.Quote quote23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat6.withQuotePolicy(quote23);
        boolean boolean25 = cSVFormat24.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.Quote quote28 = cSVFormat27.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(char22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(quote28);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("#");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar((java.lang.Character) '#');
        char char21 = cSVFormat18.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '#' + "'", char21 == '#');
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentStart((java.lang.Character) 'a');
        boolean boolean9 = cSVFormat1.isCommentingEnabled();
        java.lang.String str10 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray23 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat6.withHeader(strArray23);
        java.lang.Character char26 = cSVFormat25.getQuoteChar();
        boolean boolean27 = cSVFormat25.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat25.withNullString("Delimiter=<a> CommentStart=<4> SkipHeaderRecord:false Header:[]");
        java.lang.Class<?> wildcardClass32 = cSVFormat25.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(char26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        java.lang.Character char7 = cSVFormat1.getCommentStart();
        java.lang.Character char8 = cSVFormat1.getCommentStart();
        java.lang.Character char9 = cSVFormat1.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withDelimiter(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean9 = cSVFormat8.isNullHandling();
        boolean boolean11 = cSVFormat8.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('#');
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withHeader(strArray15);
        java.lang.String[] strArray17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withSkipHeaderRecord(false);
        boolean boolean23 = cSVFormat0.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.Quote quote1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuotePolicy(quote1);
        org.apache.commons.csv.Quote quote3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuotePolicy(quote3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        java.lang.String[] strArray51 = cSVFormat3.getHeader();
        org.apache.commons.csv.Quote quote52 = cSVFormat3.getQuotePolicy();
        java.lang.String str53 = cSVFormat3.toString();
        java.lang.Character char54 = cSVFormat3.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(quote52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str53, "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '\"' + "'", char54 == '\"');
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean15 = cSVFormat14.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean20 = cSVFormat14.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean27 = cSVFormat26.isNullHandling();
        boolean boolean29 = cSVFormat26.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withDelimiter('#');
        org.apache.commons.csv.Quote quote32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuotePolicy(quote32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        java.lang.String str44 = cSVFormat31.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat22.withHeader(strArray42);
        boolean boolean46 = cSVFormat14.equals((java.lang.Object) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean49 = cSVFormat48.isNullHandling();
        boolean boolean51 = cSVFormat48.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withDelimiter('#');
        org.apache.commons.csv.Quote quote54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withQuotePolicy(quote54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withRecordSeparator("");
        java.lang.Character char58 = cSVFormat57.getQuoteChar();
        java.lang.String str59 = cSVFormat57.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean62 = cSVFormat61.isNullHandling();
        boolean boolean64 = cSVFormat61.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat61.withDelimiter('#');
        org.apache.commons.csv.Quote quote67 = null;
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withQuotePolicy(quote67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean71 = cSVFormat70.isNullHandling();
        boolean boolean73 = cSVFormat70.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat70.withDelimiter('#');
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat75.withHeader(strArray77);
        java.lang.String str79 = cSVFormat66.format((java.lang.Object[]) strArray77);
        java.lang.String str80 = cSVFormat57.format((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat14.withHeader(strArray77);
        boolean boolean82 = cSVFormat10.equals((java.lang.Object) cSVFormat81);
        boolean boolean83 = cSVFormat10.isEscaping();
        java.lang.Character char84 = cSVFormat10.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat10.withIgnoreEmptyLines(true);
        java.lang.String str87 = cSVFormat86.toString();
        java.lang.Character char88 = cSVFormat86.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNull(char58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(char84);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false" + "'", str87, "Delimiter=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNull(char88);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withSkipHeaderRecord(false);
        java.lang.Class<?> wildcardClass18 = cSVFormat17.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('\t');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withCommentStart(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuotePolicy(quote2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape('4');
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        org.apache.commons.csv.Quote quote8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuotePolicy(quote8);
        cSVFormat6.validate();
        char char11 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withSkipHeaderRecord(false);
        java.lang.String str14 = cSVFormat6.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\t' + "'", char11 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<\t> Escape=<#> QuoteChar=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str14, "Delimiter=<\t> Escape=<#> QuoteChar=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator("Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withCommentStart('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        java.lang.Character char11 = cSVFormat10.getQuoteChar();
        java.lang.String str12 = cSVFormat10.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withCommentStart((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat14.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean16 = cSVFormat13.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter('#');
        org.apache.commons.csv.Quote quote19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuotePolicy(quote19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withHeader(strArray29);
        java.lang.String str31 = cSVFormat18.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat9.withHeader(strArray29);
        boolean boolean33 = cSVFormat1.equals((java.lang.Object) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        org.apache.commons.csv.Quote quote41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuotePolicy(quote41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean45 = cSVFormat44.isNullHandling();
        boolean boolean47 = cSVFormat44.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withDelimiter('#');
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withHeader(strArray51);
        java.lang.String str53 = cSVFormat40.format((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat1.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat1.withSkipHeaderRecord(true);
        java.lang.String str57 = cSVFormat1.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        boolean boolean7 = cSVFormat6.isCommentingEnabled();
        char char8 = cSVFormat6.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        boolean boolean11 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean14 = cSVFormat13.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withNullString("hi!");
        boolean boolean17 = cSVFormat13.isCommentingEnabled();
        boolean boolean18 = cSVFormat13.getSkipHeaderRecord();
        boolean boolean19 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        boolean boolean24 = cSVFormat21.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('#');
        org.apache.commons.csv.Quote quote27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuotePolicy(quote27);
        org.apache.commons.csv.Quote quote29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withQuotePolicy(quote29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean33 = cSVFormat32.isNullHandling();
        boolean boolean35 = cSVFormat32.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withDelimiter('#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withHeader(strArray39);
        boolean boolean41 = cSVFormat37.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat37.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray46 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat43.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat30.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat13.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat6.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        boolean boolean8 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteChar((java.lang.Character) 'a');
        boolean boolean15 = cSVFormat14.isNullHandling();
        java.lang.String[] strArray16 = cSVFormat14.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        java.lang.String str10 = cSVFormat9.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withDelimiter('4');
        java.lang.String str17 = cSVFormat16.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean19 = cSVFormat18.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        boolean boolean24 = cSVFormat21.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('#');
        java.lang.Character char27 = cSVFormat26.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(false);
        boolean boolean30 = cSVFormat29.isEscaping();
        org.apache.commons.csv.Quote quote31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuotePolicy(quote31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean37 = cSVFormat36.isNullHandling();
        boolean boolean39 = cSVFormat36.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat36.withDelimiter('#');
        org.apache.commons.csv.Quote quote42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withQuotePolicy(quote42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean46 = cSVFormat45.isNullHandling();
        boolean boolean48 = cSVFormat45.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withDelimiter('#');
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withHeader(strArray52);
        java.lang.String str54 = cSVFormat41.format((java.lang.Object[]) strArray52);
        java.lang.String str55 = cSVFormat34.format((java.lang.Object[]) strArray52);
        java.lang.String str56 = cSVFormat18.format((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat16.withHeader(strArray52);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(char27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"\"" + "'", str56, "\"\"");
        org.junit.Assert.assertNotNull(cSVFormat57);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("#");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean7 = cSVFormat6.isNullHandling();
        boolean boolean9 = cSVFormat6.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter('#');
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray13);
        boolean boolean16 = cSVFormat15.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withIgnoreSurroundingSpaces(false);
        char char24 = cSVFormat23.getDelimiter();
        org.apache.commons.csv.Quote quote25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withQuotePolicy(quote25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator('#');
        java.lang.Character char32 = cSVFormat31.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean35 = cSVFormat34.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean40 = cSVFormat34.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean43 = cSVFormat42.isNullHandling();
        boolean boolean45 = cSVFormat42.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withDelimiter('#');
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withHeader(strArray49);
        boolean boolean51 = cSVFormat47.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat47.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean56 = cSVFormat55.isNullHandling();
        boolean boolean58 = cSVFormat55.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withDelimiter('#');
        org.apache.commons.csv.Quote quote61 = null;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withQuotePolicy(quote61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean65 = cSVFormat64.isNullHandling();
        boolean boolean67 = cSVFormat64.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat64.withDelimiter('#');
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat69.withHeader(strArray71);
        java.lang.String str73 = cSVFormat60.format((java.lang.Object[]) strArray71);
        java.lang.String str74 = cSVFormat47.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat34.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat31.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat78 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean79 = cSVFormat78.isNullHandling();
        boolean boolean81 = cSVFormat78.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat78.withDelimiter('#');
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat83.withHeader(strArray85);
        java.lang.String str87 = cSVFormat31.format((java.lang.Object[]) strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat28.withHeader(strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat15.withHeader(strArray85);
        boolean boolean90 = cSVFormat15.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + 'a' + "'", char24 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNull(char32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "\"\"#" + "'", str87, "\"\"#");
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        boolean boolean4 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char5 = cSVFormat0.getEscape();
        boolean boolean6 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuoteChar('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(false);
        boolean boolean11 = cSVFormat10.isNullHandling();
        boolean boolean12 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart('\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentStart((java.lang.Character) '#');
        boolean boolean7 = cSVFormat6.isEscaping();
        org.apache.commons.csv.Quote quote8 = cSVFormat6.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentStart('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(quote8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar('4');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentStart('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<a> CommentStart=<#> RecordSeparator=< > SkipHeaderRecord:false" + "'", str8, "Delimiter=<a> CommentStart=<#> RecordSeparator=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        java.lang.Character char7 = cSVFormat1.getCommentStart();
        java.lang.Character char8 = cSVFormat1.getCommentStart();
        java.lang.Character char9 = cSVFormat1.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withCommentStart((java.lang.Character) '\"');
        boolean boolean12 = cSVFormat11.isNullHandling();
        boolean boolean13 = cSVFormat11.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withEscape('#');
        java.lang.String[] strArray21 = cSVFormat18.getHeader();
        boolean boolean22 = cSVFormat18.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart('4');
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean7 = cSVFormat6.isNullHandling();
        boolean boolean9 = cSVFormat6.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter('#');
        boolean boolean12 = cSVFormat6.isCommentingEnabled();
        boolean boolean13 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withCommentStart(' ');
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        java.lang.String str17 = cSVFormat15.format(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat15.withRecordSeparator("#");
        java.lang.String str22 = cSVFormat21.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        char char30 = cSVFormat29.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean33 = cSVFormat32.isNullHandling();
        boolean boolean35 = cSVFormat32.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withDelimiter('#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withHeader(strArray39);
        java.lang.String str41 = cSVFormat29.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat21.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat3.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat3.withRecordSeparator("Delimiter=<a> CommentStart=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#" + "'", str22, "#");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '#' + "'", char30 == '#');
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        boolean boolean11 = cSVFormat6.isCommentingEnabled();
        boolean boolean12 = cSVFormat6.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('\"');
        boolean boolean19 = cSVFormat16.isQuoting();
        char char20 = cSVFormat16.getDelimiter();
        boolean boolean21 = cSVFormat16.isEscaping();
        cSVFormat16.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '#' + "'", char20 == '#');
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        java.lang.String str4 = cSVFormat3.getRecordSeparator();
        java.lang.String str5 = cSVFormat3.getRecordSeparator();
        org.apache.commons.csv.Quote quote6 = cSVFormat3.getQuotePolicy();
        boolean boolean7 = cSVFormat3.isQuoting();
        java.lang.String str8 = cSVFormat3.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean14 = cSVFormat13.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withEscape('a');
        boolean boolean17 = cSVFormat13.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        boolean boolean24 = cSVFormat21.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('#');
        java.lang.Character char27 = cSVFormat26.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean38 = cSVFormat37.isNullHandling();
        boolean boolean40 = cSVFormat37.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withDelimiter('#');
        org.apache.commons.csv.Quote quote43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuotePolicy(quote43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean47 = cSVFormat46.isNullHandling();
        boolean boolean49 = cSVFormat46.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withDelimiter('#');
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withHeader(strArray53);
        java.lang.String str55 = cSVFormat42.format((java.lang.Object[]) strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat33.withHeader(strArray53);
        java.lang.String str57 = cSVFormat26.format((java.lang.Object[]) strArray53);
        java.lang.String str58 = cSVFormat13.format((java.lang.Object[]) strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat13.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat13.withQuoteChar((java.lang.Character) 'a');
        java.lang.Class<?> wildcardClass63 = cSVFormat62.getClass();
        boolean boolean64 = cSVFormat12.equals((java.lang.Object) wildcardClass63);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\n" + "'", str4, "\r\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertNull(quote6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\r\n" + "'", str8, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(char27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"\"" + "'", str58, "\"\"");
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuotePolicy(quote13);
        java.lang.Character char15 = cSVFormat10.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withQuoteChar('4');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + ' ' + "'", char15 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withCommentStart((java.lang.Character) 'a');
        boolean boolean12 = cSVFormat1.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String str8 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape((java.lang.Character) '4');
        boolean boolean15 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuoteChar('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<a> CommentStart=<#> RecordSeparator=< > SkipHeaderRecord:false" + "'", str8, "Delimiter=<a> CommentStart=<#> RecordSeparator=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean16 = cSVFormat13.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter('#');
        org.apache.commons.csv.Quote quote19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuotePolicy(quote19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withHeader(strArray29);
        java.lang.String str31 = cSVFormat18.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat9.withHeader(strArray29);
        boolean boolean33 = cSVFormat1.equals((java.lang.Object) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        org.apache.commons.csv.Quote quote41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuotePolicy(quote41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator("");
        java.lang.Character char45 = cSVFormat44.getQuoteChar();
        java.lang.String str46 = cSVFormat44.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean49 = cSVFormat48.isNullHandling();
        boolean boolean51 = cSVFormat48.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withDelimiter('#');
        org.apache.commons.csv.Quote quote54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withQuotePolicy(quote54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean58 = cSVFormat57.isNullHandling();
        boolean boolean60 = cSVFormat57.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withDelimiter('#');
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat62.withHeader(strArray64);
        java.lang.String str66 = cSVFormat53.format((java.lang.Object[]) strArray64);
        java.lang.String str67 = cSVFormat44.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat1.withHeader(strArray64);
        java.lang.Character char69 = cSVFormat68.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat68.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat68.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.Quote quote74 = null;
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withQuotePolicy(quote74);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat77.withRecordSeparator('\t');
        org.apache.commons.csv.CSVFormat cSVFormat80 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat80.withRecordSeparator('#');
        java.lang.Character char83 = cSVFormat82.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat82.withQuoteChar((java.lang.Character) '#');
        java.lang.Character char86 = cSVFormat85.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat88 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat88.withQuoteChar((java.lang.Character) '4');
        cSVFormat88.validate();
        java.lang.String[] strArray96 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat97 = cSVFormat88.withHeader(strArray96);
        org.apache.commons.csv.CSVFormat cSVFormat98 = cSVFormat85.withHeader(strArray96);
        java.lang.String str99 = cSVFormat77.format((java.lang.Object[]) strArray96);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(char45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNull(char69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNull(char83);
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertTrue("'" + char86 + "' != '" + '#' + "'", char86 == '#');
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat97);
        org.junit.Assert.assertNotNull(cSVFormat98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "\"\"#aDelimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:falseaaaahi!" + "'", str99, "\"\"#aDelimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:falseaaaahi!");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentStart((java.lang.Character) 'a');
        boolean boolean9 = cSVFormat8.isNullHandling();
        java.lang.String str10 = cSVFormat8.toString();
        char char11 = cSVFormat8.getDelimiter();
        boolean boolean12 = cSVFormat8.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<a> CommentStart=<a> SkipHeaderRecord:false" + "'", str10, "Delimiter=<a> CommentStart=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'a' + "'", char11 == 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.Character char3 = cSVFormat2.getEscape();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(true);
        java.lang.Character char11 = cSVFormat8.getEscape();
        boolean boolean12 = cSVFormat8.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withRecordSeparator("\r\n");
        boolean boolean13 = cSVFormat12.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart(' ');
        java.lang.String str20 = cSVFormat17.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withEscape((java.lang.Character) '\"');
        boolean boolean23 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat17.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat17.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withEscape('a');
        java.lang.Character char30 = cSVFormat29.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator('#');
        java.lang.Character char34 = cSVFormat33.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withNullString("Delimiter=<\t> QuoteChar=<\"> CommentStart=<#> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean43 = cSVFormat40.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean46 = cSVFormat45.isNullHandling();
        boolean boolean48 = cSVFormat45.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withDelimiter('#');
        org.apache.commons.csv.Quote quote51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuotePolicy(quote51);
        org.apache.commons.csv.Quote quote53 = null;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withQuotePolicy(quote53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean57 = cSVFormat56.isNullHandling();
        boolean boolean59 = cSVFormat56.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withDelimiter('#');
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withHeader(strArray63);
        boolean boolean65 = cSVFormat61.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray70 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat67.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat54.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat40.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat29.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat12.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat12.withCommentStart('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\r\n" + "'", str20, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        java.lang.String str18 = cSVFormat6.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat6.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart((java.lang.Character) '\t');
        char char25 = cSVFormat24.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + '#' + "'", char25 == '#');
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withEscape((java.lang.Character) '#');
        java.lang.Character char21 = cSVFormat12.getCommentStart();
        boolean boolean22 = cSVFormat12.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat12.withQuoteChar((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        java.lang.Character char11 = cSVFormat10.getQuoteChar();
        java.lang.String str12 = cSVFormat10.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean15 = cSVFormat14.isNullHandling();
        boolean boolean17 = cSVFormat14.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter('#');
        org.apache.commons.csv.Quote quote20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuotePolicy(quote20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean24 = cSVFormat23.isNullHandling();
        boolean boolean26 = cSVFormat23.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withDelimiter('#');
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withHeader(strArray30);
        java.lang.String str32 = cSVFormat19.format((java.lang.Object[]) strArray30);
        java.lang.String str33 = cSVFormat10.format((java.lang.Object[]) strArray30);
        org.apache.commons.csv.Quote quote34 = cSVFormat10.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat10.withSkipHeaderRecord(true);
        boolean boolean37 = cSVFormat36.isCommentingEnabled();
        java.lang.String[] strArray38 = cSVFormat36.getHeader();
        java.lang.String str39 = cSVFormat36.toString();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat36.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(quote34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Delimiter=<#> RecordSeparator=<> SkipHeaderRecord:true" + "'", str39, "Delimiter=<#> RecordSeparator=<> SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar('a');
        java.lang.String str19 = cSVFormat16.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        boolean boolean10 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean15 = cSVFormat14.isNullHandling();
        boolean boolean17 = cSVFormat14.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter('#');
        java.lang.Character char20 = cSVFormat19.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('4');
        java.lang.String str27 = cSVFormat26.getNullString();
        boolean boolean28 = cSVFormat1.equals((java.lang.Object) cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(char20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("#");
        char char6 = cSVFormat3.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean16 = cSVFormat13.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter('#');
        org.apache.commons.csv.Quote quote19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuotePolicy(quote19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withHeader(strArray29);
        java.lang.String str31 = cSVFormat18.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat9.withHeader(strArray29);
        boolean boolean33 = cSVFormat1.equals((java.lang.Object) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        org.apache.commons.csv.Quote quote41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuotePolicy(quote41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator("");
        java.lang.Character char45 = cSVFormat44.getQuoteChar();
        java.lang.String str46 = cSVFormat44.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean49 = cSVFormat48.isNullHandling();
        boolean boolean51 = cSVFormat48.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withDelimiter('#');
        org.apache.commons.csv.Quote quote54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withQuotePolicy(quote54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean58 = cSVFormat57.isNullHandling();
        boolean boolean60 = cSVFormat57.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withDelimiter('#');
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat62.withHeader(strArray64);
        java.lang.String str66 = cSVFormat53.format((java.lang.Object[]) strArray64);
        java.lang.String str67 = cSVFormat44.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat1.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat68.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat70.withCommentStart('\t');
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat70.withRecordSeparator("Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]");
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat70.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat78.withCommentStart('\"');
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat82.withCommentStart((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(char45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat84);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.isCommentingEnabled();
        java.lang.String str6 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str6, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(',');
        java.lang.String str12 = cSVFormat11.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withDelimiter('a');
        boolean boolean15 = cSVFormat11.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        boolean boolean23 = cSVFormat17.isCommentingEnabled();
        boolean boolean24 = cSVFormat17.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withCommentStart(' ');
        boolean boolean27 = cSVFormat17.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat17.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean34 = cSVFormat33.isNullHandling();
        boolean boolean36 = cSVFormat33.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withDelimiter('#');
        org.apache.commons.csv.Quote quote39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuotePolicy(quote39);
        org.apache.commons.csv.Quote quote41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withQuotePolicy(quote41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean45 = cSVFormat44.isNullHandling();
        boolean boolean47 = cSVFormat44.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withDelimiter('#');
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withHeader(strArray51);
        boolean boolean53 = cSVFormat49.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray58 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat55.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat42.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat17.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat11.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat11.withIgnoreEmptyLines(false);
        boolean boolean65 = cSVFormat64.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.String str12 = cSVFormat10.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        java.lang.Character char11 = cSVFormat10.getQuoteChar();
        java.lang.String[] strArray12 = cSVFormat10.getHeader();
        char char13 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.Quote quote14 = cSVFormat10.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
        org.junit.Assert.assertNull(quote14);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuotePolicy(quote7);
        boolean boolean9 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withDelimiter('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean13 = cSVFormat12.isNullHandling();
        boolean boolean15 = cSVFormat12.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('#');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeader(strArray19);
        boolean boolean21 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean26 = cSVFormat25.isNullHandling();
        boolean boolean28 = cSVFormat25.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withDelimiter('#');
        org.apache.commons.csv.Quote quote31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withQuotePolicy(quote31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean35 = cSVFormat34.isNullHandling();
        boolean boolean37 = cSVFormat34.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withDelimiter('#');
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withHeader(strArray41);
        java.lang.String str43 = cSVFormat30.format((java.lang.Object[]) strArray41);
        java.lang.String str44 = cSVFormat17.format((java.lang.Object[]) strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat8.withHeader(strArray41);
        java.lang.String str46 = cSVFormat45.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuoteChar((java.lang.Character) '4');
        cSVFormat50.validate();
        java.lang.String[] strArray58 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat50.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat45.withHeader(strArray58);
        boolean boolean61 = cSVFormat60.getIgnoreEmptyLines();
        boolean boolean62 = cSVFormat60.isCommentingEnabled();
        java.lang.Character char63 = cSVFormat60.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(char63);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean7 = cSVFormat4.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator('#');
        java.lang.Character char23 = cSVFormat22.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withQuoteChar((java.lang.Character) '#');
        java.lang.Character char26 = cSVFormat25.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuoteChar((java.lang.Character) '4');
        cSVFormat28.validate();
        java.lang.String[] strArray36 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat25.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat15.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat15.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart(' ');
        java.lang.String str45 = cSVFormat42.toString();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean48 = cSVFormat47.isNullHandling();
        boolean boolean50 = cSVFormat47.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withDelimiter('#');
        org.apache.commons.csv.Quote quote53 = null;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuotePolicy(quote53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean59 = cSVFormat58.isNullHandling();
        boolean boolean61 = cSVFormat58.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat58.withDelimiter('#');
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat63.withHeader(strArray65);
        boolean boolean67 = cSVFormat63.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat63.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean72 = cSVFormat71.isNullHandling();
        boolean boolean74 = cSVFormat71.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat71.withDelimiter('#');
        org.apache.commons.csv.Quote quote77 = null;
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withQuotePolicy(quote77);
        org.apache.commons.csv.CSVFormat cSVFormat80 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean81 = cSVFormat80.isNullHandling();
        boolean boolean83 = cSVFormat80.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat80.withDelimiter('#');
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat85.withHeader(strArray87);
        java.lang.String str89 = cSVFormat76.format((java.lang.Object[]) strArray87);
        java.lang.String str90 = cSVFormat63.format((java.lang.Object[]) strArray87);
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat54.withHeader(strArray87);
        java.lang.String str92 = cSVFormat42.format((java.lang.Object[]) strArray87);
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat41.withHeader(strArray87);
        boolean boolean94 = cSVFormat93.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '#' + "'", char26 == '#');
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str45, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(cSVFormat91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "\"\"" + "'", str92, "\"\"");
        org.junit.Assert.assertNotNull(cSVFormat93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        java.lang.Character char11 = cSVFormat10.getQuoteChar();
        java.lang.String str12 = cSVFormat10.getRecordSeparator();
        boolean boolean13 = cSVFormat10.getIgnoreEmptyLines();
        java.lang.Character char14 = cSVFormat10.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withNullString("Delimiter=<\t> QuoteChar=<\"> CommentStart=<#> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withDelimiter('#');
        boolean boolean21 = cSVFormat18.isCommentingEnabled();
        boolean boolean22 = cSVFormat18.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat18.withCommentStart((java.lang.Character) ' ');
        java.lang.String str25 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat18.withNullString("Delimiter=<#> CommentStart=<\t> SkipHeaderRecord:false");
        cSVFormat18.validate();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean30 = cSVFormat29.isQuoting();
        boolean boolean31 = cSVFormat29.getSkipHeaderRecord();
        boolean boolean32 = cSVFormat29.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean35 = cSVFormat34.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean42 = cSVFormat41.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean47 = cSVFormat41.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean50 = cSVFormat49.isNullHandling();
        boolean boolean52 = cSVFormat49.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withDelimiter('#');
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withHeader(strArray56);
        boolean boolean58 = cSVFormat54.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat54.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean63 = cSVFormat62.isNullHandling();
        boolean boolean65 = cSVFormat62.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat62.withDelimiter('#');
        org.apache.commons.csv.Quote quote68 = null;
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withQuotePolicy(quote68);
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean72 = cSVFormat71.isNullHandling();
        boolean boolean74 = cSVFormat71.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat71.withDelimiter('#');
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat76.withHeader(strArray78);
        java.lang.String str80 = cSVFormat67.format((java.lang.Object[]) strArray78);
        java.lang.String str81 = cSVFormat54.format((java.lang.Object[]) strArray78);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat41.withHeader(strArray78);
        java.lang.String str83 = cSVFormat34.format((java.lang.Object[]) strArray78);
        java.lang.String str84 = cSVFormat29.format((java.lang.Object[]) strArray78);
        java.lang.String str85 = cSVFormat18.format((java.lang.Object[]) strArray78);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Delimiter=<#> Escape=<a> RecordSeparator=<> SkipHeaderRecord:false" + "'", str25, "Delimiter=<#> Escape=<a> RecordSeparator=<> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\"\"" + "'", str84, "\"\"");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.isEscaping();
        java.lang.String str6 = cSVFormat1.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote11 = cSVFormat6.getQuotePolicy();
        java.lang.String str12 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator('#');
        java.lang.Character char18 = cSVFormat15.getCommentStart();
        boolean boolean19 = cSVFormat6.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.Quote quote20 = cSVFormat6.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(quote20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean9 = cSVFormat8.isNullHandling();
        boolean boolean11 = cSVFormat8.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('#');
        java.lang.Character char14 = cSVFormat13.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean34 = cSVFormat33.isNullHandling();
        boolean boolean36 = cSVFormat33.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withDelimiter('#');
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withHeader(strArray40);
        java.lang.String str42 = cSVFormat29.format((java.lang.Object[]) strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat20.withHeader(strArray40);
        java.lang.String str44 = cSVFormat13.format((java.lang.Object[]) strArray40);
        java.lang.String str45 = cSVFormat0.format((java.lang.Object[]) strArray40);
        boolean boolean46 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean50 = cSVFormat49.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withEscape('a');
        boolean boolean53 = cSVFormat49.isCommentingEnabled();
        boolean boolean54 = cSVFormat49.isEscaping();
        boolean boolean55 = cSVFormat48.equals((java.lang.Object) boolean54);
        java.lang.String str56 = cSVFormat48.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat48.withRecordSeparator("Delimiter=<a> SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat48.withCommentStart((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat3.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean57 = cSVFormat56.isNullHandling();
        boolean boolean59 = cSVFormat56.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withDelimiter('#');
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withHeader(strArray63);
        boolean boolean65 = cSVFormat61.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote66 = cSVFormat61.getQuotePolicy();
        java.lang.String str67 = cSVFormat61.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withCommentStart('4');
        java.lang.Character char70 = cSVFormat61.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat61.withIgnoreEmptyLines(true);
        boolean boolean73 = cSVFormat54.equals((java.lang.Object) cSVFormat72);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat54.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat54.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat54.withDelimiter(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(quote66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNull(char70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentStart((java.lang.Character) '4');
        java.lang.String str21 = cSVFormat20.toString();
        boolean boolean22 = cSVFormat20.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withEscape((java.lang.Character) '4');
        java.lang.Character char25 = cSVFormat20.getQuoteChar();
        java.lang.Class<?> wildcardClass26 = cSVFormat20.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Delimiter=<#> Escape=< > QuoteChar=<a> CommentStart=<4> SkipHeaderRecord:false" + "'", str21, "Delimiter=<#> Escape=< > QuoteChar=<a> CommentStart=<4> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'a' + "'", char25 == 'a');
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean10 = cSVFormat9.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withRecordSeparator('a');
        java.lang.Character char19 = cSVFormat18.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withQuoteChar((java.lang.Character) '\"');
        boolean boolean22 = cSVFormat8.equals((java.lang.Object) cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\"' + "'", char19 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        org.apache.commons.csv.Quote quote10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuotePolicy(quote10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar((java.lang.Character) '\"');
        java.lang.String[] strArray14 = cSVFormat11.getHeader();
        boolean boolean15 = cSVFormat11.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        boolean boolean11 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withEscape((java.lang.Character) ',');
        boolean boolean16 = cSVFormat1.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withEscape('a');
        boolean boolean21 = cSVFormat16.isQuoting();
        java.lang.String[] strArray22 = cSVFormat16.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines(false);
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        java.lang.Character char25 = cSVFormat24.getCommentStart();
        java.lang.String str26 = cSVFormat24.getNullString();
        java.lang.String str27 = cSVFormat24.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'a' + "'", char25 == 'a');
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape((java.lang.Character) 'a');
        boolean boolean22 = cSVFormat19.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean9 = cSVFormat8.isNullHandling();
        boolean boolean11 = cSVFormat8.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('#');
        java.lang.Character char14 = cSVFormat13.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean34 = cSVFormat33.isNullHandling();
        boolean boolean36 = cSVFormat33.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withDelimiter('#');
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withHeader(strArray40);
        java.lang.String str42 = cSVFormat29.format((java.lang.Object[]) strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat20.withHeader(strArray40);
        java.lang.String str44 = cSVFormat13.format((java.lang.Object[]) strArray40);
        java.lang.String str45 = cSVFormat0.format((java.lang.Object[]) strArray40);
        boolean boolean46 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat0.withIgnoreEmptyLines(true);
        cSVFormat48.validate();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withCommentStart((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withDelimiter('\t');
        cSVFormat53.validate();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat56);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        java.lang.Character char11 = cSVFormat10.getQuoteChar();
        java.lang.String str12 = cSVFormat10.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean15 = cSVFormat14.isNullHandling();
        boolean boolean17 = cSVFormat14.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter('#');
        org.apache.commons.csv.Quote quote20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuotePolicy(quote20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean24 = cSVFormat23.isNullHandling();
        boolean boolean26 = cSVFormat23.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withDelimiter('#');
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withHeader(strArray30);
        java.lang.String str32 = cSVFormat19.format((java.lang.Object[]) strArray30);
        java.lang.String str33 = cSVFormat10.format((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withQuoteChar(' ');
        boolean boolean39 = cSVFormat10.equals((java.lang.Object) cSVFormat38);
        java.lang.String[] strArray40 = cSVFormat10.getHeader();
        cSVFormat10.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(strArray40);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat44.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat44.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean55 = cSVFormat54.isNullHandling();
        boolean boolean57 = cSVFormat54.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withDelimiter('#');
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withHeader(strArray61);
        boolean boolean63 = cSVFormat59.getSkipHeaderRecord();
        boolean boolean64 = cSVFormat59.isCommentingEnabled();
        boolean boolean65 = cSVFormat59.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat59.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat59.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withEscape('\"');
        boolean boolean72 = cSVFormat52.equals((java.lang.Object) cSVFormat71);
        boolean boolean73 = cSVFormat52.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat52.withEscape(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cSVFormat75);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withQuoteChar(' ');
        java.lang.Character char21 = cSVFormat20.getEscape();
        boolean boolean22 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat20.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentStart('a');
        java.lang.String str31 = cSVFormat28.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart((java.lang.Character) 'a');
        boolean boolean15 = cSVFormat6.getSkipHeaderRecord();
        boolean boolean16 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        boolean boolean11 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withEscape((java.lang.Character) ',');
        java.lang.String str16 = cSVFormat15.getRecordSeparator();
        org.apache.commons.csv.Quote quote17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withRecordSeparator("Delimiter=<#> Escape=<a> RecordSeparator=<Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:true Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]> SkipHeaderRecord:false");
        java.io.Reader reader21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser22 = cSVFormat20.parse(reader21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        org.apache.commons.csv.Quote quote10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuotePolicy(quote10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('\"');
        java.lang.String str14 = cSVFormat11.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        java.lang.String str11 = cSVFormat9.getNullString();
        org.apache.commons.csv.Quote quote12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuotePolicy(quote12);
        java.lang.String str14 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean17 = cSVFormat16.isNullHandling();
        boolean boolean19 = cSVFormat16.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withDelimiter('#');
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withHeader(strArray23);
        boolean boolean25 = cSVFormat21.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean28 = cSVFormat27.isNullHandling();
        boolean boolean30 = cSVFormat27.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withDelimiter('#');
        java.lang.Character char33 = cSVFormat32.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean44 = cSVFormat43.isNullHandling();
        boolean boolean46 = cSVFormat43.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat43.withDelimiter('#');
        org.apache.commons.csv.Quote quote49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuotePolicy(quote49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean53 = cSVFormat52.isNullHandling();
        boolean boolean55 = cSVFormat52.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat52.withDelimiter('#');
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat57.withHeader(strArray59);
        java.lang.String str61 = cSVFormat48.format((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat39.withHeader(strArray59);
        java.lang.String str63 = cSVFormat32.format((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat21.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat9.withHeader(strArray59);
        java.lang.Character char66 = cSVFormat9.getCommentStart();
        org.apache.commons.csv.Quote quote67 = cSVFormat9.getQuotePolicy();
        boolean boolean68 = cSVFormat9.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNull(char33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNull(char66);
        org.junit.Assert.assertNull(quote67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuoteChar((java.lang.Character) ' ');
        java.lang.String[] strArray15 = cSVFormat10.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withRecordSeparator('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        boolean boolean2 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean7 = cSVFormat4.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withHeader(strArray11);
        boolean boolean13 = cSVFormat9.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote14 = cSVFormat9.getQuotePolicy();
        java.lang.String str15 = cSVFormat9.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean20 = cSVFormat19.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withIgnoreSurroundingSpaces(false);
        char char25 = cSVFormat24.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean28 = cSVFormat27.isNullHandling();
        boolean boolean30 = cSVFormat27.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withDelimiter('#');
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withHeader(strArray34);
        boolean boolean36 = cSVFormat32.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat32.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray41 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat24.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat9.withHeader(strArray41);
        java.lang.String str45 = cSVFormat0.format((java.lang.Object[]) strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat0.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        boolean boolean48 = cSVFormat47.getIgnoreSurroundingSpaces();
        boolean boolean49 = cSVFormat47.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(quote14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + char25 + "' != '" + 'a' + "'", char25 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false,hi!" + "'", str45, "Delimiter=<#> SkipHeaderRecord:false,hi!");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        boolean boolean7 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withSkipHeaderRecord(true);
        java.lang.String str12 = cSVFormat4.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\"');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withEscape('a');
        boolean boolean13 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        boolean boolean6 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.Quote quote7 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withCommentStart((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(quote7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.String str12 = cSVFormat10.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withIgnoreSurroundingSpaces(true);
        boolean boolean19 = cSVFormat10.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat10.withRecordSeparator("Delimiter=<#> RecordSeparator=<> SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote22 = cSVFormat10.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(quote22);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        boolean boolean11 = cSVFormat10.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator('\t');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withIgnoreSurroundingSpaces(false);
        char char27 = cSVFormat26.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean30 = cSVFormat29.isNullHandling();
        boolean boolean32 = cSVFormat29.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withDelimiter('#');
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withHeader(strArray36);
        boolean boolean38 = cSVFormat34.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat34.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray43 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat26.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat19.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat13.withHeader(strArray43);
        boolean boolean48 = cSVFormat47.isNullHandling();
        char char49 = cSVFormat47.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + char27 + "' != '" + 'a' + "'", char27 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '#' + "'", char49 == '#');
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.String str3 = cSVFormat2.toString();
        java.lang.Character char4 = cSVFormat2.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentStart((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\"' + "'", char4 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        boolean boolean17 = cSVFormat16.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withIgnoreSurroundingSpaces(false);
        boolean boolean20 = cSVFormat16.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withIgnoreSurroundingSpaces(true);
        java.lang.String str23 = cSVFormat16.toString();
        java.lang.Character char24 = cSVFormat16.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat16.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat16.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withEscape('a');
        java.lang.Character char33 = cSVFormat32.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]" + "'", str23, "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]");
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + 'a' + "'", char33 == 'a');
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withQuoteChar(' ');
        java.lang.Character char21 = cSVFormat20.getEscape();
        boolean boolean22 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat20.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreSurroundingSpaces(true);
        boolean boolean31 = cSVFormat28.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        boolean boolean11 = cSVFormat9.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuoteChar('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withNullString("Delimiter=< > SkipHeaderRecord:false");
        java.lang.String str14 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreSurroundingSpaces(false);
        java.lang.String str19 = cSVFormat16.toString();
        java.io.Reader reader20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser21 = cSVFormat16.parse(reader20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str19, "Delimiter=<#> SkipHeaderRecord:false");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuotePolicy(quote2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuotePolicy(quote8);
        boolean boolean10 = cSVFormat5.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteChar('#');
        java.lang.String[] strArray15 = cSVFormat12.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('4');
        org.apache.commons.csv.Quote quote6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuotePolicy(quote6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withNullString("Delimiter=<a> CommentStart=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("Delimiter=<#> Escape=<#> QuoteChar=<a> CommentStart=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuoteChar((java.lang.Character) 'a');
        boolean boolean14 = cSVFormat9.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean16 = cSVFormat15.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withCommentStart('4');
        java.lang.String str19 = cSVFormat18.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        boolean boolean24 = cSVFormat21.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('#');
        boolean boolean27 = cSVFormat21.isCommentingEnabled();
        boolean boolean28 = cSVFormat21.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat21.withCommentStart(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.String str32 = cSVFormat30.format(objArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat30.withRecordSeparator("#");
        java.lang.String str37 = cSVFormat36.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean40 = cSVFormat39.isNullHandling();
        boolean boolean42 = cSVFormat39.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withDelimiter('#');
        char char45 = cSVFormat44.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean48 = cSVFormat47.isNullHandling();
        boolean boolean50 = cSVFormat47.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withDelimiter('#');
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withHeader(strArray54);
        java.lang.String str56 = cSVFormat44.format((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat36.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat18.withHeader(strArray54);
        java.lang.String str59 = cSVFormat9.format((java.lang.Object[]) strArray54);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#" + "'", str37, "#");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + '#' + "'", char45 == '#');
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false" + "'", str59, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withEscape((java.lang.Character) 'a');
        java.lang.Character char15 = cSVFormat14.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withRecordSeparator("\n");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        java.lang.String str7 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean12 = cSVFormat11.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean17 = cSVFormat11.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean24 = cSVFormat23.isNullHandling();
        boolean boolean26 = cSVFormat23.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withDelimiter('#');
        org.apache.commons.csv.Quote quote29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuotePolicy(quote29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean33 = cSVFormat32.isNullHandling();
        boolean boolean35 = cSVFormat32.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withDelimiter('#');
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withHeader(strArray39);
        java.lang.String str41 = cSVFormat28.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat19.withHeader(strArray39);
        boolean boolean43 = cSVFormat11.equals((java.lang.Object) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean46 = cSVFormat45.isNullHandling();
        boolean boolean48 = cSVFormat45.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withDelimiter('#');
        org.apache.commons.csv.Quote quote51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuotePolicy(quote51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean55 = cSVFormat54.isNullHandling();
        boolean boolean57 = cSVFormat54.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withDelimiter('#');
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withHeader(strArray61);
        java.lang.String str63 = cSVFormat50.format((java.lang.Object[]) strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat11.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat0.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withCommentStart((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        boolean boolean5 = cSVFormat1.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) 'a');
        java.lang.String str9 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str9, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        java.lang.Character char53 = cSVFormat52.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean58 = cSVFormat57.isNullHandling();
        boolean boolean60 = cSVFormat57.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withDelimiter('#');
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat62.withHeader(strArray64);
        boolean boolean66 = cSVFormat62.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat62.withIgnoreEmptyLines(true);
        boolean boolean69 = cSVFormat55.equals((java.lang.Object) cSVFormat68);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat55.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat55.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat55.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat77.withRecordSeparator("Delimiter=<a> QuoteChar=< > SkipHeaderRecord:false Header:[]");
        java.lang.Character char80 = cSVFormat79.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + '\"' + "'", char53 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertTrue("'" + char80 + "' != '" + '#' + "'", char80 == '#');
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        java.lang.Character char11 = cSVFormat10.getQuoteChar();
        java.lang.String str12 = cSVFormat10.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withDelimiter('a');
        boolean boolean17 = cSVFormat16.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withIgnoreEmptyLines(false);
        java.lang.String str20 = cSVFormat19.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        java.lang.String str7 = cSVFormat0.toString();
        cSVFormat0.validate();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withEscape((java.lang.Character) ',');
        java.lang.Character char11 = cSVFormat10.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        java.lang.Character char5 = cSVFormat0.getQuoteChar();
        java.lang.String str6 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withRecordSeparator("Delimiter=<a> CommentStart=<#> RecordSeparator=< > SkipHeaderRecord:false");
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withQuoteChar(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str6, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withRecordSeparator("Delimiter=<a> RecordSeparator=<Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false");
        java.lang.String str14 = cSVFormat13.getNullString();
        java.lang.Character char15 = cSVFormat13.getQuoteChar();
        java.lang.String str16 = cSVFormat13.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<a> RecordSeparator=<Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false" + "'", str16, "Delimiter=<a> RecordSeparator=<Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        boolean boolean11 = cSVFormat10.getSkipHeaderRecord();
        cSVFormat10.validate();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withDelimiter(',');
        org.apache.commons.csv.Quote quote14 = cSVFormat13.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuoteChar('#');
        boolean boolean19 = cSVFormat18.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withQuoteChar(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(quote14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        boolean boolean4 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char5 = cSVFormat0.getEscape();
        boolean boolean6 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withSkipHeaderRecord(true);
        java.lang.Character char9 = cSVFormat8.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.Quote quote12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuotePolicy(quote12);
        boolean boolean14 = cSVFormat13.isEscaping();
        java.lang.String str15 = cSVFormat13.toString();
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat13.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<\t> Escape=<\"> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true" + "'", str15, "Delimiter=<\t> Escape=<\"> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('4');
        cSVFormat44.validate();
        org.apache.commons.csv.Quote quote46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withQuotePolicy(quote46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false");
        boolean boolean6 = cSVFormat5.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean9 = cSVFormat8.isNullHandling();
        boolean boolean11 = cSVFormat8.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('#');
        org.apache.commons.csv.Quote quote14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuotePolicy(quote14);
        java.lang.Character char16 = cSVFormat15.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean21 = cSVFormat20.isNullHandling();
        boolean boolean23 = cSVFormat20.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withDelimiter('#');
        java.lang.Character char26 = cSVFormat25.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withSkipHeaderRecord(false);
        boolean boolean29 = cSVFormat28.isEscaping();
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        org.apache.commons.csv.Quote quote41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuotePolicy(quote41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean45 = cSVFormat44.isNullHandling();
        boolean boolean47 = cSVFormat44.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withDelimiter('#');
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withHeader(strArray51);
        java.lang.String str53 = cSVFormat40.format((java.lang.Object[]) strArray51);
        java.lang.String str54 = cSVFormat33.format((java.lang.Object[]) strArray51);
        java.lang.String str55 = cSVFormat15.format((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat5.withHeader(strArray51);
        char char57 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat5.withQuoteChar('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(char26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\"' + "'", char57 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat59);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat1.withDelimiter(' ');
        java.lang.Character char45 = cSVFormat1.getEscape();
        org.apache.commons.csv.Quote quote46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat1.withQuotePolicy(quote46);
        boolean boolean48 = cSVFormat47.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withDelimiter('\"');
        java.lang.String[] strArray51 = cSVFormat50.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withNullString("Delimiter=<#> QuoteChar=< > CommentStart=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withEscape('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(char45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        boolean boolean17 = cSVFormat16.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat16.withRecordSeparator("Delimiter=<#> QuoteChar=< > CommentStart=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean26 = cSVFormat25.isNullHandling();
        boolean boolean28 = cSVFormat25.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withDelimiter('#');
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withHeader(strArray32);
        boolean boolean34 = cSVFormat30.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat30.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray39 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withHeader(strArray39);
        java.lang.String str41 = cSVFormat16.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat16.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat16.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean48 = cSVFormat47.isNullHandling();
        boolean boolean50 = cSVFormat47.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withDelimiter('#');
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withHeader(strArray54);
        boolean boolean56 = cSVFormat52.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat52.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray61 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat58.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat58.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat58.withEscape((java.lang.Character) '#');
        java.lang.Character char67 = cSVFormat58.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat58.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat58.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat58.withCommentStart(' ');
        boolean boolean74 = cSVFormat45.equals((java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "aDelimiter=<#> SkipHeaaderRecord:faalsea#hi!" + "'", str41, "aDelimiter=<#> SkipHeaaderRecord:faalsea#hi!");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNull(char67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        boolean boolean53 = cSVFormat52.getSkipHeaderRecord();
        boolean boolean54 = cSVFormat52.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        java.lang.String[] strArray51 = cSVFormat3.getHeader();
        org.apache.commons.csv.Quote quote52 = cSVFormat3.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        boolean boolean57 = cSVFormat56.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(quote52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote11 = cSVFormat6.getQuotePolicy();
        java.lang.String str12 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean17 = cSVFormat16.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withIgnoreSurroundingSpaces(false);
        char char22 = cSVFormat21.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withHeader(strArray31);
        boolean boolean33 = cSVFormat29.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat29.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray38 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat21.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat6.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withRecordSeparator(' ');
        boolean boolean44 = cSVFormat43.getIgnoreEmptyLines();
        boolean boolean45 = cSVFormat43.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat43.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'a' + "'", char22 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean13 = cSVFormat12.isNullHandling();
        boolean boolean15 = cSVFormat12.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('#');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeader(strArray19);
        boolean boolean21 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray26 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat10.withHeader(strArray26);
        boolean boolean29 = cSVFormat10.isEscaping();
        java.lang.Character char30 = cSVFormat10.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat10.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentStart(',');
        boolean boolean35 = cSVFormat32.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar((java.lang.Character) '#');
        java.lang.Character char9 = cSVFormat6.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean11 = cSVFormat10.isNullHandling();
        boolean boolean13 = cSVFormat10.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withDelimiter('#');
        org.apache.commons.csv.Quote quote16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuotePolicy(quote16);
        org.apache.commons.csv.Quote quote18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withQuotePolicy(quote18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withQuoteChar('\"');
        boolean boolean28 = cSVFormat1.equals((java.lang.Object) '\"');
        cSVFormat1.validate();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat1.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean16 = cSVFormat13.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter('#');
        org.apache.commons.csv.Quote quote19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuotePolicy(quote19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withHeader(strArray29);
        java.lang.String str31 = cSVFormat18.format((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat9.withHeader(strArray29);
        boolean boolean33 = cSVFormat1.equals((java.lang.Object) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat40.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean51 = cSVFormat50.isNullHandling();
        boolean boolean53 = cSVFormat50.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat50.withDelimiter('#');
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat55.withHeader(strArray57);
        boolean boolean59 = cSVFormat55.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat55.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean67 = cSVFormat66.isNullHandling();
        boolean boolean69 = cSVFormat66.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat66.withDelimiter('#');
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat71.withHeader(strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat62.withHeader(strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat61.withHeader(strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat48.withHeader(strArray73);
        java.lang.String str78 = cSVFormat1.format((java.lang.Object[]) strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat1.withCommentStart((java.lang.Character) 'a');
        java.lang.Character char81 = cSVFormat80.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNull(char81);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteChar((java.lang.Character) '\t');
        char char22 = cSVFormat19.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withRecordSeparator('4');
        boolean boolean25 = cSVFormat19.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat19.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuoteChar((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '#' + "'", char22 == '#');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('4');
        java.lang.String str6 = cSVFormat3.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withQuoteChar('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false" + "'", str6, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat3.withCommentStart('a');
        boolean boolean55 = cSVFormat3.getSkipHeaderRecord();
        java.lang.String str56 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat3.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str56, "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat58);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.Character char3 = cSVFormat2.getEscape();
        boolean boolean4 = cSVFormat2.isEscaping();
        org.apache.commons.csv.Quote quote5 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteChar('a');
        cSVFormat7.validate();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withCommentStart((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quote5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        boolean boolean5 = cSVFormat1.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat1.isEscaping();
        java.lang.Character char7 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        char char12 = cSVFormat11.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + 'a' + "'", char12 == 'a');
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord(true);
        boolean boolean7 = cSVFormat6.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape('#');
        java.lang.String str10 = cSVFormat6.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean13 = cSVFormat12.isNullHandling();
        boolean boolean15 = cSVFormat12.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('#');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat6.withHeader(strArray19);
        java.lang.String[] strArray22 = cSVFormat6.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat6.withDelimiter(',');
        java.lang.String str25 = cSVFormat6.getRecordSeparator();
        java.io.Reader reader26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser27 = cSVFormat6.parse(reader26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:true" + "'", str10, "Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " " + "'", str25, " ");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.String str4 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean11 = cSVFormat10.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean16 = cSVFormat10.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat18.withHeader(strArray38);
        boolean boolean42 = cSVFormat10.equals((java.lang.Object) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean45 = cSVFormat44.isNullHandling();
        boolean boolean47 = cSVFormat44.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withDelimiter('#');
        org.apache.commons.csv.Quote quote50 = null;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withQuotePolicy(quote50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withRecordSeparator("");
        java.lang.Character char54 = cSVFormat53.getQuoteChar();
        java.lang.String str55 = cSVFormat53.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean58 = cSVFormat57.isNullHandling();
        boolean boolean60 = cSVFormat57.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withDelimiter('#');
        org.apache.commons.csv.Quote quote63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withQuotePolicy(quote63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean67 = cSVFormat66.isNullHandling();
        boolean boolean69 = cSVFormat66.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat66.withDelimiter('#');
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat71.withHeader(strArray73);
        java.lang.String str75 = cSVFormat62.format((java.lang.Object[]) strArray73);
        java.lang.String str76 = cSVFormat53.format((java.lang.Object[]) strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat10.withHeader(strArray73);
        java.lang.String str78 = cSVFormat3.format((java.lang.Object[]) strArray73);
        java.lang.String str79 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<a> RecordSeparator=<Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false" + "'", str4, "Delimiter=<a> RecordSeparator=<Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNull(char54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false" + "'", str78, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        boolean boolean11 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        org.apache.commons.csv.Quote quote23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuotePolicy(quote23);
        org.apache.commons.csv.Quote quote25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withQuotePolicy(quote25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean29 = cSVFormat28.isNullHandling();
        boolean boolean31 = cSVFormat28.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withDelimiter('#');
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeader(strArray35);
        boolean boolean37 = cSVFormat33.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat33.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray42 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat26.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat1.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean56 = cSVFormat55.isNullHandling();
        boolean boolean58 = cSVFormat55.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withDelimiter('#');
        org.apache.commons.csv.Quote quote61 = null;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withQuotePolicy(quote61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean65 = cSVFormat64.isNullHandling();
        boolean boolean67 = cSVFormat64.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat64.withDelimiter('#');
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat69.withHeader(strArray71);
        java.lang.String str73 = cSVFormat60.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat51.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat49.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat1.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat1.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat1.withQuoteChar((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat1.withEscape((java.lang.Character) ' ');
        boolean boolean45 = cSVFormat44.isEscaping();
        java.lang.String str46 = cSVFormat44.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withDelimiter('4');
        org.apache.commons.csv.Quote quote49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat44.withQuotePolicy(quote49);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote11 = cSVFormat6.getQuotePolicy();
        java.lang.String str12 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean17 = cSVFormat16.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withIgnoreSurroundingSpaces(false);
        char char22 = cSVFormat21.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withHeader(strArray31);
        boolean boolean33 = cSVFormat29.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat29.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray38 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat21.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat6.withHeader(strArray38);
        boolean boolean42 = cSVFormat41.isQuoting();
        org.apache.commons.csv.Quote quote43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withQuotePolicy(quote43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withQuoteChar('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'a' + "'", char22 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.Quote quote11 = cSVFormat6.getQuotePolicy();
        java.lang.String str12 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean17 = cSVFormat16.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withIgnoreSurroundingSpaces(false);
        char char22 = cSVFormat21.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withHeader(strArray31);
        boolean boolean33 = cSVFormat29.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat29.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray38 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat21.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat6.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat45.withCommentStart('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + 'a' + "'", char22 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape((java.lang.Character) '4');
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        boolean boolean11 = cSVFormat6.isCommentingEnabled();
        boolean boolean12 = cSVFormat6.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.Quote quote17 = cSVFormat16.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(quote17);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withQuotePolicy(quote13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withRecordSeparator('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withRecordSeparator('\t');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean30 = cSVFormat29.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withEscape('a');
        boolean boolean33 = cSVFormat29.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat29.withEscape('#');
        java.lang.String str36 = cSVFormat29.toString();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat29.withEscape('#');
        cSVFormat29.validate();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat29.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withQuoteChar((java.lang.Character) '\"');
        boolean boolean44 = cSVFormat28.equals((java.lang.Object) cSVFormat41);
        org.apache.commons.csv.Quote quote45 = null;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat41.withQuotePolicy(quote45);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str36, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withDelimiter('\t');
        boolean boolean12 = cSVFormat11.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        java.lang.String str11 = cSVFormat9.getNullString();
        boolean boolean12 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuoteChar((java.lang.Character) '4');
        java.lang.String str15 = cSVFormat9.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator(' ');
        boolean boolean12 = cSVFormat9.getIgnoreSurroundingSpaces();
        java.lang.String str13 = cSVFormat9.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        java.lang.String[] strArray10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        java.lang.String[] strArray12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withHeader(strArray12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withCommentStart('\t');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withNullString("Delimiter=<a> CommentStart=<4> SkipHeaderRecord:false Header:[]");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withRecordSeparator("Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withDelimiter(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("#");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean7 = cSVFormat6.isNullHandling();
        boolean boolean9 = cSVFormat6.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter('#');
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuotePolicy(quote7);
        boolean boolean9 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withEscape((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter(' ');
        org.apache.commons.csv.Quote quote6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuotePolicy(quote6);
        org.apache.commons.csv.Quote quote8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuotePolicy(quote8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withNullString("Delimiter=<a> Escape=<4> CommentStart=<4> SkipHeaderRecord:false Header:[]");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withCommentStart(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator('4');
        java.lang.Character char12 = cSVFormat7.getQuoteChar();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '#' + "'", char12 == '#');
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean7 = cSVFormat4.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart('4');
        boolean boolean20 = cSVFormat19.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withQuoteChar('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean7 = cSVFormat4.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withSkipHeaderRecord(true);
        java.lang.Character char16 = cSVFormat15.getQuoteChar();
        boolean boolean17 = cSVFormat15.isQuoting();
        java.lang.String str18 = cSVFormat15.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true" + "'", str18, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('\t');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean20 = cSVFormat19.isNullHandling();
        boolean boolean22 = cSVFormat19.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withDelimiter('#');
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withHeader(strArray26);
        java.lang.String[] strArray28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat24.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuoteChar((java.lang.Character) '4');
        cSVFormat33.validate();
        java.lang.String[] strArray41 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat33.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat24.withHeader(strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat17.withHeader(strArray41);
        java.lang.Character char45 = cSVFormat17.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat46.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat46.withRecordSeparator("Delimiter=<\t> QuoteChar=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withSkipHeaderRecord(true);
        boolean boolean55 = cSVFormat17.equals((java.lang.Object) cSVFormat52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat52.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + char45 + "' != '" + ' ' + "'", char45 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cSVFormat57);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        java.lang.String[] strArray8 = cSVFormat6.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withRecordSeparator('a');
        boolean boolean11 = cSVFormat10.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator('#');
        boolean boolean14 = cSVFormat10.isNullHandling();
        java.lang.String str15 = cSVFormat10.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentStart((java.lang.Character) 'a');
        boolean boolean9 = cSVFormat8.isNullHandling();
        java.lang.String str10 = cSVFormat8.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withNullString("#");
        boolean boolean15 = cSVFormat14.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<a> CommentStart=<a> SkipHeaderRecord:false" + "'", str10, "Delimiter=<a> CommentStart=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        boolean boolean3 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withNullString("\"\"\"\"\"#\",\"Delimiter=<\t> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",aa,hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withCommentStart(',');
        boolean boolean10 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withEscape((java.lang.Character) '\t');
        boolean boolean15 = cSVFormat0.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        boolean boolean18 = cSVFormat17.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str2 = cSVFormat1.getNullString();
        java.lang.Character char3 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('#');
        java.lang.Character char11 = cSVFormat10.getEscape();
        boolean boolean12 = cSVFormat10.isEscaping();
        org.apache.commons.csv.Quote quote13 = cSVFormat10.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean24 = cSVFormat23.isNullHandling();
        boolean boolean26 = cSVFormat23.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withDelimiter('#');
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withHeader(strArray30);
        boolean boolean32 = cSVFormat28.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat28.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray37 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withHeader(strArray37);
        boolean boolean39 = cSVFormat38.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat38.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat38.withRecordSeparator("Delimiter=<#> QuoteChar=< > CommentStart=<a> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean48 = cSVFormat47.isNullHandling();
        boolean boolean50 = cSVFormat47.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withDelimiter('#');
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withHeader(strArray54);
        boolean boolean56 = cSVFormat52.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat52.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray61 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat58.withHeader(strArray61);
        java.lang.String str63 = cSVFormat38.format((java.lang.Object[]) strArray61);
        java.lang.String str64 = cSVFormat19.format((java.lang.Object[]) strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat7.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat7.withQuoteChar('a');
        java.lang.String[] strArray68 = cSVFormat7.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(quote13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "aDelimiter=<#> SkipHeaaderRecord:faalsea#hi!" + "'", str63, "aDelimiter=<#> SkipHeaaderRecord:faalsea#hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "aDelimiter=<#> SkipHeaaderRecord:faalsea,hi!a" + "'", str64, "aDelimiter=<#> SkipHeaaderRecord:faalsea,hi!a");
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNull(strArray68);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat1.withIgnoreEmptyLines(false);
        java.lang.String str21 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean24 = cSVFormat23.isNullHandling();
        boolean boolean26 = cSVFormat23.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withDelimiter('#');
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withHeader(strArray30);
        boolean boolean32 = cSVFormat28.getSkipHeaderRecord();
        boolean boolean33 = cSVFormat28.isCommentingEnabled();
        boolean boolean34 = cSVFormat28.isCommentingEnabled();
        boolean boolean35 = cSVFormat28.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.Quote quote38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat28.withQuotePolicy(quote38);
        org.apache.commons.csv.Quote quote40 = null;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuotePolicy(quote40);
        boolean boolean42 = cSVFormat39.isCommentingEnabled();
        boolean boolean43 = cSVFormat20.equals((java.lang.Object) cSVFormat39);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat20.withNullString("Delimiter=<a> Escape=<4> CommentStart=<4> SkipHeaderRecord:false Header:[]");
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat20.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.Character char5 = cSVFormat1.getCommentStart();
        char char6 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(',');
        java.lang.String[] strArray12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withHeader(strArray12);
        org.apache.commons.csv.Quote quote14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuotePolicy(quote14);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentStart((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("Delimiter=<a> RecordSeparator=<Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false");
        java.lang.String[] strArray11 = cSVFormat8.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        java.lang.String[] strArray51 = cSVFormat3.getHeader();
        org.apache.commons.csv.Quote quote52 = cSVFormat3.getQuotePolicy();
        java.lang.String str53 = cSVFormat3.toString();
        org.apache.commons.csv.Quote quote54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat3.withQuotePolicy(quote54);
        java.lang.String str56 = cSVFormat55.toString();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat55.withCommentStart(',');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNull(strArray51);
        org.junit.Assert.assertNull(quote52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str53, "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str56, "Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withNullString("Delimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.Character char5 = cSVFormat1.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withQuoteChar('\"');
        org.apache.commons.csv.Quote quote10 = cSVFormat9.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quote10);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withQuoteChar(' ');
        java.lang.Character char21 = cSVFormat20.getEscape();
        boolean boolean22 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withNullString("Delimiter=<4> Escape=< > CommentStart=<4> SkipHeaderRecord:false Header:[]");
        boolean boolean27 = cSVFormat20.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withQuoteChar((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean13 = cSVFormat12.isNullHandling();
        boolean boolean15 = cSVFormat12.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('#');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeader(strArray19);
        boolean boolean21 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean26 = cSVFormat25.isNullHandling();
        boolean boolean28 = cSVFormat25.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withDelimiter('#');
        org.apache.commons.csv.Quote quote31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withQuotePolicy(quote31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean35 = cSVFormat34.isNullHandling();
        boolean boolean37 = cSVFormat34.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withDelimiter('#');
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withHeader(strArray41);
        java.lang.String str43 = cSVFormat30.format((java.lang.Object[]) strArray41);
        java.lang.String str44 = cSVFormat17.format((java.lang.Object[]) strArray41);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat8.withHeader(strArray41);
        java.lang.String str46 = cSVFormat45.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuoteChar((java.lang.Character) '4');
        cSVFormat50.validate();
        java.lang.String[] strArray58 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat50.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat45.withHeader(strArray58);
        boolean boolean61 = cSVFormat60.getIgnoreEmptyLines();
        boolean boolean62 = cSVFormat60.isCommentingEnabled();
        boolean boolean63 = cSVFormat60.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        org.apache.commons.csv.Quote quote23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuotePolicy(quote23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean27 = cSVFormat26.isNullHandling();
        boolean boolean29 = cSVFormat26.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withDelimiter('#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withHeader(strArray33);
        java.lang.String str35 = cSVFormat22.format((java.lang.Object[]) strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withHeader(strArray33);
        java.lang.String str37 = cSVFormat6.format((java.lang.Object[]) strArray33);
        org.apache.commons.csv.Quote quote38 = cSVFormat6.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentStart(' ');
        java.lang.String str42 = cSVFormat39.getRecordSeparator();
        boolean boolean43 = cSVFormat39.getIgnoreSurroundingSpaces();
        boolean boolean44 = cSVFormat39.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat39.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat39.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean51 = cSVFormat50.isNullHandling();
        boolean boolean53 = cSVFormat50.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat50.withDelimiter('#');
        java.lang.Character char56 = cSVFormat55.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat55.withSkipHeaderRecord(false);
        boolean boolean59 = cSVFormat58.isEscaping();
        org.apache.commons.csv.Quote quote60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withQuotePolicy(quote60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat58.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean66 = cSVFormat65.isNullHandling();
        boolean boolean68 = cSVFormat65.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat65.withDelimiter('#');
        org.apache.commons.csv.Quote quote71 = null;
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withQuotePolicy(quote71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean75 = cSVFormat74.isNullHandling();
        boolean boolean77 = cSVFormat74.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat74.withDelimiter('#');
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat79.withHeader(strArray81);
        java.lang.String str83 = cSVFormat70.format((java.lang.Object[]) strArray81);
        java.lang.String str84 = cSVFormat63.format((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat39.withHeader(strArray81);
        java.lang.String str86 = cSVFormat6.format((java.lang.Object[]) strArray81);
        boolean boolean87 = cSVFormat6.getIgnoreEmptyLines();
        char char88 = cSVFormat6.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(quote38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\r\n" + "'", str42, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNull(char56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + char88 + "' != '" + '#' + "'", char88 == '#');
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withRecordSeparator("\r\n");
        java.lang.Character char13 = cSVFormat12.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        java.lang.Class<?> wildcardClass18 = cSVFormat17.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        java.lang.String str18 = cSVFormat6.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:true Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withIgnoreEmptyLines(false);
        java.io.Reader reader25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser26 = cSVFormat24.parse(reader25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat5.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar((java.lang.Character) '4');
        cSVFormat8.validate();
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat5.withHeader(strArray16);
        java.lang.String str19 = cSVFormat18.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<,> QuoteChar=<#> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false Header:[\"\"#, Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, aa, hi!]" + "'", str19, "Delimiter=<,> QuoteChar=<#> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false Header:[\"\"#, Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, aa, hi!]");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        java.lang.String str18 = cSVFormat6.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withIgnoreEmptyLines(false);
        boolean boolean21 = cSVFormat6.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat6.withDelimiter(' ');
        java.lang.String str24 = cSVFormat6.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean14 = cSVFormat13.isNullHandling();
        boolean boolean16 = cSVFormat13.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withHeader(strArray31);
        java.lang.String[] strArray33 = null;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withHeader(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat29.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuoteChar((java.lang.Character) '4');
        cSVFormat38.validate();
        java.lang.String[] strArray46 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat38.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat29.withHeader(strArray46);
        java.lang.String str49 = cSVFormat22.format((java.lang.Object[]) strArray46);
        java.lang.String str50 = cSVFormat6.format((java.lang.Object[]) strArray46);
        boolean boolean51 = cSVFormat6.isNullHandling();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"##Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false#aa#hi!" + "'", str49, "\"\"##Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false#aa#hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"\"##Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false#aa#hi!" + "'", str50, "\"\"##Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false#aa#hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.String str12 = cSVFormat10.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withRecordSeparator('a');
        boolean boolean19 = cSVFormat10.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("Delimiter=<4> Escape=< > CommentStart=<4> SkipHeaderRecord:false Header:[]");
        org.apache.commons.csv.Quote quote6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuotePolicy(quote6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(',');
        boolean boolean10 = cSVFormat9.isCommentingEnabled();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean7 = cSVFormat4.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeader(strArray11);
        java.lang.String[] strArray14 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withCommentStart((java.lang.Character) '\t');
        boolean boolean17 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\t> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.Quote quote11 = cSVFormat10.getQuotePolicy();
        org.apache.commons.csv.Quote quote12 = cSVFormat10.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(true);
        boolean boolean19 = cSVFormat16.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withQuoteChar(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat13.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withNullString("#");
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withCommentStart((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote8 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withQuoteChar(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(quote8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat42.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat42.withIgnoreEmptyLines(false);
        boolean boolean49 = cSVFormat48.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuotePolicy(quote7);
        boolean boolean9 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withQuoteChar('\t');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator("Delimiter=<a> CommentStart=<\t> SkipHeaderRecord:false Header:[]");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('#');
        boolean boolean11 = cSVFormat10.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        char char10 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withCommentStart((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator('\"');
        boolean boolean15 = cSVFormat14.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("#");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withCommentStart((java.lang.Character) ',');
        boolean boolean12 = cSVFormat11.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuoteChar((java.lang.Character) '4');
        boolean boolean15 = cSVFormat2.equals((java.lang.Object) '4');
        cSVFormat2.validate();
        java.lang.String str17 = cSVFormat2.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean9 = cSVFormat8.isNullHandling();
        boolean boolean11 = cSVFormat8.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('#');
        java.lang.Character char14 = cSVFormat13.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean34 = cSVFormat33.isNullHandling();
        boolean boolean36 = cSVFormat33.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withDelimiter('#');
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withHeader(strArray40);
        java.lang.String str42 = cSVFormat29.format((java.lang.Object[]) strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat20.withHeader(strArray40);
        java.lang.String str44 = cSVFormat13.format((java.lang.Object[]) strArray40);
        java.lang.String str45 = cSVFormat0.format((java.lang.Object[]) strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat0.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withRecordSeparator('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        org.apache.commons.csv.Quote quote11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuotePolicy(quote11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withEscape((java.lang.Character) 'a');
        java.lang.String str15 = cSVFormat14.toString();
        java.lang.String[] strArray16 = cSVFormat14.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Delimiter=<#> Escape=<a> SkipHeaderRecord:false" + "'", str15, "Delimiter=<#> Escape=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(false);
        java.lang.String[] strArray16 = cSVFormat15.getHeader();
        boolean boolean17 = cSVFormat15.isCommentingEnabled();
        java.io.Reader reader18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser19 = cSVFormat15.parse(reader18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        boolean boolean10 = cSVFormat9.isEscaping();
        java.lang.String str11 = cSVFormat9.getNullString();
        org.apache.commons.csv.Quote quote12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuotePolicy(quote12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withCommentStart('\"');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteChar('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        java.lang.String str18 = cSVFormat6.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withQuoteChar('a');
        boolean boolean21 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat6.withNullString("Delimiter=<a> Escape=<4> CommentStart=<4> SkipHeaderRecord:false Header:[]");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote8 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        boolean boolean11 = cSVFormat1.isNullHandling();
        java.lang.String str12 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(quote8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withQuoteChar(' ');
        java.lang.Character char21 = cSVFormat20.getEscape();
        boolean boolean22 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withCommentStart((java.lang.Character) '4');
        boolean boolean25 = cSVFormat24.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator("Delimiter=<,> Escape=<#> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.Quote quote4 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean12 = cSVFormat11.isNullHandling();
        boolean boolean14 = cSVFormat11.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withDelimiter('#');
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat7.withHeader(strArray18);
        java.lang.String[] strArray21 = cSVFormat7.getHeader();
        java.lang.String[] strArray22 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        java.lang.Character char34 = cSVFormat33.getQuoteChar();
        cSVFormat33.validate();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean38 = cSVFormat37.isNullHandling();
        boolean boolean40 = cSVFormat37.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withDelimiter('#');
        java.lang.String[] strArray44 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withHeader(strArray44);
        boolean boolean46 = cSVFormat42.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat42.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray51 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withHeader(strArray51);
        boolean boolean53 = cSVFormat52.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withDelimiter('4');
        java.lang.String[] strArray56 = cSVFormat55.getHeader();
        boolean boolean57 = cSVFormat33.equals((java.lang.Object) strArray56);
        java.lang.String str58 = cSVFormat7.format((java.lang.Object[]) strArray56);
        java.lang.String str59 = cSVFormat6.format((java.lang.Object[]) strArray56);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false\thi!" + "'", str58, "Delimiter=<#> SkipHeaderRecord:false\thi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false,hi!#" + "'", str59, "Delimiter=<#> SkipHeaderRecord:false,hi!#");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        java.lang.String str9 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean12 = cSVFormat11.isNullHandling();
        boolean boolean14 = cSVFormat11.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withDelimiter('#');
        org.apache.commons.csv.Quote quote17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("");
        java.lang.Character char21 = cSVFormat20.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentStart(' ');
        java.lang.String str25 = cSVFormat22.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withEscape((java.lang.Character) '\"');
        boolean boolean28 = cSVFormat22.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat22.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat31.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat46.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withRecordSeparator('#');
        java.lang.Character char54 = cSVFormat53.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withQuoteChar((java.lang.Character) '#');
        java.lang.Character char57 = cSVFormat56.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteChar((java.lang.Character) '4');
        cSVFormat59.validate();
        java.lang.String[] strArray67 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat59.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat56.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat46.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat22.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat20.withHeader(strArray67);
        java.lang.String str73 = cSVFormat6.format((java.lang.Object[]) strArray67);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\r\n" + "'", str25, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNull(char54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '#' + "'", char57 == '#');
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"\"#aDelimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:falseaaaahi!" + "'", str73, "\"\"#aDelimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:falseaaaahi!");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        org.apache.commons.csv.Quote quote23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuotePolicy(quote23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean27 = cSVFormat26.isNullHandling();
        boolean boolean29 = cSVFormat26.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withDelimiter('#');
        java.lang.String[] strArray33 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withHeader(strArray33);
        java.lang.String str35 = cSVFormat22.format((java.lang.Object[]) strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withHeader(strArray33);
        java.lang.String str37 = cSVFormat6.format((java.lang.Object[]) strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat6.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withEscape(',');
        boolean boolean42 = cSVFormat41.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote19 = cSVFormat16.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(quote19);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\"');
        java.lang.String str6 = cSVFormat5.getNullString();
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuotePolicy(quote7);
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        java.lang.String str10 = cSVFormat8.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<\t> Escape=<\"> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str10, "Delimiter=<\t> Escape=<\"> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat3.withQuoteChar((java.lang.Character) '4');
        java.lang.String str55 = cSVFormat3.getNullString();
        boolean boolean56 = cSVFormat3.isNullHandling();
        java.lang.Character char57 = cSVFormat3.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withRecordSeparator(',');
        char char62 = cSVFormat61.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\"' + "'", char57 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + char62 + "' != '" + ',' + "'", char62 == ',');
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray23 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat6.withHeader(strArray23);
        java.lang.Character char26 = cSVFormat25.getQuoteChar();
        boolean boolean27 = cSVFormat25.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\t> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(char26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuotePolicy(quote2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentStart('4');
        boolean boolean8 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentStart((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteChar((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean5 = cSVFormat4.isNullHandling();
        boolean boolean7 = cSVFormat4.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('#');
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withHeader(strArray11);
        java.lang.String[] strArray14 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withRecordSeparator('\t');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.Character char24 = cSVFormat23.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withSkipHeaderRecord(false);
        java.lang.String str27 = cSVFormat26.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        boolean boolean40 = cSVFormat36.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat36.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat36.withEscape((java.lang.Character) '4');
        java.lang.String[] strArray47 = new java.lang.String[] { "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]", "Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat36.withHeader(strArray47);
        java.lang.String str49 = cSVFormat29.format((java.lang.Object[]) strArray47);
        java.lang.String str50 = cSVFormat16.format((java.lang.Object[]) strArray47);
        org.apache.commons.csv.Quote quote51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat16.withQuotePolicy(quote51);
        boolean boolean53 = cSVFormat16.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(char24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]", "Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false" });
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]#Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:falseDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str49, "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]#Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:falseDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]\tDelimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false" + "'", str50, "Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]\tDelimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        java.lang.String[] strArray10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat6.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart(',');
        boolean boolean20 = cSVFormat17.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withCommentStart('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withCommentStart('\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.Quote quote14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuotePolicy(quote14);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        java.lang.Character char7 = cSVFormat6.getEscape();
        java.lang.String str8 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat3.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat55.withIgnoreEmptyLines(true);
        boolean boolean60 = cSVFormat54.equals((java.lang.Object) cSVFormat55);
        java.lang.Character char61 = cSVFormat54.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat54.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean68 = cSVFormat67.isNullHandling();
        boolean boolean70 = cSVFormat67.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat67.withDelimiter('#');
        java.lang.Character char73 = cSVFormat72.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat72.withSkipHeaderRecord(false);
        boolean boolean76 = cSVFormat75.isEscaping();
        org.apache.commons.csv.Quote quote77 = null;
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat75.withQuotePolicy(quote77);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat75.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat75.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat75.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> CommentStart=<#> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean85 = cSVFormat65.equals((java.lang.Object) cSVFormat75);
        org.apache.commons.csv.Quote quote86 = null;
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat75.withQuotePolicy(quote86);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + 'a' + "'", char61 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNull(char73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(cSVFormat87);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        java.lang.String[] strArray10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean13 = cSVFormat12.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withHeader(strArray24);
        java.lang.String str26 = cSVFormat22.toString();
        java.lang.Object obj27 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean31 = cSVFormat30.isNullHandling();
        boolean boolean33 = cSVFormat30.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withDelimiter('#');
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withHeader(strArray37);
        boolean boolean39 = cSVFormat35.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray44 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean48 = cSVFormat47.isNullHandling();
        boolean boolean50 = cSVFormat47.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withDelimiter('#');
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withHeader(strArray54);
        boolean boolean56 = cSVFormat52.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat52.withQuoteChar((java.lang.Character) 'a');
        boolean boolean59 = cSVFormat58.isQuoting();
        java.lang.Class<?> wildcardClass60 = cSVFormat58.getClass();
        java.lang.Object[] objArray61 = new java.lang.Object[] { cSVFormat22, obj27, '#', cSVFormat45, cSVFormat58 };
        java.lang.String str62 = cSVFormat15.format(objArray61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat15.withIgnoreSurroundingSpaces(false);
        java.lang.Character char65 = cSVFormat64.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean70 = cSVFormat69.isNullHandling();
        boolean boolean72 = cSVFormat69.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat69.withDelimiter('#');
        java.lang.String[] strArray76 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat74.withHeader(strArray76);
        boolean boolean78 = cSVFormat74.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat74.withIgnoreEmptyLines(true);
        boolean boolean81 = cSVFormat67.equals((java.lang.Object) cSVFormat80);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat67.withSkipHeaderRecord(true);
        java.lang.Character char84 = cSVFormat67.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat67.withCommentStart((java.lang.Character) '4');
        boolean boolean87 = cSVFormat6.equals((java.lang.Object) cSVFormat67);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat67.withQuoteChar('#');
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat89.withEscape('#');
        java.io.Reader reader92 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser93 = cSVFormat91.parse(reader92);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str26, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + char65 + "' != '" + '\"' + "'", char65 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertArrayEquals(strArray76, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertTrue("'" + char84 + "' != '" + '#' + "'", char84 == '#');
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat91);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        java.lang.String str19 = cSVFormat12.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str19, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        java.lang.String str11 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withCommentStart('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteChar(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator("Delimiter=<a> RecordSeparator=<Delimiter=< > SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean12 = cSVFormat11.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentStart('4');
        java.lang.String str15 = cSVFormat14.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        boolean boolean23 = cSVFormat17.isCommentingEnabled();
        boolean boolean24 = cSVFormat17.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withCommentStart(' ');
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        java.lang.String str28 = cSVFormat26.format(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withRecordSeparator("#");
        java.lang.String str33 = cSVFormat32.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        char char41 = cSVFormat40.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean44 = cSVFormat43.isNullHandling();
        boolean boolean46 = cSVFormat43.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat43.withDelimiter('#');
        java.lang.String[] strArray50 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withHeader(strArray50);
        java.lang.String str52 = cSVFormat40.format((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat32.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat14.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat10.withHeader(strArray50);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertArrayEquals(objArray27, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#" + "'", str33, "#");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '#' + "'", char41 == '#');
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withEscape((java.lang.Character) '#');
        java.lang.Character char21 = cSVFormat12.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat12.withQuoteChar((java.lang.Character) '4');
        java.lang.String str24 = cSVFormat23.getNullString();
        java.lang.String str25 = cSVFormat23.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withRecordSeparator('#');
        org.apache.commons.csv.Quote quote11 = cSVFormat10.getQuotePolicy();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withQuoteChar(' ');
        java.lang.Character char21 = cSVFormat20.getEscape();
        boolean boolean22 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentStart((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuoteChar((java.lang.Character) '\"');
        boolean boolean29 = cSVFormat26.isNullHandling();
        boolean boolean30 = cSVFormat26.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        java.lang.Character char11 = cSVFormat10.getQuoteChar();
        java.lang.String str12 = cSVFormat10.getRecordSeparator();
        boolean boolean13 = cSVFormat10.getIgnoreEmptyLines();
        java.lang.Character char14 = cSVFormat10.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withIgnoreSurroundingSpaces(true);
        boolean boolean17 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withCommentStart((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat10.withEscape((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        org.apache.commons.csv.Quote quote10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuotePolicy(quote10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.Quote quote14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuotePolicy(quote14);
        java.lang.Character char16 = cSVFormat15.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withNullString("Delimiter=<a> RecordSeparator=<Delimiter=<a> CommentStart=<#> RecordSeparator=< > SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(char16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentStart('#');
        char char7 = cSVFormat6.getDelimiter();
        char char8 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuoteChar('\t');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean12 = cSVFormat11.isQuoting();
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuotePolicy(quote13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar((java.lang.Character) 'a');
        java.lang.String str19 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withCommentStart((java.lang.Character) '\"');
        java.lang.String str22 = cSVFormat18.getRecordSeparator();
        boolean boolean23 = cSVFormat10.equals((java.lang.Object) str22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat10.withRecordSeparator("Delimiter=< > Escape=<\"> QuoteChar=< > RecordSeparator=<#> SkipHeaderRecord:false");
        java.lang.String str26 = cSVFormat25.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + 'a' + "'", char7 == 'a');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<\t> QuoteChar=<a> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str19, "Delimiter=<\t> QuoteChar=<a> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\r\n" + "'", str22, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuoteChar((java.lang.Character) '4');
        java.lang.Character char17 = cSVFormat16.getEscape();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '#' + "'", char17 == '#');
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart((java.lang.Character) 'a');
        boolean boolean15 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withHeader(strArray24);
        boolean boolean26 = cSVFormat22.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat22.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withIgnoreSurroundingSpaces(false);
        boolean boolean33 = cSVFormat6.equals((java.lang.Object) cSVFormat30);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withRecordSeparator("Delimiter=<#> Escape=< > QuoteChar=<a> CommentStart=<\t> SkipHeaderRecord:false");
        org.apache.commons.csv.Quote quote36 = cSVFormat30.getQuotePolicy();
        boolean boolean37 = cSVFormat30.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(quote36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.Quote quote4 = cSVFormat2.getQuotePolicy();
        org.apache.commons.csv.Quote quote5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuotePolicy(quote5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuoteChar((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withQuoteChar('\"');
        boolean boolean11 = cSVFormat2.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(quote4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withRecordSeparator('\t');
        char char15 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + 'a' + "'", char15 == 'a');
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.Character char3 = cSVFormat2.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape('\t');
        org.apache.commons.csv.Quote quote6 = cSVFormat5.getQuotePolicy();
        boolean boolean7 = cSVFormat5.isEscaping();
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quote6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        boolean boolean11 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean18 = cSVFormat17.isNullHandling();
        boolean boolean20 = cSVFormat17.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean25 = cSVFormat24.isNullHandling();
        boolean boolean27 = cSVFormat24.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withDelimiter('#');
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withRecordSeparator("");
        java.lang.Character char34 = cSVFormat33.getQuoteChar();
        java.lang.String str35 = cSVFormat33.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean38 = cSVFormat37.isNullHandling();
        boolean boolean40 = cSVFormat37.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withDelimiter('#');
        org.apache.commons.csv.Quote quote43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuotePolicy(quote43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean47 = cSVFormat46.isNullHandling();
        boolean boolean49 = cSVFormat46.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withDelimiter('#');
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withHeader(strArray53);
        java.lang.String str55 = cSVFormat42.format((java.lang.Object[]) strArray53);
        java.lang.String str56 = cSVFormat33.format((java.lang.Object[]) strArray53);
        java.lang.String str57 = cSVFormat22.format((java.lang.Object[]) strArray53);
        java.lang.String str58 = cSVFormat1.format((java.lang.Object[]) strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean61 = cSVFormat60.isNullHandling();
        boolean boolean63 = cSVFormat60.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat60.withDelimiter('#');
        org.apache.commons.csv.Quote quote66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withQuotePolicy(quote66);
        org.apache.commons.csv.Quote quote68 = null;
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat65.withQuotePolicy(quote68);
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean72 = cSVFormat71.isNullHandling();
        boolean boolean74 = cSVFormat71.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat71.withDelimiter('#');
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat76.withHeader(strArray78);
        boolean boolean80 = cSVFormat76.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat76.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray85 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat82.withHeader(strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat69.withHeader(strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat1.withHeader(strArray85);
        org.apache.commons.csv.Quote quote89 = null;
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat88.withQuotePolicy(quote89);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat90.withNullString("Delimiter=<#> CommentStart=<\t> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(char34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat87);
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertNotNull(cSVFormat92);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean13 = cSVFormat12.isNullHandling();
        boolean boolean15 = cSVFormat12.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withDelimiter('#');
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeader(strArray19);
        boolean boolean21 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray26 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat10.withHeader(strArray26);
        boolean boolean29 = cSVFormat28.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        cSVFormat1.validate();
        boolean boolean6 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape(',');
        org.apache.commons.csv.Quote quote9 = cSVFormat1.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withNullString("###");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentStart(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat14.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withEscape(',');
        boolean boolean33 = cSVFormat29.equals((java.lang.Object) '\"');
        java.lang.String[] strArray34 = cSVFormat29.getHeader();
        boolean boolean35 = cSVFormat1.equals((java.lang.Object) cSVFormat29);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat29.withCommentStart((java.lang.Character) 'a');
        java.lang.String str38 = cSVFormat29.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quote9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true" + "'", str38, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean11 = cSVFormat10.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape('a');
        boolean boolean14 = cSVFormat10.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withQuoteChar('\"');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat18.withQuoteChar((java.lang.Character) ',');
        java.lang.String str25 = cSVFormat18.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat18.withEscape((java.lang.Character) ',');
        boolean boolean28 = cSVFormat1.equals((java.lang.Object) ',');
        java.lang.String str29 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\r\n" + "'", str25, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str29, "Delimiter=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.Character char3 = cSVFormat2.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteChar((java.lang.Character) '#');
        java.lang.Character char6 = cSVFormat5.getQuoteChar();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar((java.lang.Character) '4');
        cSVFormat8.validate();
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat5.withHeader(strArray16);
        boolean boolean19 = cSVFormat5.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        boolean boolean24 = cSVFormat21.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('#');
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat5.withHeader(strArray28);
        java.lang.String str31 = cSVFormat30.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "\"\"#", "Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "aa", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#" + "'", str31, "#");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean15 = cSVFormat14.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean20 = cSVFormat14.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteChar((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean27 = cSVFormat26.isNullHandling();
        boolean boolean29 = cSVFormat26.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withDelimiter('#');
        org.apache.commons.csv.Quote quote32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuotePolicy(quote32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        java.lang.String str44 = cSVFormat31.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat22.withHeader(strArray42);
        boolean boolean46 = cSVFormat14.equals((java.lang.Object) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean49 = cSVFormat48.isNullHandling();
        boolean boolean51 = cSVFormat48.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withDelimiter('#');
        org.apache.commons.csv.Quote quote54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withQuotePolicy(quote54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withRecordSeparator("");
        java.lang.Character char58 = cSVFormat57.getQuoteChar();
        java.lang.String str59 = cSVFormat57.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean62 = cSVFormat61.isNullHandling();
        boolean boolean64 = cSVFormat61.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat61.withDelimiter('#');
        org.apache.commons.csv.Quote quote67 = null;
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withQuotePolicy(quote67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean71 = cSVFormat70.isNullHandling();
        boolean boolean73 = cSVFormat70.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat70.withDelimiter('#');
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat75.withHeader(strArray77);
        java.lang.String str79 = cSVFormat66.format((java.lang.Object[]) strArray77);
        java.lang.String str80 = cSVFormat57.format((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat14.withHeader(strArray77);
        boolean boolean82 = cSVFormat10.equals((java.lang.Object) cSVFormat81);
        org.apache.commons.csv.Quote quote83 = cSVFormat81.getQuotePolicy();
        char char84 = cSVFormat81.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNull(char58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(quote83);
        org.junit.Assert.assertTrue("'" + char84 + "' != '" + 'a' + "'", char84 == 'a');
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteChar((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withNullString("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false");
        boolean boolean21 = cSVFormat16.isQuoting();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str2 = cSVFormat1.getNullString();
        java.lang.Character char3 = cSVFormat1.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("");
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withCommentStart('#');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat44.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat44.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean55 = cSVFormat54.isNullHandling();
        boolean boolean57 = cSVFormat54.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withDelimiter('#');
        java.lang.String[] strArray61 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withHeader(strArray61);
        boolean boolean63 = cSVFormat59.getSkipHeaderRecord();
        boolean boolean64 = cSVFormat59.isCommentingEnabled();
        boolean boolean65 = cSVFormat59.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat59.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat59.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withEscape('\"');
        boolean boolean72 = cSVFormat52.equals((java.lang.Object) cSVFormat71);
        java.lang.String str73 = cSVFormat71.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.Quote quote11 = cSVFormat10.getQuotePolicy();
        org.apache.commons.csv.Quote quote12 = cSVFormat10.getQuotePolicy();
        java.lang.Character char13 = cSVFormat10.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withDelimiter('4');
        cSVFormat10.validate();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withNullString("Delimiter=<\t> Escape=<#> QuoteChar=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        java.lang.String str19 = cSVFormat10.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<a> CommentStart=< > SkipHeaderRecord:false" + "'", str19, "Delimiter=<a> CommentStart=< > SkipHeaderRecord:false");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withCommentStart((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuotePolicy(quote23);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        boolean boolean4 = cSVFormat0.isCommentingEnabled();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('#');
        java.lang.String str7 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withEscape('#');
        java.lang.Character char10 = cSVFormat9.getCommentStart();
        java.lang.Class<?> wildcardClass11 = cSVFormat9.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentStart(' ');
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        boolean boolean4 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat0.isNullHandling();
        java.lang.Character char6 = cSVFormat0.getQuoteChar();
        boolean boolean7 = cSVFormat0.isCommentingEnabled();
        java.lang.String[] strArray8 = cSVFormat0.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        boolean boolean11 = cSVFormat6.isCommentingEnabled();
        boolean boolean12 = cSVFormat6.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        boolean boolean24 = cSVFormat18.isCommentingEnabled();
        boolean boolean25 = cSVFormat18.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat18.withCommentStart(' ');
        org.apache.commons.csv.Quote quote28 = cSVFormat27.getQuotePolicy();
        org.apache.commons.csv.Quote quote29 = cSVFormat27.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        org.apache.commons.csv.Quote quote37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuotePolicy(quote37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withRecordSeparator("");
        java.lang.Character char41 = cSVFormat40.getQuoteChar();
        java.lang.String str42 = cSVFormat40.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean45 = cSVFormat44.isNullHandling();
        boolean boolean47 = cSVFormat44.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withDelimiter('#');
        org.apache.commons.csv.Quote quote50 = null;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withQuotePolicy(quote50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean54 = cSVFormat53.isNullHandling();
        boolean boolean56 = cSVFormat53.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat53.withDelimiter('#');
        java.lang.String[] strArray60 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withHeader(strArray60);
        java.lang.String str62 = cSVFormat49.format((java.lang.Object[]) strArray60);
        java.lang.String str63 = cSVFormat40.format((java.lang.Object[]) strArray60);
        java.lang.String str64 = cSVFormat27.format((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat14.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withEscape((java.lang.Character) '\t');
        boolean boolean68 = cSVFormat65.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat65.withCommentStart('\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(quote28);
        org.junit.Assert.assertNull(quote29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNull(char41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cSVFormat70);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray15 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withRecordSeparator("Delimiter=<#> Escape=<#> QuoteChar=<a> RecordSeparator=<a> SkipHeaderRecord:false");
        java.lang.Character char25 = cSVFormat20.getCommentStart();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.String str12 = cSVFormat10.format(objArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withRecordSeparator("#");
        java.lang.Character char17 = cSVFormat16.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean22 = cSVFormat21.isNullHandling();
        boolean boolean24 = cSVFormat21.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('#');
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withHeader(strArray28);
        org.apache.commons.csv.Quote quote30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withQuotePolicy(quote30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.Quote quote34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withQuotePolicy(quote34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean38 = cSVFormat37.isNullHandling();
        boolean boolean40 = cSVFormat37.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withDelimiter('#');
        org.apache.commons.csv.Quote quote43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuotePolicy(quote43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean49 = cSVFormat48.isNullHandling();
        boolean boolean51 = cSVFormat48.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withDelimiter('#');
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withHeader(strArray55);
        boolean boolean57 = cSVFormat53.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat53.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean62 = cSVFormat61.isNullHandling();
        boolean boolean64 = cSVFormat61.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat61.withDelimiter('#');
        org.apache.commons.csv.Quote quote67 = null;
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withQuotePolicy(quote67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean71 = cSVFormat70.isNullHandling();
        boolean boolean73 = cSVFormat70.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat70.withDelimiter('#');
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat75.withHeader(strArray77);
        java.lang.String str79 = cSVFormat66.format((java.lang.Object[]) strArray77);
        java.lang.String str80 = cSVFormat53.format((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat44.withHeader(strArray77);
        java.lang.String str82 = cSVFormat31.format((java.lang.Object[]) strArray77);
        java.lang.String str83 = cSVFormat19.format((java.lang.Object[]) strArray77);
        boolean boolean84 = cSVFormat19.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(char17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "#" + "'", str83, "#");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean10 = cSVFormat9.isNullHandling();
        boolean boolean12 = cSVFormat9.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withDelimiter('#');
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeader(strArray16);
        boolean boolean18 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean23 = cSVFormat22.isNullHandling();
        boolean boolean25 = cSVFormat22.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('#');
        org.apache.commons.csv.Quote quote28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuotePolicy(quote28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean32 = cSVFormat31.isNullHandling();
        boolean boolean34 = cSVFormat31.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withDelimiter('#');
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(strArray38);
        java.lang.String str40 = cSVFormat27.format((java.lang.Object[]) strArray38);
        java.lang.String str41 = cSVFormat14.format((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentStart('4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withEscape(' ');
        boolean boolean49 = cSVFormat44.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat44.withRecordSeparator("Delimiter=<#> SkipHeaderRecord:false\thi!");
        java.lang.Character char52 = cSVFormat51.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.Quote quote55 = null;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withQuotePolicy(quote55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat51.withCommentStart((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNull(char52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape('a');
        java.lang.String str7 = cSVFormat6.toString();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat6.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<a> Escape=<a> SkipHeaderRecord:false" + "'", str7, "Delimiter=<a> Escape=<a> SkipHeaderRecord:false");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentStart((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteChar('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('#');
        java.lang.String str11 = cSVFormat8.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuoteChar(',');
        org.apache.commons.csv.Quote quote14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuotePolicy(quote14);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.Quote quote13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuotePolicy(quote13);
        org.apache.commons.csv.Quote quote15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuotePolicy(quote15);
        java.lang.String str17 = cSVFormat12.getRecordSeparator();
        boolean boolean18 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withQuoteChar(' ');
        java.lang.Character char21 = cSVFormat20.getEscape();
        boolean boolean22 = cSVFormat20.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withQuoteChar((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withRecordSeparator(' ');
        org.apache.commons.csv.Quote quote27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withQuotePolicy(quote27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean31 = cSVFormat30.isNullHandling();
        boolean boolean33 = cSVFormat30.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withDelimiter('#');
        char char36 = cSVFormat35.getDelimiter();
        java.lang.String[] strArray37 = cSVFormat35.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withRecordSeparator('a');
        boolean boolean40 = cSVFormat39.isCommentingEnabled();
        java.lang.Character char41 = cSVFormat39.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withRecordSeparator('\"');
        boolean boolean44 = cSVFormat28.equals((java.lang.Object) cSVFormat43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withSkipHeaderRecord(false);
        java.lang.Class<?> wildcardClass47 = cSVFormat43.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + '#' + "'", char36 == '#');
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(char41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.Quote quote2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuotePolicy(quote2);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        org.apache.commons.csv.Quote quote7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuotePolicy(quote7);
        org.apache.commons.csv.Quote quote9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuotePolicy(quote9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withEscape((java.lang.Character) '\"');
        java.lang.Character char19 = cSVFormat14.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat14.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withCommentStart('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(char19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withCommentStart(' ');
        org.apache.commons.csv.Quote quote11 = cSVFormat10.getQuotePolicy();
        org.apache.commons.csv.Quote quote12 = cSVFormat10.getQuotePolicy();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) '\"');
        java.lang.String str17 = cSVFormat14.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quote11);
        org.junit.Assert.assertNull(quote12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.Character char7 = cSVFormat6.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentStart('4');
        java.lang.String str20 = cSVFormat19.getNullString();
        java.lang.Class<?> wildcardClass21 = cSVFormat19.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        java.lang.String str3 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape('a');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withDelimiter('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteChar('#');
        boolean boolean11 = cSVFormat8.getIgnoreSurroundingSpaces();
        boolean boolean12 = cSVFormat8.isEscaping();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n" + "'", str3, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        boolean boolean7 = cSVFormat1.isCommentingEnabled();
        boolean boolean8 = cSVFormat1.isEscaping();
        cSVFormat1.validate();
        char char10 = cSVFormat1.getDelimiter();
        java.lang.String str11 = cSVFormat1.getNullString();
        boolean boolean12 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + 'a' + "'", char10 == 'a');
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        boolean boolean5 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.isNullHandling();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('#');
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withHeader(strArray14);
        char char16 = cSVFormat12.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withNullString("Delimiter=<#> QuoteChar=<a> SkipHeaderRecord:false Header:[Delimiter=<#> SkipHeaderRecord:false, hi!]");
        boolean boolean19 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        boolean boolean20 = cSVFormat12.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '#' + "'", char16 == '#');
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean2 = cSVFormat1.isNullHandling();
        boolean boolean4 = cSVFormat1.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withDelimiter('#');
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(strArray8);
        boolean boolean10 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withQuoteChar((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentStart((java.lang.Character) 'a');
        boolean boolean15 = cSVFormat6.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat6.withEscape('4');
        boolean boolean18 = cSVFormat6.isEscaping();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean21 = cSVFormat20.isNullHandling();
        boolean boolean23 = cSVFormat20.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withDelimiter('#');
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withHeader(strArray27);
        boolean boolean29 = cSVFormat25.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat25.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray34 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withHeader(strArray34);
        boolean boolean36 = cSVFormat35.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean41 = cSVFormat40.isNullHandling();
        boolean boolean43 = cSVFormat40.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withDelimiter('#');
        char char46 = cSVFormat45.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean49 = cSVFormat48.isNullHandling();
        boolean boolean51 = cSVFormat48.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withDelimiter('#');
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withHeader(strArray55);
        java.lang.String str57 = cSVFormat45.format((java.lang.Object[]) strArray55);
        java.lang.String str58 = cSVFormat35.format((java.lang.Object[]) strArray55);
        java.lang.String str59 = cSVFormat6.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat6.withEscape((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '#' + "'", char46 == '#');
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "aa" + "'", str58, "aa");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(cSVFormat61);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.isQuoting();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean6 = cSVFormat5.isNullHandling();
        boolean boolean8 = cSVFormat5.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('#');
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeader(strArray12);
        java.lang.String str14 = cSVFormat10.toString();
        java.lang.Object obj15 = new java.lang.Object();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean19 = cSVFormat18.isNullHandling();
        boolean boolean21 = cSVFormat18.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('#');
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(strArray25);
        boolean boolean27 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean36 = cSVFormat35.isNullHandling();
        boolean boolean38 = cSVFormat35.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('#');
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withHeader(strArray42);
        boolean boolean44 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat40.withQuoteChar((java.lang.Character) 'a');
        boolean boolean47 = cSVFormat46.isQuoting();
        java.lang.Class<?> wildcardClass48 = cSVFormat46.getClass();
        java.lang.Object[] objArray49 = new java.lang.Object[] { cSVFormat10, obj15, '#', cSVFormat33, cSVFormat46 };
        java.lang.String str50 = cSVFormat3.format(objArray49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat3.withSkipHeaderRecord(true);
        boolean boolean55 = cSVFormat54.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean58 = cSVFormat57.isNullHandling();
        boolean boolean60 = cSVFormat57.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withDelimiter('#');
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat62.withHeader(strArray64);
        boolean boolean66 = cSVFormat62.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat62.withQuoteChar((java.lang.Character) 'a');
        java.lang.String[] strArray71 = new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" };
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat68.withHeader(strArray71);
        boolean boolean73 = cSVFormat72.isNullHandling();
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat72.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat77 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean78 = cSVFormat77.isNullHandling();
        boolean boolean80 = cSVFormat77.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat77.withDelimiter('#');
        char char83 = cSVFormat82.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat85 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean86 = cSVFormat85.isNullHandling();
        boolean boolean88 = cSVFormat85.equals((java.lang.Object) (byte) 0);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat85.withDelimiter('#');
        java.lang.String[] strArray92 = new java.lang.String[] { "" };
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat90.withHeader(strArray92);
        java.lang.String str94 = cSVFormat82.format((java.lang.Object[]) strArray92);
        java.lang.String str95 = cSVFormat72.format((java.lang.Object[]) strArray92);
        org.apache.commons.csv.CSVFormat cSVFormat96 = cSVFormat54.withHeader(strArray92);
        boolean boolean97 = cSVFormat96.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str14, "Delimiter=<#> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "Delimiter=<#> SkipHeaderRecord:false", "hi!" });
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertTrue("'" + char83 + "' != '" + '#' + "'", char83 == '#');
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(cSVFormat93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "aa" + "'", str95, "aa");
        org.junit.Assert.assertNotNull(cSVFormat96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }
}

