package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat6.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat6.getAutoFlush();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.Character char10 = cSVFormat7.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteMode(quoteMode10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat4.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withHeader(strArray10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        char char11 = cSVFormat10.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        java.lang.Character char19 = cSVFormat18.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat18", cSVFormat17.equals(cSVFormat18) ? cSVFormat17.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withEscape((java.lang.Character) '\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat7.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat8.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode19 = cSVFormat17.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat18", cSVFormat17.equals(cSVFormat18) ? cSVFormat17.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAutoFlush(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("hi!");
        java.lang.String str14 = cSVFormat13.toString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withTrim();
        boolean boolean17 = cSVFormat16.getIgnoreHeaderCase();
        java.lang.String str18 = cSVFormat16.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat16.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withAllowMissingColumnNames(true);
        java.lang.String[] strArray30 = cSVFormat29.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withAllowMissingColumnNames();
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat16.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat13.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat6.withHeader(strArray32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat6.getIgnoreHeaderCase();
        java.lang.String str8 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withIgnoreHeaderCase(true);
        boolean boolean16 = cSVFormat0.equals((java.lang.Object) cSVFormat15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat15", cSVFormat5.equals(cSVFormat15) ? cSVFormat5.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat1.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withHeader(resultSetMetaData11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat6.printer();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        java.lang.Character char19 = cSVFormat18.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat18", cSVFormat17.equals(cSVFormat18) ? cSVFormat17.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withRecordSeparator(',');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withEscape((java.lang.Character) '\\');
        java.lang.String str14 = cSVFormat6.getRecordSeparator();
        boolean boolean15 = cSVFormat6.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat6.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        boolean boolean7 = cSVFormat4.getTrim();
        boolean boolean8 = cSVFormat4.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.String[] strArray10 = cSVFormat9.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat9", cSVFormat4.equals(cSVFormat9) ? cSVFormat4.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat2.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        boolean boolean12 = cSVFormat11.getTrim();
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSet13);
        boolean boolean15 = cSVFormat11.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withIgnoreHeaderCase(true);
        boolean boolean18 = cSVFormat17.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat17", cSVFormat2.equals(cSVFormat17) ? cSVFormat2.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat8.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean3 = cSVFormat2.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat2.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat4", cSVFormat2.equals(cSVFormat4) ? cSVFormat2.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEscape((java.lang.Character) ' ');
        java.lang.String str12 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat14", cSVFormat11.equals(cSVFormat14) ? cSVFormat11.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat10.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        java.lang.Character char9 = cSVFormat4.getEscapeCharacter();
        boolean boolean10 = cSVFormat4.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat13", cSVFormat12.equals(cSVFormat13) ? cSVFormat12.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat4.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat10", cSVFormat4.equals(cSVFormat10) ? cSVFormat4.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String str13 = cSVFormat12.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(resultSet14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withEscape((java.lang.Character) '\\');
        java.lang.String str14 = cSVFormat6.getRecordSeparator();
        boolean boolean15 = cSVFormat6.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        boolean boolean24 = cSVFormat19.equals((java.lang.Object) cSVFormat23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean30 = cSVFormat29.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withNullString("\r\n");
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withHeaderComments(objArray33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat27.withHeaderComments(objArray33);
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withTrim();
        boolean boolean43 = cSVFormat38.equals((java.lang.Object) cSVFormat42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat38.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withTrim();
        boolean boolean48 = cSVFormat47.getIgnoreHeaderCase();
        java.lang.String str49 = cSVFormat47.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat47.withIgnoreHeaderCase(false);
        java.lang.Character char54 = cSVFormat53.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode64 = null;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withQuoteMode(quoteMode64);
        java.sql.ResultSetMetaData resultSetMetaData66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat63.withHeader(resultSetMetaData66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withNullString("hi!");
        boolean boolean70 = cSVFormat67.isQuoteCharacterSet();
        boolean boolean71 = cSVFormat60.equals((java.lang.Object) boolean70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat60.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat74 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat74.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat75.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withAllowMissingColumnNames(true);
        boolean boolean79 = cSVFormat76.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat80 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter81 = cSVFormat80.printer();
        org.apache.commons.csv.CSVFormat cSVFormat82 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode83 = null;
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat82.withQuoteMode(quoteMode83);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat84.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat84.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat84.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode89 = null;
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat84.withQuoteMode(quoteMode89);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat84.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray93 = new java.lang.Object[] { cSVFormat55, cSVFormat72, "\\N", boolean79, cSVFormat80, cSVFormat92 };
        java.lang.String str94 = cSVFormat53.format(objArray93);
        org.apache.commons.csv.CSVFormat cSVFormat95 = cSVFormat38.withHeaderComments(objArray93);
        org.apache.commons.csv.CSVFormat cSVFormat96 = cSVFormat27.withHeaderComments(objArray93);
        java.lang.String str97 = cSVFormat16.format(objArray93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean8 = cSVFormat1.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        boolean boolean9 = cSVFormat4.getAllowMissingColumnNames();
        boolean boolean10 = cSVFormat4.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean12 = cSVFormat11.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withNullString("\r\n");
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat4.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreHeaderCase(true);
        boolean boolean20 = cSVFormat19.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat19", cSVFormat4.equals(cSVFormat19) ? cSVFormat4.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat15", cSVFormat11.equals(cSVFormat15) ? cSVFormat11.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("hi!");
        boolean boolean14 = cSVFormat11.isQuoteCharacterSet();
        boolean boolean15 = cSVFormat4.equals((java.lang.Object) boolean14);
        java.lang.String[] strArray18 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat4.withHeader(strArray18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker('a');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10L, cSVFormat26, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat22.withHeaderComments(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat19.withHeaderComments(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withIgnoreHeaderCase();
        boolean boolean34 = cSVFormat32.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat19 and cSVFormat33", cSVFormat19.equals(cSVFormat33) ? cSVFormat19.hashCode() == cSVFormat33.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase();
        boolean boolean14 = cSVFormat11.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withEscape((java.lang.Character) '\\');
        java.lang.String str14 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withNullString("10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(resultSetMetaData20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withNullString("hi!");
        java.sql.ResultSet resultSet24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withHeader(resultSet24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withIgnoreHeaderCase();
        boolean boolean30 = cSVFormat6.equals((java.lang.Object) cSVFormat29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat29", cSVFormat0.equals(cSVFormat29) ? cSVFormat0.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        boolean boolean17 = cSVFormat16.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteMode(quoteMode21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withTrim();
        boolean boolean27 = cSVFormat22.equals((java.lang.Object) cSVFormat26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat22.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withTrailingDelimiter(false);
        java.lang.String[] strArray36 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat6.withHeader(strArray36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteMode(quoteMode26);
        java.sql.ResultSetMetaData resultSetMetaData28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withHeader(resultSetMetaData28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withNullString("hi!");
        boolean boolean32 = cSVFormat29.isQuoteCharacterSet();
        boolean boolean33 = cSVFormat22.equals((java.lang.Object) boolean32);
        java.lang.String[] strArray36 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat22.withHeader(strArray36);
        java.lang.String str38 = cSVFormat17.format((java.lang.Object[]) strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray36);
        boolean boolean40 = cSVFormat39.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData44 = null;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withHeader(resultSetMetaData44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat43", cSVFormat3.equals(cSVFormat43) ? cSVFormat3.hashCode() == cSVFormat43.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        boolean boolean20 = cSVFormat15.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteMode(quoteMode41);
        java.sql.ResultSetMetaData resultSetMetaData43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(resultSetMetaData43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withNullString("hi!");
        boolean boolean47 = cSVFormat44.isQuoteCharacterSet();
        boolean boolean48 = cSVFormat37.equals((java.lang.Object) boolean47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat37.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withAllowMissingColumnNames(true);
        boolean boolean56 = cSVFormat53.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter58 = cSVFormat57.printer();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray70 = new java.lang.Object[] { cSVFormat32, cSVFormat49, "\\N", boolean56, cSVFormat57, cSVFormat69 };
        java.lang.String str71 = cSVFormat30.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat15.withHeaderComments(objArray70);
        java.lang.String str73 = cSVFormat11.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat11.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat74", cSVFormat11.equals(cSVFormat74) ? cSVFormat11.hashCode() == cSVFormat74.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        boolean boolean20 = cSVFormat15.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteMode(quoteMode41);
        java.sql.ResultSetMetaData resultSetMetaData43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(resultSetMetaData43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withNullString("hi!");
        boolean boolean47 = cSVFormat44.isQuoteCharacterSet();
        boolean boolean48 = cSVFormat37.equals((java.lang.Object) boolean47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat37.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withAllowMissingColumnNames(true);
        boolean boolean56 = cSVFormat53.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter58 = cSVFormat57.printer();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray70 = new java.lang.Object[] { cSVFormat32, cSVFormat49, "\\N", boolean56, cSVFormat57, cSVFormat69 };
        java.lang.String str71 = cSVFormat30.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat15.withHeaderComments(objArray70);
        java.lang.String str73 = cSVFormat11.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode75 = null;
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat74.withQuoteMode(quoteMode75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat74", cSVFormat11.equals(cSVFormat74) ? cSVFormat11.hashCode() == cSVFormat74.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withIgnoreHeaderCase();
        boolean boolean16 = cSVFormat11.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat15", cSVFormat11.equals(cSVFormat15) ? cSVFormat11.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withNullString("\r\n");
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withHeaderComments(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withHeaderComments(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withFirstRecordAsHeader();
        java.lang.Character char21 = cSVFormat20.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteMode(quoteMode23);
        java.sql.ResultSetMetaData resultSetMetaData25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withHeader(resultSetMetaData25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withSkipHeaderRecord();
        boolean boolean30 = cSVFormat28.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withIgnoreHeaderCase(true);
        boolean boolean33 = cSVFormat20.equals((java.lang.Object) cSVFormat32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat32", cSVFormat4.equals(cSVFormat32) ? cSVFormat4.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withCommentMarker(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat10", cSVFormat4.equals(cSVFormat10) ? cSVFormat4.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean3 = cSVFormat0.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker('a');
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10L, cSVFormat25, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat21.withHeaderComments(objArray29);
        java.lang.String str31 = cSVFormat16.format(objArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat11.withHeaderComments(objArray29);
        char char33 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withQuote((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withTrim();
        boolean boolean40 = cSVFormat39.getIgnoreHeaderCase();
        java.lang.String str41 = cSVFormat39.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat39.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str47 = cSVFormat46.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuoteMode(quoteMode49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat53.withTrim();
        boolean boolean55 = cSVFormat50.equals((java.lang.Object) cSVFormat54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat50.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat50.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char60 = cSVFormat59.getCommentMarker();
        char char61 = cSVFormat59.getDelimiter();
        boolean boolean62 = cSVFormat59.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode64 = null;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat68.withTrim();
        boolean boolean70 = cSVFormat65.equals((java.lang.Object) cSVFormat69);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat65.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat73.withTrim();
        boolean boolean75 = cSVFormat74.getIgnoreHeaderCase();
        java.lang.String str76 = cSVFormat74.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat74.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat74.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat74.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat83 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat83.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat84.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat85.withAllowMissingColumnNames(true);
        java.lang.String[] strArray88 = cSVFormat87.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat87.withAllowMissingColumnNames();
        java.lang.String[] strArray90 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat89.withHeader(strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat74.withHeader(strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat93 = cSVFormat72.withHeaderComments((java.lang.Object[]) strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat94 = cSVFormat59.withHeaderComments((java.lang.Object[]) strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat95 = cSVFormat46.withHeader(strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat96 = cSVFormat39.withHeaderComments((java.lang.Object[]) strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat97 = cSVFormat37.withHeader(strArray90);
        org.apache.commons.csv.CSVFormat cSVFormat98 = cSVFormat2.withHeader(strArray90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase();
        char char11 = cSVFormat10.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat10", cSVFormat4.equals(cSVFormat10) ? cSVFormat4.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat11", cSVFormat1.equals(cSVFormat11) ? cSVFormat1.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withTrim(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        char char2 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        char char7 = cSVFormat6.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat5.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat5.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char6 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray9 = cSVFormat0.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        boolean boolean20 = cSVFormat15.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteMode(quoteMode41);
        java.sql.ResultSetMetaData resultSetMetaData43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(resultSetMetaData43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withNullString("hi!");
        boolean boolean47 = cSVFormat44.isQuoteCharacterSet();
        boolean boolean48 = cSVFormat37.equals((java.lang.Object) boolean47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat37.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withAllowMissingColumnNames(true);
        boolean boolean56 = cSVFormat53.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter58 = cSVFormat57.printer();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray70 = new java.lang.Object[] { cSVFormat32, cSVFormat49, "\\N", boolean56, cSVFormat57, cSVFormat69 };
        java.lang.String str71 = cSVFormat30.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat15.withHeaderComments(objArray70);
        java.lang.String str73 = cSVFormat11.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat11.withIgnoreHeaderCase();
        java.lang.String[] strArray75 = cSVFormat11.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat74", cSVFormat11.equals(cSVFormat74) ? cSVFormat11.hashCode() == cSVFormat74.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withEscape((java.lang.Character) '\\');
        java.lang.String str14 = cSVFormat6.getRecordSeparator();
        boolean boolean15 = cSVFormat6.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withIgnoreHeaderCase();
        boolean boolean17 = cSVFormat16.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        boolean boolean20 = cSVFormat15.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteMode(quoteMode41);
        java.sql.ResultSetMetaData resultSetMetaData43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(resultSetMetaData43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withNullString("hi!");
        boolean boolean47 = cSVFormat44.isQuoteCharacterSet();
        boolean boolean48 = cSVFormat37.equals((java.lang.Object) boolean47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat37.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withAllowMissingColumnNames(true);
        boolean boolean56 = cSVFormat53.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter58 = cSVFormat57.printer();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray70 = new java.lang.Object[] { cSVFormat32, cSVFormat49, "\\N", boolean56, cSVFormat57, cSVFormat69 };
        java.lang.String str71 = cSVFormat30.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat15.withHeaderComments(objArray70);
        java.lang.String str73 = cSVFormat11.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat74.withAutoFlush(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat74", cSVFormat11.equals(cSVFormat74) ? cSVFormat11.hashCode() == cSVFormat74.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char6 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray9 = cSVFormat0.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean8 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat10", cSVFormat6.equals(cSVFormat10) ? cSVFormat6.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVPrinter cSVPrinter20 = cSVFormat19.printer();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteMode(quoteMode22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withTrim();
        boolean boolean28 = cSVFormat23.equals((java.lang.Object) cSVFormat27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat23.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat23.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char33 = cSVFormat32.getCommentMarker();
        char char34 = cSVFormat32.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withQuoteMode(quoteMode56);
        java.sql.ResultSetMetaData resultSetMetaData58 = null;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat55.withHeader(resultSetMetaData58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withNullString("hi!");
        boolean boolean62 = cSVFormat59.isQuoteCharacterSet();
        boolean boolean63 = cSVFormat52.equals((java.lang.Object) boolean62);
        java.lang.String[] strArray66 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat52.withHeader(strArray66);
        java.lang.String str68 = cSVFormat47.format((java.lang.Object[]) strArray66);
        java.lang.String str69 = cSVFormat32.format((java.lang.Object[]) strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat19.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat9.withHeader(strArray66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(resultSetMetaData9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        boolean boolean19 = cSVFormat18.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat18", cSVFormat17.equals(cSVFormat18) ? cSVFormat17.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withFirstRecordAsHeader();
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker('a');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10L, cSVFormat18, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray22);
        java.lang.String str24 = cSVFormat9.format(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat7.withHeaderComments(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat1.withHeaderComments(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat28", cSVFormat1.equals(cSVFormat28) ? cSVFormat1.hashCode() == cSVFormat28.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) ' ');
        java.lang.String str10 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat2.printer();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker('a');
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10L, cSVFormat19, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeaderComments(objArray23);
        java.lang.String[] strArray25 = cSVFormat15.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat15.withRecordSeparator(',');
        org.apache.commons.csv.QuoteMode quoteMode28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat15.withQuoteMode(quoteMode28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat15.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withQuoteMode(quoteMode36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker('a');
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10L, cSVFormat37, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat33.withHeaderComments(objArray41);
        boolean boolean43 = cSVFormat42.getTrim();
        java.sql.ResultSet resultSet44 = null;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withHeader(resultSet44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode47 = null;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuoteMode(quoteMode47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withQuoteMode(quoteMode63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withCommentMarker('a');
        java.lang.Object[] objArray68 = new java.lang.Object[] { 10L, cSVFormat64, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat60.withHeaderComments(objArray68);
        java.lang.String str70 = cSVFormat55.format(objArray68);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat50.withHeaderComments(objArray68);
        java.lang.String str72 = cSVFormat45.format(objArray68);
        java.lang.String str73 = cSVFormat30.format(objArray68);
        java.lang.String str74 = cSVFormat12.format(objArray68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat12", cSVFormat8.equals(cSVFormat12) ? cSVFormat8.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('\t');
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape(',');
        boolean boolean15 = cSVFormat14.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode23 = cSVFormat22.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat14.withQuoteMode(quoteMode23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat4.withQuoteMode(quoteMode23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat1.withQuoteMode(quoteMode23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withEscape((java.lang.Character) '\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker('4');
        boolean boolean11 = cSVFormat10.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat12", cSVFormat10.equals(cSVFormat12) ? cSVFormat10.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withTrim(true);
        java.lang.String str14 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat6.withEscape((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat6.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat6.withHeader(resultSetMetaData20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat19", cSVFormat0.equals(cSVFormat19) ? cSVFormat0.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase();
        boolean boolean14 = cSVFormat13.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withHeader(resultSet14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char6 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray9 = cSVFormat0.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withHeader(resultSet15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreHeaderCase(true);
        java.lang.Character char15 = cSVFormat14.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat14", cSVFormat10.equals(cSVFormat14) ? cSVFormat10.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        char char2 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass4 = cSVFormat0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEscape((java.lang.Character) ' ');
        java.lang.String str12 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat14", cSVFormat11.equals(cSVFormat14) ? cSVFormat11.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat11", cSVFormat1.equals(cSVFormat11) ? cSVFormat1.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        boolean boolean7 = cSVFormat4.getTrim();
        boolean boolean8 = cSVFormat4.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.String[] strArray10 = cSVFormat4.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat9", cSVFormat4.equals(cSVFormat9) ? cSVFormat4.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withRecordSeparator("\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\",");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames(true);
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase();
        boolean boolean13 = cSVFormat2.equals((java.lang.Object) cSVFormat10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat12", cSVFormat8.equals(cSVFormat12) ? cSVFormat8.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat15.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat21", cSVFormat0.equals(cSVFormat21) ? cSVFormat0.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withIgnoreHeaderCase();
        java.lang.Character char16 = cSVFormat11.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat15", cSVFormat11.equals(cSVFormat15) ? cSVFormat11.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(resultSetMetaData20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withNullString("hi!");
        boolean boolean24 = cSVFormat21.isQuoteCharacterSet();
        boolean boolean25 = cSVFormat14.equals((java.lang.Object) boolean24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withAllowMissingColumnNames(true);
        boolean boolean33 = cSVFormat30.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter35 = cSVFormat34.printer();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat38.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat38.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray47 = new java.lang.Object[] { cSVFormat9, cSVFormat26, "\\N", boolean33, cSVFormat34, cSVFormat46 };
        java.lang.String str48 = cSVFormat7.format(objArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat7.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat7.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat7.withTrim();
        boolean boolean54 = cSVFormat53.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withIgnoreHeaderCase();
        java.lang.Character char56 = cSVFormat55.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat55", cSVFormat0.equals(cSVFormat55) ? cSVFormat0.hashCode() == cSVFormat55.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        boolean boolean20 = cSVFormat15.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteMode(quoteMode41);
        java.sql.ResultSetMetaData resultSetMetaData43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(resultSetMetaData43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withNullString("hi!");
        boolean boolean47 = cSVFormat44.isQuoteCharacterSet();
        boolean boolean48 = cSVFormat37.equals((java.lang.Object) boolean47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat37.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withAllowMissingColumnNames(true);
        boolean boolean56 = cSVFormat53.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter58 = cSVFormat57.printer();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray70 = new java.lang.Object[] { cSVFormat32, cSVFormat49, "\\N", boolean56, cSVFormat57, cSVFormat69 };
        java.lang.String str71 = cSVFormat30.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat15.withHeaderComments(objArray70);
        java.lang.String str73 = cSVFormat11.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat11.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat74", cSVFormat11.equals(cSVFormat74) ? cSVFormat11.hashCode() == cSVFormat74.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withQuote('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat8", cSVFormat4.equals(cSVFormat8) ? cSVFormat4.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean12 = cSVFormat2.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat11", cSVFormat1.equals(cSVFormat11) ? cSVFormat1.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        java.lang.String str3 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withTrim();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withHeader(resultSetMetaData12);
        boolean boolean14 = cSVFormat1.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        boolean boolean9 = cSVFormat4.getAllowMissingColumnNames();
        boolean boolean10 = cSVFormat4.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean12 = cSVFormat11.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withNullString("\r\n");
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat4.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreHeaderCase(true);
        java.lang.String str20 = cSVFormat17.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat19", cSVFormat4.equals(cSVFormat19) ? cSVFormat4.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.String str19 = cSVFormat18.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str7 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteMode(quoteMode9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        boolean boolean15 = cSVFormat10.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char20 = cSVFormat19.getCommentMarker();
        char char21 = cSVFormat19.getDelimiter();
        boolean boolean22 = cSVFormat19.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        boolean boolean30 = cSVFormat25.equals((java.lang.Object) cSVFormat29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat25.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        boolean boolean35 = cSVFormat34.getIgnoreHeaderCase();
        java.lang.String str36 = cSVFormat34.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat34.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat34.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withAllowMissingColumnNames(true);
        java.lang.String[] strArray48 = cSVFormat47.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withAllowMissingColumnNames();
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat34.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat32.withHeaderComments((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat6.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat3.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.String[] strArray58 = cSVFormat57.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat57", cSVFormat3.equals(cSVFormat57) ? cSVFormat3.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str7 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteMode(quoteMode9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        boolean boolean15 = cSVFormat10.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char20 = cSVFormat19.getCommentMarker();
        char char21 = cSVFormat19.getDelimiter();
        boolean boolean22 = cSVFormat19.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        boolean boolean30 = cSVFormat25.equals((java.lang.Object) cSVFormat29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat25.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        boolean boolean35 = cSVFormat34.getIgnoreHeaderCase();
        java.lang.String str36 = cSVFormat34.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat34.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat34.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withAllowMissingColumnNames(true);
        java.lang.String[] strArray48 = cSVFormat47.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withAllowMissingColumnNames();
        java.lang.String[] strArray50 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat34.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat32.withHeaderComments((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat6.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat3.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.Character char58 = cSVFormat57.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat57", cSVFormat3.equals(cSVFormat57) ? cSVFormat3.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        java.lang.String str3 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withTrim();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withHeader(resultSetMetaData12);
        boolean boolean14 = cSVFormat1.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("Delimiter=<,> Escape=<\\> QuoteChar=<\"> RecordSeparator=<Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass9 = cSVFormat8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat4.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteMode(quoteMode10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withQuote((java.lang.Character) '#');
        boolean boolean20 = cSVFormat19.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str38 = cSVFormat37.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode40 = null;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withTrim();
        boolean boolean46 = cSVFormat41.equals((java.lang.Object) cSVFormat45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat41.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat41.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char51 = cSVFormat50.getCommentMarker();
        char char52 = cSVFormat50.getDelimiter();
        boolean boolean53 = cSVFormat50.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode55 = null;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withTrim();
        boolean boolean61 = cSVFormat56.equals((java.lang.Object) cSVFormat60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat56.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat64.withTrim();
        boolean boolean66 = cSVFormat65.getIgnoreHeaderCase();
        java.lang.String str67 = cSVFormat65.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat65.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat65.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat65.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat74 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat74.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat75.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withAllowMissingColumnNames(true);
        java.lang.String[] strArray79 = cSVFormat78.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withAllowMissingColumnNames();
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat80.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat65.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat63.withHeaderComments((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat50.withHeaderComments((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat37.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat36.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat19.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat8.withHeader(strArray81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat8", cSVFormat4.equals(cSVFormat8) ? cSVFormat4.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(resultSetMetaData20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withNullString("hi!");
        boolean boolean24 = cSVFormat21.isQuoteCharacterSet();
        boolean boolean25 = cSVFormat14.equals((java.lang.Object) boolean24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withAllowMissingColumnNames(true);
        boolean boolean33 = cSVFormat30.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter35 = cSVFormat34.printer();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat38.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat38.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray47 = new java.lang.Object[] { cSVFormat9, cSVFormat26, "\\N", boolean33, cSVFormat34, cSVFormat46 };
        java.lang.String str48 = cSVFormat7.format(objArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat7.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat7.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat7.withTrim();
        boolean boolean54 = cSVFormat53.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withIgnoreHeaderCase();
        boolean boolean56 = cSVFormat55.getAutoFlush();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat55", cSVFormat0.equals(cSVFormat55) ? cSVFormat0.hashCode() == cSVFormat55.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        java.lang.Character char15 = cSVFormat13.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat14", cSVFormat10.equals(cSVFormat14) ? cSVFormat10.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        boolean boolean8 = cSVFormat4.isNullStringSet();
        java.lang.String str9 = cSVFormat4.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean12 = cSVFormat11.isEscapeCharacterSet();
        boolean boolean13 = cSVFormat11.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char6 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray9 = cSVFormat0.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        boolean boolean22 = cSVFormat17.equals((java.lang.Object) cSVFormat21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withTrim();
        boolean boolean27 = cSVFormat26.getIgnoreHeaderCase();
        java.lang.String str28 = cSVFormat26.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat26.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withAllowMissingColumnNames(true);
        java.lang.String[] strArray40 = cSVFormat39.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withAllowMissingColumnNames();
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat26.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuoteMode(quoteMode49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat50.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withQuoteMode(quoteMode56);
        boolean boolean58 = cSVFormat57.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode62 = null;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withQuoteMode(quoteMode62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat66.withTrim();
        boolean boolean68 = cSVFormat63.equals((java.lang.Object) cSVFormat67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat63.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withTrailingDelimiter(false);
        java.lang.String[] strArray77 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat72.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat60.withHeaderComments((java.lang.Object[]) strArray77);
        java.lang.String str80 = cSVFormat47.format((java.lang.Object[]) strArray77);
        java.lang.String str81 = cSVFormat14.format((java.lang.Object[]) strArray77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean1 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("\r\n");
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        boolean boolean8 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        boolean boolean4 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord();
        boolean boolean7 = cSVFormat6.getIgnoreEmptyLines();
        boolean boolean8 = cSVFormat6.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteMode(quoteMode19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat20.equals((java.lang.Object) cSVFormat24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char30 = cSVFormat29.getCommentMarker();
        char char31 = cSVFormat29.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat45.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuoteMode(quoteMode53);
        java.sql.ResultSetMetaData resultSetMetaData55 = null;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withHeader(resultSetMetaData55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withNullString("hi!");
        boolean boolean59 = cSVFormat56.isQuoteCharacterSet();
        boolean boolean60 = cSVFormat49.equals((java.lang.Object) boolean59);
        java.lang.String[] strArray63 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat49.withHeader(strArray63);
        java.lang.String str65 = cSVFormat44.format((java.lang.Object[]) strArray63);
        java.lang.String str66 = cSVFormat29.format((java.lang.Object[]) strArray63);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat13.withHeader(strArray63);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat12.withHeaderComments((java.lang.Object[]) strArray63);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat9", cSVFormat6.equals(cSVFormat9) ? cSVFormat6.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10L, cSVFormat31, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat27.withHeaderComments(objArray35);
        java.lang.String str37 = cSVFormat22.format(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat17.withHeaderComments(objArray35);
        java.lang.String str39 = cSVFormat12.format(objArray35);
        java.lang.String str40 = cSVFormat3.format(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat2.withHeaderComments(objArray35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withIgnoreEmptyLines(true);
        boolean boolean14 = cSVFormat13.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withAutoFlush(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat9", cSVFormat4.equals(cSVFormat9) ? cSVFormat4.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat14", cSVFormat10.equals(cSVFormat14) ? cSVFormat10.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        java.lang.Object[] objArray10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean13 = cSVFormat9.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat12", cSVFormat9.equals(cSVFormat12) ? cSVFormat9.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker(' ');
        boolean boolean5 = cSVFormat4.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withDelimiter('\\');
        boolean boolean8 = cSVFormat7.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat10.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        java.lang.String str8 = cSVFormat7.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withEscape((java.lang.Character) '\\');
        java.lang.String str14 = cSVFormat6.getRecordSeparator();
        boolean boolean15 = cSVFormat6.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withIgnoreHeaderCase();
        java.lang.String str17 = cSVFormat6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(resultSetMetaData20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withNullString("hi!");
        boolean boolean24 = cSVFormat21.isQuoteCharacterSet();
        boolean boolean25 = cSVFormat14.equals((java.lang.Object) boolean24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withAllowMissingColumnNames(true);
        boolean boolean33 = cSVFormat30.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter35 = cSVFormat34.printer();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat38.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat38.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray47 = new java.lang.Object[] { cSVFormat9, cSVFormat26, "\\N", boolean33, cSVFormat34, cSVFormat46 };
        java.lang.String str48 = cSVFormat7.format(objArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat7.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat7.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat7.withTrim();
        boolean boolean54 = cSVFormat53.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat55", cSVFormat0.equals(cSVFormat55) ? cSVFormat0.hashCode() == cSVFormat55.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAutoFlush(false);
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        boolean boolean8 = cSVFormat3.equals((java.lang.Object) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreSurroundingSpaces();
        boolean boolean12 = cSVFormat3.equals((java.lang.Object) cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withNullString("10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        boolean boolean15 = cSVFormat3.isNullStringSet();
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat3.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        java.lang.String[] strArray19 = cSVFormat17.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat18", cSVFormat3.equals(cSVFormat18) ? cSVFormat3.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAutoFlush(false);
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        boolean boolean8 = cSVFormat3.equals((java.lang.Object) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreSurroundingSpaces();
        boolean boolean12 = cSVFormat3.equals((java.lang.Object) cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withNullString("10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        boolean boolean15 = cSVFormat3.isNullStringSet();
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat3.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuote('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat18", cSVFormat3.equals(cSVFormat18) ? cSVFormat3.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat4.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat8", cSVFormat4.equals(cSVFormat8) ? cSVFormat4.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreHeaderCase(true);
        char char19 = cSVFormat18.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat18", cSVFormat12.equals(cSVFormat18) ? cSVFormat12.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean3 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.Character char12 = cSVFormat2.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat11", cSVFormat1.equals(cSVFormat11) ? cSVFormat1.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean12 = cSVFormat11.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat11", cSVFormat1.equals(cSVFormat11) ? cSVFormat1.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat10", cSVFormat4.equals(cSVFormat10) ? cSVFormat4.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        boolean boolean20 = cSVFormat15.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteMode(quoteMode41);
        java.sql.ResultSetMetaData resultSetMetaData43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withHeader(resultSetMetaData43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withNullString("hi!");
        boolean boolean47 = cSVFormat44.isQuoteCharacterSet();
        boolean boolean48 = cSVFormat37.equals((java.lang.Object) boolean47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat37.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withAllowMissingColumnNames(true);
        boolean boolean56 = cSVFormat53.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter58 = cSVFormat57.printer();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat61.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat61.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat61.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray70 = new java.lang.Object[] { cSVFormat32, cSVFormat49, "\\N", boolean56, cSVFormat57, cSVFormat69 };
        java.lang.String str71 = cSVFormat30.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat15.withHeaderComments(objArray70);
        java.lang.String str73 = cSVFormat11.format(objArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat74.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat74", cSVFormat11.equals(cSVFormat74) ? cSVFormat11.hashCode() == cSVFormat74.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) ' ');
        java.lang.String str10 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withNullString("Delimiter=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat10.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat10", cSVFormat4.equals(cSVFormat10) ? cSVFormat4.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withNullString("Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("hi!");
        java.lang.String str14 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteMode(quoteMode19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker('a');
        char char23 = cSVFormat20.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withCommentMarker('a');
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10L, cSVFormat47, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat43.withHeaderComments(objArray51);
        java.lang.String str53 = cSVFormat38.format(objArray51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat33.withHeaderComments(objArray51);
        java.lang.String str55 = cSVFormat28.format(objArray51);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat20.withHeaderComments(objArray51);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat15.withHeaderComments(objArray51);
        java.lang.String str58 = cSVFormat6.format(objArray51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat6", cSVFormat4.equals(cSVFormat6) ? cSVFormat4.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuote((java.lang.Character) '#');
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat(',');
        boolean boolean14 = cSVFormat9.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreHeaderCase(true);
        char char17 = cSVFormat13.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat16", cSVFormat13.equals(cSVFormat16) ? cSVFormat13.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat17", cSVFormat9.equals(cSVFormat17) ? cSVFormat9.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.Character char8 = cSVFormat5.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat2.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat13.printer();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '|');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker('a');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10L, cSVFormat18, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray22);
        java.lang.String str24 = cSVFormat9.format(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat4.withHeaderComments(objArray22);
        char char26 = cSVFormat4.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withIgnoreHeaderCase();
        boolean boolean32 = cSVFormat30.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat30 and cSVFormat31", cSVFormat30.equals(cSVFormat31) ? cSVFormat30.hashCode() == cSVFormat31.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator("10\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t1.0");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withTrim(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat14", cSVFormat9.equals(cSVFormat14) ? cSVFormat9.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        java.lang.String[] strArray8 = cSVFormat6.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker((java.lang.Character) '\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withHeader(resultSetMetaData20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withNullString("hi!");
        boolean boolean24 = cSVFormat21.isQuoteCharacterSet();
        boolean boolean25 = cSVFormat14.equals((java.lang.Object) boolean24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withAllowMissingColumnNames(true);
        boolean boolean33 = cSVFormat30.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter35 = cSVFormat34.printer();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat38.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat38.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray47 = new java.lang.Object[] { cSVFormat9, cSVFormat26, "\\N", boolean33, cSVFormat34, cSVFormat46 };
        java.lang.String str48 = cSVFormat7.format(objArray47);
        boolean boolean49 = cSVFormat7.getIgnoreEmptyLines();
        boolean boolean50 = cSVFormat7.isNullStringSet();
        char char51 = cSVFormat7.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String[] strArray53 = cSVFormat52.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat52", cSVFormat0.equals(cSVFormat52) ? cSVFormat0.hashCode() == cSVFormat52.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        boolean boolean9 = cSVFormat4.getAllowMissingColumnNames();
        boolean boolean10 = cSVFormat4.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean12 = cSVFormat11.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withNullString("\r\n");
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat4.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat19", cSVFormat4.equals(cSVFormat19) ? cSVFormat4.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withAutoFlush(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat18", cSVFormat17.equals(cSVFormat18) ? cSVFormat17.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        boolean boolean8 = cSVFormat4.isNullStringSet();
        java.lang.String str9 = cSVFormat4.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean12 = cSVFormat11.isEscapeCharacterSet();
        boolean boolean13 = cSVFormat11.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreHeaderCase();
        java.lang.Character char15 = cSVFormat14.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        boolean boolean20 = cSVFormat19.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        boolean boolean30 = cSVFormat25.equals((java.lang.Object) cSVFormat29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat25.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withTrailingDelimiter(false);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat34.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray39);
        java.lang.String str42 = cSVFormat22.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat43.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withEscape(',');
        boolean boolean52 = cSVFormat51.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode60 = cSVFormat59.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat51.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat22.withQuoteMode(quoteMode60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat9.withQuoteMode(quoteMode60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuote((java.lang.Character) '#');
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        java.lang.String[] strArray9 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        boolean boolean12 = cSVFormat7.getAutoFlush();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("hi!");
        boolean boolean14 = cSVFormat11.isQuoteCharacterSet();
        boolean boolean15 = cSVFormat4.equals((java.lang.Object) boolean14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean17 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]");
        org.apache.commons.csv.CSVFormat.Predefined predefined20 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = predefined20.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withIgnoreHeaderCase();
        boolean boolean27 = cSVFormat19.equals((java.lang.Object) cSVFormat25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat23 and cSVFormat26", cSVFormat23.equals(cSVFormat26) ? cSVFormat23.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteMode(quoteMode23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withQuoteMode(quoteMode42);
        java.sql.ResultSetMetaData resultSetMetaData44 = null;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withHeader(resultSetMetaData44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withNullString("hi!");
        boolean boolean48 = cSVFormat45.isQuoteCharacterSet();
        boolean boolean49 = cSVFormat38.equals((java.lang.Object) boolean48);
        java.lang.String[] strArray52 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeader(strArray52);
        java.lang.String str54 = cSVFormat33.format((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat11.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat56 and cSVFormat57", cSVFormat56.equals(cSVFormat57) ? cSVFormat56.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteMode(quoteMode23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withQuoteMode(quoteMode42);
        java.sql.ResultSetMetaData resultSetMetaData44 = null;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withHeader(resultSetMetaData44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withNullString("hi!");
        boolean boolean48 = cSVFormat45.isQuoteCharacterSet();
        boolean boolean49 = cSVFormat38.equals((java.lang.Object) boolean48);
        java.lang.String[] strArray52 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeader(strArray52);
        java.lang.String str54 = cSVFormat33.format((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat11.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withDelimiter('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat56 and cSVFormat57", cSVFormat56.equals(cSVFormat57) ? cSVFormat56.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("hi!");
        boolean boolean17 = cSVFormat0.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat18.printer();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        java.lang.String str3 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withTrim();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withHeader(resultSetMetaData12);
        boolean boolean14 = cSVFormat1.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withCommentMarker(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withNullString("\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str9 = cSVFormat8.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat11", cSVFormat8.equals(cSVFormat11) ? cSVFormat8.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        boolean boolean5 = cSVFormat0.getTrim();
        char char6 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean8 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAutoFlush(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat18", cSVFormat17.equals(cSVFormat18) ? cSVFormat17.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withIgnoreEmptyLines(true);
        boolean boolean14 = cSVFormat13.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('\"');
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(resultSet5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char6 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowMissingColumnNames();
        boolean boolean12 = cSVFormat11.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuoteMode(quoteMode19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker('a');
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10L, cSVFormat20, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat16.withHeaderComments(objArray24);
        java.lang.String[] strArray26 = cSVFormat16.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat16.withRecordSeparator(',');
        org.apache.commons.csv.QuoteMode quoteMode29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat16.withQuoteMode(quoteMode29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat16.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker('a');
        boolean boolean36 = cSVFormat13.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat13", cSVFormat8.equals(cSVFormat13) ? cSVFormat8.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withNullString("hi!");
        boolean boolean9 = cSVFormat3.equals((java.lang.Object) "hi!");
        java.lang.String str10 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape((java.lang.Character) '\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        java.lang.Object[] objArray10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean13 = cSVFormat9.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat12", cSVFormat9.equals(cSVFormat12) ? cSVFormat9.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat13.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat14", cSVFormat10.equals(cSVFormat14) ? cSVFormat10.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker('a');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10L, cSVFormat18, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray22);
        java.lang.String str24 = cSVFormat9.format(objArray22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat4.withHeaderComments(objArray22);
        char char26 = cSVFormat4.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withHeader(resultSetMetaData32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat30 and cSVFormat31", cSVFormat30.equals(cSVFormat31) ? cSVFormat30.hashCode() == cSVFormat31.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass14 = cSVFormat13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        boolean boolean13 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withNullString("\r\n");
        boolean boolean16 = cSVFormat8.equals((java.lang.Object) "\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat8.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreEmptyLines();
        java.lang.Character char20 = cSVFormat18.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat21", cSVFormat8.equals(cSVFormat21) ? cSVFormat8.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat4.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreHeaderCase(true);
        java.lang.String str9 = cSVFormat4.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat8", cSVFormat4.equals(cSVFormat8) ? cSVFormat4.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteMode(quoteMode26);
        java.sql.ResultSetMetaData resultSetMetaData28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withHeader(resultSetMetaData28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withNullString("hi!");
        boolean boolean32 = cSVFormat29.isQuoteCharacterSet();
        boolean boolean33 = cSVFormat22.equals((java.lang.Object) boolean32);
        java.lang.String[] strArray36 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat22.withHeader(strArray36);
        java.lang.String str38 = cSVFormat17.format((java.lang.Object[]) strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray36);
        boolean boolean40 = cSVFormat39.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat39.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat43", cSVFormat3.equals(cSVFormat43) ? cSVFormat3.hashCode() == cSVFormat43.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        java.lang.Character char9 = cSVFormat4.getEscapeCharacter();
        boolean boolean10 = cSVFormat4.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat13", cSVFormat12.equals(cSVFormat13) ? cSVFormat12.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        boolean boolean12 = cSVFormat11.getIgnoreHeaderCase();
        java.lang.String str13 = cSVFormat11.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat11.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withAllowMissingColumnNames(true);
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowMissingColumnNames();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat11.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat9.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withHeader(resultSet38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat34 and cSVFormat37", cSVFormat34.equals(cSVFormat37) ? cSVFormat34.hashCode() == cSVFormat37.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat10.getAutoFlush();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('a');
        boolean boolean5 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withDelimiter('\\');
        java.lang.Character char8 = cSVFormat7.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat13", cSVFormat7.equals(cSVFormat13) ? cSVFormat7.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean10 = cSVFormat9.getTrailingDelimiter();
        boolean boolean11 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        boolean boolean14 = cSVFormat13.getIgnoreHeaderCase();
        java.lang.String str15 = cSVFormat13.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withIgnoreHeaderCase(false);
        java.lang.Character char20 = cSVFormat19.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteMode(quoteMode30);
        java.sql.ResultSetMetaData resultSetMetaData32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(resultSetMetaData32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withNullString("hi!");
        boolean boolean36 = cSVFormat33.isQuoteCharacterSet();
        boolean boolean37 = cSVFormat26.equals((java.lang.Object) boolean36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat26.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withAllowMissingColumnNames(true);
        boolean boolean45 = cSVFormat42.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter47 = cSVFormat46.printer();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuoteMode(quoteMode49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode55 = null;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat50.withQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat50.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray59 = new java.lang.Object[] { cSVFormat21, cSVFormat38, "\\N", boolean45, cSVFormat46, cSVFormat58 };
        java.lang.String str60 = cSVFormat19.format(objArray59);
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat61.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withCommentMarker('a');
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10L, cSVFormat67, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat63.withHeaderComments(objArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat19.withHeaderComments(objArray71);
        java.lang.String str74 = cSVFormat9.format(objArray71);
        char char75 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean78 = cSVFormat9.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat77", cSVFormat9.equals(cSVFormat77) ? cSVFormat9.hashCode() == cSVFormat77.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean13 = cSVFormat12.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat12", cSVFormat8.equals(cSVFormat12) ? cSVFormat8.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char6 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray9 = cSVFormat0.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withTrailingDelimiter(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat17", cSVFormat0.equals(cSVFormat17) ? cSVFormat0.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreHeaderCase();
        boolean boolean19 = cSVFormat17.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat17 and cSVFormat18", cSVFormat17.equals(cSVFormat18) ? cSVFormat17.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withCommentMarker('#');
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(resultSet13);
        char char15 = cSVFormat14.getDelimiter();
        char char16 = cSVFormat14.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withIgnoreHeaderCase();
        boolean boolean18 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat17", cSVFormat12.equals(cSVFormat17) ? cSVFormat12.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator('\t');
        boolean boolean8 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean1 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("\r\n");
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        boolean boolean8 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat5.getAutoFlush();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuote('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEscape((java.lang.Character) ' ');
        java.lang.String str12 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreHeaderCase(true);
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat14", cSVFormat11.equals(cSVFormat14) ? cSVFormat11.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(true);
        boolean boolean5 = cSVFormat2.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat4", cSVFormat2.equals(cSVFormat4) ? cSVFormat2.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withEscape((java.lang.Character) '#');
        boolean boolean16 = cSVFormat15.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat19", cSVFormat15.equals(cSVFormat19) ? cSVFormat15.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.String str6 = cSVFormat4.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteMode(quoteMode6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("hi!");
        java.lang.String str12 = cSVFormat11.toString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        java.lang.String str16 = cSVFormat14.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat14.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withAllowMissingColumnNames(true);
        java.lang.String[] strArray28 = cSVFormat27.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withAllowMissingColumnNames();
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat14.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat11.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat4.withHeader(strArray30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Predefined predefined9 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat10 = predefined9.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withFirstRecordAsHeader();
        org.apache.commons.csv.QuoteMode quoteMode17 = cSVFormat16.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteMode(quoteMode26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker('a');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10L, cSVFormat27, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat23.withHeaderComments(objArray31);
        java.lang.String str33 = cSVFormat18.format(objArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat16.withHeaderComments(objArray31);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withHeaderComments(objArray31);
        java.lang.String str36 = cSVFormat8.format(objArray31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuote((java.lang.Character) '#');
        boolean boolean8 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        boolean boolean7 = cSVFormat6.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0,");
        java.lang.String str10 = cSVFormat9.getNullString();
        boolean boolean11 = cSVFormat9.isEscapeCharacterSet();
        boolean boolean12 = cSVFormat9.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean15 = cSVFormat14.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat14", cSVFormat9.equals(cSVFormat14) ? cSVFormat9.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat8.printer();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        boolean boolean7 = cSVFormat4.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat4.getAutoFlush();
        boolean boolean9 = cSVFormat4.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<a> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat12", cSVFormat4.equals(cSVFormat12) ? cSVFormat4.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        java.lang.String[] strArray9 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.Character char1 = cSVFormat0.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('#');
        boolean boolean6 = cSVFormat5.isQuoteCharacterSet();
        boolean boolean7 = cSVFormat5.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        boolean boolean8 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(true);
        java.lang.String[] strArray11 = cSVFormat6.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat10", cSVFormat6.equals(cSVFormat10) ? cSVFormat6.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withCommentMarker(' ');
        boolean boolean14 = cSVFormat13.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withTrim();
        boolean boolean23 = cSVFormat17.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withTrim();
        boolean boolean31 = cSVFormat26.equals((java.lang.Object) cSVFormat30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat26.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char36 = cSVFormat35.getCommentMarker();
        char char37 = cSVFormat35.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode40 = null;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat45.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat45.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode59 = null;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withQuoteMode(quoteMode59);
        java.sql.ResultSetMetaData resultSetMetaData61 = null;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat58.withHeader(resultSetMetaData61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withNullString("hi!");
        boolean boolean65 = cSVFormat62.isQuoteCharacterSet();
        boolean boolean66 = cSVFormat55.equals((java.lang.Object) boolean65);
        java.lang.String[] strArray69 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat55.withHeader(strArray69);
        java.lang.String str71 = cSVFormat50.format((java.lang.Object[]) strArray69);
        java.lang.String str72 = cSVFormat35.format((java.lang.Object[]) strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat17.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat16.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat5.withHeader(strArray69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        boolean boolean12 = cSVFormat11.getIgnoreHeaderCase();
        java.lang.String str13 = cSVFormat11.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat11.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withAllowMissingColumnNames(true);
        java.lang.String[] strArray25 = cSVFormat24.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowMissingColumnNames();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat11.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withTrim();
        boolean boolean40 = cSVFormat35.equals((java.lang.Object) cSVFormat39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat39.withNullString("10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withSkipHeaderRecord(false);
        boolean boolean48 = cSVFormat47.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withIgnoreHeaderCase();
        boolean boolean50 = cSVFormat9.equals((java.lang.Object) cSVFormat47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat45 and cSVFormat49", cSVFormat45.equals(cSVFormat49) ? cSVFormat45.hashCode() == cSVFormat49.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(false);
        java.lang.String str5 = cSVFormat4.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withNullString("\r\n");
        java.lang.Object[] objArray16 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withHeaderComments(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withHeaderComments(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withFirstRecordAsHeader();
        boolean boolean20 = cSVFormat19.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass22 = cSVFormat19.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat19 and cSVFormat21", cSVFormat19.equals(cSVFormat21) ? cSVFormat19.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withRecordSeparator("\\");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrim(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        boolean boolean12 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuoteMode(quoteMode23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withQuoteMode(quoteMode42);
        java.sql.ResultSetMetaData resultSetMetaData44 = null;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withHeader(resultSetMetaData44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withNullString("hi!");
        boolean boolean48 = cSVFormat45.isQuoteCharacterSet();
        boolean boolean49 = cSVFormat38.equals((java.lang.Object) boolean48);
        java.lang.String[] strArray52 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeader(strArray52);
        java.lang.String str54 = cSVFormat33.format((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat11.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withCommentMarker((java.lang.Character) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat56 and cSVFormat57", cSVFormat56.equals(cSVFormat57) ? cSVFormat56.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean10 = cSVFormat9.getTrailingDelimiter();
        boolean boolean11 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        boolean boolean14 = cSVFormat13.getIgnoreHeaderCase();
        java.lang.String str15 = cSVFormat13.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withIgnoreHeaderCase(false);
        java.lang.Character char20 = cSVFormat19.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteMode(quoteMode30);
        java.sql.ResultSetMetaData resultSetMetaData32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withHeader(resultSetMetaData32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withNullString("hi!");
        boolean boolean36 = cSVFormat33.isQuoteCharacterSet();
        boolean boolean37 = cSVFormat26.equals((java.lang.Object) boolean36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat26.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withAllowMissingColumnNames(true);
        boolean boolean45 = cSVFormat42.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter47 = cSVFormat46.printer();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuoteMode(quoteMode49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode55 = null;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat50.withQuoteMode(quoteMode55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat50.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray59 = new java.lang.Object[] { cSVFormat21, cSVFormat38, "\\N", boolean45, cSVFormat46, cSVFormat58 };
        java.lang.String str60 = cSVFormat19.format(objArray59);
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat61.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode66 = null;
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withQuoteMode(quoteMode66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withCommentMarker('a');
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10L, cSVFormat67, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat63.withHeaderComments(objArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat19.withHeaderComments(objArray71);
        java.lang.String str74 = cSVFormat9.format(objArray71);
        char char75 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean78 = cSVFormat77.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat77", cSVFormat9.equals(cSVFormat77) ? cSVFormat9.hashCode() == cSVFormat77.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        boolean boolean7 = cSVFormat4.getTrim();
        boolean boolean8 = cSVFormat4.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat9", cSVFormat4.equals(cSVFormat9) ? cSVFormat4.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean3 = cSVFormat2.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withNullString("Delimiter=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        boolean boolean16 = cSVFormat2.equals((java.lang.Object) cSVFormat13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withRecordSeparator("\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\",");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat17", cSVFormat5.equals(cSVFormat17) ? cSVFormat5.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        boolean boolean7 = cSVFormat6.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0,");
        java.lang.String str10 = cSVFormat9.getNullString();
        boolean boolean11 = cSVFormat9.isEscapeCharacterSet();
        boolean boolean12 = cSVFormat9.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat14", cSVFormat9.equals(cSVFormat14) ? cSVFormat9.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        char char13 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withQuote('#');
        boolean boolean23 = cSVFormat18.getAllowMissingColumnNames();
        boolean boolean24 = cSVFormat18.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean26 = cSVFormat25.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withNullString("\r\n");
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeaderComments(objArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat18.withHeaderComments(objArray29);
        java.lang.String str32 = cSVFormat11.format(objArray29);
        java.lang.String str33 = cSVFormat11.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withQuote('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat35", cSVFormat11.equals(cSVFormat35) ? cSVFormat11.hashCode() == cSVFormat35.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        boolean boolean9 = cSVFormat8.isNullStringSet();
        char char10 = cSVFormat8.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteMode(quoteMode16);
        java.sql.ResultSetMetaData resultSetMetaData18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(resultSetMetaData18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withNullString("hi!");
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withTrailingDelimiter();
        java.lang.Character char24 = cSVFormat19.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat19.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat19.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withAllowMissingColumnNames(true);
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withQuoteMode(quoteMode38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat43.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat50.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode57 = null;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuoteMode(quoteMode57);
        java.sql.ResultSetMetaData resultSetMetaData59 = null;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat56.withHeader(resultSetMetaData59);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withNullString("hi!");
        boolean boolean63 = cSVFormat60.isQuoteCharacterSet();
        boolean boolean64 = cSVFormat53.equals((java.lang.Object) boolean63);
        java.lang.String[] strArray67 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat53.withHeader(strArray67);
        java.lang.String str69 = cSVFormat48.format((java.lang.Object[]) strArray67);
        java.lang.String str70 = cSVFormat36.format((java.lang.Object[]) strArray67);
        java.lang.String str71 = cSVFormat19.format((java.lang.Object[]) strArray67);
        java.lang.String str72 = cSVFormat12.format((java.lang.Object[]) strArray67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withTrim(true);
        java.lang.String str14 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat6.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat6.withEscape((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat6.withIgnoreHeaderCase();
        java.lang.String str20 = cSVFormat19.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat19", cSVFormat0.equals(cSVFormat19) ? cSVFormat0.hashCode() == cSVFormat19.hashCode() : true);
    }
}

