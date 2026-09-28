package com.fasterxml.jackson.core.filter;

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
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        boolean boolean11 = filteringParserDelegate4.hasCurrentToken();
        boolean boolean12 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4.rootFilter = tokenFilter9;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, false, false);
        filteringParserDelegate14._allowMultipleMatches = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate14.canUseSchema(formatSchema17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.skipChildren();
        boolean boolean10 = filteringParserDelegate4.hasTokenId((int) ' ');
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken11;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter13, true, false);
        int int17 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean18 = filteringParserDelegate4._includePath;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        boolean boolean12 = filteringParserDelegate4.hasToken(jsonToken11);
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.isEnabled(feature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        int int10 = filteringParserDelegate4.getMatchCount();
        java.lang.String str11 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean11 = filteringParserDelegate4._includeImmediateParent;
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._includePath = true;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema15 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getCurrentToken();
        int int13 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.rootFilter;
        boolean boolean16 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._matchCount = (-1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(tokenFilter17);
        org.junit.Assert.assertNull(tokenFilter18);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        boolean boolean19 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int20 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext12 = filteringParserDelegate4._headContext;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, true);
        int int19 = filteringParserDelegate4._matchCount;
        boolean boolean20 = filteringParserDelegate4._includeImmediateParent;
        int int21 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate26 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser22, tokenFilter23, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken27 = null;
        boolean boolean28 = filteringParserDelegate26.hasToken(jsonToken27);
        java.io.Writer writer29 = null;
        int int30 = filteringParserDelegate26.releaseBuffered(writer29);
        com.fasterxml.jackson.core.JsonToken jsonToken31 = filteringParserDelegate26._currToken;
        filteringParserDelegate26._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken34 = filteringParserDelegate26.getCurrentToken();
        int int35 = filteringParserDelegate26.getFormatFeatures();
        boolean boolean36 = filteringParserDelegate26.isExpectedStartObjectToken();
        boolean boolean37 = filteringParserDelegate26.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser jsonParser38 = filteringParserDelegate26.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser39 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter40 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate43 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser39, tokenFilter40, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken44 = null;
        filteringParserDelegate43._lastClearedToken = jsonToken44;
        com.fasterxml.jackson.core.JsonToken jsonToken46 = filteringParserDelegate43.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken47 = filteringParserDelegate43._lastClearedToken;
        filteringParserDelegate43._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext50 = filteringParserDelegate43._headContext;
        filteringParserDelegate26._exposedContext = tokenFilterContext50;
        filteringParserDelegate4._headContext = tokenFilterContext50;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(jsonToken31);
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNull(jsonToken46);
        org.junit.Assert.assertNull(jsonToken47);
        org.junit.Assert.assertNotNull(tokenFilterContext50);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        java.io.Writer writer12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(writer12);
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int15 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.getCurrentToken();
        java.io.Writer writer17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(writer17);
        boolean boolean19 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        java.io.OutputStream outputStream11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(outputStream11);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        filteringParserDelegate4.rootFilter = tokenFilter13;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser12, tokenFilter13, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        boolean boolean18 = filteringParserDelegate16.hasToken(jsonToken17);
        filteringParserDelegate16._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser21, tokenFilter22, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken26 = filteringParserDelegate25._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = filteringParserDelegate25._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = filteringParserDelegate25.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate33 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser29, tokenFilter30, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = null;
        boolean boolean35 = filteringParserDelegate33.hasToken(jsonToken34);
        java.io.Writer writer36 = null;
        int int37 = filteringParserDelegate33.releaseBuffered(writer36);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = filteringParserDelegate33._currToken;
        filteringParserDelegate33._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken41 = filteringParserDelegate33.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext42 = filteringParserDelegate33._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter44 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate47 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser43, tokenFilter44, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken48 = null;
        boolean boolean49 = filteringParserDelegate47.hasToken(jsonToken48);
        java.io.Writer writer50 = null;
        int int51 = filteringParserDelegate47.releaseBuffered(writer50);
        com.fasterxml.jackson.core.JsonToken jsonToken52 = filteringParserDelegate47._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser53 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter54 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate57 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser53, tokenFilter54, false, false);
        java.io.Writer writer58 = null;
        int int59 = filteringParserDelegate57.releaseBuffered(writer58);
        boolean boolean60 = filteringParserDelegate57._allowMultipleMatches;
        java.io.OutputStream outputStream61 = null;
        int int62 = filteringParserDelegate57.releaseBuffered(outputStream61);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext63 = filteringParserDelegate57._headContext;
        filteringParserDelegate47._headContext = tokenFilterContext63;
        filteringParserDelegate33._exposedContext = tokenFilterContext63;
        filteringParserDelegate25._exposedContext = tokenFilterContext63;
        filteringParserDelegate16._exposedContext = tokenFilterContext63;
        filteringParserDelegate4._headContext = tokenFilterContext63;
        filteringParserDelegate4._allowMultipleMatches = true;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jsonToken26);
        org.junit.Assert.assertNull(tokenFilter27);
        org.junit.Assert.assertNull(tokenFilter28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(jsonToken38);
        org.junit.Assert.assertNull(jsonToken41);
        org.junit.Assert.assertNotNull(tokenFilterContext42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(jsonToken52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext63);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        boolean boolean10 = filteringParserDelegate4.hasToken(jsonToken9);
        int int11 = filteringParserDelegate4.getMatchCount();
        filteringParserDelegate4._matchCount = (short) 100;
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        int int10 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._currToken;
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4.rootFilter = tokenFilter15;
        boolean boolean17 = filteringParserDelegate4._includePath;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate4.hasToken(jsonToken12);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includeImmediateParent = false;
        int int10 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean11 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken12;
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.rootFilter;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            float float14 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        int int8 = filteringParserDelegate4.getFormatFeatures();
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        boolean boolean11 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int12 = filteringParserDelegate4._matchCount;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._matchCount = (byte) -1;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext19 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser21, tokenFilter22, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken26 = null;
        boolean boolean27 = filteringParserDelegate25.hasToken(jsonToken26);
        java.io.Writer writer28 = null;
        int int29 = filteringParserDelegate25.releaseBuffered(writer28);
        com.fasterxml.jackson.core.JsonToken jsonToken30 = filteringParserDelegate25._currToken;
        filteringParserDelegate25._includePath = false;
        filteringParserDelegate25._includeImmediateParent = false;
        boolean boolean35 = filteringParserDelegate25.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter36 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate39 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate25, tokenFilter36, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter40 = filteringParserDelegate39.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext41 = filteringParserDelegate39._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext41;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext19);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(jsonToken30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(tokenFilter40);
        org.junit.Assert.assertNotNull(tokenFilterContext41);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._matchCount = (byte) -1;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext19 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate4._currToken;
        boolean boolean21 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate26 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser22, tokenFilter23, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext27 = null;
        filteringParserDelegate26._exposedContext = tokenFilterContext27;
        int int29 = filteringParserDelegate26._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = filteringParserDelegate26.rootFilter;
        boolean boolean31 = filteringParserDelegate26._includePath;
        filteringParserDelegate26._matchCount = 'a';
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext34 = filteringParserDelegate26._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext34;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser38 = filteringParserDelegate4.overrideFormatFeatures((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext19);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(tokenFilter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext34);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        int int9 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(tokenFilterContext10);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        java.io.Writer writer19 = null;
        int int20 = filteringParserDelegate18.releaseBuffered(writer19);
        boolean boolean21 = filteringParserDelegate18.isExpectedStartObjectToken();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext12 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = filteringParserDelegate4.getValueAsDouble((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        boolean boolean17 = filteringParserDelegate15.hasToken(jsonToken16);
        java.io.Writer writer18 = null;
        int int19 = filteringParserDelegate15.releaseBuffered(writer18);
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate15._currToken;
        filteringParserDelegate15._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate15._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext23;
        boolean boolean25 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = filteringParserDelegate4._headContext;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertNotNull(tokenFilterContext23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext26);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        boolean boolean12 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser13, tokenFilter14, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken18 = null;
        boolean boolean19 = filteringParserDelegate17.hasToken(jsonToken18);
        java.io.Writer writer20 = null;
        int int21 = filteringParserDelegate17.releaseBuffered(writer20);
        filteringParserDelegate17._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate28 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser24, tokenFilter25, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken29 = null;
        boolean boolean30 = filteringParserDelegate28.hasToken(jsonToken29);
        java.io.Writer writer31 = null;
        int int32 = filteringParserDelegate28.releaseBuffered(writer31);
        com.fasterxml.jackson.core.JsonToken jsonToken33 = filteringParserDelegate28._currToken;
        filteringParserDelegate28._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate28._headContext;
        filteringParserDelegate17._exposedContext = tokenFilterContext36;
        filteringParserDelegate4._headContext = tokenFilterContext36;
        boolean boolean40 = filteringParserDelegate4.hasTokenId((int) '#');
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal42 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(jsonToken33);
        org.junit.Assert.assertNotNull(tokenFilterContext36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        filteringParserDelegate13.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate13._currToken = jsonToken15;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = filteringParserDelegate13.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter12, true, true);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = filteringParserDelegate15.getValueAsDouble((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(tokenFilterContext11);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getCurrentToken();
        int int13 = filteringParserDelegate4.getFormatFeatures();
        int int14 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.rootFilter;
        boolean boolean16 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean17 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate4.isEnabled(feature18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        filteringParserDelegate13.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate13._currToken = jsonToken15;
        boolean boolean17 = filteringParserDelegate13._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate13.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        int int10 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4._itemFilter = tokenFilter11;
        java.io.Writer writer13 = null;
        int int14 = filteringParserDelegate4.releaseBuffered(writer13);
        int int15 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.overrideStdFeatures((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        int int10 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._exposedContext;
        boolean boolean12 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(tokenFilterContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getLastClearedToken();
        java.io.Writer writer11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(writer11);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        boolean boolean21 = filteringParserDelegate19.hasToken(jsonToken20);
        java.io.Writer writer22 = null;
        int int23 = filteringParserDelegate19.releaseBuffered(writer22);
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate19._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, false, false);
        java.io.Writer writer30 = null;
        int int31 = filteringParserDelegate29.releaseBuffered(writer30);
        boolean boolean32 = filteringParserDelegate29._allowMultipleMatches;
        java.io.OutputStream outputStream33 = null;
        int int34 = filteringParserDelegate29.releaseBuffered(outputStream33);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext35 = filteringParserDelegate29._headContext;
        filteringParserDelegate19._headContext = tokenFilterContext35;
        filteringParserDelegate4._headContext = tokenFilterContext35;
        int int38 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken39 = null;
        boolean boolean40 = filteringParserDelegate4.hasToken(jsonToken39);
        boolean boolean41 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._matchCount = (short) -1;
        java.io.Writer writer44 = null;
        int int45 = filteringParserDelegate4.releaseBuffered(writer44);
        boolean boolean46 = filteringParserDelegate4.isExpectedStartArrayToken();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonToken24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate4._filterContext();
        java.io.OutputStream outputStream15 = null;
        int int16 = filteringParserDelegate4.releaseBuffered(outputStream15);
        filteringParserDelegate4._includeImmediateParent = true;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getLastClearedToken();
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includeImmediateParent = false;
        int int10 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean11 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken12;
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            float float15 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4.rootFilter = tokenFilter12;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation14 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, false, false);
        java.io.Writer writer13 = null;
        int int14 = filteringParserDelegate12.releaseBuffered(writer13);
        boolean boolean15 = filteringParserDelegate12._includeImmediateParent;
        java.lang.String str16 = filteringParserDelegate12.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate12._currToken;
        boolean boolean18 = filteringParserDelegate12.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser19, tokenFilter20, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken24 = null;
        boolean boolean25 = filteringParserDelegate23.hasToken(jsonToken24);
        java.io.Writer writer26 = null;
        int int27 = filteringParserDelegate23.releaseBuffered(writer26);
        com.fasterxml.jackson.core.JsonToken jsonToken28 = filteringParserDelegate23._currToken;
        filteringParserDelegate23._includePath = false;
        filteringParserDelegate23._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = null;
        boolean boolean39 = filteringParserDelegate37.hasToken(jsonToken38);
        java.io.Writer writer40 = null;
        int int41 = filteringParserDelegate37.releaseBuffered(writer40);
        com.fasterxml.jackson.core.JsonToken jsonToken42 = filteringParserDelegate37._currToken;
        filteringParserDelegate37._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext45 = filteringParserDelegate37._headContext;
        filteringParserDelegate23._headContext = tokenFilterContext45;
        filteringParserDelegate12._exposedContext = tokenFilterContext45;
        boolean boolean49 = filteringParserDelegate12.hasTokenId((int) (short) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter51 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate54 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser50, tokenFilter51, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken55 = null;
        filteringParserDelegate54._lastClearedToken = jsonToken55;
        com.fasterxml.jackson.core.JsonToken jsonToken57 = filteringParserDelegate54.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken58 = filteringParserDelegate54._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken59 = filteringParserDelegate54.getCurrentToken();
        boolean boolean60 = filteringParserDelegate54._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext61 = filteringParserDelegate54._headContext;
        filteringParserDelegate12._headContext = tokenFilterContext61;
        filteringParserDelegate4._headContext = tokenFilterContext61;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter64 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            long long65 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(jsonToken28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(jsonToken42);
        org.junit.Assert.assertNotNull(tokenFilterContext45);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(jsonToken57);
        org.junit.Assert.assertNull(jsonToken58);
        org.junit.Assert.assertNull(jsonToken59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext61);
        org.junit.Assert.assertNull(tokenFilter64);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        boolean boolean22 = filteringParserDelegate20.hasToken(jsonToken21);
        java.io.Writer writer23 = null;
        int int24 = filteringParserDelegate20.releaseBuffered(writer23);
        com.fasterxml.jackson.core.JsonToken jsonToken25 = filteringParserDelegate20._currToken;
        filteringParserDelegate20._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken28 = filteringParserDelegate20.getCurrentToken();
        int int29 = filteringParserDelegate20.getFormatFeatures();
        boolean boolean30 = filteringParserDelegate20._allowMultipleMatches;
        int int31 = filteringParserDelegate20.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate20._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext32;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext34 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext35 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonToken25);
        org.junit.Assert.assertNull(jsonToken28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext32);
        org.junit.Assert.assertNotNull(jsonStreamContext34);
        org.junit.Assert.assertNotNull(tokenFilterContext35);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean12 = filteringParserDelegate4.hasTokenId(0);
        java.io.Writer writer13 = null;
        int int14 = filteringParserDelegate4.releaseBuffered(writer13);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext16 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter17, false, true);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext21 = filteringParserDelegate20._filterContext();
        int int22 = filteringParserDelegate20.getCurrentTokenId();
        boolean boolean23 = filteringParserDelegate20.hasCurrentToken();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertNotNull(jsonStreamContext16);
        org.junit.Assert.assertNotNull(jsonStreamContext21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation12 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(tokenFilter9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.disable(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getCurrentToken();
        int int13 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._headContext;
        boolean boolean15 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = filteringParserDelegate4._itemFilter;
        boolean boolean17 = filteringParserDelegate4.isExpectedStartArrayToken();
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(tokenFilter16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        java.io.Writer writer19 = null;
        int int20 = filteringParserDelegate18.releaseBuffered(writer19);
        filteringParserDelegate18.clearCurrentToken();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4.rootFilter = tokenFilter9;
        filteringParserDelegate4._includeImmediateParent = false;
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        java.lang.String str14 = filteringParserDelegate4.getCurrentName();
        int int15 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.overrideFormatFeatures(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        boolean boolean19 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int20 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        filteringParserDelegate4._currToken = jsonToken21;
        boolean boolean23 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        filteringParserDelegate4._matchCount = 'a';
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext12 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(tokenFilterContext12);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4._itemFilter = tokenFilter12;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = filteringParserDelegate4.skipChildren();
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNotNull(jsonParser14);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, true, true);
        java.lang.String str15 = filteringParserDelegate14.getCurrentName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean12 = filteringParserDelegate4.hasTokenId(0);
        java.io.Writer writer13 = null;
        int int14 = filteringParserDelegate4.releaseBuffered(writer13);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4.getParsingContext();
        boolean boolean16 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        boolean boolean14 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        java.io.Writer writer12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(writer12);
        filteringParserDelegate4._allowMultipleMatches = true;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            short short18 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext17);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant13 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = filteringParserDelegate4.getBinaryValue(base64Variant13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean13 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._matchCount = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        filteringParserDelegate13.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate13._currToken = jsonToken15;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate13.skipChildren();
        boolean boolean19 = filteringParserDelegate13.hasTokenId((int) (byte) 1);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate13.setSchema(formatSchema20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._currToken = jsonToken10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4._itemFilter = tokenFilter12;
        boolean boolean15 = filteringParserDelegate4.hasTokenId((int) (byte) 100);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.canUseSchema(formatSchema17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4.rootFilter = tokenFilter11;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean16 = filteringParserDelegate4.hasTokenId((int) (byte) -1);
        boolean boolean17 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4._itemFilter = tokenFilter9;
        boolean boolean11 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, false, false);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._headContext;
        int int12 = filteringParserDelegate4.getMatchCount();
        boolean boolean13 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        boolean boolean14 = filteringParserDelegate12.hasToken(jsonToken13);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate12.releaseBuffered(writer15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate12._currToken;
        filteringParserDelegate12._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate12.getCurrentToken();
        int int21 = filteringParserDelegate12.getFormatFeatures();
        boolean boolean22 = filteringParserDelegate12._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate12._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext23;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken30 = null;
        boolean boolean31 = filteringParserDelegate29.hasToken(jsonToken30);
        java.io.Writer writer32 = null;
        int int33 = filteringParserDelegate29.releaseBuffered(writer32);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = filteringParserDelegate29._currToken;
        filteringParserDelegate29._includePath = false;
        filteringParserDelegate29._includeImmediateParent = false;
        boolean boolean39 = filteringParserDelegate29.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter40 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate43 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate29, tokenFilter40, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter44 = filteringParserDelegate43.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext45 = filteringParserDelegate43._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext45;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(tokenFilter44);
        org.junit.Assert.assertNotNull(tokenFilterContext45);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        java.io.Writer writer12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(writer12);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._exposedContext;
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(tokenFilterContext14);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4._filterContext();
        int int16 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includeImmediateParent = false;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        filteringParserDelegate4._allowMultipleMatches = false;
        boolean boolean13 = filteringParserDelegate4._includePath;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.overrideFormatFeatures((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._matchCount = (byte) 1;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser12, tokenFilter13, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        boolean boolean18 = filteringParserDelegate16.hasToken(jsonToken17);
        java.io.Writer writer19 = null;
        int int20 = filteringParserDelegate16.releaseBuffered(writer19);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext21 = filteringParserDelegate16._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = filteringParserDelegate16.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate16._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext23;
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext21);
        org.junit.Assert.assertNull(jsonToken22);
        org.junit.Assert.assertNotNull(tokenFilterContext23);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getCurrentToken();
        int int13 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.rootFilter;
        boolean boolean16 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken17;
        boolean boolean20 = filteringParserDelegate4.hasTokenId((int) (byte) 100);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext12 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter13, false, true);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter17, true, true);
        boolean boolean21 = filteringParserDelegate20.isExpectedStartArrayToken();
        int int22 = filteringParserDelegate20.getMatchCount();
        java.io.Writer writer23 = null;
        int int24 = filteringParserDelegate20.releaseBuffered(writer23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._matchCount = (byte) -1;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext19 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext19);
        org.junit.Assert.assertNull(jsonToken20);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate14._currToken;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = filteringParserDelegate14.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.getFilter();
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        java.io.Writer writer12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(writer12);
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int15 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        filteringParserDelegate4._currToken = jsonToken16;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        filteringParserDelegate4._itemFilter = tokenFilter19;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser22 = filteringParserDelegate4.setFeatureMask((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(tokenFilter18);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate15._lastClearedToken;
        boolean boolean17 = filteringParserDelegate15.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        filteringParserDelegate15._itemFilter = tokenFilter18;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        filteringParserDelegate15._lastClearedToken = jsonToken20;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        filteringParserDelegate15._itemFilter = tokenFilter22;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate28 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser24, tokenFilter25, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = null;
        filteringParserDelegate28._exposedContext = tokenFilterContext29;
        com.fasterxml.jackson.core.JsonToken jsonToken31 = null;
        filteringParserDelegate28._currToken = jsonToken31;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate28._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter35 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate38 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser34, tokenFilter35, false, false);
        java.io.Writer writer39 = null;
        int int40 = filteringParserDelegate38.releaseBuffered(writer39);
        boolean boolean41 = filteringParserDelegate38._allowMultipleMatches;
        java.io.OutputStream outputStream42 = null;
        int int43 = filteringParserDelegate38.releaseBuffered(outputStream42);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext44 = filteringParserDelegate38._headContext;
        filteringParserDelegate28._exposedContext = tokenFilterContext44;
        filteringParserDelegate15._headContext = tokenFilterContext44;
        filteringParserDelegate4._headContext = tokenFilterContext44;
        com.fasterxml.jackson.core.JsonToken jsonToken48 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int49 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tokenFilterContext33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext44);
        org.junit.Assert.assertNull(jsonToken48);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._matchCount = (byte) -1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = filteringParserDelegate18.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        filteringParserDelegate18._lastClearedToken = jsonToken20;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4.rootFilter = tokenFilter12;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4._itemFilter;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        filteringParserDelegate4._matchCount = (short) 10;
        filteringParserDelegate4.clearCurrentToken();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getCurrentToken();
        java.io.OutputStream outputStream12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(outputStream12);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        boolean boolean16 = filteringParserDelegate4.hasToken(jsonToken15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4._itemFilter = tokenFilter9;
        boolean boolean11 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext13 = filteringParserDelegate4.getParsingContext();
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(tokenFilter12);
        org.junit.Assert.assertNotNull(jsonStreamContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = filteringParserDelegate18.rootFilter;
        int int20 = filteringParserDelegate18.getMatchCount();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext21 = filteringParserDelegate18._filterContext();
        filteringParserDelegate18._matchCount = 'a';
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext21);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        boolean boolean11 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate14._currToken;
        boolean boolean16 = filteringParserDelegate14.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate14._currToken = jsonToken17;
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        java.io.Writer writer12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(writer12);
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.SerializableString serializableString16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.nextFieldName(serializableString16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, false);
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        filteringParserDelegate4._includeImmediateParent = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        boolean boolean19 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int20 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate4.rootFilter;
        boolean boolean22 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._matchCount = 0;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken30 = null;
        boolean boolean31 = filteringParserDelegate29.hasToken(jsonToken30);
        java.io.Writer writer32 = null;
        int int33 = filteringParserDelegate29.releaseBuffered(writer32);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = filteringParserDelegate29._currToken;
        filteringParserDelegate29._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken37 = filteringParserDelegate29.getCurrentToken();
        int int38 = filteringParserDelegate29.getFormatFeatures();
        int int39 = filteringParserDelegate29._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken40 = filteringParserDelegate29._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter41 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate44 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate29, tokenFilter41, true, false);
        com.fasterxml.jackson.core.JsonParser jsonParser45 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter46 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate49 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser45, tokenFilter46, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken50 = filteringParserDelegate49._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter51 = filteringParserDelegate49._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = filteringParserDelegate49.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser53 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter54 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate57 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser53, tokenFilter54, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken58 = null;
        boolean boolean59 = filteringParserDelegate57.hasToken(jsonToken58);
        java.io.Writer writer60 = null;
        int int61 = filteringParserDelegate57.releaseBuffered(writer60);
        com.fasterxml.jackson.core.JsonToken jsonToken62 = filteringParserDelegate57._currToken;
        filteringParserDelegate57._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken65 = filteringParserDelegate57.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext66 = filteringParserDelegate57._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser67 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter68 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate71 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser67, tokenFilter68, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken72 = null;
        boolean boolean73 = filteringParserDelegate71.hasToken(jsonToken72);
        java.io.Writer writer74 = null;
        int int75 = filteringParserDelegate71.releaseBuffered(writer74);
        com.fasterxml.jackson.core.JsonToken jsonToken76 = filteringParserDelegate71._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser77 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter78 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate81 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser77, tokenFilter78, false, false);
        java.io.Writer writer82 = null;
        int int83 = filteringParserDelegate81.releaseBuffered(writer82);
        boolean boolean84 = filteringParserDelegate81._allowMultipleMatches;
        java.io.OutputStream outputStream85 = null;
        int int86 = filteringParserDelegate81.releaseBuffered(outputStream85);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext87 = filteringParserDelegate81._headContext;
        filteringParserDelegate71._headContext = tokenFilterContext87;
        filteringParserDelegate57._exposedContext = tokenFilterContext87;
        filteringParserDelegate49._exposedContext = tokenFilterContext87;
        filteringParserDelegate44._headContext = tokenFilterContext87;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken92 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(tokenFilter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertNull(jsonToken37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(jsonToken40);
        org.junit.Assert.assertNull(jsonToken50);
        org.junit.Assert.assertNull(tokenFilter51);
        org.junit.Assert.assertNull(tokenFilter52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(jsonToken62);
        org.junit.Assert.assertNull(jsonToken65);
        org.junit.Assert.assertNotNull(tokenFilterContext66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNull(jsonToken76);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext87);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, false);
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate24 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter21, false, false);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken30 = null;
        boolean boolean31 = filteringParserDelegate29.hasToken(jsonToken30);
        java.io.Writer writer32 = null;
        int int33 = filteringParserDelegate29.releaseBuffered(writer32);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = filteringParserDelegate29._currToken;
        filteringParserDelegate29._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken37 = filteringParserDelegate29.getCurrentToken();
        int int38 = filteringParserDelegate29.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate29._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext39;
        com.fasterxml.jackson.core.JsonToken jsonToken41 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertNull(jsonToken37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext39);
        org.junit.Assert.assertNull(jsonToken41);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        java.lang.String str12 = filteringParserDelegate4.getCurrentName();
        boolean boolean13 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        boolean boolean16 = filteringParserDelegate4.hasToken(jsonToken15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        java.io.Writer writer12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(writer12);
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int15 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.getCurrentToken();
        java.io.Writer writer17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(writer17);
        boolean boolean20 = filteringParserDelegate4.hasTokenId((int) (byte) -1);
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        boolean boolean22 = filteringParserDelegate4.hasToken(jsonToken21);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        filteringParserDelegate4._itemFilter = tokenFilter23;
        // The following exception was thrown during execution in test generation
        try {
            int int26 = filteringParserDelegate4.nextIntValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getLastClearedToken();
        int int12 = filteringParserDelegate4._matchCount;
        java.io.Writer writer13 = null;
        int int14 = filteringParserDelegate4.releaseBuffered(writer13);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray16 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        boolean boolean14 = filteringParserDelegate12.hasToken(jsonToken13);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate12.releaseBuffered(writer15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate12._currToken;
        filteringParserDelegate12._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate12.getCurrentToken();
        int int21 = filteringParserDelegate12.getFormatFeatures();
        boolean boolean22 = filteringParserDelegate12._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate12._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext23;
        boolean boolean25 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean28 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(tokenFilter26);
        org.junit.Assert.assertNull(jsonToken27);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.nextLongValue((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.isEnabled(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        int int8 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean10 = filteringParserDelegate4.hasTokenId((int) 'a');
        filteringParserDelegate4._includeImmediateParent = false;
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._lastClearedToken;
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate4.releaseBuffered(writer14);
        boolean boolean17 = filteringParserDelegate4.hasTokenId((int) (byte) 10);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate4._currToken;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tokenFilter18);
        org.junit.Assert.assertNull(jsonToken19);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext12 = filteringParserDelegate4._headContext;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter15, true, true);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        boolean boolean20 = filteringParserDelegate18.hasToken(jsonToken19);
        com.fasterxml.jackson.core.JsonToken jsonToken21 = filteringParserDelegate18.getCurrentToken();
        boolean boolean22 = filteringParserDelegate18.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate18.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = filteringParserDelegate18._itemFilter;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(jsonToken21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNull(tokenFilter24);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getCurrentToken();
        int int13 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4.clearCurrentToken();
        int int16 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser14, tokenFilter15, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        filteringParserDelegate18._lastClearedToken = jsonToken19;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = filteringParserDelegate18.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate26 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser22, tokenFilter23, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken27 = null;
        boolean boolean28 = filteringParserDelegate26.hasToken(jsonToken27);
        java.io.Writer writer29 = null;
        int int30 = filteringParserDelegate26.releaseBuffered(writer29);
        com.fasterxml.jackson.core.JsonToken jsonToken31 = filteringParserDelegate26._currToken;
        filteringParserDelegate26._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken34 = filteringParserDelegate26.getCurrentToken();
        int int35 = filteringParserDelegate26.getFormatFeatures();
        boolean boolean36 = filteringParserDelegate26._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext37 = filteringParserDelegate26._headContext;
        filteringParserDelegate18._exposedContext = tokenFilterContext37;
        filteringParserDelegate13._headContext = tokenFilterContext37;
        java.io.Writer writer40 = null;
        int int41 = filteringParserDelegate13.releaseBuffered(writer40);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext42 = filteringParserDelegate13.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            double double43 = filteringParserDelegate13.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(jsonToken31);
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext42);
    }
}

