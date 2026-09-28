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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat0.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withFirstRecordAsHeader();
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withHeader(strArray7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat0.equals((java.lang.Object) cSVFormat4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat4", cSVFormat3.equals(cSVFormat4) ? cSVFormat3.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withDelimiter('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat7.equals((java.lang.Object) cSVFormat9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean8 = cSVFormat7.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames(true);
        java.lang.Character char11 = cSVFormat3.getCommentMarker();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat14.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreHeaderCase();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.String[] strArray4 = cSVFormat2.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat3.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreHeaderCase(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.String str19 = cSVFormat17.format(objArray18);
        boolean boolean20 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str24 = cSVFormat23.getRecordSeparator();
        boolean boolean25 = cSVFormat23.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withTrim();
        java.lang.Character char27 = cSVFormat23.getEscapeCharacter();
        boolean boolean29 = cSVFormat23.equals((java.lang.Object) 100.0d);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str31 = cSVFormat30.getRecordSeparator();
        boolean boolean32 = cSVFormat30.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
        boolean boolean35 = cSVFormat33.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withEscape('#');
        boolean boolean39 = cSVFormat36.getIgnoreSurroundingSpaces();
        boolean boolean40 = cSVFormat36.getTrailingDelimiter();
        java.lang.String[] strArray44 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat36.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat23.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat17.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean8 = cSVFormat5.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        java.lang.Character char10 = cSVFormat0.getCommentMarker();
        char char11 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('#');
        boolean boolean19 = cSVFormat16.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(resultSetMetaData20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str23 = cSVFormat22.getRecordSeparator();
        boolean boolean24 = cSVFormat22.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str26 = cSVFormat25.getRecordSeparator();
        boolean boolean27 = cSVFormat25.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape('#');
        boolean boolean31 = cSVFormat28.getIgnoreSurroundingSpaces();
        boolean boolean32 = cSVFormat28.getTrailingDelimiter();
        java.lang.String[] strArray36 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat22.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat0.format((java.lang.Object[]) strArray36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass7 = cSVFormat6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        char char18 = cSVFormat15.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str2 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames(true);
        java.lang.Character char11 = cSVFormat3.getCommentMarker();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withEscape(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreHeaderCase();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteMode(quoteMode4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean3 = cSVFormat2.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Predefined predefined6 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = predefined6.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat8 = predefined6.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat9 = predefined6.getFormat();
        boolean boolean10 = cSVFormat5.equals((java.lang.Object) cSVFormat9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat5", cSVFormat2.equals(cSVFormat5) ? cSVFormat2.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote('\"');
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('\\');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Predefined predefined12 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat13 = predefined12.getFormat();
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSetMetaData14);
        java.lang.String[] strArray16 = cSVFormat13.getHeaderComments();
        boolean boolean17 = cSVFormat13.isNullStringSet();
        java.sql.ResultSet resultSet18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat13.withHeader(resultSet18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat13.withAllowMissingColumnNames(true);
        boolean boolean22 = cSVFormat9.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        java.lang.String[] strArray18 = cSVFormat17.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.String str2 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        char char6 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat8.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('#');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        boolean boolean23 = cSVFormat19.getTrailingDelimiter();
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray27);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray27);
        boolean boolean32 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean33 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withQuote((java.lang.Character) '\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat34", cSVFormat0.equals(cSVFormat34) ? cSVFormat0.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreHeaderCase();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.String str11 = cSVFormat9.format(objArray10);
        java.lang.String str12 = cSVFormat5.format(objArray10);
        java.lang.String[] strArray13 = cSVFormat5.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat5.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withDelimiter('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat18", cSVFormat16.equals(cSVFormat18) ? cSVFormat16.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        boolean boolean9 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(true);
        char char17 = cSVFormat16.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat6.equals((java.lang.Object) cSVFormat7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat8", cSVFormat7.equals(cSVFormat8) ? cSVFormat7.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        java.lang.Character char10 = cSVFormat0.getCommentMarker();
        char char11 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Character char13 = cSVFormat12.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withQuoteMode(quoteMode7);
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withEscape('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        java.lang.Character char10 = cSVFormat0.getCommentMarker();
        char char11 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean13 = cSVFormat12.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.String str11 = cSVFormat9.format(objArray10);
        java.lang.String str12 = cSVFormat5.format(objArray10);
        java.lang.String[] strArray13 = cSVFormat5.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat5.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreHeaderCase();
        boolean boolean19 = cSVFormat18.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat18", cSVFormat16.equals(cSVFormat18) ? cSVFormat16.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        java.lang.Character char10 = cSVFormat0.getCommentMarker();
        char char11 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withHeader(resultSetMetaData13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean14 = cSVFormat0.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) 'a');
        boolean boolean8 = cSVFormat5.getIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withQuoteMode(quoteMode9);
        java.lang.String str11 = cSVFormat5.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        boolean boolean13 = cSVFormat12.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withEscape((java.lang.Character) '\"');
        java.lang.String str16 = cSVFormat15.toString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str18 = cSVFormat17.getRecordSeparator();
        boolean boolean19 = cSVFormat17.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuote((java.lang.Character) 'a');
        boolean boolean28 = cSVFormat25.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(resultSetMetaData29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str32 = cSVFormat31.getRecordSeparator();
        boolean boolean33 = cSVFormat31.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withEscape('#');
        boolean boolean37 = cSVFormat34.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withHeader(resultSetMetaData38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str41 = cSVFormat40.getRecordSeparator();
        boolean boolean42 = cSVFormat40.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str44 = cSVFormat43.getRecordSeparator();
        boolean boolean45 = cSVFormat43.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withEscape('#');
        boolean boolean49 = cSVFormat46.getIgnoreSurroundingSpaces();
        boolean boolean50 = cSVFormat46.getTrailingDelimiter();
        java.lang.String[] strArray54 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat46.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat40.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat34.withHeaderComments((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat25.withHeader(strArray54);
        java.lang.String str59 = cSVFormat22.format((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat15.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat4.withHeader(strArray54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat4", cSVFormat2.equals(cSVFormat4) ? cSVFormat2.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        java.lang.Character char10 = cSVFormat0.getCommentMarker();
        char char11 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreHeaderCase(true);
        boolean boolean12 = cSVFormat3.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote('\"');
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('\\');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean12 = cSVFormat11.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.String str3 = cSVFormat1.format(objArray2);
        boolean boolean4 = cSVFormat1.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withHeader(resultSetMetaData5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) ' ');
        boolean boolean13 = cSVFormat10.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str18 = cSVFormat17.getRecordSeparator();
        boolean boolean19 = cSVFormat17.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withTrim();
        java.lang.String[] strArray21 = cSVFormat20.getHeaderComments();
        java.sql.ResultSet resultSet22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withHeader(resultSet22);
        boolean boolean24 = cSVFormat16.equals((java.lang.Object) resultSet22);
        java.lang.String[] strArray25 = cSVFormat16.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat9.withHeader(strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withHeader(resultSet28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withIgnoreHeaderCase(true);
        java.lang.String[] strArray32 = cSVFormat27.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat27 and cSVFormat31", cSVFormat27.equals(cSVFormat31) ? cSVFormat27.hashCode() == cSVFormat31.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str2 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean8 = cSVFormat4.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat6", cSVFormat3.equals(cSVFormat6) ? cSVFormat3.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray16 = new java.lang.Object[] { cSVFormat11, 10L, 10.0f, cSVFormat14, 100.0d };
        java.lang.String str17 = cSVFormat8.format(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat8.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withIgnoreEmptyLines(false);
        java.lang.Character char25 = cSVFormat24.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str29 = cSVFormat28.getRecordSeparator();
        boolean boolean30 = cSVFormat28.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrailingDelimiter();
        boolean boolean35 = cSVFormat34.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str39 = cSVFormat38.getRecordSeparator();
        boolean boolean40 = cSVFormat38.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuote((java.lang.Character) 'a');
        boolean boolean49 = cSVFormat46.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData50 = null;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withHeader(resultSetMetaData50);
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str53 = cSVFormat52.getRecordSeparator();
        boolean boolean54 = cSVFormat52.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withEscape('#');
        boolean boolean58 = cSVFormat55.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData59 = null;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withHeader(resultSetMetaData59);
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str62 = cSVFormat61.getRecordSeparator();
        boolean boolean63 = cSVFormat61.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str65 = cSVFormat64.getRecordSeparator();
        boolean boolean66 = cSVFormat64.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat67.withEscape('#');
        boolean boolean70 = cSVFormat67.getIgnoreSurroundingSpaces();
        boolean boolean71 = cSVFormat67.getTrailingDelimiter();
        java.lang.String[] strArray75 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat67.withHeader(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat61.withHeader(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat55.withHeaderComments((java.lang.Object[]) strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat46.withHeader(strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat45.withHeaderComments((java.lang.Object[]) strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat37.withHeaderComments((java.lang.Object[]) strArray75);
        java.lang.String str82 = cSVFormat24.format((java.lang.Object[]) strArray75);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat11", cSVFormat5.equals(cSVFormat11) ? cSVFormat5.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('#');
        boolean boolean14 = cSVFormat11.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeader(resultSetMetaData15);
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withHeader(resultSetMetaData20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str26 = cSVFormat25.getRecordSeparator();
        boolean boolean27 = cSVFormat25.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withQuote((java.lang.Character) 'a');
        boolean boolean36 = cSVFormat33.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withHeader(resultSetMetaData37);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str40 = cSVFormat39.getRecordSeparator();
        boolean boolean41 = cSVFormat39.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withEscape('#');
        boolean boolean45 = cSVFormat42.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withHeader(resultSetMetaData46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str49 = cSVFormat48.getRecordSeparator();
        boolean boolean50 = cSVFormat48.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str52 = cSVFormat51.getRecordSeparator();
        boolean boolean53 = cSVFormat51.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withEscape('#');
        boolean boolean57 = cSVFormat54.getIgnoreSurroundingSpaces();
        boolean boolean58 = cSVFormat54.getTrailingDelimiter();
        java.lang.String[] strArray62 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat54.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat48.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat42.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat33.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat32.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat24.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat21.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat7.withHeader(strArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat3", cSVFormat2.equals(cSVFormat3) ? cSVFormat2.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean6 = cSVFormat5.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        java.lang.String[] strArray5 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat8", cSVFormat3.equals(cSVFormat8) ? cSVFormat3.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.String str15 = cSVFormat13.format(objArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote((java.lang.Character) 'a');
        java.lang.Character char19 = cSVFormat16.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str21 = cSVFormat20.getRecordSeparator();
        boolean boolean22 = cSVFormat20.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape('#');
        boolean boolean26 = cSVFormat23.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withHeader(resultSetMetaData27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str30 = cSVFormat29.getRecordSeparator();
        boolean boolean31 = cSVFormat29.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str33 = cSVFormat32.getRecordSeparator();
        boolean boolean34 = cSVFormat32.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withEscape('#');
        boolean boolean38 = cSVFormat35.getIgnoreSurroundingSpaces();
        boolean boolean39 = cSVFormat35.getTrailingDelimiter();
        java.lang.String[] strArray43 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat35.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat29.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat23.withHeaderComments((java.lang.Object[]) strArray43);
        java.lang.String str47 = cSVFormat16.format((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat13.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat3.withHeader(strArray43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker((java.lang.Character) '\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat15", cSVFormat6.equals(cSVFormat15) ? cSVFormat6.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        boolean boolean2 = cSVFormat1.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat1.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat3", cSVFormat2.equals(cSVFormat3) ? cSVFormat2.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withIgnoreHeaderCase(true);
        boolean boolean19 = cSVFormat18.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.String str11 = cSVFormat9.format(objArray10);
        java.lang.String str12 = cSVFormat5.format(objArray10);
        java.lang.String[] strArray13 = cSVFormat5.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat5.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withIgnoreHeaderCase();
        java.lang.Character char19 = cSVFormat18.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat18", cSVFormat16.equals(cSVFormat18) ? cSVFormat16.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreHeaderCase();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean16 = cSVFormat0.equals((java.lang.Object) cSVFormat15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEscape('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray16 = cSVFormat13.getHeader();
        boolean boolean17 = cSVFormat8.equals((java.lang.Object) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat8.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str24 = cSVFormat23.getRecordSeparator();
        boolean boolean25 = cSVFormat23.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withEscape('#');
        boolean boolean29 = cSVFormat26.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(resultSetMetaData30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str35 = cSVFormat34.getRecordSeparator();
        boolean boolean36 = cSVFormat34.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str47 = cSVFormat46.getRecordSeparator();
        boolean boolean48 = cSVFormat46.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withEscape('#');
        boolean boolean52 = cSVFormat49.getIgnoreSurroundingSpaces();
        boolean boolean53 = cSVFormat49.getTrailingDelimiter();
        java.lang.String[] strArray54 = cSVFormat49.getHeaderComments();
        java.lang.Object[] objArray55 = new java.lang.Object[] { cSVFormat21, 1.0d, cSVFormat31, cSVFormat39, cSVFormat43, cSVFormat49 };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat5.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat5.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withIgnoreHeaderCase(true);
        boolean boolean62 = cSVFormat59.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat59 and cSVFormat61", cSVFormat59.equals(cSVFormat61) ? cSVFormat59.hashCode() == cSVFormat61.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat0.getHeaderComments();
        java.lang.String str7 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean3 = cSVFormat2.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat5", cSVFormat2.equals(cSVFormat5) ? cSVFormat2.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str2 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('#');
        boolean boolean14 = cSVFormat11.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeader(resultSetMetaData15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str18 = cSVFormat17.getRecordSeparator();
        boolean boolean19 = cSVFormat17.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str21 = cSVFormat20.getRecordSeparator();
        boolean boolean22 = cSVFormat20.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape('#');
        boolean boolean26 = cSVFormat23.getIgnoreSurroundingSpaces();
        boolean boolean27 = cSVFormat23.getTrailingDelimiter();
        java.lang.String[] strArray31 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat23.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat17.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat11.withHeaderComments((java.lang.Object[]) strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat4.withHeader(strArray31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Character char9 = cSVFormat3.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.String str14 = cSVFormat13.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str13 = cSVFormat12.getRecordSeparator();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('#');
        boolean boolean18 = cSVFormat15.getIgnoreSurroundingSpaces();
        boolean boolean19 = cSVFormat15.getTrailingDelimiter();
        java.lang.String[] strArray23 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat9.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray23);
        boolean boolean27 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat3.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat3.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=<a> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat3.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat3.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat3.withHeader(resultSet35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat34", cSVFormat0.equals(cSVFormat34) ? cSVFormat0.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withAllowMissingColumnNames(true);
        java.lang.Character char11 = cSVFormat3.getCommentMarker();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withNullString("\\N");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str4 = cSVFormat3.getRecordSeparator();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        boolean boolean9 = cSVFormat6.getIgnoreSurroundingSpaces();
        boolean boolean10 = cSVFormat6.getTrailingDelimiter();
        java.lang.String[] strArray14 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withHeader(strArray14);
        java.lang.String str17 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('#');
        boolean boolean12 = cSVFormat9.getIgnoreSurroundingSpaces();
        boolean boolean13 = cSVFormat9.getTrailingDelimiter();
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat9.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat9.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat9.withQuote('a');
        boolean boolean22 = cSVFormat21.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",,\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray34 = new java.lang.Object[] { cSVFormat29, 10L, 10.0f, cSVFormat32, 100.0d };
        java.lang.String str35 = cSVFormat26.format(objArray34);
        java.lang.Character char36 = cSVFormat26.getCommentMarker();
        java.lang.String[] strArray37 = cSVFormat26.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str39 = cSVFormat38.getRecordSeparator();
        boolean boolean40 = cSVFormat38.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray44 = cSVFormat41.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray46 = cSVFormat45.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withFirstRecordAsHeader();
        java.lang.String[] strArray48 = cSVFormat47.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat41.withHeaderComments((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat26.withHeaderComments((java.lang.Object[]) strArray48);
        java.lang.String str51 = cSVFormat25.format((java.lang.Object[]) strArray48);
        java.lang.String str52 = cSVFormat5.format((java.lang.Object[]) strArray48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat12", cSVFormat2.equals(cSVFormat12) ? cSVFormat2.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean15 = cSVFormat14.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat14", cSVFormat9.equals(cSVFormat14) ? cSVFormat9.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat10", cSVFormat9.equals(cSVFormat10) ? cSVFormat9.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str16 = cSVFormat15.getRecordSeparator();
        boolean boolean17 = cSVFormat15.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withHeader(resultSet21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.lang.String str26 = cSVFormat24.format(objArray25);
        boolean boolean27 = cSVFormat24.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str31 = cSVFormat30.getRecordSeparator();
        boolean boolean32 = cSVFormat30.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withTrim();
        java.lang.Character char34 = cSVFormat30.getEscapeCharacter();
        boolean boolean36 = cSVFormat30.equals((java.lang.Object) 100.0d);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str38 = cSVFormat37.getRecordSeparator();
        boolean boolean39 = cSVFormat37.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str41 = cSVFormat40.getRecordSeparator();
        boolean boolean42 = cSVFormat40.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withEscape('#');
        boolean boolean46 = cSVFormat43.getIgnoreSurroundingSpaces();
        boolean boolean47 = cSVFormat43.getTrailingDelimiter();
        java.lang.String[] strArray51 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat43.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat37.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat14.withHeader(strArray51);
        java.lang.String str58 = cSVFormat3.format((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat3.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat3.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat61", cSVFormat0.equals(cSVFormat61) ? cSVFormat0.hashCode() == cSVFormat61.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSet9);
        boolean boolean11 = cSVFormat8.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withHeader(resultSet27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray37 = new java.lang.Object[] { cSVFormat32, 10L, 10.0f, cSVFormat35, 100.0d };
        java.lang.String str38 = cSVFormat29.format(objArray37);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat28.withHeaderComments(objArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean41 = cSVFormat40.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withAllowMissingColumnNames(false);
        boolean boolean48 = cSVFormat45.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean50 = cSVFormat49.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",,\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",");
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray56 = cSVFormat55.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withFirstRecordAsHeader();
        java.lang.String[] strArray58 = cSVFormat57.getHeader();
        java.lang.String str59 = cSVFormat54.format((java.lang.Object[]) strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat45.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat28.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat23.withHeaderComments((java.lang.Object[]) strArray58);
        java.lang.String str63 = cSVFormat15.format((java.lang.Object[]) strArray58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        char char18 = cSVFormat17.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSet3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreHeaderCase(true);
        java.lang.Character char9 = cSVFormat8.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('#');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        boolean boolean23 = cSVFormat19.getTrailingDelimiter();
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray27);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray27);
        boolean boolean32 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean33 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withDelimiter('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat34", cSVFormat0.equals(cSVFormat34) ? cSVFormat0.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.Character char8 = cSVFormat7.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"\r\n\",\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat14.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat14", cSVFormat8.equals(cSVFormat14) ? cSVFormat8.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        java.lang.String str5 = cSVFormat2.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrailingDelimiter();
        java.lang.String str13 = cSVFormat12.getRecordSeparator();
        boolean boolean14 = cSVFormat12.getIgnoreHeaderCase();
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withHeader(resultSet15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withNullString("hi!");
        java.lang.String[] strArray23 = cSVFormat22.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str25 = cSVFormat24.getRecordSeparator();
        boolean boolean26 = cSVFormat24.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.lang.String str34 = cSVFormat32.format(objArray33);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withQuote((java.lang.Character) 'a');
        java.lang.Character char38 = cSVFormat35.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str40 = cSVFormat39.getRecordSeparator();
        boolean boolean41 = cSVFormat39.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withEscape('#');
        boolean boolean45 = cSVFormat42.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withHeader(resultSetMetaData46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str49 = cSVFormat48.getRecordSeparator();
        boolean boolean50 = cSVFormat48.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str52 = cSVFormat51.getRecordSeparator();
        boolean boolean53 = cSVFormat51.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withEscape('#');
        boolean boolean57 = cSVFormat54.getIgnoreSurroundingSpaces();
        boolean boolean58 = cSVFormat54.getTrailingDelimiter();
        java.lang.String[] strArray62 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat54.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat48.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat42.withHeaderComments((java.lang.Object[]) strArray62);
        java.lang.String str66 = cSVFormat35.format((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat32.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat17.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat7", cSVFormat2.equals(cSVFormat7) ? cSVFormat2.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withRecordSeparator('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withIgnoreHeaderCase();
        java.lang.Character char19 = cSVFormat18.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"\r\n\",\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withHeader(resultSetMetaData25);
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str28 = cSVFormat27.getRecordSeparator();
        boolean boolean29 = cSVFormat27.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withTrim();
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        java.lang.String str38 = cSVFormat36.format(objArray37);
        java.lang.String str39 = cSVFormat32.format(objArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat26.withHeaderComments(objArray37);
        java.lang.String str41 = cSVFormat8.format(objArray37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat14", cSVFormat8.equals(cSVFormat14) ? cSVFormat8.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        java.lang.String[] strArray5 = cSVFormat3.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat8", cSVFormat3.equals(cSVFormat8) ? cSVFormat3.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuoteMode(quoteMode9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat8", cSVFormat7.equals(cSVFormat8) ? cSVFormat7.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        boolean boolean12 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withTrailingDelimiter(false);
        boolean boolean18 = cSVFormat15.isNullStringSet();
        org.apache.commons.csv.QuoteMode quoteMode19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withQuoteMode(quoteMode19);
        boolean boolean21 = cSVFormat14.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withEscape((java.lang.Character) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat22", cSVFormat15.equals(cSVFormat22) ? cSVFormat15.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass6 = cSVFormat5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrim(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat6", cSVFormat3.equals(cSVFormat6) ? cSVFormat3.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('|');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat4.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Predefined predefined9 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat10 = predefined9.getFormat();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSetMetaData11);
        java.lang.String[] strArray13 = cSVFormat10.getHeaderComments();
        boolean boolean14 = cSVFormat10.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean18 = cSVFormat16.equals((java.lang.Object) (byte) 100);
        boolean boolean19 = cSVFormat16.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withAllowMissingColumnNames();
        java.lang.String str24 = cSVFormat22.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withTrim();
        java.lang.Object[] objArray27 = new java.lang.Object[] {};
        java.lang.String str28 = cSVFormat26.format(objArray27);
        java.lang.String str29 = cSVFormat22.format(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat16.withHeaderComments(objArray27);
        java.lang.String str31 = cSVFormat10.format(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str33 = cSVFormat32.getRecordSeparator();
        boolean boolean34 = cSVFormat32.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withTrim(false);
        boolean boolean41 = cSVFormat35.equals((java.lang.Object) cSVFormat38);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat35.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat35.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat45.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withQuote((java.lang.Character) 'a');
        boolean boolean53 = cSVFormat50.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat50.withHeader(resultSetMetaData54);
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str57 = cSVFormat56.getRecordSeparator();
        boolean boolean58 = cSVFormat56.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withEscape('#');
        boolean boolean62 = cSVFormat59.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat59.withHeader(resultSetMetaData63);
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str66 = cSVFormat65.getRecordSeparator();
        boolean boolean67 = cSVFormat65.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str69 = cSVFormat68.getRecordSeparator();
        boolean boolean70 = cSVFormat68.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat68.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat71.withEscape('#');
        boolean boolean74 = cSVFormat71.getIgnoreSurroundingSpaces();
        boolean boolean75 = cSVFormat71.getTrailingDelimiter();
        java.lang.String[] strArray79 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat71.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat65.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat59.withHeaderComments((java.lang.Object[]) strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat50.withHeader(strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat45.withHeader(strArray79);
        java.lang.String str85 = cSVFormat10.format((java.lang.Object[]) strArray79);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat3.withHeader(strArray79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEscape('|');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        java.lang.Character char13 = cSVFormat12.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat12", cSVFormat7.equals(cSVFormat12) ? cSVFormat7.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote((java.lang.Character) 'a');
        boolean boolean9 = cSVFormat4.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withHeader(resultSetMetaData12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat4", cSVFormat2.equals(cSVFormat4) ? cSVFormat2.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray12 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray14 = cSVFormat13.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withFirstRecordAsHeader();
        java.lang.String[] strArray16 = cSVFormat15.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat18 and cSVFormat21", cSVFormat18.equals(cSVFormat21) ? cSVFormat18.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withEscape((java.lang.Character) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean2 = cSVFormat0.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.Character char9 = cSVFormat7.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat8", cSVFormat7.equals(cSVFormat8) ? cSVFormat7.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuote((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withRecordSeparator("Delimiter=<,> Escape=<#> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat15", cSVFormat11.equals(cSVFormat15) ? cSVFormat11.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withIgnoreHeaderCase();
        java.lang.String str19 = cSVFormat18.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withTrailingDelimiter();
        boolean boolean7 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(false);
        boolean boolean10 = cSVFormat9.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean13 = cSVFormat12.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str20 = cSVFormat19.getRecordSeparator();
        boolean boolean21 = cSVFormat19.getIgnoreEmptyLines();
        boolean boolean22 = cSVFormat18.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withIgnoreHeaderCase(false);
        boolean boolean25 = cSVFormat19.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat19.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrailingDelimiter();
        boolean boolean33 = cSVFormat12.equals((java.lang.Object) cSVFormat31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat12", cSVFormat2.equals(cSVFormat12) ? cSVFormat2.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str2 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String str9 = cSVFormat8.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean12 = cSVFormat4.equals((java.lang.Object) cSVFormat11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean15 = cSVFormat14.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat14", cSVFormat9.equals(cSVFormat14) ? cSVFormat9.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        boolean boolean4 = cSVFormat0.getSkipHeaderRecord();
        java.lang.Character char5 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuote((java.lang.Character) ' ');
        boolean boolean12 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withQuote((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withTrim(false);
        char char25 = cSVFormat24.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat24.withIgnoreHeaderCase();
        boolean boolean29 = cSVFormat0.equals((java.lang.Object) cSVFormat24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat21 and cSVFormat28", cSVFormat21.equals(cSVFormat28) ? cSVFormat21.hashCode() == cSVFormat28.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.String str11 = cSVFormat9.format(objArray10);
        java.lang.String str12 = cSVFormat5.format(objArray10);
        java.lang.String[] strArray13 = cSVFormat5.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat5.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        java.lang.String str18 = cSVFormat16.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withQuoteMode(quoteMode21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat20", cSVFormat16.equals(cSVFormat20) ? cSVFormat16.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        boolean boolean10 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote('\"');
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuoteMode(quoteMode16);
        java.lang.String[] strArray18 = cSVFormat17.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat19", cSVFormat7.equals(cSVFormat19) ? cSVFormat7.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat7.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat8", cSVFormat7.equals(cSVFormat8) ? cSVFormat7.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('#');
        boolean boolean12 = cSVFormat9.getIgnoreSurroundingSpaces();
        boolean boolean13 = cSVFormat9.getTrailingDelimiter();
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat9.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat5.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat5.withEscape('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat20", cSVFormat0.equals(cSVFormat20) ? cSVFormat0.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withRecordSeparator(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str20 = cSVFormat19.getRecordSeparator();
        boolean boolean21 = cSVFormat19.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withTrailingDelimiter();
        java.lang.String str32 = cSVFormat31.getRecordSeparator();
        boolean boolean33 = cSVFormat31.getIgnoreHeaderCase();
        java.sql.ResultSet resultSet34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withHeader(resultSet34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withNullString("hi!");
        java.lang.String[] strArray42 = cSVFormat41.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str44 = cSVFormat43.getRecordSeparator();
        boolean boolean45 = cSVFormat43.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat50.withTrim();
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        java.lang.String str53 = cSVFormat51.format(objArray52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withQuote((java.lang.Character) 'a');
        java.lang.Character char57 = cSVFormat54.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str59 = cSVFormat58.getRecordSeparator();
        boolean boolean60 = cSVFormat58.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withEscape('#');
        boolean boolean64 = cSVFormat61.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData65 = null;
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat61.withHeader(resultSetMetaData65);
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str68 = cSVFormat67.getRecordSeparator();
        boolean boolean69 = cSVFormat67.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat70 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str71 = cSVFormat70.getRecordSeparator();
        boolean boolean72 = cSVFormat70.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat70.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withEscape('#');
        boolean boolean76 = cSVFormat73.getIgnoreSurroundingSpaces();
        boolean boolean77 = cSVFormat73.getTrailingDelimiter();
        java.lang.String[] strArray81 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat73.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat67.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat61.withHeaderComments((java.lang.Object[]) strArray81);
        java.lang.String str85 = cSVFormat54.format((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat51.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat49.withHeaderComments((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat88 = cSVFormat41.withHeaderComments((java.lang.Object[]) strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat89 = cSVFormat36.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat19.withHeader(strArray81);
        org.apache.commons.csv.CSVFormat cSVFormat91 = cSVFormat18.withHeader(strArray81);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        boolean boolean10 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(true);
        boolean boolean17 = cSVFormat14.isQuoteCharacterSet();
        java.lang.Character char18 = cSVFormat14.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat14.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat19", cSVFormat14.equals(cSVFormat19) ? cSVFormat14.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuote((java.lang.Character) '\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withDelimiter('|');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        boolean boolean17 = cSVFormat15.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat16", cSVFormat15.equals(cSVFormat16) ? cSVFormat15.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withQuote((java.lang.Character) '4');
        java.lang.Character char12 = cSVFormat11.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        boolean boolean16 = cSVFormat15.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat15", cSVFormat11.equals(cSVFormat15) ? cSVFormat11.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withRecordSeparator(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat7.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withQuote((java.lang.Character) '|');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=< > RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        java.lang.String str10 = cSVFormat9.getNullString();
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withHeader(resultSet9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withIgnoreHeaderCase();
        boolean boolean19 = cSVFormat18.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withHeader(resultSet10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat10.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat10", cSVFormat9.equals(cSVFormat10) ? cSVFormat9.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withTrailingDelimiter(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withFirstRecordAsHeader();
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat2.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        boolean boolean9 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuote((java.lang.Character) 'a');
        boolean boolean21 = cSVFormat18.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(resultSetMetaData22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str25 = cSVFormat24.getRecordSeparator();
        boolean boolean26 = cSVFormat24.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withEscape('#');
        boolean boolean30 = cSVFormat27.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withHeader(resultSetMetaData31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
        boolean boolean35 = cSVFormat33.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str37 = cSVFormat36.getRecordSeparator();
        boolean boolean38 = cSVFormat36.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withEscape('#');
        boolean boolean42 = cSVFormat39.getIgnoreSurroundingSpaces();
        boolean boolean43 = cSVFormat39.getTrailingDelimiter();
        java.lang.String[] strArray47 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat39.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat33.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat27.withHeaderComments((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat18.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat13.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat52 and cSVFormat57", cSVFormat52.equals(cSVFormat57) ? cSVFormat52.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSet2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(resultSetMetaData7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Character char9 = cSVFormat3.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        boolean boolean13 = cSVFormat11.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withTrim();
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        java.lang.String str25 = cSVFormat23.format(objArray24);
        boolean boolean26 = cSVFormat23.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str30 = cSVFormat29.getRecordSeparator();
        boolean boolean31 = cSVFormat29.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withTrim();
        java.lang.Character char33 = cSVFormat29.getEscapeCharacter();
        boolean boolean35 = cSVFormat29.equals((java.lang.Object) 100.0d);
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str37 = cSVFormat36.getRecordSeparator();
        boolean boolean38 = cSVFormat36.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str40 = cSVFormat39.getRecordSeparator();
        boolean boolean41 = cSVFormat39.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withEscape('#');
        boolean boolean45 = cSVFormat42.getIgnoreSurroundingSpaces();
        boolean boolean46 = cSVFormat42.getTrailingDelimiter();
        java.lang.String[] strArray50 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat42.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat36.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat29.withHeaderComments((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat23.withHeaderComments((java.lang.Object[]) strArray50);
        java.lang.String str55 = cSVFormat21.format((java.lang.Object[]) strArray50);
        java.lang.String str56 = cSVFormat10.format((java.lang.Object[]) strArray50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat10", cSVFormat0.equals(cSVFormat10) ? cSVFormat0.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) '\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('#');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        boolean boolean23 = cSVFormat19.getTrailingDelimiter();
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray27);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray27);
        boolean boolean32 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreHeaderCase();
        java.lang.Character char40 = cSVFormat38.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat38 and cSVFormat39", cSVFormat38.equals(cSVFormat39) ? cSVFormat38.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape('\\');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        char char8 = cSVFormat5.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withIgnoreHeaderCase(true);
        boolean boolean19 = cSVFormat3.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.String str11 = cSVFormat9.format(objArray10);
        java.lang.String str12 = cSVFormat3.format(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuote((java.lang.Character) 'a');
        java.lang.Character char20 = cSVFormat17.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str22 = cSVFormat21.getRecordSeparator();
        boolean boolean23 = cSVFormat21.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('#');
        boolean boolean27 = cSVFormat24.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(resultSetMetaData28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str31 = cSVFormat30.getRecordSeparator();
        boolean boolean32 = cSVFormat30.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
        boolean boolean35 = cSVFormat33.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withEscape('#');
        boolean boolean39 = cSVFormat36.getIgnoreSurroundingSpaces();
        boolean boolean40 = cSVFormat36.getTrailingDelimiter();
        java.lang.String[] strArray44 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat36.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray44);
        java.lang.String str48 = cSVFormat17.format((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray44);
        java.lang.String str50 = cSVFormat15.format((java.lang.Object[]) strArray44);
        java.sql.ResultSet resultSet51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat15.withHeader(resultSet51);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withIgnoreHeaderCase();
        boolean boolean54 = cSVFormat52.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat53", cSVFormat14.equals(cSVFormat53) ? cSVFormat14.hashCode() == cSVFormat53.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker('#');
        boolean boolean4 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('a');
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuote((java.lang.Character) 'a');
        java.lang.Character char15 = cSVFormat12.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str26 = cSVFormat25.getRecordSeparator();
        boolean boolean27 = cSVFormat25.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str29 = cSVFormat28.getRecordSeparator();
        boolean boolean30 = cSVFormat28.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withEscape('#');
        boolean boolean34 = cSVFormat31.getIgnoreSurroundingSpaces();
        boolean boolean35 = cSVFormat31.getTrailingDelimiter();
        java.lang.String[] strArray39 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat31.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat25.withHeader(strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray39);
        java.lang.String str43 = cSVFormat12.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray39);
        java.lang.String str45 = cSVFormat5.format((java.lang.Object[]) strArray39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withQuote((java.lang.Character) 'a');
        boolean boolean9 = cSVFormat4.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(true);
        java.lang.Character char7 = cSVFormat6.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote('\"');
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('\\');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('|');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('#');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        boolean boolean23 = cSVFormat19.getTrailingDelimiter();
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray27);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray27);
        boolean boolean32 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuote('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat38 and cSVFormat39", cSVFormat38.equals(cSVFormat39) ? cSVFormat38.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSet9);
        boolean boolean11 = cSVFormat8.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withTrim(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat12", cSVFormat0.equals(cSVFormat12) ? cSVFormat0.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withSkipHeaderRecord();
        boolean boolean16 = cSVFormat15.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withNullString("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str30 = cSVFormat29.getRecordSeparator();
        boolean boolean31 = cSVFormat29.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withCommentMarker('#');
        boolean boolean37 = cSVFormat32.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat32.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray48 = new java.lang.Object[] { cSVFormat43, 10L, 10.0f, cSVFormat46, 100.0d };
        java.lang.String str49 = cSVFormat40.format(objArray48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str51 = cSVFormat50.getRecordSeparator();
        boolean boolean52 = cSVFormat50.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str54 = cSVFormat53.getRecordSeparator();
        boolean boolean55 = cSVFormat53.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withEscape('#');
        boolean boolean59 = cSVFormat56.getIgnoreSurroundingSpaces();
        boolean boolean60 = cSVFormat56.getTrailingDelimiter();
        java.lang.String[] strArray64 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat56.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat50.withHeader(strArray64);
        java.lang.String str67 = cSVFormat40.format((java.lang.Object[]) strArray64);
        java.lang.String str68 = cSVFormat32.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat28.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat18", cSVFormat15.equals(cSVFormat18) ? cSVFormat15.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat10.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat10", cSVFormat4.equals(cSVFormat10) ? cSVFormat4.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean8 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.lang.String[] strArray9 = cSVFormat3.getHeader();
        java.lang.String str10 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('4');
        boolean boolean19 = cSVFormat3.equals((java.lang.Object) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat3.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withEscape('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat21 and cSVFormat22", cSVFormat21.equals(cSVFormat22) ? cSVFormat21.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote('\"');
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('\\');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        java.lang.Character char12 = cSVFormat9.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray16 = cSVFormat13.getHeader();
        boolean boolean17 = cSVFormat8.equals((java.lang.Object) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat8.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str24 = cSVFormat23.getRecordSeparator();
        boolean boolean25 = cSVFormat23.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withEscape('#');
        boolean boolean29 = cSVFormat26.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData30 = null;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(resultSetMetaData30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str35 = cSVFormat34.getRecordSeparator();
        boolean boolean36 = cSVFormat34.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str47 = cSVFormat46.getRecordSeparator();
        boolean boolean48 = cSVFormat46.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withEscape('#');
        boolean boolean52 = cSVFormat49.getIgnoreSurroundingSpaces();
        boolean boolean53 = cSVFormat49.getTrailingDelimiter();
        java.lang.String[] strArray54 = cSVFormat49.getHeaderComments();
        java.lang.Object[] objArray55 = new java.lang.Object[] { cSVFormat21, 1.0d, cSVFormat31, cSVFormat39, cSVFormat43, cSVFormat49 };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat5.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat5.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withIgnoreHeaderCase();
        boolean boolean60 = cSVFormat58.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat58 and cSVFormat59", cSVFormat58.equals(cSVFormat59) ? cSVFormat58.hashCode() == cSVFormat59.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat3.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('4');
        boolean boolean6 = cSVFormat3.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean8 = cSVFormat7.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.String str9 = cSVFormat8.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"\r\n\",\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase(true);
        java.lang.String str15 = cSVFormat14.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat14", cSVFormat8.equals(cSVFormat14) ? cSVFormat8.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withTrim();
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.String str11 = cSVFormat9.format(objArray10);
        java.lang.String str12 = cSVFormat3.format(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuote((java.lang.Character) 'a');
        java.lang.Character char20 = cSVFormat17.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str22 = cSVFormat21.getRecordSeparator();
        boolean boolean23 = cSVFormat21.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('#');
        boolean boolean27 = cSVFormat24.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(resultSetMetaData28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str31 = cSVFormat30.getRecordSeparator();
        boolean boolean32 = cSVFormat30.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
        boolean boolean35 = cSVFormat33.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withEscape('#');
        boolean boolean39 = cSVFormat36.getIgnoreSurroundingSpaces();
        boolean boolean40 = cSVFormat36.getTrailingDelimiter();
        java.lang.String[] strArray44 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat36.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray44);
        java.lang.String str48 = cSVFormat17.format((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray44);
        java.lang.String str50 = cSVFormat15.format((java.lang.Object[]) strArray44);
        java.sql.ResultSet resultSet51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat15.withHeader(resultSet51);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withIgnoreHeaderCase();
        boolean boolean54 = cSVFormat52.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat53", cSVFormat14.equals(cSVFormat53) ? cSVFormat14.hashCode() == cSVFormat53.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('4');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("\n");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat6.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('#');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        boolean boolean23 = cSVFormat19.getTrailingDelimiter();
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray27);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray27);
        boolean boolean32 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str38 = cSVFormat37.getRecordSeparator();
        boolean boolean39 = cSVFormat37.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withEscape('#');
        boolean boolean43 = cSVFormat40.getIgnoreSurroundingSpaces();
        boolean boolean44 = cSVFormat40.getTrailingDelimiter();
        java.lang.String[] strArray48 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat40.withHeader(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat40.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat40.withQuote('a');
        boolean boolean53 = cSVFormat52.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withTrailingDelimiter();
        boolean boolean55 = cSVFormat36.equals((java.lang.Object) cSVFormat52);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat52.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat52.withIgnoreHeaderCase(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat57", cSVFormat2.equals(cSVFormat57) ? cSVFormat2.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        boolean boolean16 = cSVFormat15.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat15", cSVFormat6.equals(cSVFormat15) ? cSVFormat6.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.Character char10 = cSVFormat8.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat9", cSVFormat4.equals(cSVFormat9) ? cSVFormat4.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        boolean boolean9 = cSVFormat6.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withTrailingDelimiter(true);
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuoteMode(quoteMode14);
        java.lang.String[] strArray16 = cSVFormat13.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str18 = cSVFormat17.getRecordSeparator();
        boolean boolean19 = cSVFormat17.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withEscape('#');
        boolean boolean23 = cSVFormat20.getIgnoreSurroundingSpaces();
        boolean boolean24 = cSVFormat20.getTrailingDelimiter();
        java.lang.String[] strArray28 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat20.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat20.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat20.withQuote('a');
        boolean boolean33 = cSVFormat32.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",,\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray45 = new java.lang.Object[] { cSVFormat40, 10L, 10.0f, cSVFormat43, 100.0d };
        java.lang.String str46 = cSVFormat37.format(objArray45);
        java.lang.Character char47 = cSVFormat37.getCommentMarker();
        java.lang.String[] strArray48 = cSVFormat37.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str50 = cSVFormat49.getRecordSeparator();
        boolean boolean51 = cSVFormat49.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray55 = cSVFormat52.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray57 = cSVFormat56.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withFirstRecordAsHeader();
        java.lang.String[] strArray59 = cSVFormat58.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat52.withHeaderComments((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat37.withHeaderComments((java.lang.Object[]) strArray59);
        java.lang.String str62 = cSVFormat36.format((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat5.withHeader(strArray59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        boolean boolean6 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('#');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        boolean boolean23 = cSVFormat19.getTrailingDelimiter();
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray27);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray27);
        boolean boolean32 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat38 and cSVFormat39", cSVFormat38.equals(cSVFormat39) ? cSVFormat38.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat7", cSVFormat5.equals(cSVFormat7) ? cSVFormat5.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str3 = cSVFormat2.getRecordSeparator();
        boolean boolean4 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) strArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase();
        java.lang.String str16 = cSVFormat15.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean17 = cSVFormat16.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        char char8 = cSVFormat7.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withEscape('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat11", cSVFormat4.equals(cSVFormat11) ? cSVFormat4.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat9.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat10", cSVFormat4.equals(cSVFormat10) ? cSVFormat4.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat12", cSVFormat7.equals(cSVFormat12) ? cSVFormat7.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat0.getHeaderComments();
        java.lang.String str7 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        boolean boolean11 = cSVFormat9.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withEscape('#');
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withHeader(resultSetMetaData15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withTrim(false);
        java.sql.ResultSetMetaData resultSetMetaData19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeader(resultSetMetaData19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str22 = cSVFormat21.getRecordSeparator();
        boolean boolean23 = cSVFormat21.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('#');
        boolean boolean27 = cSVFormat24.getIgnoreSurroundingSpaces();
        boolean boolean28 = cSVFormat24.getTrailingDelimiter();
        java.lang.String[] strArray32 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat24.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat24.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat24.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat24.withIgnoreSurroundingSpaces();
        java.lang.String str38 = cSVFormat24.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withTrim();
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.lang.String str42 = cSVFormat40.format(objArray41);
        boolean boolean43 = cSVFormat40.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str47 = cSVFormat46.getRecordSeparator();
        boolean boolean48 = cSVFormat46.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withTrim();
        java.lang.Character char50 = cSVFormat46.getEscapeCharacter();
        boolean boolean52 = cSVFormat46.equals((java.lang.Object) 100.0d);
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str54 = cSVFormat53.getRecordSeparator();
        boolean boolean55 = cSVFormat53.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str57 = cSVFormat56.getRecordSeparator();
        boolean boolean58 = cSVFormat56.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withEscape('#');
        boolean boolean62 = cSVFormat59.getIgnoreSurroundingSpaces();
        boolean boolean63 = cSVFormat59.getTrailingDelimiter();
        java.lang.String[] strArray67 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat59.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat53.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat46.withHeaderComments((java.lang.Object[]) strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat40.withHeaderComments((java.lang.Object[]) strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat18.withHeaderComments((java.lang.Object[]) strArray67);
        java.lang.String str74 = cSVFormat0.format((java.lang.Object[]) strArray67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        java.lang.Character char10 = cSVFormat0.getCommentMarker();
        char char11 = cSVFormat0.getDelimiter();
        java.lang.String str12 = cSVFormat0.toString();
        boolean boolean13 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.Character char23 = cSVFormat22.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat22", cSVFormat0.equals(cSVFormat22) ? cSVFormat0.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean10 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.lang.String[] strArray9 = cSVFormat3.getHeader();
        java.lang.String str10 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('4');
        boolean boolean19 = cSVFormat3.equals((java.lang.Object) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat3.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat21 and cSVFormat22", cSVFormat21.equals(cSVFormat22) ? cSVFormat21.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str2 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) 'a');
        java.lang.Character char7 = cSVFormat4.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('#');
        boolean boolean14 = cSVFormat11.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeader(resultSetMetaData15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str18 = cSVFormat17.getRecordSeparator();
        boolean boolean19 = cSVFormat17.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str21 = cSVFormat20.getRecordSeparator();
        boolean boolean22 = cSVFormat20.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape('#');
        boolean boolean26 = cSVFormat23.getIgnoreSurroundingSpaces();
        boolean boolean27 = cSVFormat23.getTrailingDelimiter();
        java.lang.String[] strArray31 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat23.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat17.withHeader(strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat11.withHeaderComments((java.lang.Object[]) strArray31);
        java.lang.String str35 = cSVFormat4.format((java.lang.Object[]) strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray31);
        java.lang.String str37 = cSVFormat0.format((java.lang.Object[]) strArray31);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat38", cSVFormat0.equals(cSVFormat38) ? cSVFormat0.hashCode() == cSVFormat38.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        boolean boolean14 = cSVFormat12.getSkipHeaderRecord();
        java.lang.Character char15 = cSVFormat12.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat16", cSVFormat12.equals(cSVFormat16) ? cSVFormat12.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('a');
        boolean boolean3 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean4 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        boolean boolean1 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withNullString("\n");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        char char7 = cSVFormat6.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        char char7 = cSVFormat5.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        boolean boolean6 = cSVFormat0.equals((java.lang.Object) 100.0d);
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Character char6 = cSVFormat3.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat12", cSVFormat3.equals(cSVFormat12) ? cSVFormat3.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(resultSet18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat17", cSVFormat15.equals(cSVFormat17) ? cSVFormat15.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        boolean boolean10 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withTrim();
        java.lang.Character char14 = cSVFormat13.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withDelimiter('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat17", cSVFormat16.equals(cSVFormat17) ? cSVFormat16.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str13 = cSVFormat12.getRecordSeparator();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('#');
        boolean boolean18 = cSVFormat15.getIgnoreSurroundingSpaces();
        boolean boolean19 = cSVFormat15.getTrailingDelimiter();
        java.lang.String[] strArray23 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat9.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray23);
        boolean boolean27 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat3.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat3.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=<a> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat3.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat3.withRecordSeparator(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat34", cSVFormat0.equals(cSVFormat34) ? cSVFormat0.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.String str10 = cSVFormat9.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote((java.lang.Character) 'a');
        java.lang.Character char11 = cSVFormat8.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str13 = cSVFormat12.getRecordSeparator();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('#');
        boolean boolean18 = cSVFormat15.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withHeader(resultSetMetaData19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str22 = cSVFormat21.getRecordSeparator();
        boolean boolean23 = cSVFormat21.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str25 = cSVFormat24.getRecordSeparator();
        boolean boolean26 = cSVFormat24.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withEscape('#');
        boolean boolean30 = cSVFormat27.getIgnoreSurroundingSpaces();
        boolean boolean31 = cSVFormat27.getTrailingDelimiter();
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat27.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat21.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray35);
        java.lang.String str39 = cSVFormat8.format((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray35);
        java.lang.String str41 = cSVFormat5.format((java.lang.Object[]) strArray35);
        boolean boolean42 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat5.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat5.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat45", cSVFormat5.equals(cSVFormat45) ? cSVFormat5.hashCode() == cSVFormat45.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        boolean boolean8 = cSVFormat6.getIgnoreEmptyLines();
        boolean boolean9 = cSVFormat5.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreHeaderCase(false);
        boolean boolean12 = cSVFormat6.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuoteMode(quoteMode22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat21", cSVFormat16.equals(cSVFormat21) ? cSVFormat16.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.lang.String[] strArray9 = cSVFormat3.getHeader();
        java.lang.String str10 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuote((java.lang.Character) 'a');
        java.lang.Character char20 = cSVFormat17.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str22 = cSVFormat21.getRecordSeparator();
        boolean boolean23 = cSVFormat21.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withEscape('#');
        boolean boolean27 = cSVFormat24.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData28 = null;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(resultSetMetaData28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str31 = cSVFormat30.getRecordSeparator();
        boolean boolean32 = cSVFormat30.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
        boolean boolean35 = cSVFormat33.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withEscape('#');
        boolean boolean39 = cSVFormat36.getIgnoreSurroundingSpaces();
        boolean boolean40 = cSVFormat36.getTrailingDelimiter();
        java.lang.String[] strArray44 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat36.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray44);
        java.lang.String str48 = cSVFormat17.format((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat3.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass54 = cSVFormat53.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat53", cSVFormat0.equals(cSVFormat53) ? cSVFormat0.hashCode() == cSVFormat53.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        java.lang.String str6 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str8 = cSVFormat7.getRecordSeparator();
        boolean boolean9 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withTrim();
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        java.lang.String str20 = cSVFormat18.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withQuote((java.lang.Character) 'a');
        java.lang.Character char24 = cSVFormat21.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str26 = cSVFormat25.getRecordSeparator();
        boolean boolean27 = cSVFormat25.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape('#');
        boolean boolean31 = cSVFormat28.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(resultSetMetaData32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str35 = cSVFormat34.getRecordSeparator();
        boolean boolean36 = cSVFormat34.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str38 = cSVFormat37.getRecordSeparator();
        boolean boolean39 = cSVFormat37.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withEscape('#');
        boolean boolean43 = cSVFormat40.getIgnoreSurroundingSpaces();
        boolean boolean44 = cSVFormat40.getTrailingDelimiter();
        java.lang.String[] strArray48 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat40.withHeader(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat34.withHeader(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat28.withHeaderComments((java.lang.Object[]) strArray48);
        java.lang.String str52 = cSVFormat21.format((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat18.withHeader(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat14.withHeaderComments((java.lang.Object[]) strArray48);
        java.lang.String str55 = cSVFormat3.format((java.lang.Object[]) strArray48);
        java.sql.ResultSetMetaData resultSetMetaData56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat3.withHeader(resultSetMetaData56);
        org.apache.commons.csv.QuoteMode quoteMode58 = null;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat3.withQuoteMode(quoteMode58);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str62 = cSVFormat61.getRecordSeparator();
        boolean boolean63 = cSVFormat61.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withTrim();
        java.lang.Character char65 = cSVFormat61.getEscapeCharacter();
        boolean boolean67 = cSVFormat61.equals((java.lang.Object) 100.0d);
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str69 = cSVFormat68.getRecordSeparator();
        boolean boolean70 = cSVFormat68.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat71 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str72 = cSVFormat71.getRecordSeparator();
        boolean boolean73 = cSVFormat71.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat71.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat74.withEscape('#');
        boolean boolean77 = cSVFormat74.getIgnoreSurroundingSpaces();
        boolean boolean78 = cSVFormat74.getTrailingDelimiter();
        java.lang.String[] strArray82 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat74.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat68.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat61.withHeaderComments((java.lang.Object[]) strArray82);
        java.lang.String str86 = cSVFormat60.format((java.lang.Object[]) strArray82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat60", cSVFormat0.equals(cSVFormat60) ? cSVFormat0.hashCode() == cSVFormat60.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat8", cSVFormat7.equals(cSVFormat8) ? cSVFormat7.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase(true);
        java.lang.String str7 = cSVFormat6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('4');
        boolean boolean6 = cSVFormat5.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withQuote('|');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withEscape('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat11", cSVFormat5.equals(cSVFormat11) ? cSVFormat5.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        boolean boolean10 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        java.lang.Character char15 = cSVFormat14.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat16", cSVFormat12.equals(cSVFormat16) ? cSVFormat12.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.QuoteMode quoteMode2 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        boolean boolean6 = cSVFormat5.getIgnoreEmptyLines();
        boolean boolean7 = cSVFormat1.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat12", cSVFormat1.equals(cSVFormat12) ? cSVFormat1.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape('#');
        boolean boolean16 = cSVFormat13.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuote('a');
        boolean boolean19 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withAllowMissingColumnNames();
        java.lang.String str22 = cSVFormat20.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.lang.String str26 = cSVFormat24.format(objArray25);
        java.lang.String str27 = cSVFormat20.format(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withHeaderComments(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str30 = cSVFormat29.getRecordSeparator();
        boolean boolean31 = cSVFormat29.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withEscape('#');
        boolean boolean35 = cSVFormat32.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(resultSetMetaData36);
        java.lang.String[] strArray38 = cSVFormat32.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray40 = cSVFormat39.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withFirstRecordAsHeader();
        java.lang.String[] strArray42 = cSVFormat41.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat32.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat28.withHeaderComments((java.lang.Object[]) strArray42);
        java.lang.String str45 = cSVFormat8.format((java.lang.Object[]) strArray42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(resultSet8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str4 = cSVFormat3.getRecordSeparator();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        boolean boolean9 = cSVFormat6.getIgnoreSurroundingSpaces();
        boolean boolean10 = cSVFormat6.getTrailingDelimiter();
        java.lang.String[] strArray14 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withHeader(strArray14);
        java.lang.String str17 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String[] strArray20 = cSVFormat19.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withRecordSeparator('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat22", cSVFormat0.equals(cSVFormat22) ? cSVFormat0.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat3", cSVFormat0.equals(cSVFormat3) ? cSVFormat0.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withSkipHeaderRecord();
        boolean boolean16 = cSVFormat15.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeader(resultSet19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat18", cSVFormat15.equals(cSVFormat18) ? cSVFormat15.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass6 = cSVFormat5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreHeaderCase(true);
        boolean boolean10 = cSVFormat9.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat9", cSVFormat4.equals(cSVFormat9) ? cSVFormat4.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.lang.String[] strArray9 = cSVFormat3.getHeader();
        java.lang.String str10 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('4');
        boolean boolean19 = cSVFormat3.equals((java.lang.Object) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat3.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreHeaderCase();
        boolean boolean23 = cSVFormat21.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat21 and cSVFormat22", cSVFormat21.equals(cSVFormat22) ? cSVFormat21.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.Character char4 = cSVFormat3.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat3", cSVFormat2.equals(cSVFormat3) ? cSVFormat2.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str4 = cSVFormat3.getRecordSeparator();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape('#');
        boolean boolean9 = cSVFormat6.getIgnoreSurroundingSpaces();
        boolean boolean10 = cSVFormat6.getTrailingDelimiter();
        java.lang.String[] strArray14 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withHeader(strArray14);
        java.lang.String str17 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Object[] objArray19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeaderComments(objArray19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat18", cSVFormat0.equals(cSVFormat18) ? cSVFormat0.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean7 = cSVFormat3.getTrailingDelimiter();
        java.lang.String[] strArray11 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        java.sql.ResultSet resultSet18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withHeader(resultSet18);
        java.lang.String[] strArray20 = cSVFormat19.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withIgnoreHeaderCase(true);
        boolean boolean25 = cSVFormat15.equals((java.lang.Object) cSVFormat22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat24", cSVFormat0.equals(cSVFormat24) ? cSVFormat0.hashCode() == cSVFormat24.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        java.lang.String[] strArray9 = cSVFormat3.getHeader();
        boolean boolean10 = cSVFormat3.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withCommentMarker((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        boolean boolean17 = cSVFormat15.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat16", cSVFormat14.equals(cSVFormat16) ? cSVFormat14.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.Character char15 = cSVFormat0.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape('4');
        boolean boolean8 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        java.lang.String str12 = cSVFormat11.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        java.lang.Character char8 = cSVFormat7.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        boolean boolean9 = cSVFormat3.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withQuote((java.lang.Character) 'a');
        boolean boolean21 = cSVFormat18.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData22 = null;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(resultSetMetaData22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str25 = cSVFormat24.getRecordSeparator();
        boolean boolean26 = cSVFormat24.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withEscape('#');
        boolean boolean30 = cSVFormat27.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withHeader(resultSetMetaData31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str34 = cSVFormat33.getRecordSeparator();
        boolean boolean35 = cSVFormat33.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str37 = cSVFormat36.getRecordSeparator();
        boolean boolean38 = cSVFormat36.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withEscape('#');
        boolean boolean42 = cSVFormat39.getIgnoreSurroundingSpaces();
        boolean boolean43 = cSVFormat39.getTrailingDelimiter();
        java.lang.String[] strArray47 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat39.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat33.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat27.withHeaderComments((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat18.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat13.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat52 and cSVFormat57", cSVFormat52.equals(cSVFormat57) ? cSVFormat52.hashCode() == cSVFormat57.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat5.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",,\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.String str2 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        char char6 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass9 = cSVFormat5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean18 = cSVFormat17.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str20 = cSVFormat19.getRecordSeparator();
        boolean boolean21 = cSVFormat19.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray25 = cSVFormat22.getHeader();
        boolean boolean26 = cSVFormat17.equals((java.lang.Object) strArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat17.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator(' ');
        boolean boolean31 = cSVFormat28.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str33 = cSVFormat32.getRecordSeparator();
        boolean boolean34 = cSVFormat32.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withEscape('#');
        boolean boolean38 = cSVFormat35.getIgnoreSurroundingSpaces();
        boolean boolean39 = cSVFormat35.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withTrim();
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        java.lang.String str43 = cSVFormat41.format(objArray42);
        java.lang.String str44 = cSVFormat35.format(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat35.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withQuote((java.lang.Character) 'a');
        java.lang.Character char52 = cSVFormat49.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str54 = cSVFormat53.getRecordSeparator();
        boolean boolean55 = cSVFormat53.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withEscape('#');
        boolean boolean59 = cSVFormat56.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData60 = null;
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withHeader(resultSetMetaData60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str63 = cSVFormat62.getRecordSeparator();
        boolean boolean64 = cSVFormat62.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str66 = cSVFormat65.getRecordSeparator();
        boolean boolean67 = cSVFormat65.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat65.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat68.withEscape('#');
        boolean boolean71 = cSVFormat68.getIgnoreSurroundingSpaces();
        boolean boolean72 = cSVFormat68.getTrailingDelimiter();
        java.lang.String[] strArray76 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat68.withHeader(strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat62.withHeader(strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat56.withHeaderComments((java.lang.Object[]) strArray76);
        java.lang.String str80 = cSVFormat49.format((java.lang.Object[]) strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat48.withHeaderComments((java.lang.Object[]) strArray76);
        java.lang.String str82 = cSVFormat47.format((java.lang.Object[]) strArray76);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat28.withHeader(strArray76);
        java.lang.String str84 = cSVFormat16.format((java.lang.Object[]) strArray76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat16", cSVFormat0.equals(cSVFormat16) ? cSVFormat0.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean14 = cSVFormat5.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat13", cSVFormat0.equals(cSVFormat13) ? cSVFormat0.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        boolean boolean10 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        java.lang.Character char15 = cSVFormat14.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat16", cSVFormat12.equals(cSVFormat16) ? cSVFormat12.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        boolean boolean12 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withTrailingDelimiter(false);
        boolean boolean18 = cSVFormat15.isNullStringSet();
        org.apache.commons.csv.QuoteMode quoteMode19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withQuoteMode(quoteMode19);
        boolean boolean21 = cSVFormat14.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withIgnoreHeaderCase();
        java.lang.String str23 = cSVFormat22.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat22", cSVFormat0.equals(cSVFormat22) ? cSVFormat0.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray18 = new java.lang.Object[] { cSVFormat13, 10L, 10.0f, cSVFormat16, 100.0d };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat10.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat10.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat10.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withIgnoreEmptyLines(false);
        java.lang.Character char27 = cSVFormat26.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str31 = cSVFormat30.getRecordSeparator();
        boolean boolean32 = cSVFormat30.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withTrailingDelimiter();
        boolean boolean37 = cSVFormat36.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str41 = cSVFormat40.getRecordSeparator();
        boolean boolean42 = cSVFormat40.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat48.withQuote((java.lang.Character) 'a');
        boolean boolean51 = cSVFormat48.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withHeader(resultSetMetaData52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str55 = cSVFormat54.getRecordSeparator();
        boolean boolean56 = cSVFormat54.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withEscape('#');
        boolean boolean60 = cSVFormat57.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData61 = null;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withHeader(resultSetMetaData61);
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str64 = cSVFormat63.getRecordSeparator();
        boolean boolean65 = cSVFormat63.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str67 = cSVFormat66.getRecordSeparator();
        boolean boolean68 = cSVFormat66.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat66.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withEscape('#');
        boolean boolean72 = cSVFormat69.getIgnoreSurroundingSpaces();
        boolean boolean73 = cSVFormat69.getTrailingDelimiter();
        java.lang.String[] strArray77 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat69.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat63.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat57.withHeaderComments((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat48.withHeader(strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat39.withHeaderComments((java.lang.Object[]) strArray77);
        java.lang.String str84 = cSVFormat26.format((java.lang.Object[]) strArray77);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.String str2 = cSVFormat0.toString();
        java.lang.Character char3 = cSVFormat0.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat14", cSVFormat0.equals(cSVFormat14) ? cSVFormat0.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker('#');
        boolean boolean4 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.String str6 = cSVFormat0.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean10 = cSVFormat5.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        boolean boolean6 = cSVFormat5.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(true);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        boolean boolean10 = cSVFormat8.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrim(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat3", cSVFormat2.equals(cSVFormat3) ? cSVFormat2.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        java.lang.String[] strArray5 = cSVFormat4.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) (byte) 100);
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat5.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        java.lang.String[] strArray8 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withQuote('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withFirstRecordAsHeader();
        boolean boolean5 = cSVFormat0.getAllowMissingColumnNames();
        java.lang.String[] strArray6 = cSVFormat0.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withRecordSeparator("Delimiter=<,> QuoteChar=< > RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        boolean boolean10 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withTrim();
        java.lang.String[] strArray12 = cSVFormat11.getHeaderComments();
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSet13);
        boolean boolean15 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str17 = cSVFormat16.getRecordSeparator();
        boolean boolean18 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape('#');
        boolean boolean22 = cSVFormat19.getIgnoreSurroundingSpaces();
        boolean boolean23 = cSVFormat19.getTrailingDelimiter();
        java.lang.String[] strArray27 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat14.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withIgnoreHeaderCase(true);
        boolean boolean35 = cSVFormat7.equals((java.lang.Object) cSVFormat34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat31 and cSVFormat34", cSVFormat31.equals(cSVFormat34) ? cSVFormat31.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String[] strArray12 = cSVFormat11.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('4');
        boolean boolean17 = cSVFormat16.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat19", cSVFormat16.equals(cSVFormat19) ? cSVFormat16.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        boolean boolean10 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withTrim();
        java.lang.Character char14 = cSVFormat13.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withHeader(resultSetMetaData18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat16 and cSVFormat17", cSVFormat16.equals(cSVFormat17) ? cSVFormat16.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker('#');
        boolean boolean4 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Character char6 = cSVFormat5.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.Character char4 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withIgnoreHeaderCase(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        boolean boolean2 = cSVFormat1.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat1.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat1.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        boolean boolean3 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat1", cSVFormat0.equals(cSVFormat1) ? cSVFormat0.hashCode() == cSVFormat1.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withRecordSeparator('|');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat8", cSVFormat0.equals(cSVFormat8) ? cSVFormat0.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        boolean boolean6 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames(true);
        java.lang.Character char11 = cSVFormat8.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String str13 = cSVFormat8.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat12", cSVFormat8.equals(cSVFormat12) ? cSVFormat8.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim(false);
        boolean boolean5 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.String str7 = cSVFormat4.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        boolean boolean9 = cSVFormat7.getTrailingDelimiter();
        boolean boolean10 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat4.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreSurroundingSpaces(false);
        java.lang.Character char15 = cSVFormat14.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withQuoteMode(quoteMode17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat16", cSVFormat12.equals(cSVFormat16) ? cSVFormat12.hashCode() == cSVFormat16.hashCode() : true);
    }
}

