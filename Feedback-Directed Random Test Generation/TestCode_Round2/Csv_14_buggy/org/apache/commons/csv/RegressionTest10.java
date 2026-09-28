package org.apache.commons.csv;

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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        java.lang.String str2 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        java.lang.Character char7 = cSVFormat4.getQuoteCharacter();
        boolean boolean8 = cSVFormat4.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withFirstRecordAsHeader();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat9.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parameter 'reader' must not be null!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str2, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\"' + "'", char7 == '\"');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withTrim(false);
        java.lang.String str9 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withRecordSeparator("Delimiter=<#> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Predefined predefined12 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat13 = predefined12.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat14 = predefined12.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat15 = predefined12.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat16 = predefined12.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat17 = predefined12.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat18 = predefined12.getFormat();
        java.lang.Appendable appendable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) cSVFormat18, appendable19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<a> SkipHeaderRecord:false" + "'", str9, "Delimiter=<a> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + predefined12 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined12.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray13 = new java.lang.Object[] { cSVFormat8, 10L, 10.0f, cSVFormat11, 100.0d };
        java.lang.String str14 = cSVFormat5.format(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat4.withHeaderComments(objArray13);
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat4.withHeader(resultSet16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuote('\\');
        boolean boolean20 = cSVFormat17.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0" + "'", str14, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
        java.sql.ResultSetMetaData resultSetMetaData21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat0.withHeader(resultSetMetaData21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withRecordSeparator(",");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuote('|');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0" + "'", str9, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str12, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
        boolean boolean15 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat0.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0" + "'", str9, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines();
        java.lang.Character char11 = cSVFormat10.getCommentMarker();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("hi!");
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat3.getHeader();
        char char7 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ',' + "'", char7 == ',');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> RecordSeparator=<??> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrailingDelimiter(false);
        boolean boolean8 = cSVFormat5.isCommentMarkerSet();
        boolean boolean9 = cSVFormat5.getSkipHeaderRecord();
        java.lang.Character char10 = cSVFormat5.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"a\"\r\n\"a\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        java.lang.Character char15 = cSVFormat5.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        boolean boolean17 = cSVFormat16.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str19 = cSVFormat18.getRecordSeparator();
        boolean boolean20 = cSVFormat18.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray24 = cSVFormat21.getHeader();
        boolean boolean25 = cSVFormat16.equals((java.lang.Object) strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat16.withQuote((java.lang.Character) '4');
        java.lang.Character char28 = cSVFormat27.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray39 = new java.lang.Object[] { cSVFormat34, 10L, 10.0f, cSVFormat37, 100.0d };
        java.lang.String str40 = cSVFormat31.format(objArray39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat31.withSkipHeaderRecord(false);
        boolean boolean43 = cSVFormat31.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str45 = cSVFormat44.getRecordSeparator();
        boolean boolean46 = cSVFormat44.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray50 = cSVFormat47.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String[] strArray52 = cSVFormat51.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withFirstRecordAsHeader();
        java.lang.String[] strArray54 = cSVFormat53.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat31.withHeaderComments((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat2.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat2.withRecordSeparator('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(char10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\"' + "'", char15 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\r\n" + "'", str19, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNull(char28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0" + "'", str40, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\r\n" + "'", str45, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNull(strArray50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNull(strArray52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        java.lang.String[] strArray4 = cSVFormat3.getHeaderComments();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeader(resultSet5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrailingDelimiter();
        char char20 = cSVFormat19.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + char20 + "' != '" + ',' + "'", char20 == ',');
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        boolean boolean1 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withNullString("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",,\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.String str9 = cSVFormat7.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote((java.lang.Character) 'a');
        java.lang.Character char13 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str15 = cSVFormat14.getRecordSeparator();
        boolean boolean16 = cSVFormat14.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withEscape('#');
        boolean boolean20 = cSVFormat17.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(resultSetMetaData21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str24 = cSVFormat23.getRecordSeparator();
        boolean boolean25 = cSVFormat23.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str27 = cSVFormat26.getRecordSeparator();
        boolean boolean28 = cSVFormat26.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withEscape('#');
        boolean boolean32 = cSVFormat29.getIgnoreSurroundingSpaces();
        boolean boolean33 = cSVFormat29.getTrailingDelimiter();
        java.lang.String[] strArray37 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat29.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat23.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat17.withHeaderComments((java.lang.Object[]) strArray37);
        java.lang.String str41 = cSVFormat10.format((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat7.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat0.withHeaderComments((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat0.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\n" + "'", str15, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\r\n" + "'", str24, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\r\n" + "'", str27, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" });
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"\r\n\",\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"" + "'", str41, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"\r\n\",\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray24 = new java.lang.Object[] { cSVFormat19, 10L, 10.0f, cSVFormat22, 100.0d };
        java.lang.String str25 = cSVFormat16.format(objArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str27 = cSVFormat26.getRecordSeparator();
        boolean boolean28 = cSVFormat26.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str30 = cSVFormat29.getRecordSeparator();
        boolean boolean31 = cSVFormat29.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withEscape('#');
        boolean boolean35 = cSVFormat32.getIgnoreSurroundingSpaces();
        boolean boolean36 = cSVFormat32.getTrailingDelimiter();
        java.lang.String[] strArray40 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat32.withHeader(strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat26.withHeader(strArray40);
        java.lang.String str43 = cSVFormat16.format((java.lang.Object[]) strArray40);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat13.withHeader(strArray40);
        java.lang.String str45 = cSVFormat44.toString();
        boolean boolean46 = cSVFormat44.isQuoteCharacterSet();
        boolean boolean47 = cSVFormat44.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0" + "'", str25, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\r\n" + "'", str27, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\r\n" + "'", str30, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" });
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"\r\n\",\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"" + "'", str43, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"\r\n\",\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false Header:[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, \r\n, Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false]" + "'", str45, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false Header:[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, \r\n, Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.String str5 = cSVFormat1.getNullString();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat1.getQuoteMode();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(quoteMode6);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '\t');
        java.lang.String str9 = cSVFormat5.getNullString();
        java.lang.Character char10 = cSVFormat5.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(char10);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        java.lang.String[] strArray2 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withTrailingDelimiter();
        boolean boolean7 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuote('\t');
        boolean boolean10 = cSVFormat9.isNullStringSet();
        boolean boolean11 = cSVFormat9.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase(false);
        java.io.File file14 = null;
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat9.print(file14, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(strArray2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSet2);
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape((java.lang.Character) '\t');
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(quoteMode5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        java.io.File file4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat3.print(file4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        java.lang.String str10 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str14 = cSVFormat13.getRecordSeparator();
        boolean boolean15 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withRecordSeparator("hi!");
        boolean boolean23 = cSVFormat12.equals((java.lang.Object) cSVFormat22);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat12.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0" + "'", str9, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str10, "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\r\n" + "'", str14, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter(true);
        java.lang.String str8 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withEscape((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String str14 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        boolean boolean6 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        java.lang.String str4 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<#> SkipHeaderRecord:false" + "'", str4, "Delimiter=<#> SkipHeaderRecord:false");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape('#');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('4');
        boolean boolean13 = cSVFormat10.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        java.lang.String[] strArray3 = cSVFormat2.getHeaderComments();
        java.lang.String str4 = cSVFormat2.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<\t> Escape=<\\> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str4, "Delimiter=<\t> Escape=<\\> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Object[] objArray8 = new java.lang.Object[] { cSVFormat3, 10L, 10.0f, cSVFormat6, 100.0d };
        java.lang.String str9 = cSVFormat0.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withTrailingDelimiter(true);
        boolean boolean12 = cSVFormat11.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withAllowMissingColumnNames();
        boolean boolean19 = cSVFormat11.equals((java.lang.Object) cSVFormat18);
        java.lang.Character char20 = cSVFormat11.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat11.withIgnoreEmptyLines(true);
        java.nio.file.Path path23 = null;
        java.nio.charset.Charset charset24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter25 = cSVFormat11.print(path23, charset24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 10, 10.0, Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0" + "'", str9, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",10,10.0,\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",100.0");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(char20);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator("\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\n> SkipHeaderRecord:false\",\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuote((java.lang.Character) 'a');
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        boolean boolean10 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuoteMode(quoteMode12);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withAllowMissingColumnNames();
        java.lang.Character char9 = cSVFormat8.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str11 = cSVFormat10.getRecordSeparator();
        boolean boolean12 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withEscape('a');
        java.lang.String[] strArray18 = cSVFormat15.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withQuote(' ');
        java.lang.Character char21 = cSVFormat15.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat15.withRecordSeparator("Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat15.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withTrim();
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.String str33 = cSVFormat31.format(objArray32);
        boolean boolean34 = cSVFormat31.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str38 = cSVFormat37.getRecordSeparator();
        boolean boolean39 = cSVFormat37.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withTrim();
        java.lang.Character char41 = cSVFormat37.getEscapeCharacter();
        boolean boolean43 = cSVFormat37.equals((java.lang.Object) 100.0d);
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str45 = cSVFormat44.getRecordSeparator();
        boolean boolean46 = cSVFormat44.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str48 = cSVFormat47.getRecordSeparator();
        boolean boolean49 = cSVFormat47.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withEscape('#');
        boolean boolean53 = cSVFormat50.getIgnoreSurroundingSpaces();
        boolean boolean54 = cSVFormat50.getTrailingDelimiter();
        java.lang.String[] strArray58 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat50.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat44.withHeader(strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat37.withHeaderComments((java.lang.Object[]) strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat31.withHeaderComments((java.lang.Object[]) strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat26.withHeader(strArray58);
        java.lang.String str64 = cSVFormat25.format((java.lang.Object[]) strArray58);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat8.withHeader(strArray58);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\"' + "'", char9 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\n" + "'", str11, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNull(strArray18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\"' + "'", char21 == '\"');
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\r\n" + "'", str38, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNull(char41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\r\n" + "'", str45, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\r\n" + "'", str48, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" });
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",,\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"," + "'", str64, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",,\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",");
        org.junit.Assert.assertNotNull(cSVFormat65);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str1 = cSVFormat0.getRecordSeparator();
        boolean boolean2 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) 'a');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrim();
        boolean boolean8 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withDelimiter('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str18 = cSVFormat17.getRecordSeparator();
        boolean boolean19 = cSVFormat17.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withEscape('#');
        boolean boolean23 = cSVFormat20.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(resultSetMetaData24);
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withQuoteMode(quoteMode26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withHeader(resultSetMetaData29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str35 = cSVFormat34.getRecordSeparator();
        boolean boolean36 = cSVFormat34.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withQuote((java.lang.Character) 'a');
        boolean boolean45 = cSVFormat42.getSkipHeaderRecord();
        java.sql.ResultSetMetaData resultSetMetaData46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withHeader(resultSetMetaData46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str49 = cSVFormat48.getRecordSeparator();
        boolean boolean50 = cSVFormat48.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withEscape('#');
        boolean boolean54 = cSVFormat51.getIgnoreSurroundingSpaces();
        java.sql.ResultSetMetaData resultSetMetaData55 = null;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(resultSetMetaData55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str58 = cSVFormat57.getRecordSeparator();
        boolean boolean59 = cSVFormat57.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.String str61 = cSVFormat60.getRecordSeparator();
        boolean boolean62 = cSVFormat60.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat60.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withEscape('#');
        boolean boolean66 = cSVFormat63.getIgnoreSurroundingSpaces();
        boolean boolean67 = cSVFormat63.getTrailingDelimiter();
        java.lang.String[] strArray71 = new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" };
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat63.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat57.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat51.withHeaderComments((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat42.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat41.withHeaderComments((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat33.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat30.withHeader(strArray71);
        java.lang.String str79 = cSVFormat14.format((java.lang.Object[]) strArray71);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\n" + "'", str1, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\r\n" + "'", str18, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\r\n" + "'", str35, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\r\n" + "'", str49, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\r\n" + "'", str58, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\r\n" + "'", str61, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "\r\n", "Delimiter=<,> QuoteChar=<\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" });
        org.junit.Assert.assertNotNull(cSVFormat72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat74);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(cSVFormat76);
        org.junit.Assert.assertNotNull(cSVFormat77);
        org.junit.Assert.assertNotNull(cSVFormat78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"#\"\r\n\"#\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"" + "'", str79, "\"Delimiter=<,> QuoteChar=<\"\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"#\"\r\n\"#\"Delimiter=<,> QuoteChar=<\"\"> CommentStart=< > RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\"");
    }
}

