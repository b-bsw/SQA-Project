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
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean4 = cSVFormat3.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        char char7 = cSVFormat6.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat9", cSVFormat2.equals(cSVFormat9) ? cSVFormat2.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char4 = cSVFormat3.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.sql.ResultSetMetaData resultSetMetaData32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withHeader(resultSetMetaData32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray37 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withHeaderComments(objArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat35.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat35.withHeader(resultSetMetaData43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray55 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withHeaderComments(objArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat48.withHeaderComments(objArray55);
        java.lang.String[] strArray62 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat48.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat44.withHeaderComments((java.lang.Object[]) strArray62);
        java.lang.String str65 = cSVFormat31.format((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat29", cSVFormat6.equals(cSVFormat29) ? cSVFormat6.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuoteMode(quoteMode7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat9", cSVFormat2.equals(cSVFormat9) ? cSVFormat2.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean4 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat6.withIgnoreHeaderCase();
        java.lang.Character char30 = cSVFormat29.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat29", cSVFormat6.equals(cSVFormat29) ? cSVFormat6.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat6.withIgnoreHeaderCase();
        java.lang.String str30 = cSVFormat29.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat29", cSVFormat6.equals(cSVFormat29) ? cSVFormat6.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat6.withHeaderComments(objArray17);
        java.lang.String str21 = cSVFormat1.format(objArray17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat9", cSVFormat2.equals(cSVFormat9) ? cSVFormat2.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str8 = cSVFormat7.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeaderComments(objArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat2.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withSkipHeaderRecord();
        boolean boolean37 = cSVFormat36.getIgnoreSurroundingSpaces();
        boolean boolean38 = cSVFormat36.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat36.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat36.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withIgnoreEmptyLines();
        boolean boolean45 = cSVFormat44.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet46 = null;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withHeader(resultSet46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat50.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray54 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat50.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat44.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat36.withHeaderComments((java.lang.Object[]) strArray54);
        java.lang.String str58 = cSVFormat32.format((java.lang.Object[]) strArray54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat32", cSVFormat2.equals(cSVFormat32) ? cSVFormat2.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray18 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withHeaderComments(objArray18);
        boolean boolean20 = cSVFormat16.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("Delimiter=<a> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:true");
        boolean boolean25 = cSVFormat14.equals((java.lang.Object) cSVFormat22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withQuoteMode(quoteMode12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        java.lang.String str15 = cSVFormat14.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withEscape(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(true);
        boolean boolean16 = cSVFormat7.equals((java.lang.Object) cSVFormat15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        java.lang.String str7 = cSVFormat2.toString();
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        java.lang.Character char12 = cSVFormat11.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        java.lang.String str7 = cSVFormat2.toString();
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        java.lang.String str12 = cSVFormat9.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean37 = cSVFormat36.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat36", cSVFormat0.equals(cSVFormat36) ? cSVFormat0.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.Character char6 = cSVFormat4.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote(',');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withNullString("Delimiter=<a> NullString=<hi!> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withRecordSeparator("\n");
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        boolean boolean28 = cSVFormat27.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withHeader(resultSet29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray37 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat33.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat27.withHeader(strArray37);
        java.lang.String str40 = cSVFormat24.format((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat9.withHeader(strArray37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withCommentMarker(' ');
        boolean boolean16 = cSVFormat8.isQuoteCharacterSet();
        boolean boolean18 = cSVFormat8.equals((java.lang.Object) "0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withHeader(resultSet20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat21.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat8.format((java.lang.Object[]) strArray28);
        java.lang.String str32 = cSVFormat5.format((java.lang.Object[]) strArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat5", cSVFormat2.equals(cSVFormat5) ? cSVFormat2.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat10", cSVFormat2.equals(cSVFormat10) ? cSVFormat2.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        char char16 = cSVFormat15.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.String[] strArray7 = cSVFormat5.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean8 = cSVFormat1.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("Delimiter=<a> NullString=<hi!> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("\n");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        java.lang.Character char15 = cSVFormat12.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        java.lang.String[] strArray27 = cSVFormat26.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(false);
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withHeader(resultSetMetaData15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        boolean boolean21 = cSVFormat20.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withIgnoreHeaderCase();
        boolean boolean23 = cSVFormat16.equals((java.lang.Object) cSVFormat20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat20 and cSVFormat22", cSVFormat20.equals(cSVFormat22) ? cSVFormat20.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeaderComments(objArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat2.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreHeaderCase();
        java.lang.Character char33 = cSVFormat31.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat32", cSVFormat2.equals(cSVFormat32) ? cSVFormat2.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        boolean boolean7 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat13 };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withHeaderComments(objArray15);
        java.sql.ResultSet resultSet17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(resultSet17);
        java.lang.String str19 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withIgnoreHeaderCase(false);
        boolean boolean34 = cSVFormat26.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat26.withAllowMissingColumnNames();
        boolean boolean36 = cSVFormat35.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        boolean boolean40 = cSVFormat39.getSkipHeaderRecord();
        char char41 = cSVFormat39.getDelimiter();
        char char42 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withIgnoreEmptyLines();
        boolean boolean49 = cSVFormat48.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat48.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withIgnoreEmptyLines();
        boolean boolean62 = cSVFormat61.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withHeader(resultSet63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat66.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat67.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat67.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat67.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat61.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat58.withHeaderComments((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat55.withHeaderComments((java.lang.Object[]) strArray71);
        java.lang.String str76 = cSVFormat44.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat35.withHeader(strArray71);
        java.lang.String str78 = cSVFormat20.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat3.withHeader(strArray71);
        java.lang.String str80 = cSVFormat1.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean82 = cSVFormat81.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat81", cSVFormat1.equals(cSVFormat81) ? cSVFormat1.hashCode() == cSVFormat81.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        boolean boolean10 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) "0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat2.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.String str27 = cSVFormat26.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withNullString("Delimiter=<a> NullString=<hi!> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("\n");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSet16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray24 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withHeader(strArray24);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat17.withHeaderComments((java.lang.Object[]) strArray24);
        boolean boolean27 = cSVFormat17.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat17.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Predefined predefined30 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat31 = predefined30.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat32 = predefined30.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat33 = predefined30.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withIgnoreEmptyLines();
        boolean boolean37 = cSVFormat36.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode40 = null;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat36.withQuoteMode(quoteMode40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat36.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withIgnoreEmptyLines();
        boolean boolean50 = cSVFormat49.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withHeader(resultSet51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat54.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat55.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray59 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat55.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat49.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat46.withHeaderComments((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat43.withHeaderComments((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat33.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat17.withHeader(strArray59);
        java.lang.String str66 = cSVFormat13.format((java.lang.Object[]) strArray59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        boolean boolean10 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) "0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat2.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean27 = cSVFormat26.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.Character char9 = cSVFormat8.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withQuoteMode(quoteMode12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat16.withIgnoreHeaderCase(false);
        boolean boolean24 = cSVFormat16.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat16.withAllowMissingColumnNames();
        boolean boolean26 = cSVFormat25.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreEmptyLines();
        boolean boolean30 = cSVFormat29.getSkipHeaderRecord();
        char char31 = cSVFormat29.getDelimiter();
        char char32 = cSVFormat29.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withIgnoreEmptyLines();
        boolean boolean39 = cSVFormat38.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat38.withQuoteMode(quoteMode42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat38.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat50.withIgnoreEmptyLines();
        boolean boolean52 = cSVFormat51.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet53 = null;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withHeader(resultSet53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat57.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray61 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat51.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat48.withHeaderComments((java.lang.Object[]) strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat45.withHeaderComments((java.lang.Object[]) strArray61);
        java.lang.String str66 = cSVFormat34.format((java.lang.Object[]) strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat25.withHeader(strArray61);
        java.lang.String str68 = cSVFormat13.format((java.lang.Object[]) strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        boolean boolean16 = cSVFormat15.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean12 = cSVFormat9.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat8.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean6 = cSVFormat5.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreHeaderCase();
        java.lang.String[] strArray35 = cSVFormat34.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat33 and cSVFormat34", cSVFormat33.equals(cSVFormat34) ? cSVFormat33.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean7 = cSVFormat2.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        boolean boolean13 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat12", cSVFormat9.equals(cSVFormat12) ? cSVFormat9.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat7", cSVFormat6.equals(cSVFormat7) ? cSVFormat6.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withAllowMissingColumnNames();
        java.lang.Character char24 = cSVFormat20.getEscapeCharacter();
        boolean boolean25 = cSVFormat20.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withIgnoreHeaderCase();
        boolean boolean27 = cSVFormat26.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat26", cSVFormat3.equals(cSVFormat26) ? cSVFormat3.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeaderComments(objArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat2.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreHeaderCase();
        boolean boolean33 = cSVFormat32.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat32", cSVFormat2.equals(cSVFormat32) ? cSVFormat2.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        boolean boolean27 = cSVFormat26.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        java.lang.Character char12 = cSVFormat7.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreEmptyLines();
        boolean boolean23 = cSVFormat22.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withQuoteMode(quoteMode26);
        boolean boolean28 = cSVFormat22.getIgnoreSurroundingSpaces();
        boolean boolean29 = cSVFormat22.isQuoteCharacterSet();
        org.apache.commons.csv.QuoteMode quoteMode30 = cSVFormat22.getQuoteMode();
        boolean boolean31 = cSVFormat19.equals((java.lang.Object) cSVFormat22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray16 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withHeaderComments(objArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreHeaderCase();
        boolean boolean23 = cSVFormat1.equals((java.lang.Object) cSVFormat21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat21 and cSVFormat22", cSVFormat21.equals(cSVFormat22) ? cSVFormat21.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withQuote('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("0");
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('4');
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withDelimiter('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSetMetaData2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('4');
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode12 = cSVFormat10.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withNullString("4-1.04,1.0,Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeaderComments(objArray8);
        boolean boolean10 = cSVFormat6.isEscapeCharacterSet();
        boolean boolean11 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withSkipHeaderRecord();
        java.lang.Object[] objArray18 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat16 };
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat6.withHeaderComments(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat22.withIgnoreHeaderCase(false);
        boolean boolean30 = cSVFormat22.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat22.withAllowMissingColumnNames();
        boolean boolean32 = cSVFormat31.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withIgnoreEmptyLines();
        boolean boolean36 = cSVFormat35.getSkipHeaderRecord();
        char char37 = cSVFormat35.getDelimiter();
        char char38 = cSVFormat35.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withIgnoreEmptyLines();
        boolean boolean45 = cSVFormat44.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode48 = null;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat44.withQuoteMode(quoteMode48);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat44.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withIgnoreEmptyLines();
        boolean boolean58 = cSVFormat57.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet59 = null;
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat57.withHeader(resultSet59);
        org.apache.commons.csv.CSVFormat cSVFormat62 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat63.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat63.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray67 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat63.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat57.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat54.withHeaderComments((java.lang.Object[]) strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat51.withHeaderComments((java.lang.Object[]) strArray67);
        java.lang.String str72 = cSVFormat40.format((java.lang.Object[]) strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat31.withHeader(strArray67);
        java.lang.String str74 = cSVFormat19.format((java.lang.Object[]) strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat4.withHeader(strArray67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        java.lang.String str15 = cSVFormat14.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat5.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat9.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withHeaderComments(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat28.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withRecordSeparator("hi!");
        java.lang.Character char38 = cSVFormat37.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withEscape((java.lang.Character) ' ');
        char char49 = cSVFormat48.getDelimiter();
        char char50 = cSVFormat48.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat48.withQuoteMode(quoteMode51);
        boolean boolean53 = cSVFormat52.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.QuoteMode quoteMode56 = cSVFormat55.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat55.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withIgnoreEmptyLines();
        boolean boolean62 = cSVFormat61.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withHeader(resultSet63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat66.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat67.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat67.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat67.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat61.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat58.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat52.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat42.withHeaderComments((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat26.withHeader(strArray71);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withQuoteMode(quoteMode8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeaderComments(objArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat7.withIgnoreHeaderCase(true);
        boolean boolean48 = cSVFormat47.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat47", cSVFormat2.equals(cSVFormat47) ? cSVFormat2.hashCode() == cSVFormat47.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withIgnoreHeaderCase();
        boolean boolean27 = cSVFormat20.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat26", cSVFormat3.equals(cSVFormat26) ? cSVFormat3.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        java.lang.Character char20 = cSVFormat19.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeaderComments(objArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat7.withIgnoreHeaderCase(true);
        java.lang.String str48 = cSVFormat47.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat47", cSVFormat2.equals(cSVFormat47) ? cSVFormat2.hashCode() == cSVFormat47.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.String str6 = cSVFormat4.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat5", cSVFormat1.equals(cSVFormat5) ? cSVFormat1.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        boolean boolean11 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat0.equals((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuote(',');
        boolean boolean15 = cSVFormat9.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreHeaderCase();
        java.lang.String str21 = cSVFormat20.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat20", cSVFormat9.equals(cSVFormat20) ? cSVFormat9.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat8.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        char char11 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat15", cSVFormat9.equals(cSVFormat15) ? cSVFormat9.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreEmptyLines();
        boolean boolean15 = cSVFormat14.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withQuoteMode(quoteMode18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreSurroundingSpaces();
        java.lang.Character char23 = cSVFormat21.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray27 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withHeaderComments(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray43 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withHeaderComments(objArray43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat36.withHeaderComments(objArray43);
        java.lang.String[] strArray50 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat36.withHeader(strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat21.withHeaderComments((java.lang.Object[]) strArray50);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat11.withHeader(strArray50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false Header:[]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat12", cSVFormat3.equals(cSVFormat12) ? cSVFormat3.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        boolean boolean7 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat13 };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withHeaderComments(objArray15);
        java.sql.ResultSet resultSet17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(resultSet17);
        java.lang.String str19 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withIgnoreHeaderCase(false);
        boolean boolean34 = cSVFormat26.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat26.withAllowMissingColumnNames();
        boolean boolean36 = cSVFormat35.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        boolean boolean40 = cSVFormat39.getSkipHeaderRecord();
        char char41 = cSVFormat39.getDelimiter();
        char char42 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withIgnoreEmptyLines();
        boolean boolean49 = cSVFormat48.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat48.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withIgnoreEmptyLines();
        boolean boolean62 = cSVFormat61.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withHeader(resultSet63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat66.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat67.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat67.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat67.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat61.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat58.withHeaderComments((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat55.withHeaderComments((java.lang.Object[]) strArray71);
        java.lang.String str76 = cSVFormat44.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat35.withHeader(strArray71);
        java.lang.String str78 = cSVFormat20.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat3.withHeader(strArray71);
        java.lang.String str80 = cSVFormat1.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean82 = cSVFormat1.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat81", cSVFormat1.equals(cSVFormat81) ? cSVFormat1.hashCode() == cSVFormat81.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat11 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat15", cSVFormat1.equals(cSVFormat15) ? cSVFormat1.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat5.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withHeaderComments((java.lang.Object[]) strArray28);
        boolean boolean31 = cSVFormat10.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat10.withIgnoreHeaderCase(true);
        boolean boolean34 = cSVFormat33.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat33", cSVFormat1.equals(cSVFormat33) ? cSVFormat1.hashCode() == cSVFormat33.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreHeaderCase();
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('4');
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat5", cSVFormat3.equals(cSVFormat5) ? cSVFormat3.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat20.withQuoteMode(quoteMode27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat26", cSVFormat3.equals(cSVFormat26) ? cSVFormat3.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withQuoteMode(quoteMode14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat13", cSVFormat10.equals(cSVFormat13) ? cSVFormat10.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.Character char9 = cSVFormat8.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat0.withHeader(resultSet37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat36", cSVFormat0.equals(cSVFormat36) ? cSVFormat0.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withQuote('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat6", cSVFormat3.equals(cSVFormat6) ? cSVFormat3.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.Character char10 = cSVFormat8.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreEmptyLines();
        boolean boolean21 = cSVFormat20.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withIgnoreEmptyLines();
        boolean boolean34 = cSVFormat33.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeader(resultSet35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat33.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat27.withHeaderComments((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat15.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat10.withHeader(strArray43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat12", cSVFormat3.equals(cSVFormat12) ? cSVFormat3.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreHeaderCase();
        java.lang.Character char35 = cSVFormat34.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat33 and cSVFormat34", cSVFormat33.equals(cSVFormat34) ? cSVFormat33.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        char char7 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass9 = cSVFormat8.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray12 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withHeaderComments(objArray12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker((java.lang.Character) ' ');
        boolean boolean18 = cSVFormat6.equals((java.lang.Object) cSVFormat15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator("Delimiter=<a> NullString=<hi!> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat20", cSVFormat15.equals(cSVFormat20) ? cSVFormat15.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean8 = cSVFormat7.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        boolean boolean11 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat0.equals((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuote(',');
        boolean boolean15 = cSVFormat9.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreHeaderCase();
        boolean boolean21 = cSVFormat20.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat20", cSVFormat9.equals(cSVFormat20) ? cSVFormat9.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getSkipHeaderRecord();
        char char13 = cSVFormat11.getDelimiter();
        char char14 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreEmptyLines();
        boolean boolean21 = cSVFormat20.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withIgnoreEmptyLines();
        boolean boolean34 = cSVFormat33.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeader(resultSet35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat33.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat27.withHeaderComments((java.lang.Object[]) strArray43);
        java.lang.String str48 = cSVFormat16.format((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat8.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode51 = cSVFormat50.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat49 and cSVFormat50", cSVFormat49.equals(cSVFormat50) ? cSVFormat49.hashCode() == cSVFormat50.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass8 = cSVFormat7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuoteMode(quoteMode10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreEmptyLines();
        boolean boolean20 = cSVFormat19.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeader(resultSet21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat19.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat3.withHeader(strArray29);
        java.lang.String str35 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.Character char37 = cSVFormat3.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat36", cSVFormat3.equals(cSVFormat36) ? cSVFormat3.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        boolean boolean7 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat13 };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withHeaderComments(objArray15);
        java.sql.ResultSet resultSet17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(resultSet17);
        java.lang.String str19 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withIgnoreHeaderCase(false);
        boolean boolean34 = cSVFormat26.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat26.withAllowMissingColumnNames();
        boolean boolean36 = cSVFormat35.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        boolean boolean40 = cSVFormat39.getSkipHeaderRecord();
        char char41 = cSVFormat39.getDelimiter();
        char char42 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withIgnoreEmptyLines();
        boolean boolean49 = cSVFormat48.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat48.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withIgnoreEmptyLines();
        boolean boolean62 = cSVFormat61.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withHeader(resultSet63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat66.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat67.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat67.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat67.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat61.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat58.withHeaderComments((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat55.withHeaderComments((java.lang.Object[]) strArray71);
        java.lang.String str76 = cSVFormat44.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat35.withHeader(strArray71);
        java.lang.String str78 = cSVFormat20.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat3.withHeader(strArray71);
        java.lang.String str80 = cSVFormat1.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String[] strArray82 = cSVFormat1.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat81", cSVFormat1.equals(cSVFormat81) ? cSVFormat1.hashCode() == cSVFormat81.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withCommentMarker(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat5", cSVFormat2.equals(cSVFormat5) ? cSVFormat2.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat5.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat8", cSVFormat5.equals(cSVFormat8) ? cSVFormat5.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeaderComments(objArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat2.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat32", cSVFormat2.equals(cSVFormat32) ? cSVFormat2.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreEmptyLines();
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuoteMode(quoteMode13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreEmptyLines();
        boolean boolean23 = cSVFormat22.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withHeader(resultSet24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray32 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat22.withHeader(strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray32);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray32);
        java.lang.String[] strArray37 = cSVFormat36.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat6", cSVFormat3.equals(cSVFormat6) ? cSVFormat3.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord();
        java.lang.String[] strArray9 = cSVFormat5.getHeader();
        java.lang.Character char10 = cSVFormat5.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withQuote('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat11", cSVFormat5.equals(cSVFormat11) ? cSVFormat5.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray12 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withHeader(strArray12);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withHeader(strArray12);
        boolean boolean15 = cSVFormat14.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase();
        java.lang.String str17 = cSVFormat16.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat16", cSVFormat13.equals(cSVFormat16) ? cSVFormat13.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray15 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat5.withHeader(strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat2.withHeaderComments((java.lang.Object[]) strArray15);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat2.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        boolean boolean27 = cSVFormat26.getIgnoreSurroundingSpaces();
        boolean boolean28 = cSVFormat26.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreEmptyLines();
        boolean boolean35 = cSVFormat34.getSkipHeaderRecord();
        char char36 = cSVFormat34.getDelimiter();
        char char37 = cSVFormat34.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withIgnoreEmptyLines();
        boolean boolean44 = cSVFormat43.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode47 = null;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat43.withQuoteMode(quoteMode47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat43.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withIgnoreEmptyLines();
        boolean boolean57 = cSVFormat56.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet58 = null;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withHeader(resultSet58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat61.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat62.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat62.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray66 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat62.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat56.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat53.withHeaderComments((java.lang.Object[]) strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat50.withHeaderComments((java.lang.Object[]) strArray66);
        java.lang.String str71 = cSVFormat39.format((java.lang.Object[]) strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat31.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat20.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat73.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat73.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet77 = null;
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withHeader(resultSet77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat73 and cSVFormat76", cSVFormat73.equals(cSVFormat76) ? cSVFormat73.hashCode() == cSVFormat76.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        java.lang.String[] strArray12 = cSVFormat11.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        java.lang.String str16 = cSVFormat13.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withIgnoreHeaderCase(false);
        boolean boolean27 = cSVFormat19.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withAllowMissingColumnNames();
        boolean boolean29 = cSVFormat28.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreEmptyLines();
        boolean boolean33 = cSVFormat32.getSkipHeaderRecord();
        char char34 = cSVFormat32.getDelimiter();
        char char35 = cSVFormat32.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withIgnoreEmptyLines();
        boolean boolean42 = cSVFormat41.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode45 = null;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat41.withQuoteMode(quoteMode45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat41.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat53.withIgnoreEmptyLines();
        boolean boolean55 = cSVFormat54.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet56 = null;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withHeader(resultSet56);
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat60.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray64 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat60.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat54.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat51.withHeaderComments((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat48.withHeaderComments((java.lang.Object[]) strArray64);
        java.lang.String str69 = cSVFormat37.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat28.withHeader(strArray64);
        java.lang.String str71 = cSVFormat13.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat10.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat2.withHeader(strArray64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape((java.lang.Character) ' ');
        char char22 = cSVFormat21.getDelimiter();
        char char23 = cSVFormat21.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withQuoteMode(quoteMode24);
        boolean boolean26 = cSVFormat25.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.QuoteMode quoteMode29 = cSVFormat28.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreEmptyLines();
        boolean boolean35 = cSVFormat34.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withHeader(resultSet36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat31.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat25.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withDelimiter('4');
        boolean boolean52 = cSVFormat51.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withIgnoreHeaderCase();
        boolean boolean54 = cSVFormat53.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat51 and cSVFormat53", cSVFormat51.equals(cSVFormat53) ? cSVFormat51.hashCode() == cSVFormat53.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        java.lang.Character char12 = cSVFormat11.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.Character char8 = cSVFormat7.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean7 = cSVFormat2.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSetMetaData13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat12", cSVFormat9.equals(cSVFormat12) ? cSVFormat9.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) ' ');
        char char6 = cSVFormat5.getDelimiter();
        boolean boolean7 = cSVFormat5.isCommentMarkerSet();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat11", cSVFormat5.equals(cSVFormat11) ? cSVFormat5.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat11 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withHeaderComments(objArray13);
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withHeader(resultSet15);
        java.lang.String str17 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        java.lang.String str21 = cSVFormat18.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat24.withIgnoreHeaderCase(false);
        boolean boolean32 = cSVFormat24.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat24.withAllowMissingColumnNames();
        boolean boolean34 = cSVFormat33.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreEmptyLines();
        boolean boolean38 = cSVFormat37.getSkipHeaderRecord();
        char char39 = cSVFormat37.getDelimiter();
        char char40 = cSVFormat37.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat45.withIgnoreEmptyLines();
        boolean boolean47 = cSVFormat46.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode50 = null;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withQuoteMode(quoteMode50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat46.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withIgnoreEmptyLines();
        boolean boolean60 = cSVFormat59.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet61 = null;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withHeader(resultSet61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat64.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat65.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat65.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat65.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat59.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat56.withHeaderComments((java.lang.Object[]) strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat53.withHeaderComments((java.lang.Object[]) strArray69);
        java.lang.String str74 = cSVFormat42.format((java.lang.Object[]) strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat33.withHeader(strArray69);
        java.lang.String str76 = cSVFormat18.format((java.lang.Object[]) strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat1.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat77.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat77.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat79.withDelimiter(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat77 and cSVFormat79", cSVFormat77.equals(cSVFormat79) ? cSVFormat77.hashCode() == cSVFormat79.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withDelimiter('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat9", cSVFormat2.equals(cSVFormat9) ? cSVFormat2.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean6 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        java.lang.Character char17 = cSVFormat16.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat16", cSVFormat15.equals(cSVFormat16) ? cSVFormat15.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        java.lang.Character char12 = cSVFormat7.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) ' ');
        char char6 = cSVFormat5.getDelimiter();
        boolean boolean7 = cSVFormat5.isCommentMarkerSet();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase(true);
        boolean boolean12 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat11", cSVFormat5.equals(cSVFormat11) ? cSVFormat5.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getSkipHeaderRecord();
        char char13 = cSVFormat11.getDelimiter();
        char char14 = cSVFormat11.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreEmptyLines();
        boolean boolean21 = cSVFormat20.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withQuoteMode(quoteMode24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat20.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withIgnoreEmptyLines();
        boolean boolean34 = cSVFormat33.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeader(resultSet35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray43 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat33.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat27.withHeaderComments((java.lang.Object[]) strArray43);
        java.lang.String str48 = cSVFormat16.format((java.lang.Object[]) strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat8.withHeader(strArray43);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat49 and cSVFormat50", cSVFormat49.equals(cSVFormat50) ? cSVFormat49.hashCode() == cSVFormat50.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withEscape('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat16", cSVFormat15.equals(cSVFormat16) ? cSVFormat15.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        char char11 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat15", cSVFormat9.equals(cSVFormat15) ? cSVFormat9.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withHeader(resultSetMetaData17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withHeader(resultSetMetaData21);
        char char23 = cSVFormat22.getDelimiter();
        boolean boolean24 = cSVFormat8.equals((java.lang.Object) char23);
        boolean boolean25 = cSVFormat8.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String str27 = cSVFormat26.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape('#');
        java.lang.Character char8 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean13 = cSVFormat12.isQuoteCharacterSet();
        boolean boolean14 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuoteMode(quoteMode15);
        boolean boolean17 = cSVFormat4.equals((java.lang.Object) cSVFormat16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat4.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat18", cSVFormat2.equals(cSVFormat18) ? cSVFormat2.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withEscape('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat8", cSVFormat1.equals(cSVFormat8) ? cSVFormat1.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord();
        java.lang.String[] strArray9 = cSVFormat5.getHeader();
        java.lang.Character char10 = cSVFormat5.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat11", cSVFormat5.equals(cSVFormat11) ? cSVFormat5.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape('#');
        java.lang.Character char8 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean13 = cSVFormat12.isQuoteCharacterSet();
        boolean boolean14 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuoteMode(quoteMode15);
        boolean boolean17 = cSVFormat4.equals((java.lang.Object) cSVFormat16);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass19 = cSVFormat18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat18", cSVFormat2.equals(cSVFormat18) ? cSVFormat2.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat8", cSVFormat1.equals(cSVFormat8) ? cSVFormat1.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        java.lang.String str23 = cSVFormat22.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat28 and cSVFormat30", cSVFormat28.equals(cSVFormat30) ? cSVFormat28.hashCode() == cSVFormat30.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        boolean boolean16 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withDelimiter('4');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Character char15 = cSVFormat14.getEscapeCharacter();
        boolean boolean16 = cSVFormat14.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withIgnoreEmptyLines();
        boolean boolean22 = cSVFormat21.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat21.withCommentMarker(' ');
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreEmptyLines();
        boolean boolean38 = cSVFormat37.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withQuoteMode(quoteMode41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat37.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withIgnoreEmptyLines();
        boolean boolean51 = cSVFormat50.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withHeader(resultSet52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat50.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat44.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat32.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat28.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat18.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat13.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat69", cSVFormat13.equals(cSVFormat69) ? cSVFormat13.hashCode() == cSVFormat69.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        boolean boolean11 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat0.equals((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuote(',');
        boolean boolean15 = cSVFormat9.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeader(resultSetMetaData21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat20", cSVFormat9.equals(cSVFormat20) ? cSVFormat9.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        boolean boolean7 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean8 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat13 };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat3.withHeaderComments(objArray15);
        java.sql.ResultSet resultSet17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(resultSet17);
        java.lang.String str19 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.String str23 = cSVFormat20.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray30 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withHeader(strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat26.withIgnoreHeaderCase(false);
        boolean boolean34 = cSVFormat26.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat26.withAllowMissingColumnNames();
        boolean boolean36 = cSVFormat35.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        boolean boolean40 = cSVFormat39.getSkipHeaderRecord();
        char char41 = cSVFormat39.getDelimiter();
        char char42 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withIgnoreEmptyLines();
        boolean boolean49 = cSVFormat48.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat48.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat48.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withIgnoreEmptyLines();
        boolean boolean62 = cSVFormat61.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet63 = null;
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withHeader(resultSet63);
        org.apache.commons.csv.CSVFormat cSVFormat66 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat66.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat67.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat67.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray71 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat67.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat61.withHeader(strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat58.withHeaderComments((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat55.withHeaderComments((java.lang.Object[]) strArray71);
        java.lang.String str76 = cSVFormat44.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat35.withHeader(strArray71);
        java.lang.String str78 = cSVFormat20.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat3.withHeader(strArray71);
        java.lang.String str80 = cSVFormat1.format((java.lang.Object[]) strArray71);
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat1.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat81", cSVFormat1.equals(cSVFormat81) ? cSVFormat1.hashCode() == cSVFormat81.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean6 = cSVFormat5.getSkipHeaderRecord();
        char char7 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreEmptyLines();
        boolean boolean11 = cSVFormat10.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('a');
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSetMetaData16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator('a');
        java.lang.Character char20 = cSVFormat17.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray24 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withHeaderComments(objArray24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray29 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withHeaderComments(objArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat27.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray45 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withHeaderComments(objArray45);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat38.withHeaderComments(objArray45);
        java.lang.String[] strArray52 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat38.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat32.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat17.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat5.withHeader(strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat1.withHeader(strArray52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat2", cSVFormat1.equals(cSVFormat2) ? cSVFormat1.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withHeader(resultSetMetaData17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withHeader(resultSetMetaData21);
        char char23 = cSVFormat22.getDelimiter();
        boolean boolean24 = cSVFormat8.equals((java.lang.Object) char23);
        boolean boolean25 = cSVFormat8.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat8.withQuoteMode(quoteMode27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withNullString("0");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat6", cSVFormat5.equals(cSVFormat6) ? cSVFormat5.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments((java.lang.Object[]) strArray9);
        boolean boolean12 = cSVFormat2.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(true);
        boolean boolean17 = cSVFormat14.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat16", cSVFormat14.equals(cSVFormat16) ? cSVFormat14.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean37 = cSVFormat36.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat36", cSVFormat0.equals(cSVFormat36) ? cSVFormat0.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        boolean boolean20 = cSVFormat18.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        boolean boolean10 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) "0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat2.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat2.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentMarker((java.lang.Character) ' ');
        boolean boolean7 = cSVFormat2.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat2.withQuoteMode(quoteMode12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withQuote('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withDelimiter('4');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Character char15 = cSVFormat14.getEscapeCharacter();
        boolean boolean16 = cSVFormat14.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withIgnoreEmptyLines();
        boolean boolean22 = cSVFormat21.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat21.withCommentMarker(' ');
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreEmptyLines();
        boolean boolean38 = cSVFormat37.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withQuoteMode(quoteMode41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat37.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withIgnoreEmptyLines();
        boolean boolean51 = cSVFormat50.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withHeader(resultSet52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat50.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat44.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat32.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat28.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat18.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat13.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat69.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat69", cSVFormat13.equals(cSVFormat69) ? cSVFormat13.hashCode() == cSVFormat69.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(false);
        java.lang.String str17 = cSVFormat14.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat21", cSVFormat14.equals(cSVFormat21) ? cSVFormat14.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        char char11 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat15", cSVFormat9.equals(cSVFormat15) ? cSVFormat9.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat10.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        java.lang.Character char12 = cSVFormat9.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreEmptyLines(true);
        boolean boolean4 = cSVFormat3.getIgnoreHeaderCase();
        boolean boolean5 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat6", cSVFormat3.equals(cSVFormat6) ? cSVFormat3.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape(' ');
        boolean boolean31 = cSVFormat28.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withIgnoreHeaderCase();
        char char34 = cSVFormat33.getDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat33", cSVFormat6.equals(cSVFormat33) ? cSVFormat6.hashCode() == cSVFormat33.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces();
        boolean boolean13 = cSVFormat12.getIgnoreEmptyLines();
        java.lang.String str14 = cSVFormat12.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withEscape((java.lang.Character) ',');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat18", cSVFormat12.equals(cSVFormat18) ? cSVFormat12.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withHeaderComments((java.lang.Object[]) strArray28);
        java.sql.ResultSetMetaData resultSetMetaData31 = null;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withHeader(resultSetMetaData31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withHeader(resultSetMetaData34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat33", cSVFormat1.equals(cSVFormat33) ? cSVFormat1.hashCode() == cSVFormat33.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSetMetaData9);
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat10.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat19", cSVFormat1.equals(cSVFormat19) ? cSVFormat1.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeaderComments(objArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat47", cSVFormat2.equals(cSVFormat47) ? cSVFormat2.hashCode() == cSVFormat47.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.QuoteMode quoteMode8 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withQuote('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withHeader(resultSet7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withRecordSeparator("0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withCommentMarker('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat10", cSVFormat2.equals(cSVFormat10) ? cSVFormat2.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentMarker((java.lang.Character) ' ');
        boolean boolean7 = cSVFormat2.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode12 = cSVFormat11.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Character char3 = cSVFormat0.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withIgnoreHeaderCase(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat16", cSVFormat15.equals(cSVFormat16) ? cSVFormat15.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreEmptyLines();
        boolean boolean5 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.lang.String str6 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass8 = cSVFormat3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        java.lang.Character char11 = cSVFormat9.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray15 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withHeaderComments(objArray15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray31 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withHeaderComments(objArray31);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat24.withHeaderComments(objArray31);
        java.lang.String[] strArray38 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat24.withHeader(strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat18.withHeaderComments((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray38);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withDelimiter('\\');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withIgnoreHeaderCase(true);
        java.lang.String str46 = cSVFormat41.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat45", cSVFormat9.equals(cSVFormat45) ? cSVFormat9.hashCode() == cSVFormat45.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces();
        boolean boolean13 = cSVFormat12.getIgnoreEmptyLines();
        java.lang.String str14 = cSVFormat12.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat12.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass19 = cSVFormat12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat18", cSVFormat12.equals(cSVFormat18) ? cSVFormat12.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        java.lang.String str23 = cSVFormat22.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode31 = cSVFormat30.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat28 and cSVFormat30", cSVFormat28.equals(cSVFormat30) ? cSVFormat28.hashCode() == cSVFormat30.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape('#');
        java.lang.Character char8 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        boolean boolean19 = cSVFormat18.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSetMetaData resultSetMetaData24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withHeader(resultSetMetaData24);
        org.apache.commons.csv.QuoteMode quoteMode26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuoteMode(quoteMode26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat.Predefined predefined29 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat30 = predefined29.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat31 = predefined29.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat32 = predefined29.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withRecordSeparator("Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:false");
        java.sql.ResultSetMetaData resultSetMetaData35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withHeader(resultSetMetaData35);
        boolean boolean37 = cSVFormat34.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withIgnoreEmptyLines();
        boolean boolean41 = cSVFormat40.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode44 = null;
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withQuoteMode(quoteMode44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat40.withCommentMarker(' ');
        boolean boolean48 = cSVFormat40.isQuoteCharacterSet();
        boolean boolean50 = cSVFormat40.equals((java.lang.Object) "0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withHeader(resultSet52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat53.withHeaderComments((java.lang.Object[]) strArray60);
        java.lang.String str63 = cSVFormat40.format((java.lang.Object[]) strArray60);
        java.lang.String str64 = cSVFormat34.format((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat28.withHeader(strArray60);
        java.lang.String str66 = cSVFormat15.format((java.lang.Object[]) strArray60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreHeaderCase();
        boolean boolean14 = cSVFormat12.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat13", cSVFormat10.equals(cSVFormat13) ? cSVFormat10.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        java.lang.String str11 = cSVFormat9.getRecordSeparator();
        boolean boolean12 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        java.lang.String[] strArray14 = cSVFormat9.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat17", cSVFormat10.equals(cSVFormat17) ? cSVFormat10.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withQuote((java.lang.Character) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat11", cSVFormat10.equals(cSVFormat11) ? cSVFormat10.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator(',');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray4 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withHeaderComments(objArray4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape((java.lang.Character) ' ');
        boolean boolean10 = cSVFormat9.isCommentMarkerSet();
        boolean boolean11 = cSVFormat9.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat0.equals((java.lang.Object) cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuote(',');
        boolean boolean15 = cSVFormat9.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat9.withCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat9.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withEscape((java.lang.Character) '\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat20", cSVFormat9.equals(cSVFormat20) ? cSVFormat9.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        boolean boolean15 = cSVFormat12.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        java.lang.Character char27 = cSVFormat26.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape((java.lang.Character) ' ');
        char char22 = cSVFormat21.getDelimiter();
        char char23 = cSVFormat21.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withQuoteMode(quoteMode24);
        boolean boolean26 = cSVFormat25.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.QuoteMode quoteMode29 = cSVFormat28.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreEmptyLines();
        boolean boolean35 = cSVFormat34.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withHeader(resultSet36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat31.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat25.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withDelimiter('4');
        boolean boolean52 = cSVFormat51.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat51.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat51 and cSVFormat53", cSVFormat51.equals(cSVFormat53) ? cSVFormat51.hashCode() == cSVFormat53.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean7 = cSVFormat2.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray26 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeaderComments(objArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat15.withHeaderComments(objArray26);
        java.lang.String str30 = cSVFormat12.format(objArray26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat12", cSVFormat9.equals(cSVFormat12) ? cSVFormat9.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(false);
        java.lang.String str17 = cSVFormat14.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreHeaderCase(true);
        boolean boolean22 = cSVFormat21.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat21", cSVFormat14.equals(cSVFormat21) ? cSVFormat14.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat11 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Character char17 = cSVFormat16.getEscapeCharacter();
        boolean boolean18 = cSVFormat16.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreEmptyLines();
        boolean boolean24 = cSVFormat23.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withQuoteMode(quoteMode27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat23.withCommentMarker(' ');
        java.lang.String[] strArray31 = cSVFormat30.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        boolean boolean40 = cSVFormat39.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat39.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withIgnoreEmptyLines();
        boolean boolean53 = cSVFormat52.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withHeader(resultSet54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat58.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat52.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat49.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat46.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat34.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat20.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat14.withHeaderComments((java.lang.Object[]) strArray62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat15", cSVFormat1.equals(cSVFormat15) ? cSVFormat1.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreHeaderCase(false);
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        java.lang.String[] strArray11 = cSVFormat9.getHeaderComments();
        boolean boolean12 = cSVFormat9.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass14 = cSVFormat13.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat13", cSVFormat2.equals(cSVFormat13) ? cSVFormat2.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuoteMode(quoteMode10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreEmptyLines();
        boolean boolean20 = cSVFormat19.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeader(resultSet21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat19.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat3.withHeader(strArray29);
        java.lang.String str35 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat3.withIgnoreHeaderCase();
        java.lang.String str37 = cSVFormat3.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat36", cSVFormat3.equals(cSVFormat36) ? cSVFormat3.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        java.lang.Character char8 = cSVFormat6.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat10", cSVFormat2.equals(cSVFormat10) ? cSVFormat2.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        boolean boolean10 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) "0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat2.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withNullString("Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("Delimiter=<\\> QuoteChar=<\t> NullString=<hi!> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments((java.lang.Object[]) strArray9);
        boolean boolean12 = cSVFormat2.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat2.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreHeaderCase(true);
        java.lang.String[] strArray17 = cSVFormat16.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat16", cSVFormat14.equals(cSVFormat16) ? cSVFormat14.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat9", cSVFormat3.equals(cSVFormat9) ? cSVFormat3.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat5.getQuoteMode();
        java.lang.String[] strArray7 = cSVFormat5.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        char char4 = cSVFormat2.getDelimiter();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat7.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withHeaderComments(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat23.withHeaderComments(objArray30);
        java.lang.String[] strArray37 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat23.withHeader(strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat23.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withAllowMissingColumnNames();
        java.lang.Character char44 = cSVFormat40.getEscapeCharacter();
        boolean boolean45 = cSVFormat40.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat53.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray60 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withHeaderComments(objArray60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat53.withHeaderComments(objArray60);
        java.lang.String[] strArray67 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat53.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat49.withHeaderComments((java.lang.Object[]) strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat40.withHeader(strArray67);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray67);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean13 = cSVFormat12.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat12", cSVFormat9.equals(cSVFormat12) ? cSVFormat9.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withDelimiter('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat11", cSVFormat7.equals(cSVFormat11) ? cSVFormat7.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat9", cSVFormat3.equals(cSVFormat9) ? cSVFormat3.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.QuoteMode quoteMode2 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.QuoteMode quoteMode1 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withNullString("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:true Header:[]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat4", cSVFormat2.equals(cSVFormat4) ? cSVFormat2.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        char char4 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat1.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray14 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withIgnoreHeaderCase(false);
        boolean boolean18 = cSVFormat10.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withAllowMissingColumnNames();
        boolean boolean20 = cSVFormat19.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withIgnoreEmptyLines();
        boolean boolean24 = cSVFormat23.getSkipHeaderRecord();
        char char25 = cSVFormat23.getDelimiter();
        char char26 = cSVFormat23.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreEmptyLines();
        boolean boolean33 = cSVFormat32.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withQuoteMode(quoteMode36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat32.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withIgnoreEmptyLines();
        boolean boolean46 = cSVFormat45.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet47 = null;
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withHeader(resultSet47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat50.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat51.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray55 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat45.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat42.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat39.withHeaderComments((java.lang.Object[]) strArray55);
        java.lang.String str60 = cSVFormat28.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat19.withHeader(strArray55);
        java.lang.String str62 = cSVFormat7.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass64 = cSVFormat63.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat63", cSVFormat2.equals(cSVFormat63) ? cSVFormat2.hashCode() == cSVFormat63.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withIgnoreEmptyLines();
        boolean boolean31 = cSVFormat30.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode34 = null;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat30.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withIgnoreEmptyLines();
        boolean boolean44 = cSVFormat43.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet45 = null;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat43.withHeader(resultSet45);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray53 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withHeader(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat43.withHeader(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat40.withHeaderComments((java.lang.Object[]) strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat37.withHeaderComments((java.lang.Object[]) strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat25.withHeader(strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat20.withHeaderComments((java.lang.Object[]) strArray53);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat61.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat61.withDelimiter('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat61 and cSVFormat62", cSVFormat61.equals(cSVFormat62) ? cSVFormat61.hashCode() == cSVFormat62.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        boolean boolean10 = cSVFormat2.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat2.equals((java.lang.Object) "0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSet14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withHeader(strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat2.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeaderComments(objArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat7.withIgnoreHeaderCase(true);
        boolean boolean48 = cSVFormat47.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat47", cSVFormat2.equals(cSVFormat47) ? cSVFormat2.hashCode() == cSVFormat47.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        java.lang.String str11 = cSVFormat9.getRecordSeparator();
        boolean boolean12 = cSVFormat9.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        java.lang.String str14 = cSVFormat13.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat13", cSVFormat9.equals(cSVFormat13) ? cSVFormat9.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '\t');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat14", cSVFormat12.equals(cSVFormat14) ? cSVFormat12.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass6 = cSVFormat5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator('a');
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('a');
        java.lang.Character char12 = cSVFormat9.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '#');
        boolean boolean17 = cSVFormat14.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreHeaderCase();
        java.lang.String str19 = cSVFormat14.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat18", cSVFormat7.equals(cSVFormat18) ? cSVFormat7.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.Character char6 = cSVFormat4.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreEmptyLines();
        boolean boolean15 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withQuoteMode(quoteMode18);
        org.apache.commons.csv.QuoteMode quoteMode20 = cSVFormat19.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withIgnoreSurroundingSpaces(true);
        boolean boolean23 = cSVFormat7.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withQuote('#');
        java.lang.Character char26 = cSVFormat19.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withNullString("a\nahi!aDelimiter=<a> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreHeaderCase();
        boolean boolean30 = cSVFormat29.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat28 and cSVFormat29", cSVFormat28.equals(cSVFormat29) ? cSVFormat28.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withIgnoreHeaderCase(true);
        java.lang.String str16 = cSVFormat10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        java.lang.String str12 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreEmptyLines();
        boolean boolean18 = cSVFormat17.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withQuoteMode(quoteMode21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat17.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeaderComments(objArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat17.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat17.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat48.withIgnoreEmptyLines();
        boolean boolean50 = cSVFormat49.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat49.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode53 = null;
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withQuoteMode(quoteMode53);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat49.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat60.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat60.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray67 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat65.withHeaderComments(objArray67);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat60.withHeaderComments(objArray67);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat60.withHeader(strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat49.withHeader(strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat76.withIgnoreHeaderCase(false);
        java.lang.String[] strArray79 = cSVFormat78.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat46.withHeader(strArray79);
        java.lang.String str81 = cSVFormat1.format((java.lang.Object[]) strArray79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat14", cSVFormat1.equals(cSVFormat14) ? cSVFormat1.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        boolean boolean40 = cSVFormat39.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode43 = null;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat39.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat39.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withIgnoreEmptyLines();
        boolean boolean53 = cSVFormat52.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat52.withHeader(resultSet54);
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat57.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat58.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray62 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat58.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat52.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat49.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat46.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat34.withHeader(strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat29.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray62);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat69.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode71 = cSVFormat70.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat70", cSVFormat2.equals(cSVFormat70) ? cSVFormat2.hashCode() == cSVFormat70.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        boolean boolean7 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuoteMode(quoteMode10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreEmptyLines();
        boolean boolean20 = cSVFormat19.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet21 = null;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeader(resultSet21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat19.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat16.withHeaderComments((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat3.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreHeaderCase();
        boolean boolean40 = cSVFormat38.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat38 and cSVFormat39", cSVFormat38.equals(cSVFormat39) ? cSVFormat38.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withHeaderComments((java.lang.Object[]) strArray28);
        boolean boolean31 = cSVFormat10.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat10.withIgnoreHeaderCase(true);
        java.lang.Character char34 = cSVFormat10.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat33", cSVFormat1.equals(cSVFormat33) ? cSVFormat1.hashCode() == cSVFormat33.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withDelimiter('4');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Character char15 = cSVFormat14.getEscapeCharacter();
        boolean boolean16 = cSVFormat14.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withIgnoreEmptyLines();
        boolean boolean22 = cSVFormat21.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat21.withCommentMarker(' ');
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreEmptyLines();
        boolean boolean38 = cSVFormat37.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withQuoteMode(quoteMode41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat37.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withIgnoreEmptyLines();
        boolean boolean51 = cSVFormat50.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withHeader(resultSet52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat50.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat44.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat32.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat28.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat18.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat13.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<Delimiter=<a> RecordSeparator=< > SkipHeaderRecord:false> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat69", cSVFormat13.equals(cSVFormat69) ? cSVFormat13.hashCode() == cSVFormat69.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withQuote((java.lang.Character) '\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        boolean boolean6 = cSVFormat1.isCommentMarkerSet();
        boolean boolean7 = cSVFormat1.getIgnoreHeaderCase();
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat10", cSVFormat1.equals(cSVFormat10) ? cSVFormat1.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("0");
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase(true);
        boolean boolean11 = cSVFormat8.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        boolean boolean6 = cSVFormat1.isCommentMarkerSet();
        boolean boolean7 = cSVFormat1.getIgnoreHeaderCase();
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat10", cSVFormat1.equals(cSVFormat10) ? cSVFormat1.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreHeaderCase();
        boolean boolean35 = cSVFormat33.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat33 and cSVFormat34", cSVFormat33.equals(cSVFormat34) ? cSVFormat33.hashCode() == cSVFormat34.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray24 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withHeaderComments(objArray24);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withHeaderComments(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat33.withHeaderComments(objArray40);
        java.lang.String[] strArray47 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat33.withHeader(strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat27.withHeaderComments((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat17.withHeaderComments((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat15", cSVFormat12.equals(cSVFormat15) ? cSVFormat12.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        boolean boolean7 = cSVFormat5.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withCommentMarker(' ');
        java.lang.String[] strArray10 = cSVFormat9.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat8.withHeader(resultSetMetaData16);
        java.lang.String str18 = cSVFormat17.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withCommentMarker(' ');
        java.lang.String str22 = cSVFormat19.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray29 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withHeader(strArray29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat25.withIgnoreHeaderCase(false);
        boolean boolean33 = cSVFormat25.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat25.withAllowMissingColumnNames();
        boolean boolean35 = cSVFormat34.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withIgnoreEmptyLines();
        boolean boolean39 = cSVFormat38.getSkipHeaderRecord();
        char char40 = cSVFormat38.getDelimiter();
        char char41 = cSVFormat38.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat38.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withIgnoreEmptyLines();
        boolean boolean48 = cSVFormat47.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode51 = null;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withQuoteMode(quoteMode51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat47.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat55.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withIgnoreEmptyLines();
        boolean boolean61 = cSVFormat60.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet62 = null;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat60.withHeader(resultSet62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat65.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat66.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat66.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray70 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat66.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat60.withHeader(strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat57.withHeaderComments((java.lang.Object[]) strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat74 = cSVFormat54.withHeaderComments((java.lang.Object[]) strArray70);
        java.lang.String str75 = cSVFormat43.format((java.lang.Object[]) strArray70);
        org.apache.commons.csv.CSVFormat cSVFormat76 = cSVFormat34.withHeader(strArray70);
        java.lang.String str77 = cSVFormat19.format((java.lang.Object[]) strArray70);
        java.lang.String str78 = cSVFormat17.format((java.lang.Object[]) strArray70);
        java.lang.String str79 = cSVFormat6.format((java.lang.Object[]) strArray70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreHeaderCase();
        boolean boolean9 = cSVFormat2.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        boolean boolean6 = cSVFormat5.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:false");
        boolean boolean15 = cSVFormat1.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withAllowMissingColumnNames();
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(resultSetMetaData17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode20 = cSVFormat19.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat19", cSVFormat14.equals(cSVFormat19) ? cSVFormat14.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray20 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withHeaderComments(objArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeaderComments(objArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat2.withHeader(strArray27);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuote((java.lang.Character) '\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat32", cSVFormat2.equals(cSVFormat32) ? cSVFormat2.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreEmptyLines();
        boolean boolean5 = cSVFormat3.getIgnoreSurroundingSpaces();
        java.lang.String str6 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray14 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withIgnoreSurroundingSpaces();
        boolean boolean21 = cSVFormat20.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray25 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeaderComments(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat23.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat23.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray40 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withHeaderComments(objArray40);
        java.lang.String str42 = cSVFormat34.format(objArray40);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat20.withHeaderComments(objArray40);
        java.lang.String str44 = cSVFormat7.format(objArray40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withEscape('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("#-1.0#a1.0a#Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false#");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat5", cSVFormat4.equals(cSVFormat5) ? cSVFormat4.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withRecordSeparator('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray13 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat2.withHeaderComments(objArray13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuoteMode(quoteMode20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat19", cSVFormat2.equals(cSVFormat19) ? cSVFormat2.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat16", cSVFormat12.equals(cSVFormat16) ? cSVFormat12.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withHeader(resultSet18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat21.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray26 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray26);
        boolean boolean29 = cSVFormat19.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat19.withAllowMissingColumnNames(true);
        org.apache.commons.csv.QuoteMode quoteMode32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat19.withQuoteMode(quoteMode32);
        org.apache.commons.csv.CSVFormat.Predefined predefined34 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat35 = predefined34.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat36 = predefined34.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat37 = predefined34.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withEscape((java.lang.Character) ' ');
        boolean boolean40 = cSVFormat39.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat47.withIgnoreEmptyLines();
        boolean boolean49 = cSVFormat48.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withAllowMissingColumnNames(false);
        boolean boolean52 = cSVFormat45.equals((java.lang.Object) cSVFormat48);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat48.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray58 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withHeaderComments(objArray58);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat56.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData64 = null;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat56.withHeader(resultSetMetaData64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat67.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat68.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat69.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat69.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat74 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray76 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat74.withHeaderComments(objArray76);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat69.withHeaderComments(objArray76);
        java.lang.String[] strArray83 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat84 = cSVFormat69.withHeader(strArray83);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat65.withHeaderComments((java.lang.Object[]) strArray83);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat48.withHeader(strArray83);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat39.withHeader(strArray83);
        java.lang.String str88 = cSVFormat33.format((java.lang.Object[]) strArray83);
        java.lang.String str89 = cSVFormat10.format((java.lang.Object[]) strArray83);
        org.apache.commons.csv.CSVFormat cSVFormat90 = cSVFormat10.withIgnoreHeaderCase();
        boolean boolean91 = cSVFormat90.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat90", cSVFormat10.equals(cSVFormat90) ? cSVFormat10.hashCode() == cSVFormat90.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator("hi!");
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withEscape((java.lang.Character) ' ');
        char char22 = cSVFormat21.getDelimiter();
        char char23 = cSVFormat21.getDelimiter();
        org.apache.commons.csv.QuoteMode quoteMode24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat21.withQuoteMode(quoteMode24);
        boolean boolean26 = cSVFormat25.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.QuoteMode quoteMode29 = cSVFormat28.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreEmptyLines();
        boolean boolean35 = cSVFormat34.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withHeader(resultSet36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray44 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat34.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat31.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat25.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat15.withHeaderComments((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat49.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat49.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat49.withIgnoreHeaderCase();
        java.lang.String str55 = cSVFormat49.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat15 and cSVFormat54", cSVFormat15.equals(cSVFormat54) ? cSVFormat15.hashCode() == cSVFormat54.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode27 = cSVFormat20.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat26", cSVFormat3.equals(cSVFormat26) ? cSVFormat3.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeaderComments(objArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean48 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat47", cSVFormat2.equals(cSVFormat47) ? cSVFormat2.hashCode() == cSVFormat47.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentMarker((java.lang.Character) ' ');
        boolean boolean7 = cSVFormat2.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(true);
        boolean boolean13 = cSVFormat12.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat12", cSVFormat10.equals(cSVFormat12) ? cSVFormat10.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        java.lang.Object obj10 = null;
        boolean boolean11 = cSVFormat9.equals(obj10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withNullString("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withIgnoreHeaderCase();
        boolean boolean21 = cSVFormat13.equals((java.lang.Object) cSVFormat20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat20", cSVFormat2.equals(cSVFormat20) ? cSVFormat2.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        java.sql.ResultSet resultSet23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withHeader(resultSet23);
        java.lang.String[] strArray25 = cSVFormat22.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withRecordSeparator("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:true");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreHeaderCase();
        java.lang.Character char17 = cSVFormat11.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat16", cSVFormat11.equals(cSVFormat16) ? cSVFormat11.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        java.lang.String[] strArray14 = cSVFormat13.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray17 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withHeaderComments(objArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData23 = null;
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat15.withHeader(resultSetMetaData23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withHeaderComments(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeaderComments(objArray35);
        java.lang.String[] strArray42 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat28.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat24.withHeaderComments((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat7.withIgnoreHeaderCase(true);
        java.lang.String[] strArray48 = cSVFormat7.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat47", cSVFormat2.equals(cSVFormat47) ? cSVFormat2.hashCode() == cSVFormat47.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withEscape('#');
        java.lang.Character char8 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withEscape((java.lang.Character) ',');
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withCommentMarker(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat15", cSVFormat10.equals(cSVFormat15) ? cSVFormat10.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withIgnoreHeaderCase();
        java.lang.String[] strArray32 = cSVFormat31.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat31", cSVFormat6.equals(cSVFormat31) ? cSVFormat6.hashCode() == cSVFormat31.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass37 = cSVFormat36.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat36", cSVFormat0.equals(cSVFormat36) ? cSVFormat0.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat16", cSVFormat11.equals(cSVFormat16) ? cSVFormat11.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withHeaderComments((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat34.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat35", cSVFormat13.equals(cSVFormat35) ? cSVFormat13.hashCode() == cSVFormat35.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        java.lang.String[] strArray5 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withDelimiter('4');
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Character char15 = cSVFormat14.getEscapeCharacter();
        boolean boolean16 = cSVFormat14.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withIgnoreEmptyLines();
        boolean boolean22 = cSVFormat21.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withQuoteMode(quoteMode25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat21.withCommentMarker(' ');
        java.lang.String[] strArray29 = cSVFormat28.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreEmptyLines();
        boolean boolean38 = cSVFormat37.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode41 = null;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withQuoteMode(quoteMode41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat37.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withIgnoreEmptyLines();
        boolean boolean51 = cSVFormat50.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet52 = null;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat50.withHeader(resultSet52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat55.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat56.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray60 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat56.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat50.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat44.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat32.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat28.withHeaderComments((java.lang.Object[]) strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat18.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat13.withHeader(strArray60);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat13.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData70 = null;
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat69.withHeader(resultSetMetaData70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat69", cSVFormat13.equals(cSVFormat69) ? cSVFormat13.hashCode() == cSVFormat69.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.String str37 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat36", cSVFormat0.equals(cSVFormat36) ? cSVFormat0.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat5.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withQuoteMode(quoteMode11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat10", cSVFormat2.equals(cSVFormat10) ? cSVFormat2.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat0.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat36", cSVFormat0.equals(cSVFormat36) ? cSVFormat0.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('#');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withIgnoreEmptyLines();
        boolean boolean15 = cSVFormat14.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withQuoteMode(quoteMode18);
        org.apache.commons.csv.QuoteMode quoteMode20 = cSVFormat19.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withIgnoreSurroundingSpaces(true);
        boolean boolean23 = cSVFormat7.equals((java.lang.Object) cSVFormat19);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withQuote('#');
        java.lang.Character char26 = cSVFormat19.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withNullString("a\nahi!aDelimiter=<a> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withIgnoreHeaderCase();
        boolean boolean30 = cSVFormat28.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat28 and cSVFormat29", cSVFormat28.equals(cSVFormat29) ? cSVFormat28.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord();
        java.lang.String[] strArray9 = cSVFormat5.getHeader();
        java.lang.Character char10 = cSVFormat5.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass12 = cSVFormat5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat11", cSVFormat5.equals(cSVFormat11) ? cSVFormat5.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("Delimiter=<a> CommentStart=<4> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        java.lang.Object[] objArray8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withHeaderComments(objArray8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape('4');
        java.lang.Character char11 = cSVFormat10.getEscapeCharacter();
        org.apache.commons.csv.QuoteMode quoteMode12 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreHeaderCase();
        java.lang.String str20 = cSVFormat18.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat19", cSVFormat10.equals(cSVFormat19) ? cSVFormat10.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withEscape('4');
        java.lang.String[] strArray8 = cSVFormat2.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        boolean boolean12 = cSVFormat11.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat11", cSVFormat3.equals(cSVFormat11) ? cSVFormat3.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter(' ');
        boolean boolean7 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.Character char9 = cSVFormat4.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat8", cSVFormat1.equals(cSVFormat8) ? cSVFormat1.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode12 = cSVFormat11.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        boolean boolean12 = cSVFormat9.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat6.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat6", cSVFormat2.equals(cSVFormat6) ? cSVFormat2.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        boolean boolean26 = cSVFormat25.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withHeader(resultSet27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat25.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat7.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat4.withHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat4.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat42", cSVFormat1.equals(cSVFormat42) ? cSVFormat1.hashCode() == cSVFormat42.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withIgnoreHeaderCase(true);
        boolean boolean37 = cSVFormat34.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat34 and cSVFormat36", cSVFormat34.equals(cSVFormat36) ? cSVFormat34.hashCode() == cSVFormat36.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        boolean boolean19 = cSVFormat3.isCommentMarkerSet();
        boolean boolean20 = cSVFormat3.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean22 = cSVFormat21.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat21", cSVFormat3.equals(cSVFormat21) ? cSVFormat3.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0d), 1.0f, cSVFormat11 };
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withHeaderComments(objArray13);
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withHeader(resultSet15);
        java.lang.String str17 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        java.lang.String str21 = cSVFormat18.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray28 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat24.withIgnoreHeaderCase(false);
        boolean boolean32 = cSVFormat24.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat24.withAllowMissingColumnNames();
        boolean boolean34 = cSVFormat33.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat36.withIgnoreEmptyLines();
        boolean boolean38 = cSVFormat37.getSkipHeaderRecord();
        char char39 = cSVFormat37.getDelimiter();
        char char40 = cSVFormat37.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat45.withIgnoreEmptyLines();
        boolean boolean47 = cSVFormat46.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode50 = null;
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat46.withQuoteMode(quoteMode50);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat46.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withIgnoreEmptyLines();
        boolean boolean60 = cSVFormat59.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet61 = null;
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withHeader(resultSet61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat64.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat65.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat65.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray69 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat65.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat59.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat56.withHeaderComments((java.lang.Object[]) strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat53.withHeaderComments((java.lang.Object[]) strArray69);
        java.lang.String str74 = cSVFormat42.format((java.lang.Object[]) strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat33.withHeader(strArray69);
        java.lang.String str76 = cSVFormat18.format((java.lang.Object[]) strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat1.withHeader(strArray69);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat77.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat79 = cSVFormat77.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat77.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat77 and cSVFormat79", cSVFormat77.equals(cSVFormat79) ? cSVFormat77.hashCode() == cSVFormat79.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        org.apache.commons.csv.QuoteMode quoteMode27 = cSVFormat22.getQuoteMode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreHeaderCase();
        boolean boolean11 = cSVFormat9.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat10", cSVFormat7.equals(cSVFormat10) ? cSVFormat7.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withHeaderComments(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments(objArray19);
        java.lang.String[] strArray26 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat12.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat6.withIgnoreHeaderCase();
        boolean boolean30 = cSVFormat6.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat29", cSVFormat6.equals(cSVFormat29) ? cSVFormat6.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withRecordSeparator("0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat10.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat10", cSVFormat2.equals(cSVFormat10) ? cSVFormat2.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean1 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray5 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray28);
        java.lang.String str31 = cSVFormat0.format((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat0.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withIgnoreSurroundingSpaces();
        boolean boolean35 = cSVFormat33.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat33.withCommentMarker('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat33 and cSVFormat37", cSVFormat33.equals(cSVFormat37) ? cSVFormat33.hashCode() == cSVFormat37.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withHeader(resultSetMetaData9);
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat10.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat10.withNullString("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat10.withIgnoreHeaderCase();
        boolean boolean20 = cSVFormat19.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat19", cSVFormat1.equals(cSVFormat19) ? cSVFormat1.hashCode() == cSVFormat19.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        java.lang.String str23 = cSVFormat22.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withRecordSeparator("Delimiter=<a> SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withRecordSeparator('\\');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat28 and cSVFormat30", cSVFormat28.equals(cSVFormat30) ? cSVFormat28.hashCode() == cSVFormat30.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator('a');
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('a');
        java.lang.Character char12 = cSVFormat9.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '#');
        boolean boolean17 = cSVFormat14.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass19 = cSVFormat18.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat18", cSVFormat7.equals(cSVFormat18) ? cSVFormat7.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSet13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat11.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray21);
        java.sql.ResultSet resultSet25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat3.withHeader(resultSet25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withHeader(resultSetMetaData29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withIgnoreHeaderCase(true);
        java.lang.Character char33 = cSVFormat28.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat32", cSVFormat3.equals(cSVFormat32) ? cSVFormat3.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase(true);
        boolean boolean4 = cSVFormat3.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat3", cSVFormat1.equals(cSVFormat3) ? cSVFormat1.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.QuoteMode quoteMode2 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withCommentMarker('a');
        org.apache.commons.csv.QuoteMode quoteMode5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuoteMode(quoteMode5);
        boolean boolean7 = cSVFormat6.isNullStringSet();
        java.lang.String[] strArray8 = cSVFormat6.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker(',');
        java.lang.String str11 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat6.withIgnoreHeaderCase(true);
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSetMetaData14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat4 and cSVFormat13", cSVFormat4.equals(cSVFormat13) ? cSVFormat4.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        char char4 = cSVFormat2.getDelimiter();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowMissingColumnNames(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.getIgnoreSurroundingSpaces();
        boolean boolean5 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSet13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray21 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat11.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray21);
        java.sql.ResultSet resultSet25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat3.withHeader(resultSet25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat3.withAllowMissingColumnNames(true);
        java.sql.ResultSetMetaData resultSetMetaData29 = null;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withHeader(resultSetMetaData29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker((java.lang.Character) '\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat32", cSVFormat3.equals(cSVFormat32) ? cSVFormat3.hashCode() == cSVFormat32.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreEmptyLines(true);
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        java.lang.String[] strArray11 = cSVFormat9.getHeaderComments();
        org.apache.commons.csv.QuoteMode quoteMode12 = cSVFormat9.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withEscape('#');
        boolean boolean26 = cSVFormat25.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean28 = cSVFormat27.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray32 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withHeaderComments(objArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray48 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withHeaderComments(objArray48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat41.withHeaderComments(objArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat41.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat35.withHeaderComments((java.lang.Object[]) strArray55);
        java.lang.String str58 = cSVFormat27.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat25.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat13", cSVFormat1.equals(cSVFormat13) ? cSVFormat1.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        java.lang.String str7 = cSVFormat2.toString();
        org.apache.commons.csv.QuoteMode quoteMode8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withQuoteMode(quoteMode8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat11", cSVFormat2.equals(cSVFormat11) ? cSVFormat2.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        java.lang.String str8 = cSVFormat5.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.QuoteMode quoteMode3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat8.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat8.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat14", cSVFormat8.equals(cSVFormat14) ? cSVFormat8.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreHeaderCase(false);
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withNullString("Delimiter=<a> Escape=<4> QuoteChar=<4> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreHeaderCase(true);
        java.lang.String[] strArray15 = cSVFormat9.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat14", cSVFormat2.equals(cSVFormat14) ? cSVFormat2.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        java.lang.Character char14 = cSVFormat11.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreEmptyLines();
        boolean boolean9 = cSVFormat8.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreSurroundingSpaces(true);
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withHeader(resultSetMetaData14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withNullString("Delimiter=<a> EmptyLines:ignored SkipHeaderRecord:false");
        java.lang.Character char23 = cSVFormat19.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat19.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.EXCEL;
        boolean boolean27 = cSVFormat26.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray31 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withHeaderComments(objArray31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat29.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray47 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat45.withHeaderComments(objArray47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat40.withHeaderComments(objArray47);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat40.withHeader(strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat34.withHeaderComments((java.lang.Object[]) strArray54);
        java.lang.String str57 = cSVFormat26.format((java.lang.Object[]) strArray54);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat26.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withRecordSeparator("0hi!");
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat63.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat64.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat64.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray68 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat64.withHeader(strArray68);
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat61.withHeader(strArray68);
        java.lang.String str71 = cSVFormat19.format((java.lang.Object[]) strArray68);
        org.apache.commons.csv.CSVFormat cSVFormat72 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray68);
        org.apache.commons.csv.CSVFormat cSVFormat73 = cSVFormat5.withHeaderComments((java.lang.Object[]) strArray68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        boolean boolean8 = cSVFormat7.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        java.lang.String str10 = cSVFormat9.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat9", cSVFormat7.equals(cSVFormat9) ? cSVFormat7.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withNullString("Delimiter=<a> RecordSeparator=<4> EmptyLines:ignored SkipHeaderRecord:false HeaderComments:[, \n, hi!, Delimiter=<a> SkipHeaderRecord:true]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        java.lang.Object obj10 = null;
        boolean boolean11 = cSVFormat9.equals(obj10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withRecordSeparator('\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat14", cSVFormat7.equals(cSVFormat14) ? cSVFormat7.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        boolean boolean5 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase();
        java.lang.String str13 = cSVFormat9.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat12", cSVFormat9.equals(cSVFormat12) ? cSVFormat9.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.QuoteMode quoteMode1 = cSVFormat0.getQuoteMode();
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSet2);
        java.lang.String[] strArray4 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withHeaderComments(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withNullString("0");
        org.apache.commons.csv.QuoteMode quoteMode12 = cSVFormat11.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase(true);
        boolean boolean16 = cSVFormat0.equals((java.lang.Object) cSVFormat13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withEscape('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("\n");
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreEmptyLines();
        boolean boolean16 = cSVFormat15.getSkipHeaderRecord();
        char char17 = cSVFormat15.getDelimiter();
        char char18 = cSVFormat15.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat15.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withAllowMissingColumnNames();
        java.lang.String[] strArray26 = cSVFormat24.getHeader();
        boolean boolean27 = cSVFormat12.equals((java.lang.Object) cSVFormat24);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat38.withIgnoreSurroundingSpaces();
        boolean boolean42 = cSVFormat41.getIgnoreEmptyLines();
        java.lang.Character char43 = cSVFormat41.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat41.withDelimiter(' ');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat41.withDelimiter('\\');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat41.withIgnoreHeaderCase();
        boolean boolean49 = cSVFormat28.equals((java.lang.Object) cSVFormat41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat28", cSVFormat12.equals(cSVFormat28) ? cSVFormat12.hashCode() == cSVFormat28.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat8.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('4');
        char char10 = cSVFormat9.getDelimiter();
        char char11 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withRecordSeparator(' ');
        boolean boolean14 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false Header:[]");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        boolean boolean6 = cSVFormat1.isCommentMarkerSet();
        boolean boolean7 = cSVFormat1.getIgnoreHeaderCase();
        boolean boolean8 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withHeader(resultSet12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withHeader(strArray20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat13.withHeaderComments((java.lang.Object[]) strArray20);
        boolean boolean23 = cSVFormat13.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat13.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat13.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.apache.commons.csv.QuoteMode quoteMode31 = cSVFormat30.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat35.withIgnoreEmptyLines();
        boolean boolean37 = cSVFormat36.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat36.withHeader(resultSet38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat42.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray46 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat36.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat33.withHeader(strArray46);
        java.lang.String str50 = cSVFormat28.format((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat1.withHeader(strArray46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat10", cSVFormat1.equals(cSVFormat10) ? cSVFormat1.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat14", cSVFormat2.equals(cSVFormat14) ? cSVFormat2.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withEscape((java.lang.Character) ' ');
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String[] strArray11 = cSVFormat10.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat10", cSVFormat8.equals(cSVFormat10) ? cSVFormat8.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat2.isQuoteCharacterSet();
        char char7 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        boolean boolean14 = cSVFormat11.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        boolean boolean19 = cSVFormat3.isCommentMarkerSet();
        boolean boolean20 = cSVFormat3.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat23 and cSVFormat24", cSVFormat23.equals(cSVFormat24) ? cSVFormat23.hashCode() == cSVFormat24.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        boolean boolean2 = cSVFormat1.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass10 = cSVFormat7.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray10 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments(objArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat3.withHeader(strArray17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat26", cSVFormat2.equals(cSVFormat26) ? cSVFormat2.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray21 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withHeaderComments(objArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat14.withHeaderComments(objArray21);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat14.withHeader(strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat10.withHeaderComments((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat1.withHeader(strArray28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) '\t');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat6", cSVFormat3.equals(cSVFormat6) ? cSVFormat3.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withIgnoreHeaderCase(false);
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        java.lang.String[] strArray11 = cSVFormat9.getHeaderComments();
        boolean boolean12 = cSVFormat9.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat13", cSVFormat2.equals(cSVFormat13) ? cSVFormat2.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("0");
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat6.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuoteMode(quoteMode9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode19 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withQuoteMode(quoteMode19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.sql.ResultSetMetaData resultSetMetaData25 = null;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withHeader(resultSetMetaData25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray30 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withHeaderComments(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat28.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat28.withEscape((java.lang.Character) ' ');
        java.sql.ResultSetMetaData resultSetMetaData36 = null;
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat28.withHeader(resultSetMetaData36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat40.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat41.withCommentMarker('#');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray48 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat46.withHeaderComments(objArray48);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat41.withHeaderComments(objArray48);
        java.lang.String[] strArray55 = new java.lang.String[] { "", "\n", "hi!", "Delimiter=<a> SkipHeaderRecord:true" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat41.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat37.withHeaderComments((java.lang.Object[]) strArray55);
        java.lang.String str58 = cSVFormat24.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat22.withHeader(strArray55);
        java.lang.String str60 = cSVFormat59.toString();
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withIgnoreHeaderCase(true);
        boolean boolean63 = cSVFormat10.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat59 and cSVFormat62", cSVFormat59.equals(cSVFormat62) ? cSVFormat59.hashCode() == cSVFormat62.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withQuoteMode(quoteMode6);
        boolean boolean8 = cSVFormat7.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat9", cSVFormat2.equals(cSVFormat9) ? cSVFormat2.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat2.withHeaderComments((java.lang.Object[]) strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withQuote('#');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withRecordSeparator("\\");
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreHeaderCase(true);
        java.lang.String str22 = cSVFormat19.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat19 and cSVFormat21", cSVFormat19.equals(cSVFormat21) ? cSVFormat19.hashCode() == cSVFormat21.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreEmptyLines();
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withQuoteMode(quoteMode16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withIgnoreEmptyLines();
        boolean boolean26 = cSVFormat25.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withHeader(resultSet27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray35 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat25.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat7.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat4.withHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat4.withIgnoreHeaderCase();
        java.lang.Class<?> wildcardClass43 = cSVFormat4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat42", cSVFormat1.equals(cSVFormat42) ? cSVFormat1.hashCode() == cSVFormat42.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withCommentMarker(' ');
        boolean boolean8 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreEmptyLines(true);
        boolean boolean13 = cSVFormat12.getIgnoreHeaderCase();
        boolean boolean14 = cSVFormat12.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        boolean boolean16 = cSVFormat1.equals((java.lang.Object) cSVFormat12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat15", cSVFormat12.equals(cSVFormat15) ? cSVFormat12.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat9", cSVFormat8.equals(cSVFormat9) ? cSVFormat8.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray3 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withHeaderComments(objArray3);
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:true");
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat13", cSVFormat11.equals(cSVFormat13) ? cSVFormat11.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        char char4 = cSVFormat2.getDelimiter();
        char char5 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreEmptyLines();
        boolean boolean12 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withQuote('4');
        org.apache.commons.csv.QuoteMode quoteMode15 = null;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat11.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withIgnoreEmptyLines();
        boolean boolean25 = cSVFormat24.getIgnoreSurroundingSpaces();
        java.sql.ResultSet resultSet26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat24.withHeader(resultSet26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withEscape((java.lang.Character) '#');
        java.lang.String[] strArray34 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat30.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat24.withHeader(strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat21.withHeaderComments((java.lang.Object[]) strArray34);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat18.withHeaderComments((java.lang.Object[]) strArray34);
        java.lang.String str39 = cSVFormat7.format((java.lang.Object[]) strArray34);
        java.lang.String str40 = cSVFormat7.toString();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withIgnoreHeaderCase();
        java.lang.String[] strArray43 = cSVFormat42.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat41 and cSVFormat42", cSVFormat41.equals(cSVFormat42) ? cSVFormat41.hashCode() == cSVFormat42.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        boolean boolean2 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray9 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withHeaderComments(objArray9);
        boolean boolean11 = cSVFormat7.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withCommentMarker(' ');
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        boolean boolean15 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat13.withCommentMarker((java.lang.Character) '4');
        char char18 = cSVFormat17.getDelimiter();
        boolean boolean19 = cSVFormat5.equals((java.lang.Object) cSVFormat17);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat5.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Object[] objArray25 = new java.lang.Object[] { (byte) 0 };
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat23.withHeaderComments(objArray25);
        boolean boolean27 = cSVFormat23.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withIgnoreHeaderCase();
        boolean boolean31 = cSVFormat5.equals((java.lang.Object) cSVFormat29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat30", cSVFormat13.equals(cSVFormat30) ? cSVFormat13.hashCode() == cSVFormat30.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        boolean boolean11 = cSVFormat4.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withRecordSeparator('\"');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat13", cSVFormat2.equals(cSVFormat13) ? cSVFormat2.hashCode() == cSVFormat13.hashCode() : true);
    }
}

