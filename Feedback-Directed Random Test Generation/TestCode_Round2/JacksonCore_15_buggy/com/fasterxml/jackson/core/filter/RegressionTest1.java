package com.fasterxml.jackson.core.filter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        boolean boolean17 = filteringParserDelegate15.hasToken(jsonToken16);
        java.io.Writer writer18 = null;
        int int19 = filteringParserDelegate15.releaseBuffered(writer18);
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate15._currToken;
        filteringParserDelegate15._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate15.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate15._lastClearedToken;
        filteringParserDelegate15.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNull(jsonToken24);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate13.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate13.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.configure(feature7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            float float7 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser12, tokenFilter13, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate16._lastClearedToken;
        boolean boolean18 = filteringParserDelegate16.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        filteringParserDelegate16._itemFilter = tokenFilter19;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        filteringParserDelegate16._lastClearedToken = jsonToken21;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        filteringParserDelegate16._itemFilter = tokenFilter23;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext30 = null;
        filteringParserDelegate29._exposedContext = tokenFilterContext30;
        com.fasterxml.jackson.core.JsonToken jsonToken32 = null;
        filteringParserDelegate29._currToken = jsonToken32;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext34 = filteringParserDelegate29._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter36 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate39 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser35, tokenFilter36, false, false);
        java.io.Writer writer40 = null;
        int int41 = filteringParserDelegate39.releaseBuffered(writer40);
        boolean boolean42 = filteringParserDelegate39._allowMultipleMatches;
        java.io.OutputStream outputStream43 = null;
        int int44 = filteringParserDelegate39.releaseBuffered(outputStream43);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext45 = filteringParserDelegate39._headContext;
        filteringParserDelegate29._exposedContext = tokenFilterContext45;
        filteringParserDelegate16._headContext = tokenFilterContext45;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken48 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(tokenFilterContext34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext45);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation11 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilter12);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        filteringParserDelegate18._matchCount = (byte) 1;
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
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext40 = filteringParserDelegate25._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate18.setCurrentValue((java.lang.Object) jsonStreamContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(jsonToken30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext40);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        filteringParserDelegate14._includePath = true;
        boolean boolean17 = filteringParserDelegate14.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation18 = filteringParserDelegate14.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream6 = null;
        int int7 = filteringParserDelegate4.releaseBuffered(outputStream6);
        // The following exception was thrown during execution in test generation
        try {
            float float8 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
            java.lang.String str10 = filteringParserDelegate4.nextTextValue();
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        boolean boolean18 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        boolean boolean9 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        filteringParserDelegate18._matchCount = (byte) 1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate18.getFilter();
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = filteringParserDelegate18.isEnabled(feature22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation15 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext7 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tokenFilterContext7);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        boolean boolean13 = filteringParserDelegate4.hasCurrentToken();
        java.io.OutputStream outputStream14 = null;
        int int15 = filteringParserDelegate4.releaseBuffered(outputStream14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = filteringParserDelegate4.getValueAsDouble();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        filteringParserDelegate18._matchCount = (byte) 1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate18.getFilter();
        filteringParserDelegate18._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = filteringParserDelegate18.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser19, tokenFilter20, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken24 = null;
        boolean boolean25 = filteringParserDelegate23.hasToken(jsonToken24);
        java.io.Writer writer26 = null;
        int int27 = filteringParserDelegate23.releaseBuffered(writer26);
        com.fasterxml.jackson.core.JsonToken jsonToken28 = filteringParserDelegate23._currToken;
        filteringParserDelegate23._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken31 = filteringParserDelegate23.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate23._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = null;
        boolean boolean39 = filteringParserDelegate37.hasToken(jsonToken38);
        java.io.Writer writer40 = null;
        int int41 = filteringParserDelegate37.releaseBuffered(writer40);
        com.fasterxml.jackson.core.JsonToken jsonToken42 = filteringParserDelegate37._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter44 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate47 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser43, tokenFilter44, false, false);
        java.io.Writer writer48 = null;
        int int49 = filteringParserDelegate47.releaseBuffered(writer48);
        boolean boolean50 = filteringParserDelegate47._allowMultipleMatches;
        java.io.OutputStream outputStream51 = null;
        int int52 = filteringParserDelegate47.releaseBuffered(outputStream51);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext53 = filteringParserDelegate47._headContext;
        filteringParserDelegate37._headContext = tokenFilterContext53;
        filteringParserDelegate23._exposedContext = tokenFilterContext53;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken56 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext53);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(jsonToken28);
        org.junit.Assert.assertNull(jsonToken31);
        org.junit.Assert.assertNotNull(tokenFilterContext32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(jsonToken42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext53);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.overrideFormatFeatures((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        int int10 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            short short11 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.readBinaryValue(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.canReadObjectId();
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
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation19 = filteringParserDelegate4.getCurrentLocation();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate11.hasToken(jsonToken12);
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate11.releaseBuffered(writer14);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate11._currToken;
        filteringParserDelegate11._includePath = false;
        filteringParserDelegate11._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate11.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) tokenFilter21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        filteringParserDelegate18._matchCount = (byte) 1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate18.getFilter();
        com.fasterxml.jackson.core.Base64Variant base64Variant22 = null;
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = filteringParserDelegate18.readBinaryValue(base64Variant22, outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4.rootFilter;
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(tokenFilter9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        filteringParserDelegate14._includePath = true;
        boolean boolean17 = filteringParserDelegate14.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = filteringParserDelegate14.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter11);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int7 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        int int10 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        filteringParserDelegate4._itemFilter = tokenFilter16;
        int int18 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = filteringParserDelegate4.getNumberValue();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jsonToken10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.overrideFormatFeatures((int) ' ', 0);
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
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        java.lang.String str15 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate18.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        int int9 = filteringParserDelegate4._matchCount;
        boolean boolean10 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = filteringParserDelegate4.nextLongValue((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
            com.fasterxml.jackson.core.JsonLocation jsonLocation15 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        boolean boolean18 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int19 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        boolean boolean12 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        boolean boolean14 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = filteringParserDelegate11.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.readBinaryValue(base64Variant7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        java.io.OutputStream outputStream12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(outputStream12);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation13 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        int int10 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        filteringParserDelegate14._includePath = true;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec17 = filteringParserDelegate14.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilter12);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate18._headContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = filteringParserDelegate18.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter19);
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = filteringParserDelegate4.getText();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation11 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken13;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal13 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        boolean boolean14 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.lang.String str17 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate4.disable(feature18);
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        filteringParserDelegate4._itemFilter = tokenFilter16;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = filteringParserDelegate4.getTextLength();
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
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.nextIntValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = filteringParserDelegate18.readBinaryValue(outputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.overrideStdFeatures((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        boolean boolean13 = filteringParserDelegate4.hasCurrentToken();
        java.io.OutputStream outputStream14 = null;
        int int15 = filteringParserDelegate4.releaseBuffered(outputStream14);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = filteringParserDelegate4.getValueAsDouble((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.nextFieldName(serializableString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = filteringParserDelegate4.getBinaryValue();
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
        org.junit.Assert.assertNotNull(jsonStreamContext16);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken21 = filteringParserDelegate20.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
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
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        filteringParserDelegate4._matchCount = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = filteringParserDelegate4.getValueAsDouble((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        boolean boolean14 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        filteringParserDelegate4._itemFilter = tokenFilter16;
        int int18 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.canUseSchema(formatSchema19);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        int int9 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            short short19 = filteringParserDelegate4.getShortValue();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate14.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.rootFilter;
        boolean boolean15 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        boolean boolean22 = filteringParserDelegate20.hasToken(jsonToken21);
        java.io.Writer writer23 = null;
        int int24 = filteringParserDelegate20.releaseBuffered(writer23);
        com.fasterxml.jackson.core.JsonToken jsonToken25 = filteringParserDelegate20._currToken;
        filteringParserDelegate20._includePath = false;
        java.lang.String str28 = filteringParserDelegate20.getCurrentName();
        int int29 = filteringParserDelegate20.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken30 = filteringParserDelegate20._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser31 = filteringParserDelegate20.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonToken25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(jsonToken30);
        org.junit.Assert.assertNotNull(jsonParser31);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate11.hasToken(jsonToken12);
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate11.releaseBuffered(writer14);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate11._currToken;
        filteringParserDelegate11._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate11.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate11._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = filteringParserDelegate4.getValueAsString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.nextLongValue((long) (short) -1);
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
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        int int10 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        boolean boolean12 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.Base64Variant base64Variant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = filteringParserDelegate4.getBinaryValue(base64Variant11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        int int10 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        int int14 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean15 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        boolean boolean12 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            short short13 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser14, tokenFilter15, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        boolean boolean20 = filteringParserDelegate18.hasToken(jsonToken19);
        java.io.Writer writer21 = null;
        int int22 = filteringParserDelegate18.releaseBuffered(writer21);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate18._currToken;
        filteringParserDelegate18._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = filteringParserDelegate18._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext26;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNotNull(tokenFilterContext26);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        int int15 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate13.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean10 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray7 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser13 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        boolean boolean12 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate11.hasToken(jsonToken12);
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate11.getCurrentToken();
        filteringParserDelegate11._allowMultipleMatches = false;
        boolean boolean17 = filteringParserDelegate11.isExpectedStartObjectToken();
        boolean boolean18 = filteringParserDelegate11._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.nextIntValue((int) '#');
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
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        com.fasterxml.jackson.core.SerializableString serializableString13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.nextFieldName(serializableString13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        boolean boolean12 = filteringParserDelegate4.hasTokenId(10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation13 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = filteringParserDelegate4.getBinaryValue(base64Variant8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate13.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate13.getLastClearedToken();
        java.lang.String str16 = filteringParserDelegate13.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = filteringParserDelegate13.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        filteringParserDelegate18._matchCount = (byte) 1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate18.getFilter();
        filteringParserDelegate18._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = filteringParserDelegate18.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema15);
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
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        java.lang.String str10 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec11 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(tokenFilter9);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        // The following exception was thrown during execution in test generation
        try {
            float float15 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        java.lang.String str10 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(tokenFilter10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        int int14 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean15 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        com.fasterxml.jackson.core.JsonToken jsonToken22 = filteringParserDelegate17._currToken;
        boolean boolean23 = filteringParserDelegate17._includeImmediateParent;
        boolean boolean25 = filteringParserDelegate17.hasTokenId(0);
        java.io.Writer writer26 = null;
        int int27 = filteringParserDelegate17.releaseBuffered(writer26);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext28 = filteringParserDelegate17.getParsingContext();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext29 = filteringParserDelegate17._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate33 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate17, tokenFilter30, false, true);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) false);
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
        org.junit.Assert.assertNull(jsonToken22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext28);
        org.junit.Assert.assertNotNull(jsonStreamContext29);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, false, false);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate14.releaseBuffered(writer15);
        boolean boolean17 = filteringParserDelegate14._allowMultipleMatches;
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate14.releaseBuffered(outputStream18);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext20;
        com.fasterxml.jackson.core.Base64Variant base64Variant22 = null;
        java.io.OutputStream outputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = filteringParserDelegate4.readBinaryValue(base64Variant22, outputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.getFeatureMask();
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
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        int int11 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = filteringParserDelegate4.getValueAsDouble((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = filteringParserDelegate13.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal16 = filteringParserDelegate4.getDecimalValue();
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
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.io.OutputStream outputStream15 = null;
        int int16 = filteringParserDelegate4.releaseBuffered(outputStream15);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = filteringParserDelegate4.getDoubleValue();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate15._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = filteringParserDelegate15._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = filteringParserDelegate15.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser19, tokenFilter20, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken24 = null;
        boolean boolean25 = filteringParserDelegate23.hasToken(jsonToken24);
        java.io.Writer writer26 = null;
        int int27 = filteringParserDelegate23.releaseBuffered(writer26);
        com.fasterxml.jackson.core.JsonToken jsonToken28 = filteringParserDelegate23._currToken;
        filteringParserDelegate23._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken31 = filteringParserDelegate23.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate23._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken38 = null;
        boolean boolean39 = filteringParserDelegate37.hasToken(jsonToken38);
        java.io.Writer writer40 = null;
        int int41 = filteringParserDelegate37.releaseBuffered(writer40);
        com.fasterxml.jackson.core.JsonToken jsonToken42 = filteringParserDelegate37._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser43 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter44 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate47 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser43, tokenFilter44, false, false);
        java.io.Writer writer48 = null;
        int int49 = filteringParserDelegate47.releaseBuffered(writer48);
        boolean boolean50 = filteringParserDelegate47._allowMultipleMatches;
        java.io.OutputStream outputStream51 = null;
        int int52 = filteringParserDelegate47.releaseBuffered(outputStream51);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext53 = filteringParserDelegate47._headContext;
        filteringParserDelegate37._headContext = tokenFilterContext53;
        filteringParserDelegate23._exposedContext = tokenFilterContext53;
        filteringParserDelegate15._exposedContext = tokenFilterContext53;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken57 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(tokenFilter17);
        org.junit.Assert.assertNull(tokenFilter18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(jsonToken28);
        org.junit.Assert.assertNull(jsonToken31);
        org.junit.Assert.assertNotNull(tokenFilterContext32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(jsonToken42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext53);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        int int12 = filteringParserDelegate4.getMatchCount();
        java.lang.Class<?> wildcardClass13 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        com.fasterxml.jackson.core.JsonParser jsonParser20 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate24 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser20, tokenFilter21, false, false);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) jsonParser20);
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, false, false);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate14.releaseBuffered(writer15);
        boolean boolean17 = filteringParserDelegate14._allowMultipleMatches;
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate14.releaseBuffered(outputStream18);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext20;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        int int7 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.lang.Class<?> wildcardClass17 = jsonStreamContext16.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertNotNull(jsonStreamContext16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4.rootFilter = tokenFilter9;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream6 = null;
        int int7 = filteringParserDelegate4.releaseBuffered(outputStream6);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean17 = filteringParserDelegate4.nextBooleanValue();
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
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser13, tokenFilter14, false, false);
        java.io.Writer writer18 = null;
        int int19 = filteringParserDelegate17.releaseBuffered(writer18);
        boolean boolean20 = filteringParserDelegate17._allowMultipleMatches;
        java.io.OutputStream outputStream21 = null;
        int int22 = filteringParserDelegate17.releaseBuffered(outputStream21);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate17._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate27 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate17, tokenFilter24, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = filteringParserDelegate17.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken29 = filteringParserDelegate17.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext23);
        org.junit.Assert.assertNull(tokenFilter28);
        org.junit.Assert.assertNull(jsonToken29);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = filteringParserDelegate4.getBinaryValue(base64Variant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        int int14 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.getValueAsLong((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = filteringParserDelegate4.isEnabled(feature20);
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
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken38 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.canUseSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        int int14 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray15 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.Class<?> wildcardClass48 = filteringParserDelegate4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.FormatSchema formatSchema12 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = filteringParserDelegate4.getValueAsString();
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
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        boolean boolean9 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.getValueAsLong((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = filteringParserDelegate4.canUseSchema(formatSchema23);
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.io.OutputStream outputStream15 = null;
        int int16 = filteringParserDelegate4.releaseBuffered(outputStream15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4._lastClearedToken;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.enable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        boolean boolean12 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        int int10 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            short short11 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        boolean boolean22 = filteringParserDelegate4.hasToken(jsonToken21);
        // The following exception was thrown during execution in test generation
        try {
            double double24 = filteringParserDelegate4.getValueAsDouble((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = filteringParserDelegate4.getByteValue();
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
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = filteringParserDelegate4.getValueAsLong((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.getValueAsString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        int int11 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.getValueAsLong(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
            filteringParserDelegate13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = filteringParserDelegate13.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        boolean boolean17 = filteringParserDelegate15.hasToken(jsonToken16);
        java.io.Writer writer18 = null;
        int int19 = filteringParserDelegate15.releaseBuffered(writer18);
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate15._currToken;
        filteringParserDelegate15._includePath = false;
        filteringParserDelegate15._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken30 = null;
        boolean boolean31 = filteringParserDelegate29.hasToken(jsonToken30);
        java.io.Writer writer32 = null;
        int int33 = filteringParserDelegate29.releaseBuffered(writer32);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = filteringParserDelegate29._currToken;
        filteringParserDelegate29._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext37 = filteringParserDelegate29._headContext;
        filteringParserDelegate15._headContext = tokenFilterContext37;
        filteringParserDelegate4._exposedContext = tokenFilterContext37;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger40 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertNotNull(tokenFilterContext37);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean11 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation11 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.configure(feature10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean10 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate4._exposedContext;
        int int26 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = filteringParserDelegate4.getValueAsInt();
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
        org.junit.Assert.assertNotNull(tokenFilterContext25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        int int8 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        // The following exception was thrown during execution in test generation
        try {
            float float9 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.nextLongValue((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        filteringParserDelegate14._includePath = true;
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate14.disable(feature17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        filteringParserDelegate14._includePath = true;
        boolean boolean17 = filteringParserDelegate14.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            short short12 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext11);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        boolean boolean20 = filteringParserDelegate4.hasToken(jsonToken19);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = filteringParserDelegate4.getValueAsDouble((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.String str13 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.Base64Variant base64Variant15 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = filteringParserDelegate4.getBinaryValue(base64Variant15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate13.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate13.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = filteringParserDelegate20.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate4._exposedContext;
        int int26 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec27 = filteringParserDelegate4.getCodec();
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
        org.junit.Assert.assertNotNull(tokenFilterContext25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int7 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.disable(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate13.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate13.getLastClearedToken();
        int int16 = filteringParserDelegate13.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = filteringParserDelegate13.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.getIntValue();
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
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.overrideStdFeatures((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = filteringParserDelegate4.nextLongValue(10L);
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
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version21 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = filteringParserDelegate4.getValueAsLong((long) '#');
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
        org.junit.Assert.assertNotNull(jsonStreamContext16);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate4._exposedContext;
        int int26 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = filteringParserDelegate4.getText();
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
        org.junit.Assert.assertNotNull(tokenFilterContext25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.isEnabled(feature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(tokenFilterContext13);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = filteringParserDelegate13.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        int int9 = filteringParserDelegate4._matchCount;
        boolean boolean10 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
            int int17 = filteringParserDelegate4.getFeatureMask();
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.isEnabled(feature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        filteringParserDelegate18._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType21 = filteringParserDelegate18.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        int int15 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter16, false, true);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = filteringParserDelegate19.getValueAsInt((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType17 = filteringParserDelegate4.getNumberType();
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
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4._itemFilter;
        int int16 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.disable(feature17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        int int14 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean15 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, false);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = filteringParserDelegate13.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.overrideFormatFeatures(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = filteringParserDelegate4.getValueAsDouble((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number27 = filteringParserDelegate4.getNumberValue();
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
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = filteringParserDelegate4.getValueAsDouble((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser20 = filteringParserDelegate4.configure(feature18, true);
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
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = filteringParserDelegate4.getCurrentValue();
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
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate11.hasToken(jsonToken12);
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate11.releaseBuffered(writer14);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate11._currToken;
        filteringParserDelegate11._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate11.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate11._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext20;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema22 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        com.fasterxml.jackson.core.JsonToken jsonToken14 = null;
        filteringParserDelegate4._currToken = jsonToken14;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        java.io.OutputStream outputStream12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(outputStream12);
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.configure(feature14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        filteringParserDelegate4._matchCount = 'a';
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        boolean boolean17 = filteringParserDelegate4.hasToken(jsonToken16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4._itemFilter = tokenFilter11;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser13, tokenFilter14, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext18 = null;
        filteringParserDelegate17._exposedContext = tokenFilterContext18;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        filteringParserDelegate17._currToken = jsonToken20;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext22 = filteringParserDelegate17._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate27 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser23, tokenFilter24, false, false);
        java.io.Writer writer28 = null;
        int int29 = filteringParserDelegate27.releaseBuffered(writer28);
        boolean boolean30 = filteringParserDelegate27._allowMultipleMatches;
        java.io.OutputStream outputStream31 = null;
        int int32 = filteringParserDelegate27.releaseBuffered(outputStream31);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate27._headContext;
        filteringParserDelegate17._exposedContext = tokenFilterContext33;
        filteringParserDelegate4._headContext = tokenFilterContext33;
        com.fasterxml.jackson.core.Base64Variant base64Variant36 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray37 = filteringParserDelegate4.getBinaryValue(base64Variant36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilterContext22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext33);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        boolean boolean9 = filteringParserDelegate4.hasTokenId((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.nextLongValue((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = filteringParserDelegate4.canReadObjectId();
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
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = filteringParserDelegate4._filterContext();
        boolean boolean20 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.SerializableString serializableString21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = filteringParserDelegate4.nextFieldName(serializableString21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        boolean boolean13 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte15 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate11.hasToken(jsonToken12);
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate11.releaseBuffered(writer14);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate11._currToken;
        filteringParserDelegate11._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate11.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate11._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext20;
        // The following exception was thrown during execution in test generation
        try {
            short short22 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = filteringParserDelegate4.getInputSource();
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
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.hasTextCharacters();
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
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version25 = filteringParserDelegate4.version();
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
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream6 = null;
        int int7 = filteringParserDelegate4.releaseBuffered(outputStream6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = filteringParserDelegate4.nextLongValue((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate4._exposedContext;
        int int26 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
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
        org.junit.Assert.assertNotNull(tokenFilterContext25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._currToken;
        java.lang.String str15 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        boolean boolean22 = filteringParserDelegate4.hasToken(jsonToken21);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate26 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter23, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal27 = filteringParserDelegate26.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = filteringParserDelegate18.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, false, false);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate14.releaseBuffered(writer15);
        boolean boolean17 = filteringParserDelegate14._allowMultipleMatches;
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate14.releaseBuffered(outputStream18);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext20;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._currToken;
        java.lang.String str15 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext16 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate4.overrideStdFeatures(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(jsonStreamContext16);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4._itemFilter = tokenFilter11;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser13, tokenFilter14, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext18 = null;
        filteringParserDelegate17._exposedContext = tokenFilterContext18;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        filteringParserDelegate17._currToken = jsonToken20;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext22 = filteringParserDelegate17._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate27 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser23, tokenFilter24, false, false);
        java.io.Writer writer28 = null;
        int int29 = filteringParserDelegate27.releaseBuffered(writer28);
        boolean boolean30 = filteringParserDelegate27._allowMultipleMatches;
        java.io.OutputStream outputStream31 = null;
        int int32 = filteringParserDelegate27.releaseBuffered(outputStream31);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate27._headContext;
        filteringParserDelegate17._exposedContext = tokenFilterContext33;
        filteringParserDelegate4._headContext = tokenFilterContext33;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken36 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilterContext22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext33);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.getTextOffset();
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
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate4._currToken = jsonToken17;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = filteringParserDelegate4.getValueAsLong((long) 1);
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
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate4.nextIntValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getValueAsInt((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.io.OutputStream outputStream15 = null;
        int int16 = filteringParserDelegate4.releaseBuffered(outputStream15);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = filteringParserDelegate4.getNumberValue();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(tokenFilter17);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        filteringParserDelegate4._matchCount = 'a';
        com.fasterxml.jackson.core.Base64Variant base64Variant16 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = filteringParserDelegate4.getBinaryValue(base64Variant16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate14.setCodec(objectCodec15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType11 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = filteringParserDelegate4.nextIntValue((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        int int14 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.nextLongValue((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate4._currToken = jsonToken17;
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = filteringParserDelegate4.readBinaryValue(outputStream19);
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
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser22 = filteringParserDelegate20.setFeatureMask((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(jsonStreamContext16);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        com.fasterxml.jackson.core.JsonToken jsonToken14 = null;
        filteringParserDelegate4._currToken = jsonToken14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        java.lang.String str10 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = filteringParserDelegate4.getNumberValue();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = filteringParserDelegate4.nextLongValue((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        boolean boolean12 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.enable(feature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate4._headContext;
        boolean boolean14 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.SerializableString serializableString15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.nextFieldName(serializableString15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = filteringParserDelegate20.nextLongValue(10L);
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
        org.junit.Assert.assertNotNull(jsonStreamContext16);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        int int15 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter16, false, true);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(tokenFilter11);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.isClosed();
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
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.readBinaryValue(base64Variant8, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = filteringParserDelegate4.getValueAsLong(0L);
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
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        filteringParserDelegate4._matchCount = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate4.getValueAsInt((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        int int15 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter16, false, true);
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = filteringParserDelegate19.getBinaryValue(base64Variant20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        boolean boolean12 = filteringParserDelegate4.hasTokenId(10);
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = filteringParserDelegate14.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = filteringParserDelegate4.getValueAsDouble();
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
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter16, true, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version20 = filteringParserDelegate4.version();
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
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        boolean boolean14 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.enable(feature16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        filteringParserDelegate4._itemFilter = tokenFilter19;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = filteringParserDelegate4.hasTextCharacters();
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
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.rootFilter;
        boolean boolean15 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
            com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.nextToken();
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = filteringParserDelegate4.getValueAsDouble(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate18.canUseSchema(formatSchema19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        java.io.OutputStream outputStream12 = null;
        int int13 = filteringParserDelegate4.releaseBuffered(outputStream12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        filteringParserDelegate18._matchCount = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken21 = filteringParserDelegate18.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.skipChildren();
        boolean boolean10 = filteringParserDelegate4.hasTokenId((int) ' ');
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.canUseSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4.rootFilter = tokenFilter15;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.getValueAsBoolean(false);
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
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        boolean boolean19 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser21 = filteringParserDelegate4.enable(feature20);
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.enable(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        java.lang.String str9 = filteringParserDelegate4.getCurrentName();
        int int10 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.canUseSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = filteringParserDelegate4.getValueAsString("");
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
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.getValueAsLong((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec18 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = filteringParserDelegate18.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter19);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        filteringParserDelegate4._itemFilter = tokenFilter19;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = filteringParserDelegate4.getBinaryValue();
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
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isEnabled(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.canUseSchema(formatSchema15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(jsonToken6);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilterContext10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        boolean boolean13 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4._itemFilter;
        int int16 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        int int10 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        int int16 = filteringParserDelegate4.getMatchCount();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate4.nextToken();
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
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4._itemFilter = tokenFilter11;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        int int12 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.configure(feature13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = filteringParserDelegate4.getValueAsLong((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        int int10 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = filteringParserDelegate4.getValueAsLong(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext12 = null;
        filteringParserDelegate11._exposedContext = tokenFilterContext12;
        int int14 = filteringParserDelegate11._matchCount;
        java.io.OutputStream outputStream15 = null;
        int int16 = filteringParserDelegate11.releaseBuffered(outputStream15);
        int int17 = filteringParserDelegate11.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser18, tokenFilter19, false, false);
        java.io.Writer writer23 = null;
        int int24 = filteringParserDelegate22.releaseBuffered(writer23);
        boolean boolean25 = filteringParserDelegate22._allowMultipleMatches;
        java.io.OutputStream outputStream26 = null;
        int int27 = filteringParserDelegate22.releaseBuffered(outputStream26);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext28 = filteringParserDelegate22._headContext;
        filteringParserDelegate11._headContext = tokenFilterContext28;
        filteringParserDelegate4._exposedContext = tokenFilterContext28;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken31 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext28);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = null;
        filteringParserDelegate4._currToken = jsonToken14;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema16 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(tokenFilter13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNotNull(tokenFilterContext11);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken22 = null;
        boolean boolean23 = filteringParserDelegate21.hasToken(jsonToken22);
        java.io.Writer writer24 = null;
        int int25 = filteringParserDelegate21.releaseBuffered(writer24);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext26 = filteringParserDelegate21._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext26);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = filteringParserDelegate4.getObjectId();
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
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        boolean boolean22 = filteringParserDelegate4.hasToken(jsonToken21);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate26 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter23, true, false);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = filteringParserDelegate4.getValueAsDouble(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = filteringParserDelegate4.getValueAsString("hi!");
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
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.getValueAsLong((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate4.releaseBuffered(outputStream17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = filteringParserDelegate4.getCurrentValue();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, false, false);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate14.releaseBuffered(writer15);
        boolean boolean17 = filteringParserDelegate14._allowMultipleMatches;
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate14.releaseBuffered(outputStream18);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4.rootFilter = tokenFilter9;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            short short12 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate14.setCodec(objectCodec15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate4.configure(feature17, false);
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
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter11);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        int int7 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        filteringParserDelegate20._lastClearedToken = jsonToken21;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version23 = filteringParserDelegate20.version();
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
        org.junit.Assert.assertNotNull(jsonStreamContext16);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        filteringParserDelegate18._matchCount = (byte) 1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate18.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = filteringParserDelegate18.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate13.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate13.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate13.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType11 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._currToken;
        boolean boolean13 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger14 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser14, tokenFilter15, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        boolean boolean20 = filteringParserDelegate18.hasToken(jsonToken19);
        java.io.Writer writer21 = null;
        int int22 = filteringParserDelegate18.releaseBuffered(writer21);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate18._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate28 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser24, tokenFilter25, false, false);
        java.io.Writer writer29 = null;
        int int30 = filteringParserDelegate28.releaseBuffered(writer29);
        boolean boolean31 = filteringParserDelegate28._allowMultipleMatches;
        java.io.OutputStream outputStream32 = null;
        int int33 = filteringParserDelegate28.releaseBuffered(outputStream32);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext34 = filteringParserDelegate28._headContext;
        filteringParserDelegate18._headContext = tokenFilterContext34;
        filteringParserDelegate4._exposedContext = tokenFilterContext34;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext34);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.overrideStdFeatures((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = filteringParserDelegate4.getValueAsLong(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version11 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.disable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4.rootFilter = tokenFilter9;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(tokenFilterContext13);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        boolean boolean15 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.nextToken();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4.rootFilter = tokenFilter9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate13.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate13.getLastClearedToken();
        int int16 = filteringParserDelegate13.getMatchCount();
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate13.isEnabled(feature17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate4.releaseBuffered(writer14);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.nextIntValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.io.Writer writer21 = null;
        int int22 = filteringParserDelegate20.releaseBuffered(writer21);
        boolean boolean23 = filteringParserDelegate20._includeImmediateParent;
        java.lang.String str24 = filteringParserDelegate20.getCurrentName();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext25 = filteringParserDelegate20.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(jsonStreamContext25);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate14._lastClearedToken = jsonToken15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate14.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser18, tokenFilter19, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = null;
        boolean boolean24 = filteringParserDelegate22.hasToken(jsonToken23);
        java.io.Writer writer25 = null;
        int int26 = filteringParserDelegate22.releaseBuffered(writer25);
        com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate22._currToken;
        filteringParserDelegate22._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken30 = filteringParserDelegate22.getCurrentToken();
        int int31 = filteringParserDelegate22.getFormatFeatures();
        boolean boolean32 = filteringParserDelegate22._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate22._headContext;
        filteringParserDelegate14._exposedContext = tokenFilterContext33;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken35 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(jsonToken27);
        org.junit.Assert.assertNull(jsonToken30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext33);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(tokenFilter9);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate13._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate13._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = filteringParserDelegate13.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken22 = null;
        boolean boolean23 = filteringParserDelegate21.hasToken(jsonToken22);
        java.io.Writer writer24 = null;
        int int25 = filteringParserDelegate21.releaseBuffered(writer24);
        com.fasterxml.jackson.core.JsonToken jsonToken26 = filteringParserDelegate21._currToken;
        filteringParserDelegate21._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken29 = filteringParserDelegate21.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext30 = filteringParserDelegate21._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser31 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter32 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate35 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser31, tokenFilter32, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = null;
        boolean boolean37 = filteringParserDelegate35.hasToken(jsonToken36);
        java.io.Writer writer38 = null;
        int int39 = filteringParserDelegate35.releaseBuffered(writer38);
        com.fasterxml.jackson.core.JsonToken jsonToken40 = filteringParserDelegate35._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter42 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate45 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser41, tokenFilter42, false, false);
        java.io.Writer writer46 = null;
        int int47 = filteringParserDelegate45.releaseBuffered(writer46);
        boolean boolean48 = filteringParserDelegate45._allowMultipleMatches;
        java.io.OutputStream outputStream49 = null;
        int int50 = filteringParserDelegate45.releaseBuffered(outputStream49);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext51 = filteringParserDelegate45._headContext;
        filteringParserDelegate35._headContext = tokenFilterContext51;
        filteringParserDelegate21._exposedContext = tokenFilterContext51;
        filteringParserDelegate13._exposedContext = tokenFilterContext51;
        filteringParserDelegate4._exposedContext = tokenFilterContext51;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertNull(tokenFilter16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(jsonToken26);
        org.junit.Assert.assertNull(jsonToken29);
        org.junit.Assert.assertNotNull(tokenFilterContext30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(jsonToken40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext51);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        int int14 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = null;
        filteringParserDelegate4._currToken = jsonToken14;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(tokenFilter13);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser18, tokenFilter19, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = null;
        boolean boolean24 = filteringParserDelegate22.hasToken(jsonToken23);
        java.io.Writer writer25 = null;
        int int26 = filteringParserDelegate22.releaseBuffered(writer25);
        com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate22._currToken;
        filteringParserDelegate22._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken30 = filteringParserDelegate22.getCurrentToken();
        int int31 = filteringParserDelegate22.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate22._headContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken33 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(jsonToken27);
        org.junit.Assert.assertNull(jsonToken30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext32);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate13._lastClearedToken = jsonToken17;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser20 = filteringParserDelegate13.setFeatureMask((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext7 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tokenFilterContext7);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        int int10 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        boolean boolean17 = filteringParserDelegate15.hasToken(jsonToken16);
        com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate15.getCurrentToken();
        filteringParserDelegate15._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        filteringParserDelegate15._lastClearedToken = jsonToken21;
        filteringParserDelegate15.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate11.hasToken(jsonToken12);
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate11.releaseBuffered(writer14);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate11._currToken;
        filteringParserDelegate11._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate11.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate11._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext20;
        java.lang.Class<?> wildcardClass22 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(tokenFilterContext20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter16, true, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation20 = filteringParserDelegate4.getTokenLocation();
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
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate13.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate13.getLastClearedToken();
        java.lang.String str16 = filteringParserDelegate13.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate13.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.configure(feature15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken30 = null;
        boolean boolean31 = filteringParserDelegate29.hasToken(jsonToken30);
        java.io.Writer writer32 = null;
        int int33 = filteringParserDelegate29.releaseBuffered(writer32);
        com.fasterxml.jackson.core.JsonToken jsonToken34 = filteringParserDelegate29._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter36 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate39 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser35, tokenFilter36, false, false);
        java.io.Writer writer40 = null;
        int int41 = filteringParserDelegate39.releaseBuffered(writer40);
        boolean boolean42 = filteringParserDelegate39._allowMultipleMatches;
        java.io.OutputStream outputStream43 = null;
        int int44 = filteringParserDelegate39.releaseBuffered(outputStream43);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext45 = filteringParserDelegate39._headContext;
        filteringParserDelegate29._headContext = tokenFilterContext45;
        filteringParserDelegate4._exposedContext = tokenFilterContext45;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertNotNull(tokenFilterContext23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext45);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        boolean boolean18 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean19 = filteringParserDelegate4.nextBooleanValue();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        java.lang.String str9 = filteringParserDelegate4.getCurrentName();
        int int10 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.Base64Variant base64Variant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = filteringParserDelegate4.getBinaryValue(base64Variant11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        boolean boolean13 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, false, false);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate14.releaseBuffered(writer15);
        boolean boolean17 = filteringParserDelegate14._allowMultipleMatches;
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate14.releaseBuffered(outputStream18);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext20;
        com.fasterxml.jackson.core.JsonToken jsonToken22 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext20);
        org.junit.Assert.assertNull(jsonToken22);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = filteringParserDelegate4.getValueAsDouble((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, false, false);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate14.releaseBuffered(writer15);
        boolean boolean17 = filteringParserDelegate14._allowMultipleMatches;
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate14.releaseBuffered(outputStream18);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext20;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        boolean boolean20 = filteringParserDelegate4.hasToken(jsonToken19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.Base64Variant base64Variant15 = null;
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.readBinaryValue(base64Variant15, outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.nextLongValue((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema14);
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema7 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(jsonToken6);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        int int12 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = filteringParserDelegate4.nextLongValue(1L);
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
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        boolean boolean18 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int19 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema20 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        boolean boolean18 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int19 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken13;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser14 = filteringParserDelegate4.enable(feature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.lang.String str13 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream15 = null;
        int int16 = filteringParserDelegate4.releaseBuffered(outputStream15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.canUseSchema(formatSchema8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate4.hasTextCharacters();
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
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = filteringParserDelegate4.getValueAsLong((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(tokenFilter11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        filteringParserDelegate4._matchCount = 'a';
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        boolean boolean16 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = filteringParserDelegate4.getLongValue();
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
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation13 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.io.OutputStream outputStream17 = null;
        int int18 = filteringParserDelegate13.releaseBuffered(outputStream17);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext19 = filteringParserDelegate13._headContext;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = filteringParserDelegate13.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext19);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version8 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType8 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(tokenFilterContext12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.enable(feature15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        boolean boolean10 = filteringParserDelegate4.hasToken(jsonToken9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        boolean boolean9 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.overrideFormatFeatures((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            byte byte26 = filteringParserDelegate4.getByteValue();
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
        org.junit.Assert.assertNotNull(tokenFilterContext25);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = null;
        filteringParserDelegate15._exposedContext = tokenFilterContext16;
        int int18 = filteringParserDelegate15._matchCount;
        java.io.OutputStream outputStream19 = null;
        int int20 = filteringParserDelegate15.releaseBuffered(outputStream19);
        int int21 = filteringParserDelegate15.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        filteringParserDelegate15._itemFilter = tokenFilter22;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) tokenFilter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser13 = filteringParserDelegate4.enable(feature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        boolean boolean22 = filteringParserDelegate4.hasToken(jsonToken21);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jsonToken23);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.enable(feature16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        java.io.Writer writer10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(writer10);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        int int13 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        filteringParserDelegate20._lastClearedToken = jsonToken21;
        filteringParserDelegate20._matchCount = (-1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = filteringParserDelegate20.getTypeId();
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
        org.junit.Assert.assertNotNull(jsonStreamContext16);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean10 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation11 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4.getLastClearedToken();
        boolean boolean16 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.disable(feature17);
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
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.io.Writer writer16 = null;
        int int17 = filteringParserDelegate15.releaseBuffered(writer16);
        boolean boolean18 = filteringParserDelegate15._allowMultipleMatches;
        java.io.OutputStream outputStream19 = null;
        int int20 = filteringParserDelegate15.releaseBuffered(outputStream19);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate15._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext21;
        boolean boolean24 = filteringParserDelegate4.hasTokenId((int) (byte) 1);
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.requiresCustomCodec();
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
        org.junit.Assert.assertNotNull(jsonStreamContext17);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        boolean boolean10 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.io.OutputStream outputStream15 = null;
        int int16 = filteringParserDelegate4.releaseBuffered(outputStream15);
        // The following exception was thrown during execution in test generation
        try {
            float float17 = filteringParserDelegate4.getFloatValue();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        boolean boolean12 = filteringParserDelegate11.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate11.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation17 = filteringParserDelegate4.getTokenLocation();
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
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertNull(jsonToken16);
    }
}

