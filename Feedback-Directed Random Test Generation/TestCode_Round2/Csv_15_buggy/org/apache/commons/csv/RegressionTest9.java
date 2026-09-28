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
        java.sql.ResultSetMetaData resultSetMetaData19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeader(resultSetMetaData19);
        java.lang.String str21 = cSVFormat18.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\r\n" + "'", str21, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        boolean boolean22 = cSVFormat17.equals((java.lang.Object) cSVFormat21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withTrailingDelimiter(false);
        java.lang.String[] strArray31 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat14.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat14.withFirstRecordAsHeader();
        java.lang.String str35 = cSVFormat34.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" });
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Delimiter=<,> QuoteChar=<\"> CommentStart=<a> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:true Header:[]" + "'", str35, "Delimiter=<,> QuoteChar=<\"> CommentStart=<a> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:true Header:[]");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean1 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote('4');
        boolean boolean6 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withCommentMarker('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withFirstRecordAsHeader();
        java.lang.String str12 = cSVFormat11.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<4> Escape=<,> QuoteChar=<\"> NullString=<Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]" + "'", str12, "Delimiter=<4> Escape=<,> QuoteChar=<\"> NullString=<Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('\t');
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        java.lang.String[] strArray17 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat4.withSkipHeaderRecord(false);
        boolean boolean20 = cSVFormat19.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(true);
        char char12 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('4');
        boolean boolean17 = cSVFormat14.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat4.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat4.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat4.withQuote('4');
        java.lang.String str26 = cSVFormat4.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str26, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        java.lang.Character char13 = cSVFormat11.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuote('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.Character char8 = cSVFormat7.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withNullString("10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        boolean boolean11 = cSVFormat7.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat7.withCommentMarker((java.lang.Character) '#');
        boolean boolean17 = cSVFormat6.equals((java.lang.Object) cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        boolean boolean7 = cSVFormat6.getTrailingDelimiter();
        java.lang.Character char8 = cSVFormat6.getQuoteCharacter();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        boolean boolean9 = cSVFormat0.getAutoFlush();
        boolean boolean10 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(resultSetMetaData13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreEmptyLines(true);
        boolean boolean17 = cSVFormat12.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(true);
        java.lang.Character char5 = cSVFormat2.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("\"\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\",\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"10\tDelimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0\"");
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\\' + "'", char5 == '\\');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('4');
        boolean boolean5 = cSVFormat0.getAllowMissingColumnNames();
        boolean boolean6 = cSVFormat0.isQuoteCharacterSet();
        java.lang.Character char7 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteMode(quoteMode9);
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withNullString("hi!");
        java.lang.String str15 = cSVFormat12.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat20.printer();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withRecordSeparator('4');
        boolean boolean25 = cSVFormat20.getAllowMissingColumnNames();
        boolean boolean26 = cSVFormat20.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuoteMode(quoteMode28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withIgnoreEmptyLines(false);
        boolean boolean42 = cSVFormat41.isQuoteCharacterSet();
        org.apache.commons.csv.QuoteMode quoteMode43 = cSVFormat41.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode45 = null;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withTrim();
        boolean boolean51 = cSVFormat46.equals((java.lang.Object) cSVFormat50);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat50.withNullString("10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withTrailingDelimiter();
        boolean boolean58 = cSVFormat57.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode64 = null;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withCommentMarker('a');
        java.lang.Object[] objArray69 = new java.lang.Object[] { 10L, cSVFormat65, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat61.withHeaderComments(objArray69);
        boolean boolean71 = cSVFormat70.getTrim();
        java.sql.ResultSet resultSet72 = null;
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat70.withHeader(resultSet72);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat70.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat76 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat76.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat79.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat80.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode83 = cSVFormat82.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat75.withQuoteMode(quoteMode83);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat57.withQuoteMode(quoteMode83);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat41.withQuoteMode(quoteMode83);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat20.withQuoteMode(quoteMode83);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat12.withQuoteMode(quoteMode83);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat0.withQuoteMode(quoteMode83);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVPrinter21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(quoteMode43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertTrue("'" + quoteMode83 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode83.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat87);
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertNotNull(cSVFormat89);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        boolean boolean14 = cSVFormat11.isEscapeCharacterSet();
        boolean boolean15 = cSVFormat11.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '#');
        boolean boolean7 = cSVFormat4.getIgnoreEmptyLines();
        char char8 = cSVFormat4.getDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuote((java.lang.Character) '\t');
        boolean boolean15 = cSVFormat14.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withFirstRecordAsHeader();
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter20 = cSVFormat14.print(appendable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ',' + "'", char8 == ',');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('a');
        boolean boolean7 = cSVFormat4.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat4.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withFirstRecordAsHeader();
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withNullString("");
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat14.print(appendable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        boolean boolean14 = cSVFormat11.getAutoFlush();
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
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat11.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withEscape('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + ',' + "'", char13 == ',');
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNull(strArray40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        boolean boolean10 = cSVFormat2.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withDelimiter('4');
        char char13 = cSVFormat12.getDelimiter();
        java.lang.Character char14 = cSVFormat12.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '4' + "'", char13 == '4');
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\"' + "'", char14 == '\"');
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        boolean boolean16 = cSVFormat11.getSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat11.printer();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat11.withNullString(",");
        boolean boolean20 = cSVFormat19.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote(' ');
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(quoteMode11);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape(',');
        boolean boolean15 = cSVFormat5.equals((java.lang.Object) cSVFormat12);
        boolean boolean16 = cSVFormat5.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        java.lang.String str10 = cSVFormat8.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(true);
        boolean boolean11 = cSVFormat8.getTrailingDelimiter();
        java.sql.ResultSet resultSet12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withHeader(resultSet12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('|');
        boolean boolean16 = cSVFormat13.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withTrim();
        boolean boolean9 = cSVFormat4.equals((java.lang.Object) cSVFormat8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        char char15 = cSVFormat13.getDelimiter();
        boolean boolean16 = cSVFormat13.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        boolean boolean24 = cSVFormat19.equals((java.lang.Object) cSVFormat23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withTrim();
        boolean boolean29 = cSVFormat28.getIgnoreHeaderCase();
        java.lang.String str30 = cSVFormat28.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat28.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat28.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withAllowMissingColumnNames(true);
        java.lang.String[] strArray42 = cSVFormat41.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withAllowMissingColumnNames();
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat28.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat26.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat0.withHeader(strArray44);
        java.sql.ResultSet resultSet50 = null;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat0.withHeader(resultSet50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat0.withNullString("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '4' + "'", char14 == '4');
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + ',' + "'", char15 == ',');
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNull(strArray42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        boolean boolean16 = cSVFormat11.getSkipHeaderRecord();
        boolean boolean17 = cSVFormat11.getIgnoreEmptyLines();
        java.lang.Appendable appendable18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withSkipHeaderRecord();
        java.lang.String[] strArray22 = cSVFormat20.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter30 = cSVFormat29.printer();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withRecordSeparator('4');
        java.lang.Character char34 = cSVFormat29.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean36 = cSVFormat35.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withNullString("\r\n");
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withHeaderComments(objArray39);
        java.lang.String str41 = cSVFormat29.format(objArray39);
        java.lang.String str42 = cSVFormat28.format(objArray39);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat11.printRecord(appendable18, objArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVPrinter30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + '\"' + "'", char34 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertArrayEquals(objArray39, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker('a');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10L, cSVFormat28, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat24.withHeaderComments(objArray32);
        java.lang.String str34 = cSVFormat33.toString();
        boolean boolean35 = cSVFormat33.getSkipHeaderRecord();
        boolean boolean36 = cSVFormat33.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withFirstRecordAsHeader();
        char char38 = cSVFormat37.getDelimiter();
        java.lang.Character char39 = cSVFormat37.getEscapeCharacter();
        boolean boolean40 = cSVFormat21.equals((java.lang.Object) char39);
        boolean boolean41 = cSVFormat21.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]" + "'", str34, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + ',' + "'", char38 == ',');
        org.junit.Assert.assertNull(char39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat3.printer();
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
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuoteMode(quoteMode43);
        java.sql.ResultSetMetaData resultSetMetaData45 = null;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat42.withHeader(resultSetMetaData45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withNullString("hi!");
        boolean boolean49 = cSVFormat46.isQuoteCharacterSet();
        boolean boolean50 = cSVFormat39.equals((java.lang.Object) boolean49);
        java.lang.String[] strArray53 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat39.withHeader(strArray53);
        java.lang.String str55 = cSVFormat34.format((java.lang.Object[]) strArray53);
        java.lang.String str56 = cSVFormat19.format((java.lang.Object[]) strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat3.withHeader(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat2.withHeaderComments((java.lang.Object[]) strArray53);
        java.sql.ResultSetMetaData resultSetMetaData59 = null;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat2.withHeader(resultSetMetaData59);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat2.withCommentMarker((java.lang.Character) '\\');
        boolean boolean63 = cSVFormat62.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVPrinter7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '4' + "'", char20 == '4');
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + ',' + "'", char21 == ',');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str55, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str56, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        boolean boolean12 = cSVFormat7.equals((java.lang.Object) cSVFormat11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withEscape((java.lang.Character) '4');
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
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat14.withHeaderComments((java.lang.Object[]) strArray32);
        java.lang.String str36 = cSVFormat4.format((java.lang.Object[]) strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(strArray30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withNullString("10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0,");
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrim(true);
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\n" + "'", str9, "\r\n");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withEscape('\\');
        java.lang.Character char16 = cSVFormat11.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\"' + "'", char16 == '\"');
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str9 = cSVFormat8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withDelimiter('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str9, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        boolean boolean10 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(resultSetMetaData17);
        boolean boolean19 = cSVFormat14.getIgnoreSurroundingSpaces();
        java.lang.Character char20 = cSVFormat14.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat14.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray23 = cSVFormat14.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat14.withHeader(resultSetMetaData24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat14.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat14.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker('a');
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10L, cSVFormat38, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat34.withHeaderComments(objArray42);
        boolean boolean44 = cSVFormat43.getTrim();
        java.sql.ResultSet resultSet45 = null;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withHeader(resultSet45);
        boolean boolean47 = cSVFormat43.getTrailingDelimiter();
        boolean boolean48 = cSVFormat43.getSkipHeaderRecord();
        boolean boolean49 = cSVFormat43.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat43.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.String[] strArray53 = cSVFormat52.getHeaderComments();
        java.lang.String str54 = cSVFormat31.format((java.lang.Object[]) strArray53);
        java.lang.String str55 = cSVFormat13.format((java.lang.Object[]) strArray53);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(char20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "10", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "1.0" });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str54, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str55, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrailingDelimiter();
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames();
        java.lang.Character char14 = cSVFormat13.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('\t');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreSurroundingSpaces(true);
        boolean boolean20 = cSVFormat17.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withHeader(resultSet25);
        boolean boolean27 = cSVFormat26.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode30 = cSVFormat26.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat26.withRecordSeparator("");
        org.apache.commons.csv.QuoteMode quoteMode33 = null;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat26.withQuoteMode(quoteMode33);
        org.apache.commons.csv.CSVPrinter cSVPrinter35 = cSVFormat34.printer();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuoteMode(quoteMode37);
        java.sql.ResultSetMetaData resultSetMetaData39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withHeader(resultSetMetaData39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withNullString("hi!");
        java.lang.String str43 = cSVFormat40.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withAllowMissingColumnNames();
        java.lang.Character char45 = cSVFormat40.getEscapeCharacter();
        boolean boolean46 = cSVFormat40.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat40.withQuote('#');
        java.lang.String str49 = cSVFormat40.toString();
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuoteMode(quoteMode51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat54.withQuote('#');
        boolean boolean59 = cSVFormat54.getAllowMissingColumnNames();
        boolean boolean60 = cSVFormat54.getAutoFlush();
        boolean boolean61 = cSVFormat54.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat54.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat64.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat65.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode69 = null;
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat68.withQuoteMode(quoteMode69);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withCommentMarker('a');
        java.lang.Object[] objArray74 = new java.lang.Object[] { 10L, cSVFormat70, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat66.withHeaderComments(objArray74);
        boolean boolean76 = cSVFormat75.getTrim();
        java.sql.ResultSet resultSet77 = null;
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat75.withHeader(resultSet77);
        boolean boolean79 = cSVFormat75.getTrailingDelimiter();
        boolean boolean80 = cSVFormat75.getSkipHeaderRecord();
        boolean boolean81 = cSVFormat75.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat75.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat82.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.String[] strArray85 = cSVFormat84.getHeaderComments();
        java.lang.String str86 = cSVFormat63.format((java.lang.Object[]) strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat40.withHeader(strArray85);
        java.lang.String str88 = cSVFormat34.format((java.lang.Object[]) strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat23.withHeaderComments((java.lang.Object[]) strArray85);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat17.withHeader(strArray85);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(quoteMode30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVPrinter35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\r\n" + "'", str43, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(char45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str49, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "10", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "1.0" });
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str86, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertNotNull(cSVFormat87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str88, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat90);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreHeaderCase(true);
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat7.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        java.lang.Character char13 = cSVFormat11.getEscapeCharacter();
        boolean boolean14 = cSVFormat11.isCommentMarkerSet();
        java.lang.String[] strArray15 = cSVFormat11.getHeaderComments();
        java.lang.String str16 = cSVFormat11.toString();
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withHeader(resultSetMetaData17);
        char char19 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withIgnoreSurroundingSpaces();
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
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withQuoteMode(quoteMode36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withQuote('#');
        boolean boolean44 = cSVFormat39.getAllowMissingColumnNames();
        boolean boolean45 = cSVFormat39.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean47 = cSVFormat46.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withNullString("\r\n");
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withHeaderComments(objArray50);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat39.withHeaderComments(objArray50);
        java.lang.String str53 = cSVFormat32.format(objArray50);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat11.withHeaderComments(objArray50);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<,> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str16, "Delimiter=<,> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + ',' + "'", char19 == ',');
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + '4' + "'", char33 == '4');
        org.junit.Assert.assertTrue("'" + char34 + "' != '" + ',' + "'", char34 == ',');
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertArrayEquals(objArray50, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(cSVFormat54);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
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
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withTrailingDelimiter(true);
        java.nio.file.Path path22 = null;
        java.nio.charset.Charset charset23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat19.print(path22, charset23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        boolean boolean9 = cSVFormat7.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        java.lang.String str12 = cSVFormat7.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\r\n" + "'", str12, "\r\n");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("");
        boolean boolean10 = cSVFormat6.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat14.printer();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        char char23 = cSVFormat21.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray26 = cSVFormat21.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withEscape('\t');
        java.lang.Character char30 = cSVFormat29.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape(',');
        boolean boolean40 = cSVFormat39.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode48 = cSVFormat47.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat39.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat29.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat21.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat20.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat6.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat6.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(quoteMode13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + ',' + "'", char23 == ',');
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNull(char30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + quoteMode48 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode48.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreEmptyLines(true);
        java.lang.String[] strArray17 = cSVFormat16.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "10", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "1.0" });
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        java.lang.String[] strArray12 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withRecordSeparator(',');
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat2.withQuote((java.lang.Character) '\"');
        boolean boolean20 = cSVFormat2.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\\N");
        boolean boolean5 = cSVFormat2.isQuoteCharacterSet();
        java.lang.Character char6 = cSVFormat2.getEscapeCharacter();
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
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withAllowMissingColumnNames(true);
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withAllowMissingColumnNames();
        java.lang.String[] strArray45 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withHeader(strArray45);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat35.withHeaderComments((java.lang.Object[]) strArray45);
        java.lang.String str48 = cSVFormat2.format((java.lang.Object[]) strArray45);
        java.lang.Character char49 = cSVFormat2.getQuoteCharacter();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\\' + "'", char6 == '\\');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" + "'", str31, "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + char33 + "' != '" + ',' + "'", char33 == ',');
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNull(strArray43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '\"' + "'", char49 == '\"');
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrim();
        java.lang.String str8 = cSVFormat7.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<\t> Escape=<\\> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str8, "Delimiter=<\t> Escape=<\\> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        boolean boolean18 = cSVFormat17.getAutoFlush();
        boolean boolean19 = cSVFormat17.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withTrim();
        boolean boolean17 = cSVFormat16.getIgnoreHeaderCase();
        java.lang.String str18 = cSVFormat16.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withSkipHeaderRecord();
        boolean boolean22 = cSVFormat21.isCommentMarkerSet();
        java.lang.Appendable appendable23 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat14.print((java.lang.Object) boolean22, appendable23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode12 = cSVFormat11.getQuoteMode();
        boolean boolean13 = cSVFormat11.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(quoteMode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAutoFlush(false);
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        boolean boolean8 = cSVFormat3.equals((java.lang.Object) '\"');
        java.lang.Character char9 = cSVFormat3.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withQuote((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        boolean boolean7 = cSVFormat6.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('\"');
        java.lang.String[] strArray13 = cSVFormat10.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\\N");
        boolean boolean5 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat8.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray14 = cSVFormat13.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode17 = cSVFormat16.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withAllowMissingColumnNames(true);
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withAllowMissingColumnNames();
        java.lang.String[] strArray25 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat12.withHeaderComments((java.lang.Object[]) strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat2.withHeader(strArray25);
        boolean boolean30 = cSVFormat29.isCommentMarkerSet();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(quoteMode17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withSkipHeaderRecord(true);
        boolean boolean17 = cSVFormat16.isQuoteCharacterSet();
        char char18 = cSVFormat16.getDelimiter();
        boolean boolean19 = cSVFormat16.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + ',' + "'", char18 == ',');
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withFirstRecordAsHeader();
        org.apache.commons.csv.QuoteMode quoteMode16 = cSVFormat15.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker('a');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10L, cSVFormat26, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat22.withHeaderComments(objArray30);
        java.lang.String str32 = cSVFormat17.format(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat15.withHeaderComments(objArray30);
        java.lang.Appendable appendable34 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat9.print((java.lang.Object) objArray30, appendable34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(quoteMode7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNull(quoteMode16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" + "'", str32, "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat33);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        boolean boolean9 = cSVFormat8.isNullStringSet();
        char char10 = cSVFormat8.getDelimiter();
        java.lang.String[] strArray11 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withQuote('#');
        boolean boolean28 = cSVFormat8.equals((java.lang.Object) cSVFormat27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuoteMode(quoteMode30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat33.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat33.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat33.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withRecordSeparator('#');
        boolean boolean47 = cSVFormat27.equals((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(resultSetMetaData7);
        java.io.File file9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat0.print(file9, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.Character char9 = cSVFormat0.getEscapeCharacter();
        boolean boolean10 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('\"');
        java.sql.ResultSetMetaData resultSetMetaData19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeader(resultSetMetaData19);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        boolean boolean9 = cSVFormat7.getTrim();
        java.lang.String str10 = cSVFormat7.getRecordSeparator();
        java.lang.Class<?> wildcardClass11 = cSVFormat7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\r\n" + "'", str10, "\r\n");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat14.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(true);
        java.lang.Character char5 = cSVFormat2.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("\"\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\",\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"10\tDelimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0\"");
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSetMetaData8);
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat9.print(appendable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\\' + "'", char5 == '\\');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        char char5 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean7 = cSVFormat6.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteMode(quoteMode10);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreEmptyLines(false);
        java.lang.Character char18 = cSVFormat15.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withTrim();
        java.lang.Character char20 = cSVFormat15.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withNullString("Delimiter=<,> QuoteChar=< > RecordSeparator=<\r\n> SkipHeaderRecord:true");
        boolean boolean23 = cSVFormat6.equals((java.lang.Object) cSVFormat22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat6.withSkipHeaderRecord(false);
        java.lang.Character char26 = cSVFormat25.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNull(char20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\"' + "'", char26 == '\"');
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withQuote('\\');
        boolean boolean20 = cSVFormat19.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        java.sql.ResultSetMetaData resultSetMetaData26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withHeader(resultSetMetaData26);
        boolean boolean28 = cSVFormat23.getIgnoreSurroundingSpaces();
        java.lang.Character char29 = cSVFormat23.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat23.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withEscape('\"');
        java.lang.Appendable appendable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat22.print((java.lang.Object) cSVFormat32, appendable35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        java.lang.Character char7 = cSVFormat6.getEscapeCharacter();
        java.lang.Character char8 = cSVFormat6.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withCommentMarker('\\');
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        boolean boolean9 = cSVFormat4.getAllowMissingColumnNames();
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withHeader(resultSet10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrailingDelimiter(false);
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withHeader(resultSet15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuoteMode(quoteMode7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        boolean boolean18 = cSVFormat13.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSkipHeaderRecord();
        boolean boolean20 = cSVFormat19.getTrailingDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeader(resultSetMetaData21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuoteMode(quoteMode28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withQuoteMode(quoteMode38);
        java.sql.ResultSetMetaData resultSetMetaData40 = null;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withHeader(resultSetMetaData40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withNullString("hi!");
        java.lang.String str44 = cSVFormat43.toString();
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat45.withTrim();
        boolean boolean47 = cSVFormat46.getIgnoreHeaderCase();
        java.lang.String str48 = cSVFormat46.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat46.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat46.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat46.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withAllowMissingColumnNames(true);
        java.lang.String[] strArray60 = cSVFormat59.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withAllowMissingColumnNames();
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat46.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat43.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat34.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat26.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat2.withHeader(strArray62);
        java.lang.String str69 = cSVFormat68.toString();
        java.lang.String str70 = cSVFormat68.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str44, "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNull(strArray60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[]" + "'", str69, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[]");
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean3 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat0.getQuoteMode();
        java.lang.String str5 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str7 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(quoteMode4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        java.lang.String[] strArray12 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withTrailingDelimiter();
        java.lang.Appendable appendable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat15.println(appendable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char8 = cSVFormat7.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim();
        boolean boolean10 = cSVFormat7.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        boolean boolean4 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withNullString("10\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        boolean boolean19 = cSVFormat18.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char8 = cSVFormat5.getEscapeCharacter();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape(',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("Delimiter=<,> Escape=< > QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withFirstRecordAsHeader();
        boolean boolean12 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSetMetaData10);
        boolean boolean12 = cSVFormat9.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(false);
        java.lang.String str17 = cSVFormat14.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withEscape((java.lang.Character) 'a');
        java.lang.Appendable appendable20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        boolean boolean23 = cSVFormat22.getIgnoreHeaderCase();
        java.lang.String str24 = cSVFormat22.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withIgnoreHeaderCase(false);
        java.lang.Character char29 = cSVFormat28.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode47 = null;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuoteMode(quoteMode47);
        java.sql.ResultSetMetaData resultSetMetaData49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat46.withHeader(resultSetMetaData49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withNullString("hi!");
        boolean boolean53 = cSVFormat50.isQuoteCharacterSet();
        boolean boolean54 = cSVFormat43.equals((java.lang.Object) boolean53);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat43.withAllowMissingColumnNames();
        boolean boolean56 = cSVFormat43.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat43.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withFirstRecordAsHeader();
        java.lang.String[] strArray62 = cSVFormat61.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat35.withHeaderComments((java.lang.Object[]) strArray62);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat19.printRecord(appendable20, (java.lang.Object[]) strArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\n" + "'", str17, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\"' + "'", char29 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat63);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        java.lang.String[] strArray12 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withRecordSeparator(',');
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreHeaderCase(false);
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withHeader(resultSetMetaData20);
        java.sql.ResultSetMetaData resultSetMetaData22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withHeader(resultSetMetaData22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('a');
        java.lang.String[] strArray7 = cSVFormat4.getHeaderComments();
        java.lang.Character char8 = cSVFormat4.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        boolean boolean12 = cSVFormat11.getIgnoreHeaderCase();
        java.lang.String str13 = cSVFormat11.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker('\t');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withIgnoreEmptyLines(true);
        boolean boolean25 = cSVFormat9.equals((java.lang.Object) cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat8.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('4');
        java.lang.Character char13 = cSVFormat8.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean15 = cSVFormat14.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withNullString("\r\n");
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeaderComments(objArray18);
        java.lang.String str20 = cSVFormat8.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat8.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withEscape(',');
        boolean boolean32 = cSVFormat31.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode40 = cSVFormat39.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat31.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat8.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat7.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat44.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withAllowMissingColumnNames(true);
        boolean boolean53 = cSVFormat7.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\"' + "'", char13 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + quoteMode40 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode40.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\n" + "'", str5, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat4.withCommentMarker((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(strArray7);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(resultSetMetaData13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '#');
        boolean boolean7 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteMode(quoteMode8);
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote((java.lang.Character) '4');
        boolean boolean16 = cSVFormat11.getTrim();
        char char17 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode19 = cSVFormat18.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteMode(quoteMode22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat34.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode47 = null;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuoteMode(quoteMode47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withCommentMarker('a');
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10L, cSVFormat48, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat44.withHeaderComments(objArray52);
        java.lang.String str54 = cSVFormat39.format(objArray52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat34.withHeaderComments(objArray52);
        java.lang.String str56 = cSVFormat29.format(objArray52);
        java.lang.String str57 = cSVFormat20.format(objArray52);
        java.lang.String str58 = cSVFormat18.format(objArray52);
        java.lang.String str59 = cSVFormat9.format(objArray52);
        boolean boolean60 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat9.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + ',' + "'", char17 == ',');
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNull(quoteMode19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" + "'", str54, "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str56, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str57, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str58, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str59, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cSVFormat62);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        boolean boolean14 = cSVFormat12.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        java.lang.String[] strArray6 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrim();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withDelimiter('4');
        java.lang.String str13 = cSVFormat12.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withTrim();
        java.lang.Character char20 = cSVFormat14.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat14.withTrailingDelimiter(true);
        java.lang.Character char23 = cSVFormat14.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat14.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withEscape('\t');
        java.lang.Character char28 = cSVFormat27.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withEscape(',');
        boolean boolean38 = cSVFormat37.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode46 = cSVFormat45.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat37.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat27.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat14.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat12.withQuoteMode(quoteMode46);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(char23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + quoteMode46 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode46.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('\t');
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        java.lang.Appendable appendable4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteMode(quoteMode13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteMode(quoteMode16);
        java.sql.ResultSetMetaData resultSetMetaData18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(resultSetMetaData18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withNullString("hi!");
        java.lang.String str22 = cSVFormat21.toString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        boolean boolean25 = cSVFormat24.getIgnoreHeaderCase();
        java.lang.String str26 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat24.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames(true);
        java.lang.String[] strArray38 = cSVFormat37.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withAllowMissingColumnNames();
        java.lang.String[] strArray40 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withHeader(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat24.withHeader(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat21.withHeader(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat12.withHeader(strArray40);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat2.printRecord(appendable4, (java.lang.Object[]) strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str22, "Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNull(strArray38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines(true);
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        java.lang.String str6 = cSVFormat4.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat14.getAllowMissingColumnNames();
        java.lang.String str16 = cSVFormat14.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAutoFlush(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat18.printer();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withTrailingDelimiter();
        boolean boolean21 = cSVFormat9.equals((java.lang.Object) cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withRecordSeparator("\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat15.printer();
        boolean boolean17 = cSVFormat15.getIgnoreEmptyLines();
        boolean boolean18 = cSVFormat15.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withFirstRecordAsHeader();
        char char26 = cSVFormat24.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withTrailingDelimiter(false);
        java.lang.String str32 = cSVFormat28.toString();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withFirstRecordAsHeader();
        boolean boolean35 = cSVFormat27.equals((java.lang.Object) cSVFormat34);
        java.lang.String[] strArray36 = cSVFormat34.getHeader();
        java.lang.String str37 = cSVFormat14.format((java.lang.Object[]) strArray36);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '4' + "'", char12 == '4');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\t' + "'", char26 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str32, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str37, "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteMode(quoteMode13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteMode(quoteMode20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withEscape('\t');
        java.lang.Character char29 = cSVFormat28.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withEscape(',');
        boolean boolean39 = cSVFormat38.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode47 = cSVFormat46.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat38.withQuoteMode(quoteMode47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat28.withQuoteMode(quoteMode47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat19.withQuoteMode(quoteMode47);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat11.withQuoteMode(quoteMode47);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertTrue("'" + quoteMode47 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode47.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        boolean boolean18 = cSVFormat17.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withNullString("Delimiter=<,> QuoteChar=<#> CommentStart=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean26 = cSVFormat25.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withNullString("\r\n");
        java.lang.Object[] objArray29 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeaderComments(objArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat17.withHeaderComments(objArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter33 = cSVFormat32.printer();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAutoFlush(false);
        char char38 = cSVFormat35.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode39 = cSVFormat35.getQuoteMode();
        java.lang.Appendable appendable40 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat17.print((java.lang.Object) quoteMode39, appendable40, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" });
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertArrayEquals(objArray29, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVPrinter33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '\t' + "'", char38 == '\t');
        org.junit.Assert.assertNull(quoteMode39);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(false);
        java.lang.Character char6 = cSVFormat3.getQuoteCharacter();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean1 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("\r\n");
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('a');
        boolean boolean8 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        boolean boolean14 = cSVFormat11.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode22 = cSVFormat21.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat11.withQuoteMode(quoteMode22);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + quoteMode22 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode22.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuote((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withAllowMissingColumnNames();
        boolean boolean16 = cSVFormat15.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.Character char6 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray9 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        boolean boolean18 = cSVFormat13.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char23 = cSVFormat22.getCommentMarker();
        char char24 = cSVFormat22.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVPrinter cSVPrinter26 = cSVFormat25.printer();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode33 = null;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuoteMode(quoteMode33);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentMarker('a');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 10L, cSVFormat34, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat30.withHeaderComments(objArray38);
        boolean boolean40 = cSVFormat39.getTrim();
        java.sql.ResultSet resultSet41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withHeader(resultSet41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode52 = cSVFormat51.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat44.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat27.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat10.withQuoteMode(quoteMode52);
        java.sql.ResultSet resultSet56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat10.withHeader(resultSet56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withCommentMarker('|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '4' + "'", char23 == '4');
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + ',' + "'", char24 == ',');
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVPrinter26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertTrue("'" + quoteMode52 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode52.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.QuoteMode quoteMode2 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentMarker((java.lang.Character) 'a');
        java.lang.Character char5 = cSVFormat1.getCommentMarker();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(quoteMode2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSetMetaData10);
        boolean boolean12 = cSVFormat9.isNullStringSet();
        boolean boolean13 = cSVFormat9.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '#');
        boolean boolean7 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        boolean boolean16 = cSVFormat11.isNullStringSet();
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withHeader(resultSetMetaData17);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
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
        char char12 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str9, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.isNullStringSet();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeader(resultSet3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase(false);
        boolean boolean7 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteMode(quoteMode7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(resultSetMetaData9);
        boolean boolean11 = cSVFormat6.getIgnoreSurroundingSpaces();
        java.lang.Character char12 = cSVFormat6.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray15 = cSVFormat6.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat6.withHeader(resultSetMetaData16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat6.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        boolean boolean30 = cSVFormat25.equals((java.lang.Object) cSVFormat29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat25.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat25.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char35 = cSVFormat34.getCommentMarker();
        char char36 = cSVFormat34.getDelimiter();
        boolean boolean37 = cSVFormat34.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuoteMode(quoteMode39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withTrim();
        boolean boolean45 = cSVFormat40.equals((java.lang.Object) cSVFormat44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat40.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withTrim();
        boolean boolean50 = cSVFormat49.getIgnoreHeaderCase();
        java.lang.String str51 = cSVFormat49.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat49.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withAllowMissingColumnNames(true);
        java.lang.String[] strArray63 = cSVFormat62.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withAllowMissingColumnNames();
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withHeader(strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat49.withHeader(strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat34.withHeaderComments((java.lang.Object[]) strArray65);
        java.lang.String str70 = cSVFormat6.format((java.lang.Object[]) strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat5.withHeader(strArray65);
        org.apache.commons.csv.CSVPrinter cSVPrinter72 = cSVFormat71.printer();
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat71.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '4' + "'", char35 == '4');
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + ',' + "'", char36 == ',');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVPrinter72);
        org.junit.Assert.assertNotNull(cSVFormat74);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteMode(quoteMode7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(resultSetMetaData9);
        boolean boolean11 = cSVFormat6.getIgnoreSurroundingSpaces();
        java.lang.Character char12 = cSVFormat6.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray15 = cSVFormat6.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat6.withHeader(resultSetMetaData16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat6.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        boolean boolean30 = cSVFormat25.equals((java.lang.Object) cSVFormat29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat25.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat25.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char35 = cSVFormat34.getCommentMarker();
        char char36 = cSVFormat34.getDelimiter();
        boolean boolean37 = cSVFormat34.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuoteMode(quoteMode39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withTrim();
        boolean boolean45 = cSVFormat40.equals((java.lang.Object) cSVFormat44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat40.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withTrim();
        boolean boolean50 = cSVFormat49.getIgnoreHeaderCase();
        java.lang.String str51 = cSVFormat49.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat49.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat49.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withAllowMissingColumnNames(true);
        java.lang.String[] strArray63 = cSVFormat62.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withAllowMissingColumnNames();
        java.lang.String[] strArray65 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat64.withHeader(strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat49.withHeader(strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat34.withHeaderComments((java.lang.Object[]) strArray65);
        java.lang.String str70 = cSVFormat6.format((java.lang.Object[]) strArray65);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat5.withHeader(strArray65);
        org.apache.commons.csv.CSVPrinter cSVPrinter72 = cSVFormat71.printer();
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat71.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat74.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '4' + "'", char35 == '4');
        org.junit.Assert.assertTrue("'" + char36 + "' != '" + ',' + "'", char36 == ',');
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVPrinter72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withAutoFlush(false);
        boolean boolean11 = cSVFormat10.isEscapeCharacterSet();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        boolean boolean13 = cSVFormat10.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withEscape(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(true);
        java.lang.String[] strArray13 = cSVFormat12.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withTrailingDelimiter();
        java.lang.Character char9 = cSVFormat4.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean11 = cSVFormat4.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        java.lang.Object obj7 = null;
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.print(obj7, appendable8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        java.sql.ResultSetMetaData resultSetMetaData19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeader(resultSetMetaData19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withTrim(false);
        boolean boolean25 = cSVFormat24.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat9.withTrailingDelimiter(true);
        java.lang.String str77 = cSVFormat9.getRecordSeparator();
        java.lang.String str78 = cSVFormat9.getNullString();
        java.io.Reader reader79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser80 = cSVFormat9.parse(reader79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVPrinter47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str60, "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str74, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\r\n" + "'", str77, "\r\n");
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        java.nio.file.Path path78 = null;
        java.nio.charset.Charset charset79 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter80 = cSVFormat77.print(path78, charset79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + '\"' + "'", char20 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVPrinter47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str60, "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str74, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertTrue("'" + char75 + "' != '" + ',' + "'", char75 == ',');
        org.junit.Assert.assertNotNull(cSVFormat77);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withAutoFlush(false);
        boolean boolean13 = cSVFormat4.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        boolean boolean9 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines(false);
        java.lang.Character char12 = cSVFormat11.getEscapeCharacter();
        java.lang.String[] strArray13 = cSVFormat11.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withRecordSeparator('\\');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(char12);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker(' ');
        boolean boolean11 = cSVFormat10.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker('a');
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10L, cSVFormat18, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray22);
        boolean boolean24 = cSVFormat23.getTrim();
        java.sql.ResultSet resultSet25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeader(resultSet25);
        boolean boolean27 = cSVFormat23.getTrailingDelimiter();
        boolean boolean28 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter29 = cSVFormat23.printer();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat23.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat23.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker('a');
        boolean boolean36 = cSVFormat10.equals((java.lang.Object) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withQuoteMode(quoteMode38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrim();
        boolean boolean44 = cSVFormat39.equals((java.lang.Object) cSVFormat43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat39.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat39.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean50 = cSVFormat49.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withNullString("\r\n");
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withHeaderComments(objArray53);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat47.withHeaderComments(objArray53);
        java.lang.String str56 = cSVFormat10.format(objArray53);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat4.withHeaderComments(objArray53);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cSVPrinter29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(cSVFormat57);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(true);
        boolean boolean11 = cSVFormat8.getTrailingDelimiter();
        java.sql.ResultSet resultSet12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withHeader(resultSet12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('|');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator('\"');
        java.lang.Character char8 = cSVFormat0.getCommentMarker();
        boolean boolean9 = cSVFormat0.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        java.lang.String str12 = cSVFormat11.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withHeader(resultSetMetaData16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withNullString("hi!");
        java.lang.String str20 = cSVFormat17.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withAllowMissingColumnNames();
        java.lang.Character char22 = cSVFormat17.getEscapeCharacter();
        boolean boolean23 = cSVFormat17.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat17.withNullString("\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat17.withEscape((java.lang.Character) '4');
        boolean boolean28 = cSVFormat27.getAutoFlush();
        boolean boolean29 = cSVFormat11.equals((java.lang.Object) cSVFormat27);
        java.sql.ResultSetMetaData resultSetMetaData30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat11.withHeader(resultSetMetaData30);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\r\n" + "'", str20, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(char22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(false);
        java.lang.String str5 = cSVFormat4.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim(true);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat7.println(appendable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withDelimiter('|');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('a');
        boolean boolean5 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withDelimiter('\\');
        java.lang.Character char8 = cSVFormat4.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        boolean boolean8 = cSVFormat4.isNullStringSet();
        java.lang.String str9 = cSVFormat4.toString();
        java.lang.Character char10 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withTrailingDelimiter();
        java.lang.String str12 = cSVFormat4.toString();
        java.lang.Character char13 = cSVFormat4.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str9, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str12, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
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
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withDelimiter(',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape(' ');
        java.sql.ResultSetMetaData resultSetMetaData26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withHeader(resultSetMetaData26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withRecordSeparator("Delimiter=<,> QuoteChar=<4> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        java.io.Reader reader30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser31 = cSVFormat25.parse(reader30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertArrayEquals(objArray16, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        java.lang.Character char4 = cSVFormat3.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withEscape('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\\' + "'", char4 == '\\');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + quoteMode7 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode7.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        java.lang.String[] strArray12 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withRecordSeparator("\\N");
        java.lang.String[] strArray17 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat2.withTrim(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter20 = cSVFormat19.printer();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withQuote('a');
        boolean boolean24 = cSVFormat23.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVPrinter20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        char char2 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray5 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('\t');
        java.lang.Character char9 = cSVFormat8.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape(',');
        boolean boolean19 = cSVFormat18.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode27 = cSVFormat26.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat18.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat8.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat0.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat0.withDelimiter(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ',' + "'", char2 == ',');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + quoteMode27 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode27.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat9.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker('a');
        java.lang.String str8 = cSVFormat7.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withNullString("10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\r\n" + "'", str8, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withTrailingDelimiter();
        java.lang.String str19 = cSVFormat18.toString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withIgnoreEmptyLines();
        java.lang.Appendable appendable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter22 = cSVFormat20.print(appendable21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'out' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str19, "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord(true);
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
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
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str38, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteMode(quoteMode20);
        java.sql.ResultSetMetaData resultSetMetaData22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withHeader(resultSetMetaData22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withNullString("hi!");
        boolean boolean26 = cSVFormat23.isQuoteCharacterSet();
        boolean boolean27 = cSVFormat16.equals((java.lang.Object) boolean26);
        java.lang.String[] strArray30 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat16.withHeader(strArray30);
        java.lang.String str32 = cSVFormat11.format((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withTrim();
        boolean boolean36 = cSVFormat35.getIgnoreHeaderCase();
        java.lang.String str37 = cSVFormat35.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat35.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat35.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat35.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat35.withCommentMarker((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat46.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withQuoteMode(quoteMode56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withCommentMarker('a');
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10L, cSVFormat57, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat53.withHeaderComments(objArray61);
        java.lang.String[] strArray63 = cSVFormat53.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat53.withRecordSeparator(',');
        java.lang.Character char66 = cSVFormat65.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withIgnoreEmptyLines();
        java.lang.String str68 = cSVFormat67.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat69 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray70 = cSVFormat69.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat69.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode73 = cSVFormat72.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat74 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat74.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat75.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withAllowMissingColumnNames(true);
        java.lang.String[] strArray79 = cSVFormat78.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withAllowMissingColumnNames();
        java.lang.String[] strArray81 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat80.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat72.withHeaderComments((java.lang.Object[]) strArray81);
        java.lang.String str84 = cSVFormat67.format((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat46.withHeaderComments((java.lang.Object[]) strArray81);
        java.lang.String str86 = cSVFormat45.format((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat11.withHeader(strArray81);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str32, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNull(strArray63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNull(char66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "," + "'", str68, ",");
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNull(strArray70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNull(quoteMode73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNull(strArray79);
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "," + "'", str84, ",");
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(cSVFormat87);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean1 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        boolean boolean6 = cSVFormat4.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withDelimiter('|');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim(true);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat4 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withEscape((java.lang.Character) '|');
        java.lang.String str12 = cSVFormat11.getNullString();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrailingDelimiter(true);
        boolean boolean7 = cSVFormat6.isNullStringSet();
        char char8 = cSVFormat6.getDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker('\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\t' + "'", char8 == '\t');
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote((java.lang.Character) '4');
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteMode(quoteMode13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuoteMode(quoteMode32);
        java.sql.ResultSetMetaData resultSetMetaData34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withHeader(resultSetMetaData34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withNullString("hi!");
        boolean boolean38 = cSVFormat35.isQuoteCharacterSet();
        boolean boolean39 = cSVFormat28.equals((java.lang.Object) boolean38);
        java.lang.String[] strArray42 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        java.lang.String str44 = cSVFormat23.format((java.lang.Object[]) strArray42);
        java.lang.String str45 = cSVFormat10.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str44, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"4,410,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.04" + "'", str45, "4\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"4,410,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.04");
        org.junit.Assert.assertNotNull(cSVFormat46);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAutoFlush(false);
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames(false);
        java.lang.String str8 = cSVFormat2.toString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str8, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withAutoFlush(true);
        java.lang.Character char23 = cSVFormat22.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\"' + "'", char23 == '\"');
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("\\N");
        boolean boolean5 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape(',');
        boolean boolean15 = cSVFormat5.equals((java.lang.Object) cSVFormat12);
        boolean boolean16 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withSkipHeaderRecord();
        java.lang.String[] strArray18 = cSVFormat17.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(false);
        boolean boolean11 = cSVFormat10.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        boolean boolean5 = cSVFormat0.getTrim();
        char char6 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSetMetaData10);
        java.lang.Character char12 = cSVFormat9.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ',' + "'", char6 == ',');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\"' + "'", char12 == '\"');
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat8.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('4');
        java.lang.Character char13 = cSVFormat8.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean15 = cSVFormat14.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withNullString("\r\n");
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withHeaderComments(objArray18);
        java.lang.String str20 = cSVFormat8.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat8.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withEscape(',');
        boolean boolean32 = cSVFormat31.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode40 = cSVFormat39.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat31.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat8.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat7.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withTrim(false);
        boolean boolean46 = cSVFormat45.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\"' + "'", char13 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + quoteMode40 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode40.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAutoFlush(false);
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSetMetaData16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withAllowMissingColumnNames();
        boolean boolean19 = cSVFormat18.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("\\N");
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        boolean boolean6 = cSVFormat4.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        boolean boolean12 = cSVFormat11.isNullStringSet();
        boolean boolean13 = cSVFormat4.equals((java.lang.Object) cSVFormat11);
        boolean boolean14 = cSVFormat11.isNullStringSet();
        boolean boolean15 = cSVFormat11.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        boolean boolean18 = cSVFormat13.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        boolean boolean23 = cSVFormat22.getIgnoreHeaderCase();
        java.lang.String str24 = cSVFormat22.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withIgnoreHeaderCase(false);
        java.lang.Character char29 = cSVFormat28.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuoteMode(quoteMode39);
        java.sql.ResultSetMetaData resultSetMetaData41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withHeader(resultSetMetaData41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withNullString("hi!");
        boolean boolean45 = cSVFormat42.isQuoteCharacterSet();
        boolean boolean46 = cSVFormat35.equals((java.lang.Object) boolean45);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat35.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat50.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withAllowMissingColumnNames(true);
        boolean boolean54 = cSVFormat51.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter56 = cSVFormat55.printer();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode58 = null;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withQuoteMode(quoteMode58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat59.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode64 = null;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat59.withQuoteMode(quoteMode64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat59.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray68 = new java.lang.Object[] { cSVFormat30, cSVFormat47, "\\N", boolean54, cSVFormat55, cSVFormat67 };
        java.lang.String str69 = cSVFormat28.format(objArray68);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat13.withHeaderComments(objArray68);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat10.withHeaderComments(objArray68);
        boolean boolean72 = cSVFormat71.isEscapeCharacterSet();
        boolean boolean73 = cSVFormat71.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\"' + "'", char29 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVPrinter56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str69, "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getNullString();
        boolean boolean2 = cSVFormat0.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        char char5 = cSVFormat2.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withEscape('a');
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withHeader(resultSet14);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuoteMode(quoteMode27);
        java.sql.ResultSetMetaData resultSetMetaData29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withHeader(resultSetMetaData29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withNullString("hi!");
        boolean boolean33 = cSVFormat30.isQuoteCharacterSet();
        boolean boolean34 = cSVFormat23.equals((java.lang.Object) boolean33);
        java.lang.String[] strArray37 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat23.withHeader(strArray37);
        java.lang.String str39 = cSVFormat18.format((java.lang.Object[]) strArray37);
        java.lang.String str40 = cSVFormat6.format((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat6.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str39, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str40, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withEscape('\\');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=<\\> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.String str14 = cSVFormat11.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str14, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        boolean boolean6 = cSVFormat5.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        java.lang.Appendable appendable10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteMode(quoteMode17);
        java.sql.ResultSetMetaData resultSetMetaData19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withHeader(resultSetMetaData19);
        boolean boolean21 = cSVFormat16.getIgnoreSurroundingSpaces();
        java.lang.Character char22 = cSVFormat16.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat16.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray25 = cSVFormat16.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withHeader(resultSetMetaData26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat16.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat16.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuoteMode(quoteMode39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker('a');
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10L, cSVFormat40, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat36.withHeaderComments(objArray44);
        boolean boolean46 = cSVFormat45.getTrim();
        java.sql.ResultSet resultSet47 = null;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withHeader(resultSet47);
        boolean boolean49 = cSVFormat45.getTrailingDelimiter();
        boolean boolean50 = cSVFormat45.getSkipHeaderRecord();
        boolean boolean51 = cSVFormat45.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat45.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.String[] strArray55 = cSVFormat54.getHeaderComments();
        java.lang.String str56 = cSVFormat33.format((java.lang.Object[]) strArray55);
        java.lang.String str57 = cSVFormat11.format((java.lang.Object[]) strArray55);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat6.printRecord(appendable10, (java.lang.Object[]) strArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(char22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(strArray25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "10", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "1.0" });
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str56, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str57, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat13.printer();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVPrinter cSVPrinter21 = cSVFormat17.printer();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withAutoFlush(false);
        boolean boolean24 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = cSVFormat27.printer();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter30 = cSVFormat29.printer();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape(',');
        boolean boolean40 = cSVFormat39.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode48 = cSVFormat47.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat39.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat29.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat27.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat26.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat16.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withCommentMarker('\\');
        java.lang.Character char56 = cSVFormat55.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVPrinter14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVPrinter21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVPrinter28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVPrinter30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + quoteMode48 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode48.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\\' + "'", char56 == '\\');
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        java.lang.Character char4 = cSVFormat3.getEscapeCharacter();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeader(resultSetMetaData5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withTrim();
        boolean boolean9 = cSVFormat8.getIgnoreHeaderCase();
        java.lang.String str10 = cSVFormat8.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase(false);
        java.lang.Character char15 = cSVFormat14.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuoteMode(quoteMode25);
        java.sql.ResultSetMetaData resultSetMetaData27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withHeader(resultSetMetaData27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withNullString("hi!");
        boolean boolean31 = cSVFormat28.isQuoteCharacterSet();
        boolean boolean32 = cSVFormat21.equals((java.lang.Object) boolean31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat21.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withAllowMissingColumnNames(true);
        boolean boolean40 = cSVFormat37.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter42 = cSVFormat41.printer();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode44 = null;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuoteMode(quoteMode44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat45.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode50 = null;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat45.withQuoteMode(quoteMode50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat45.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray54 = new java.lang.Object[] { cSVFormat16, cSVFormat33, "\\N", boolean40, cSVFormat41, cSVFormat53 };
        java.lang.String str55 = cSVFormat14.format(objArray54);
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode61 = null;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withQuoteMode(quoteMode61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withCommentMarker('a');
        java.lang.Object[] objArray66 = new java.lang.Object[] { 10L, cSVFormat62, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat58.withHeaderComments(objArray66);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat14.withHeaderComments(objArray66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat6.withHeaderComments(objArray66);
        java.sql.ResultSet resultSet70 = null;
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withHeader(resultSet70);
        boolean boolean72 = cSVFormat69.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\\' + "'", char4 == '\\');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVPrinter42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str55, "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(true);
        java.lang.Character char5 = cSVFormat4.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("\"\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\",\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"10\tDelimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0\"");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withDelimiter('|');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSetMetaData10);
        java.sql.ResultSet resultSet12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withHeader(resultSet12);
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withRecordSeparator("\n");
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withAllowMissingColumnNames(true);
        java.lang.String[] strArray36 = cSVFormat35.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames();
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat28.withHeaderComments((java.lang.Object[]) strArray38);
        boolean boolean41 = cSVFormat40.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withTrim();
        boolean boolean49 = cSVFormat44.equals((java.lang.Object) cSVFormat48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat44.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat44.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char54 = cSVFormat53.getCommentMarker();
        char char55 = cSVFormat53.getDelimiter();
        boolean boolean56 = cSVFormat53.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode58 = null;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withQuoteMode(quoteMode58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withTrim();
        boolean boolean64 = cSVFormat59.equals((java.lang.Object) cSVFormat63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat59.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat67.withTrim();
        boolean boolean69 = cSVFormat68.getIgnoreHeaderCase();
        java.lang.String str70 = cSVFormat68.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat68.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat68.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat68.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat77 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat77.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat78.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat79.withAllowMissingColumnNames(true);
        java.lang.String[] strArray82 = cSVFormat81.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat81.withAllowMissingColumnNames();
        java.lang.String[] strArray84 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat83.withHeader(strArray84);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat68.withHeader(strArray84);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat66.withHeaderComments((java.lang.Object[]) strArray84);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat53.withHeaderComments((java.lang.Object[]) strArray84);
        boolean boolean89 = cSVFormat40.equals((java.lang.Object) cSVFormat88);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat88.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat88.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" + "'", str24, "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + ',' + "'", char26 == ',');
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + '4' + "'", char54 == '4');
        org.junit.Assert.assertTrue("'" + char55 + "' != '" + ',' + "'", char55 == ',');
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNull(strArray82);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat87);
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(cSVFormat90);
        org.junit.Assert.assertNotNull(cSVFormat91);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        boolean boolean16 = cSVFormat11.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat11.withCommentMarker('|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean3 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces();
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        java.lang.Character char7 = cSVFormat5.getQuoteCharacter();
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat5.getQuoteMode();
        boolean boolean9 = cSVFormat5.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + quoteMode8 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode8.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        boolean boolean12 = cSVFormat11.getIgnoreHeaderCase();
        java.lang.String str13 = cSVFormat11.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteMode(quoteMode20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withTrim();
        boolean boolean26 = cSVFormat21.equals((java.lang.Object) cSVFormat25);
        boolean boolean27 = cSVFormat11.equals((java.lang.Object) cSVFormat21);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuoteMode(quoteMode29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(resultSetMetaData38);
        org.apache.commons.csv.QuoteMode quoteMode40 = cSVFormat39.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter42 = cSVFormat41.printer();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withRecordSeparator('4');
        java.lang.Character char46 = cSVFormat41.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean48 = cSVFormat47.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withNullString("\r\n");
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withHeaderComments(objArray51);
        java.lang.String str53 = cSVFormat41.format(objArray51);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat41.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat56.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat62.withEscape(',');
        boolean boolean65 = cSVFormat64.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat66.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat69.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode73 = cSVFormat72.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat64.withQuoteMode(quoteMode73);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat41.withQuoteMode(quoteMode73);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat39.withQuoteMode(quoteMode73);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat11.withQuoteMode(quoteMode73);
        boolean boolean78 = cSVFormat8.equals((java.lang.Object) cSVFormat11);
        boolean boolean79 = cSVFormat8.isNullStringSet();
        char char80 = cSVFormat8.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(quoteMode9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNull(quoteMode40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVPrinter42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '\"' + "'", char46 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertArrayEquals(objArray51, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertTrue("'" + quoteMode73 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode73.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + char80 + "' != '" + ',' + "'", char80 == ',');
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean16 = cSVFormat15.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteMode(quoteMode20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withIgnoreEmptyLines();
        boolean boolean29 = cSVFormat28.getTrailingDelimiter();
        boolean boolean30 = cSVFormat28.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        boolean boolean33 = cSVFormat32.getIgnoreHeaderCase();
        java.lang.String str34 = cSVFormat32.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat32.withIgnoreHeaderCase(false);
        java.lang.Character char39 = cSVFormat38.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode49 = null;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuoteMode(quoteMode49);
        java.sql.ResultSetMetaData resultSetMetaData51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withHeader(resultSetMetaData51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withNullString("hi!");
        boolean boolean55 = cSVFormat52.isQuoteCharacterSet();
        boolean boolean56 = cSVFormat45.equals((java.lang.Object) boolean55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat45.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withAllowMissingColumnNames(true);
        boolean boolean64 = cSVFormat61.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter66 = cSVFormat65.printer();
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode68 = null;
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withQuoteMode(quoteMode68);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat69.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat69.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode74 = null;
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat69.withQuoteMode(quoteMode74);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat69.withAllowMissingColumnNames(true);
        java.lang.Object[] objArray78 = new java.lang.Object[] { cSVFormat40, cSVFormat57, "\\N", boolean64, cSVFormat65, cSVFormat77 };
        java.lang.String str79 = cSVFormat38.format(objArray78);
        org.apache.commons.csv.CSVFormat cSVFormat80 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat80.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat81.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat84 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode85 = null;
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat84.withQuoteMode(quoteMode85);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat86.withCommentMarker('a');
        java.lang.Object[] objArray90 = new java.lang.Object[] { 10L, cSVFormat86, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat82.withHeaderComments(objArray90);
        org.apache.commons.csv.CSVFormat cSVFormat92 = cSVFormat38.withHeaderComments(objArray90);
        java.lang.String str93 = cSVFormat28.format(objArray90);
        java.lang.String str94 = cSVFormat15.format(objArray90);
        org.apache.commons.csv.CSVFormat cSVFormat95 = cSVFormat14.withHeaderComments(objArray90);
        java.lang.String str96 = cSVFormat2.format(objArray90);
        java.lang.Character char97 = cSVFormat2.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertTrue("'" + char39 + "' != '" + '\"' + "'", char39 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVPrinter66);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str79, "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat91);
        org.junit.Assert.assertNotNull(cSVFormat92);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str93, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str94, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertNotNull(cSVFormat95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" + "'", str96, "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertNull(char97);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Appendable appendable9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker('a');
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10L, cSVFormat16, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray20);
        java.lang.String[] strArray22 = cSVFormat12.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat12.withRecordSeparator(',');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreEmptyLines();
        java.lang.String str27 = cSVFormat26.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withTrim(true);
        java.lang.Character char33 = cSVFormat32.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuoteMode(quoteMode41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat42.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat53.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withQuoteMode(quoteMode60);
        java.sql.ResultSetMetaData resultSetMetaData62 = null;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat59.withHeader(resultSetMetaData62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withNullString("hi!");
        boolean boolean66 = cSVFormat63.isQuoteCharacterSet();
        boolean boolean67 = cSVFormat56.equals((java.lang.Object) boolean66);
        java.lang.String[] strArray70 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat56.withHeader(strArray70);
        java.lang.String str72 = cSVFormat51.format((java.lang.Object[]) strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat37.withHeaderComments((java.lang.Object[]) strArray70);
        java.lang.String str74 = cSVFormat32.format((java.lang.Object[]) strArray70);
        java.lang.String str75 = cSVFormat26.format((java.lang.Object[]) strArray70);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat5.printRecord(appendable9, (java.lang.Object[]) strArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNull(strArray22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "," + "'", str27, ",");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNull(char33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str72, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false, 1.0]\"\\\tfalse\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true Header:[]\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\t10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\",1.0" + "'", str74, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false, 1.0]\"\\\tfalse\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true Header:[]\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\t10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"," + "'", str75, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\",");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat4 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) '#');
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        java.lang.Character char8 = cSVFormat7.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames();
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVPrinter cSVPrinter23 = cSVFormat18.printer();
        boolean boolean24 = cSVFormat7.equals((java.lang.Object) cSVPrinter23);
        java.lang.String str25 = cSVFormat7.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVPrinter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat2.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAutoFlush(false);
        char char9 = cSVFormat8.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10L, cSVFormat17, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeaderComments(objArray21);
        java.lang.String[] strArray23 = cSVFormat13.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat13.withRecordSeparator(',');
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat13.withQuoteMode(quoteMode26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat13.withRecordSeparator('\t');
        boolean boolean31 = cSVFormat10.equals((java.lang.Object) cSVFormat30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ',' + "'", char9 == ',');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        java.lang.Character char6 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) ' ');
        java.lang.String str10 = cSVFormat7.toString();
        java.lang.String str11 = cSVFormat7.getRecordSeparator();
        java.lang.String str12 = cSVFormat7.toString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withIgnoreEmptyLines(false);
        boolean boolean16 = cSVFormat15.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str10, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true" + "'", str12, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> Escape=<a> QuoteChar=<\"> RecordSeparator=<??> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
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
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat14.withTrim();
        java.lang.String str22 = cSVFormat21.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\"' + "'", char6 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Delimiter=<,> QuoteChar=<\"> CommentStart=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str22, "Delimiter=<,> QuoteChar=<\"> CommentStart=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str9 = cSVFormat8.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withTrim();
        boolean boolean17 = cSVFormat12.equals((java.lang.Object) cSVFormat16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char22 = cSVFormat21.getCommentMarker();
        char char23 = cSVFormat21.getDelimiter();
        boolean boolean24 = cSVFormat21.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteMode(quoteMode26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withTrim();
        boolean boolean32 = cSVFormat27.equals((java.lang.Object) cSVFormat31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat27.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withTrim();
        boolean boolean37 = cSVFormat36.getIgnoreHeaderCase();
        java.lang.String str38 = cSVFormat36.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat36.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat36.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat45.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withAllowMissingColumnNames(true);
        java.lang.String[] strArray50 = cSVFormat49.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withAllowMissingColumnNames();
        java.lang.String[] strArray52 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat36.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat34.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat21.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat8.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat1.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withRecordSeparator("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withNullString("Delimiter=<,> QuoteChar=<\"> CommentStart=<a> RecordSeparator=<\r\n> SkipHeaderRecord:false HeaderComments:[]");
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + '4' + "'", char22 == '4');
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + ',' + "'", char23 == ',');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        java.lang.String str15 = cSVFormat14.getNullString();
        java.lang.String str16 = cSVFormat14.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteMode(quoteMode21);
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withHeader(resultSetMetaData23);
        boolean boolean25 = cSVFormat20.getIgnoreSurroundingSpaces();
        java.lang.Character char26 = cSVFormat20.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat20.withCommentMarker((java.lang.Character) '\\');
        java.lang.String[] strArray29 = cSVFormat20.getHeaderComments();
        java.sql.ResultSetMetaData resultSetMetaData30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat20.withHeader(resultSetMetaData30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat20.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat20.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat20.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withQuoteMode(quoteMode38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrim();
        boolean boolean44 = cSVFormat39.equals((java.lang.Object) cSVFormat43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat39.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat39.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char49 = cSVFormat48.getCommentMarker();
        char char50 = cSVFormat48.getDelimiter();
        boolean boolean51 = cSVFormat48.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withTrim();
        boolean boolean59 = cSVFormat54.equals((java.lang.Object) cSVFormat58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat54.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withTrim();
        boolean boolean64 = cSVFormat63.getIgnoreHeaderCase();
        java.lang.String str65 = cSVFormat63.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat63.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat63.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat63.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat72 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat72.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat73.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat74.withAllowMissingColumnNames(true);
        java.lang.String[] strArray77 = cSVFormat76.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withAllowMissingColumnNames();
        java.lang.String[] strArray79 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat78.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat63.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat61.withHeaderComments((java.lang.Object[]) strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat48.withHeaderComments((java.lang.Object[]) strArray79);
        java.lang.String str84 = cSVFormat20.format((java.lang.Object[]) strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat16.withHeader(strArray79);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(char26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(strArray29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '4' + "'", char49 == '4');
        org.junit.Assert.assertTrue("'" + char50 + "' != '" + ',' + "'", char50 == ',');
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(cSVFormat67);
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(cSVFormat71);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNull(strArray77);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(cSVFormat85);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withNullString("Delimiter=< > QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true Header:[]");
        org.apache.commons.csv.QuoteMode quoteMode10 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withQuote('a');
        java.lang.Character char13 = cSVFormat7.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        java.sql.ResultSetMetaData resultSetMetaData27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat4.withHeader(resultSetMetaData27);
        java.lang.Character char29 = cSVFormat28.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat30.printer();
        boolean boolean32 = cSVFormat30.getIgnoreEmptyLines();
        boolean boolean33 = cSVFormat30.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker('a');
        java.lang.String str38 = cSVFormat37.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withSkipHeaderRecord(true);
        boolean boolean43 = cSVFormat28.equals((java.lang.Object) cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" + "'", str24, "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + ',' + "'", char26 == ',');
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNull(char29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\r\n" + "'", str38, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        java.lang.String[] strArray12 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withRecordSeparator(',');
        java.lang.Character char15 = cSVFormat14.getCommentMarker();
        org.apache.commons.csv.CSVFormat.Predefined predefined16 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat17 = predefined16.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat18 = predefined16.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteMode(quoteMode22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat25.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withIgnoreEmptyLines();
        java.lang.Character char31 = cSVFormat30.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withAllowMissingColumnNames(true);
        java.lang.String[] strArray37 = cSVFormat36.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withAllowMissingColumnNames();
        java.lang.String[] strArray39 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray39);
        java.lang.String str42 = cSVFormat20.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withHeader(strArray39);
        boolean boolean44 = cSVFormat14.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(char15);
        org.junit.Assert.assertTrue("'" + predefined16 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined16.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '\"' + "'", char31 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"" + "'", str42, "\"");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('4');
        java.lang.Character char5 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean7 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("\r\n");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeaderComments(objArray10);
        java.lang.String str12 = cSVFormat0.format(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getNullString();
        java.lang.Character char2 = cSVFormat0.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(char2);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.String str11 = cSVFormat10.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreEmptyLines(false);
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withRecordSeparator('4');
        java.lang.Character char5 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean7 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withNullString("\r\n");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeaderComments(objArray10);
        java.lang.String str12 = cSVFormat0.format(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) '4');
        java.lang.String[] strArray17 = cSVFormat16.getHeader();
        char char18 = cSVFormat16.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(strArray17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\t' + "'", char18 == '\t');
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        java.lang.String[] strArray9 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreSurroundingSpaces();
        java.lang.Character char11 = cSVFormat4.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'a' + "'", char11 == 'a');
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        java.lang.Character char5 = cSVFormat4.getQuoteCharacter();
        boolean boolean6 = cSVFormat4.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\"' + "'", char5 == '\"');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean6 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withTrim();
        boolean boolean15 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        boolean boolean23 = cSVFormat18.equals((java.lang.Object) cSVFormat22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat18.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat18.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char28 = cSVFormat27.getCommentMarker();
        char char29 = cSVFormat27.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuoteMode(quoteMode32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuoteMode(quoteMode51);
        java.sql.ResultSetMetaData resultSetMetaData53 = null;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withHeader(resultSetMetaData53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withNullString("hi!");
        boolean boolean57 = cSVFormat54.isQuoteCharacterSet();
        boolean boolean58 = cSVFormat47.equals((java.lang.Object) boolean57);
        java.lang.String[] strArray61 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat47.withHeader(strArray61);
        java.lang.String str63 = cSVFormat42.format((java.lang.Object[]) strArray61);
        java.lang.String str64 = cSVFormat27.format((java.lang.Object[]) strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat9.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat0.withHeader(strArray61);
        org.apache.commons.csv.CSVPrinter cSVPrinter67 = cSVFormat66.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertTrue("'" + char28 + "' != '" + '4' + "'", char28 == '4');
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + ',' + "'", char29 == ',');
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str63, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str64, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVPrinter67);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines();
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withHeader(resultSetMetaData13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
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
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreEmptyLines();
        java.lang.Character char31 = cSVFormat28.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withAutoFlush(true);
        java.lang.String str36 = cSVFormat33.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<hi!> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat37.withTrailingDelimiter(true);
        boolean boolean44 = cSVFormat33.equals((java.lang.Object) cSVFormat37);
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(quoteMode8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" + "'", str24, "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(char31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\r\n" + "'", str36, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.Appendable appendable5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuoteMode(quoteMode7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('4');
        boolean boolean16 = cSVFormat15.getTrim();
        boolean boolean17 = cSVFormat15.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        java.lang.String[] strArray21 = cSVFormat19.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withQuote((java.lang.Character) '#');
        boolean boolean26 = cSVFormat25.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withIgnoreSurroundingSpaces(true);
        boolean boolean30 = cSVFormat27.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuoteMode(quoteMode32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withAllowMissingColumnNames();
        boolean boolean40 = cSVFormat39.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode48 = null;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat53.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat53.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode67 = null;
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withQuoteMode(quoteMode67);
        java.sql.ResultSetMetaData resultSetMetaData69 = null;
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat66.withHeader(resultSetMetaData69);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat70.withNullString("hi!");
        boolean boolean73 = cSVFormat70.isQuoteCharacterSet();
        boolean boolean74 = cSVFormat63.equals((java.lang.Object) boolean73);
        java.lang.String[] strArray77 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat63.withHeader(strArray77);
        java.lang.String str79 = cSVFormat58.format((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat44.withHeaderComments((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat39.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat27.withHeaderComments((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat15.withHeader(strArray77);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat4.printRecord(appendable5, (java.lang.Object[]) strArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str79, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(cSVFormat82);
        org.junit.Assert.assertNotNull(cSVFormat83);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat2.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withRecordSeparator("");
        java.lang.Character char9 = cSVFormat2.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withHeader(resultSetMetaData12);
        boolean boolean14 = cSVFormat13.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(quoteMode6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        char char5 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withNullString("Delimiter=<\t> Escape=<\\> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\t' + "'", char5 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat8.printer();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord();
        boolean boolean13 = cSVFormat12.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat6.getIgnoreHeaderCase();
        java.lang.String str8 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        boolean boolean11 = cSVFormat0.equals((java.lang.Object) "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        java.lang.Character char8 = cSVFormat2.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withNullString("Delimiter=< > QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true Header:[]");
        char char10 = cSVFormat9.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) 'a');
        boolean boolean10 = cSVFormat2.getAllowMissingColumnNames();
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withHeader(resultSet11);
        java.lang.String str13 = cSVFormat2.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str13, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        java.lang.String[] strArray12 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withRecordSeparator(',');
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withDelimiter('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        java.lang.Character char3 = cSVFormat2.getEscapeCharacter();
        java.lang.Character char4 = cSVFormat2.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(true);
        boolean boolean8 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withAutoFlush(false);
        java.lang.String str13 = cSVFormat5.toString();
        boolean boolean14 = cSVFormat2.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat5.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNull(char4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str13, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(true);
        java.lang.Character char5 = cSVFormat4.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuoteMode(quoteMode13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withQuoteMode(quoteMode32);
        java.sql.ResultSetMetaData resultSetMetaData34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withHeader(resultSetMetaData34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withNullString("hi!");
        boolean boolean38 = cSVFormat35.isQuoteCharacterSet();
        boolean boolean39 = cSVFormat28.equals((java.lang.Object) boolean38);
        java.lang.String[] strArray42 = new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        java.lang.String str44 = cSVFormat23.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray42);
        java.lang.String str46 = cSVFormat4.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat4.withTrailingDelimiter(true);
        boolean boolean49 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat4.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\tfalse\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"", "10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0" });
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"" + "'", str44, "\"\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\"\"\tfalse\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true Header:[]\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\t\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\"\",\"10,\"\"Delimiter=<,> QuoteChar=<\"\"\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\",1.0\"");
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false, 1.0]\"\\\tfalse\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true Header:[]\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\t10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\",1.0" + "'", str46, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false, 1.0]\"\\\tfalse\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:true Header:[]\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<,> SkipHeaderRecord:true\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\\\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\"\t10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\",1.0");
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withQuote((java.lang.Character) '#');
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        java.lang.String[] strArray9 = cSVFormat7.getHeaderComments();
        java.lang.String str10 = cSVFormat7.toString();
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(resultSet11);
        boolean boolean13 = cSVFormat12.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<#> RecordSeparator=<\r\n> SkipHeaderRecord:false" + "'", str10, "Delimiter=<,> QuoteChar=<#> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVPrinter cSVPrinter1 = cSVFormat0.printer();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator('\t');
        boolean boolean8 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVPrinter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withCommentMarker('\\');
        boolean boolean21 = cSVFormat6.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        java.nio.file.Path path24 = null;
        java.nio.charset.Charset charset25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter26 = cSVFormat23.print(path24, charset25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat23);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        java.lang.String[] strArray13 = cSVFormat11.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreEmptyLines();
        java.lang.String str16 = cSVFormat14.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "10", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "1.0" });
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]" + "'", str16, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SurroundingSpaces:ignored SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withNullString("10,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\",1.0");
        boolean boolean15 = cSVFormat4.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat13.println(appendable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        boolean boolean7 = cSVFormat2.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withAutoFlush(false);
        boolean boolean11 = cSVFormat10.isEscapeCharacterSet();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        java.lang.Character char13 = cSVFormat10.getQuoteCharacter();
        java.io.File file14 = null;
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat10.print(file14, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\"' + "'", char13 == '\"');
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote((java.lang.Character) '4');
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, cSVFormat6, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments(objArray10);
        java.lang.String[] strArray12 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withRecordSeparator("\\N");
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        boolean boolean24 = cSVFormat19.equals((java.lang.Object) cSVFormat23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withTrailingDelimiter(false);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat28.withHeader(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat16.withHeader(strArray33);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat16.withIgnoreEmptyLines();
        char char37 = cSVFormat16.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat16.withFirstRecordAsHeader();
        java.lang.Character char39 = cSVFormat16.getCommentMarker();
        char char40 = cSVFormat16.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" });
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + char37 + "' != '" + ',' + "'", char37 == ',');
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNull(char39);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + ',' + "'", char40 == ',');
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        java.lang.String[] strArray3 = cSVFormat1.getHeader();
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("Delimiter=<,> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> SkipHeaderRecord:true");
        java.lang.Character char8 = cSVFormat7.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuoteMode(quoteMode10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withCommentMarker(' ');
        char char17 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat11.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuoteMode(quoteMode21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withTrim();
        boolean boolean27 = cSVFormat22.equals((java.lang.Object) cSVFormat26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat22.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withTrim();
        boolean boolean32 = cSVFormat31.getIgnoreHeaderCase();
        java.lang.String str33 = cSVFormat31.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat31.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withAllowMissingColumnNames(true);
        java.lang.String[] strArray45 = cSVFormat44.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withAllowMissingColumnNames();
        java.lang.String[] strArray47 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat31.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat29.withHeaderComments((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat29.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat29.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withQuoteMode(quoteMode56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withTrim();
        boolean boolean62 = cSVFormat57.equals((java.lang.Object) cSVFormat61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat57.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat65.withTrim();
        boolean boolean67 = cSVFormat66.getIgnoreHeaderCase();
        java.lang.String str68 = cSVFormat66.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat66.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat66.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat66.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat75.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat76.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat77.withAllowMissingColumnNames(true);
        java.lang.String[] strArray80 = cSVFormat79.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat79.withAllowMissingColumnNames();
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat81.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat66.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat64.withHeaderComments((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat29.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat11.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat88.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat88.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + ',' + "'", char17 == ',');
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNull(strArray45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(cSVFormat70);
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat79);
        org.junit.Assert.assertNull(strArray80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat83);
        org.junit.Assert.assertNotNull(cSVFormat84);
        org.junit.Assert.assertNotNull(cSVFormat85);
        org.junit.Assert.assertNotNull(cSVFormat86);
        org.junit.Assert.assertNotNull(cSVFormat87);
        org.junit.Assert.assertNotNull(cSVFormat88);
        org.junit.Assert.assertNotNull(cSVFormat89);
        org.junit.Assert.assertNotNull(cSVFormat91);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces();
        boolean boolean4 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withTrailingDelimiter(true);
        boolean boolean7 = cSVFormat6.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withEscape('|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        java.lang.Character char9 = cSVFormat4.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '4' + "'", char9 == '4');
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape('a');
        boolean boolean7 = cSVFormat4.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat4.getTrim();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        boolean boolean18 = cSVFormat13.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrim();
        boolean boolean23 = cSVFormat22.getIgnoreHeaderCase();
        java.lang.String str24 = cSVFormat22.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat22.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withAllowMissingColumnNames(true);
        java.lang.String[] strArray36 = cSVFormat35.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withAllowMissingColumnNames();
        java.lang.String[] strArray38 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat22.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat20.withHeaderComments((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat20.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode45 = null;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withNullString("");
        org.apache.commons.csv.QuoteMode quoteMode52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withQuoteMode(quoteMode52);
        boolean boolean54 = cSVFormat53.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode58 = null;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withQuoteMode(quoteMode58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withTrim();
        boolean boolean64 = cSVFormat59.equals((java.lang.Object) cSVFormat63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat59.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat66.withTrailingDelimiter(false);
        java.lang.String[] strArray73 = new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" };
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat68.withHeader(strArray73);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat56.withHeaderComments((java.lang.Object[]) strArray73);
        java.lang.String str76 = cSVFormat43.format((java.lang.Object[]) strArray73);
        java.lang.String str77 = cSVFormat10.format((java.lang.Object[]) strArray73);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNull(strArray36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertNotNull(cSVFormat68);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]", "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" });
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\"\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\",\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"10\tDelimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0\"" + "'", str76, "\"\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\",\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"10\tDelimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0\"");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\"\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\",\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"10\tDelimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0\"" + "'", str77, "\"\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true HeaderComments:[10, Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]\",\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"10\tDelimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0\"");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean10 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('\"');
        boolean boolean16 = cSVFormat15.getIgnoreHeaderCase();
        boolean boolean17 = cSVFormat15.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuoteMode(quoteMode1);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("hi!");
        java.lang.String str7 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean9 = cSVFormat8.isQuoteCharacterSet();
        boolean boolean10 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        boolean boolean1 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote('4');
        boolean boolean6 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreSurroundingSpaces(false);
        boolean boolean15 = cSVFormat11.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withRecordSeparator("10\t\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        java.lang.String str4 = cSVFormat2.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withEscape('\"');
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10L, cSVFormat9, 1.0f };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withHeaderComments(objArray13);
        java.lang.String str15 = cSVFormat0.format(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat0.withSkipHeaderRecord(true);
        java.lang.String str22 = cSVFormat21.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0" + "'", str15, "10\tDelimiter=<,> QuoteChar=<\"> RecordSeparator=<\\r\\n> SkipHeaderRecord:false\t1.0");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\n" + "'", str22, "\n");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
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
        java.lang.String[] strArray16 = cSVFormat11.getHeader();
        java.lang.Character char17 = cSVFormat11.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false, 1.0]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strArray16);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\"' + "'", char17 == '\"');
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(false);
        boolean boolean14 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat11.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withAllowMissingColumnNames(true);
        java.lang.Character char18 = cSVFormat11.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat11.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(quoteMode15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(char18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
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
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withEscape((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
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
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat7.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\"' + "'", char8 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVPrinter35);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[Delimiter=<\t> Escape=<\"> QuoteChar=<\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:true, \\N, false, Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"" + "'", str48, "\"Delimiter=<\t> Escape=<\"\"> QuoteChar=<\"\"> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:true\",\\N,false,\"Delimiter=<\t> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> SkipHeaderRecord:false\"");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + ',' + "'", char51 == ',');
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
    }
}

