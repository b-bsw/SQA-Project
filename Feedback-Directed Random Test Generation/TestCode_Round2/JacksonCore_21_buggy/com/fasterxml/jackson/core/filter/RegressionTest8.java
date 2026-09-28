package com.fasterxml.jackson.core.filter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        boolean boolean12 = filteringParserDelegate11._allowMultipleMatches;
        filteringParserDelegate11._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate19.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray28, "");
        com.fasterxml.jackson.core.JsonToken jsonToken35 = filteringParserDelegate4.getLastClearedToken();
        boolean boolean36 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate40 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter37, false, true);
        com.fasterxml.jackson.core.JsonParser jsonParser41 = filteringParserDelegate40.skipChildren();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonParser41);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.canUseSchema(formatSchema14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate30._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext31;
        com.fasterxml.jackson.core.JsonToken jsonToken33 = filteringParserDelegate4.currentToken();
        boolean boolean35 = filteringParserDelegate4.hasTokenId((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double37 = filteringParserDelegate4.getValueAsDouble((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext31);
        org.junit.Assert.assertNull(jsonToken33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder10 = filteringParserDelegate4.getNonBlockingInputFeeder();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(nonBlockingInputFeeder10);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = filteringParserDelegate4._filterContext();
        int int20 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext21 = filteringParserDelegate4._filterContext();
        boolean boolean22 = filteringParserDelegate4.hasCurrentToken();
        boolean boolean23 = filteringParserDelegate4.canParseAsync();
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jsonToken24);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.JsonToken jsonToken26 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        filteringParserDelegate4.rootFilter = tokenFilter27;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = null;
        filteringParserDelegate4._itemFilter = tokenFilter29;
        boolean boolean31 = filteringParserDelegate4.hasCurrentToken();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = jsonParser6.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._currToken = jsonToken11;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.currentToken();
        boolean boolean14 = filteringParserDelegate4._includePath;
        int int15 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean16 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4.rootFilter = tokenFilter8;
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, true, false);
        boolean boolean16 = filteringParserDelegate15._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate15.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser18, tokenFilter19, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder23 = filteringParserDelegate22.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate22._exposedContext;
        boolean boolean25 = filteringParserDelegate22._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder31 = filteringParserDelegate30.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate30._exposedContext;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate30.setRequestPayloadOnError(byteArray39, "");
        filteringParserDelegate22.setRequestPayloadOnError(byteArray39, "");
        com.fasterxml.jackson.core.JsonParser jsonParser44 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter45 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate48 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser44, tokenFilter45, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext49 = filteringParserDelegate48._headContext;
        filteringParserDelegate22._exposedContext = tokenFilterContext49;
        filteringParserDelegate15._exposedContext = tokenFilterContext49;
        filteringParserDelegate4._headContext = tokenFilterContext49;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            double double55 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNull(nonBlockingInputFeeder23);
        org.junit.Assert.assertNull(tokenFilterContext24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder31);
        org.junit.Assert.assertNull(tokenFilterContext32);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext49);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        int int14 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken15;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        boolean boolean22 = filteringParserDelegate21._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate21.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext24 = filteringParserDelegate21._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = filteringParserDelegate21.rootFilter;
        int int26 = filteringParserDelegate21._matchCount;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate31 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser27, tokenFilter28, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter32 = null;
        filteringParserDelegate31._itemFilter = tokenFilter32;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate31, tokenFilter34, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter39 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate42 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser38, tokenFilter39, true, false);
        boolean boolean43 = filteringParserDelegate42._allowMultipleMatches;
        filteringParserDelegate42._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter46 = filteringParserDelegate42.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser47 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter48 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate51 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser47, tokenFilter48, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext52 = filteringParserDelegate51._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter53 = null;
        filteringParserDelegate51.rootFilter = tokenFilter53;
        com.fasterxml.jackson.core.JsonParser jsonParser55 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter56 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate59 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser55, tokenFilter56, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder60 = filteringParserDelegate59.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext61 = filteringParserDelegate59._exposedContext;
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate59.setRequestPayloadOnError(byteArray68, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext71 = filteringParserDelegate59._headContext;
        filteringParserDelegate51._headContext = tokenFilterContext71;
        filteringParserDelegate42._exposedContext = tokenFilterContext71;
        filteringParserDelegate37._exposedContext = tokenFilterContext71;
        filteringParserDelegate21._headContext = tokenFilterContext71;
        filteringParserDelegate4._headContext = tokenFilterContext71;
        int int77 = filteringParserDelegate4.getMatchCount();
        int int78 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4.clearCurrentToken();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNotNull(jsonStreamContext24);
        org.junit.Assert.assertNull(tokenFilter25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(tokenFilter46);
        org.junit.Assert.assertNotNull(tokenFilterContext52);
        org.junit.Assert.assertNull(nonBlockingInputFeeder60);
        org.junit.Assert.assertNull(tokenFilterContext61);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext71);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload10 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload10);
        boolean boolean12 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext13 = filteringParserDelegate4.getParsingContext();
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate4.releaseBuffered(writer14);
        int int16 = filteringParserDelegate4.currentTokenId();
        boolean boolean17 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        filteringParserDelegate4.rootFilter = tokenFilter18;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        boolean boolean13 = filteringParserDelegate12._allowMultipleMatches;
        filteringParserDelegate12._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = filteringParserDelegate12.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext22 = filteringParserDelegate21._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        filteringParserDelegate21.rootFilter = tokenFilter23;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder30 = filteringParserDelegate29.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate29._exposedContext;
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate29.setRequestPayloadOnError(byteArray38, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext41 = filteringParserDelegate29._headContext;
        filteringParserDelegate21._headContext = tokenFilterContext41;
        filteringParserDelegate12._exposedContext = tokenFilterContext41;
        com.fasterxml.jackson.core.JsonParser jsonParser44 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter45 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate48 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser44, tokenFilter45, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext49 = filteringParserDelegate48._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter50 = null;
        filteringParserDelegate48.rootFilter = tokenFilter50;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = filteringParserDelegate48.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder53 = filteringParserDelegate48.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter54 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate57 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate48, tokenFilter54, true, false);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter59 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate62 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser58, tokenFilter59, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder63 = filteringParserDelegate62.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext64 = filteringParserDelegate62._exposedContext;
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate62.setRequestPayloadOnError(byteArray71, "");
        filteringParserDelegate57.setRequestPayloadOnError(byteArray71, "hi!");
        filteringParserDelegate12.setRequestPayloadOnError(byteArray71, "hi!");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray71, "");
        // The following exception was thrown during execution in test generation
        try {
            long long81 = filteringParserDelegate4.getValueAsLong((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(tokenFilter16);
        org.junit.Assert.assertNotNull(tokenFilterContext22);
        org.junit.Assert.assertNull(nonBlockingInputFeeder30);
        org.junit.Assert.assertNull(tokenFilterContext31);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext41);
        org.junit.Assert.assertNotNull(tokenFilterContext49);
        org.junit.Assert.assertNull(tokenFilter52);
        org.junit.Assert.assertNull(nonBlockingInputFeeder53);
        org.junit.Assert.assertNull(nonBlockingInputFeeder63);
        org.junit.Assert.assertNull(tokenFilterContext64);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4._itemFilter = tokenFilter12;
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.SerializableString serializableString15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.nextFieldName(serializableString15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext7 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate12._headContext;
        filteringParserDelegate12.setRequestPayloadOnError("");
        filteringParserDelegate12._matchCount = 10;
        filteringParserDelegate12._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload20 = null;
        filteringParserDelegate12.setRequestPayloadOnError(requestPayload20);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = filteringParserDelegate12._itemFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder23 = filteringParserDelegate12.getNonBlockingInputFeeder();
        filteringParserDelegate12._matchCount = (byte) 100;
        boolean boolean26 = filteringParserDelegate12._includeImmediateParent;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder27 = filteringParserDelegate12.getNonBlockingInputFeeder();
        int int28 = filteringParserDelegate12.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = filteringParserDelegate12._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext29;
        java.io.OutputStream outputStream31 = null;
        int int32 = filteringParserDelegate4.releaseBuffered(outputStream31);
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNull(tokenFilterContext7);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
        org.junit.Assert.assertNull(tokenFilter22);
        org.junit.Assert.assertNull(nonBlockingInputFeeder23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        java.io.Writer writer19 = null;
        int int20 = filteringParserDelegate4.releaseBuffered(writer19);
        filteringParserDelegate4._includeImmediateParent = true;
        int int23 = filteringParserDelegate4.currentTokenId();
        int int24 = filteringParserDelegate4.getCurrentTokenId();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        boolean boolean10 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4._itemFilter;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int11 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4._itemFilter;
        int int13 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        filteringParserDelegate4.rootFilter = tokenFilter14;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(tokenFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(tokenFilter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter9, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        filteringParserDelegate4._itemFilter = tokenFilter13;
        boolean boolean15 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken16;
        int int18 = filteringParserDelegate4.getFormatFeatures();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter18, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate28 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser24, tokenFilter25, true, false);
        boolean boolean29 = filteringParserDelegate28._allowMultipleMatches;
        filteringParserDelegate28._includeImmediateParent = false;
        boolean boolean32 = filteringParserDelegate28.isExpectedStartObjectToken();
        int int33 = filteringParserDelegate28.getCurrentTokenId();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload34 = null;
        filteringParserDelegate28.setRequestPayloadOnError(requestPayload34);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate40 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser36, tokenFilter37, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext41 = filteringParserDelegate40._headContext;
        filteringParserDelegate40.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext44 = filteringParserDelegate40._headContext;
        filteringParserDelegate28._headContext = tokenFilterContext44;
        filteringParserDelegate4._headContext = tokenFilterContext44;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext41);
        org.junit.Assert.assertNotNull(tokenFilterContext44);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        boolean boolean8 = filteringParserDelegate4.hasTokenId(100);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload9 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload9);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.skipChildren();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(tokenFilter11);
        org.junit.Assert.assertNotNull(jsonParser12);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        filteringParserDelegate4.rootFilter = tokenFilter14;
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext22 = filteringParserDelegate21._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        filteringParserDelegate21.rootFilter = tokenFilter23;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder30 = filteringParserDelegate29.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate29._exposedContext;
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate29.setRequestPayloadOnError(byteArray38, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext41 = filteringParserDelegate29._headContext;
        filteringParserDelegate21._headContext = tokenFilterContext41;
        filteringParserDelegate4._exposedContext = tokenFilterContext41;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext44 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4._includePath = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean47 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNotNull(tokenFilterContext22);
        org.junit.Assert.assertNull(nonBlockingInputFeeder30);
        org.junit.Assert.assertNull(tokenFilterContext31);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext41);
        org.junit.Assert.assertNotNull(tokenFilterContext44);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = filteringParserDelegate4.getValueAsDouble((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload9 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload9);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = filteringParserDelegate4._filterContext();
        boolean boolean12 = filteringParserDelegate4._allowMultipleMatches;
        java.lang.String str13 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._currToken;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken27;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = filteringParserDelegate4.getFilter();
        boolean boolean30 = filteringParserDelegate4.hasCurrentToken();
        filteringParserDelegate4._includePath = false;
        boolean boolean33 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext34 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload35 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload35);
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter26);
        org.junit.Assert.assertNull(tokenFilter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext34);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken27;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = filteringParserDelegate4.getFilter();
        boolean boolean30 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter32 = null;
        filteringParserDelegate4._itemFilter = tokenFilter32;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter26);
        org.junit.Assert.assertNull(tokenFilter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(tokenFilterContext31);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4._itemFilter = tokenFilter12;
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4.rootFilter = tokenFilter15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.getCurrentToken();
        boolean boolean19 = filteringParserDelegate4.hasTokenId((int) (short) 1);
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        int int14 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload15 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext18 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        filteringParserDelegate4._currToken = jsonToken19;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate4._itemFilter;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNotNull(jsonStreamContext18);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        boolean boolean22 = filteringParserDelegate19._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate27 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser23, tokenFilter24, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder28 = filteringParserDelegate27.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = filteringParserDelegate27._exposedContext;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate27.setRequestPayloadOnError(byteArray36, "");
        filteringParserDelegate19.setRequestPayloadOnError(byteArray36, "");
        com.fasterxml.jackson.core.JsonParser jsonParser41 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter42 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate45 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser41, tokenFilter42, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext46 = filteringParserDelegate45._headContext;
        filteringParserDelegate19._exposedContext = tokenFilterContext46;
        filteringParserDelegate4._exposedContext = tokenFilterContext46;
        java.lang.String str49 = filteringParserDelegate4.getCurrentName();
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken53 = filteringParserDelegate4.getCurrentToken();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder28);
        org.junit.Assert.assertNull(tokenFilterContext29);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(tokenFilter52);
        org.junit.Assert.assertNull(jsonToken53);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._currToken = jsonToken11;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext13 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload14 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload14);
        com.fasterxml.jackson.core.JsonToken jsonToken16 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken16;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext18 = filteringParserDelegate4._filterContext();
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNotNull(jsonStreamContext13);
        org.junit.Assert.assertNotNull(jsonStreamContext18);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate15._headContext;
        filteringParserDelegate15.setRequestPayloadOnError("");
        filteringParserDelegate15._matchCount = 10;
        filteringParserDelegate15._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload23 = null;
        filteringParserDelegate15.setRequestPayloadOnError(requestPayload23);
        int int25 = filteringParserDelegate15.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken26 = null;
        boolean boolean27 = filteringParserDelegate15.hasToken(jsonToken26);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate32 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser28, tokenFilter29, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder33 = filteringParserDelegate32.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext34 = filteringParserDelegate32._exposedContext;
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate32.setRequestPayloadOnError(byteArray41, "");
        filteringParserDelegate15.setRequestPayloadOnError(byteArray41, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNotNull(tokenFilterContext16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder33);
        org.junit.Assert.assertNull(tokenFilterContext34);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        java.io.OutputStream outputStream14 = null;
        int int15 = filteringParserDelegate13.releaseBuffered(outputStream14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate20._headContext;
        filteringParserDelegate20.setRequestPayloadOnError("");
        filteringParserDelegate20._matchCount = 10;
        filteringParserDelegate20._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload28 = null;
        filteringParserDelegate20.setRequestPayloadOnError(requestPayload28);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = filteringParserDelegate20._itemFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder31 = filteringParserDelegate20.getNonBlockingInputFeeder();
        filteringParserDelegate20._matchCount = (byte) 100;
        boolean boolean34 = filteringParserDelegate20._includeImmediateParent;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder35 = filteringParserDelegate20.getNonBlockingInputFeeder();
        int int36 = filteringParserDelegate20.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext37 = filteringParserDelegate20._headContext;
        filteringParserDelegate13._headContext = tokenFilterContext37;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate13._headContext;
        boolean boolean41 = filteringParserDelegate13.hasTokenId((int) ' ');
        boolean boolean43 = filteringParserDelegate13.hasTokenId((int) (byte) 100);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser46 = filteringParserDelegate13.configure(feature44, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext21);
        org.junit.Assert.assertNull(tokenFilter30);
        org.junit.Assert.assertNull(nonBlockingInputFeeder31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext37);
        org.junit.Assert.assertNotNull(tokenFilterContext39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate30._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext31;
        com.fasterxml.jackson.core.JsonToken jsonToken33 = null;
        boolean boolean34 = filteringParserDelegate4.hasToken(jsonToken33);
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext12 = filteringParserDelegate11._exposedContext;
        filteringParserDelegate11.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = filteringParserDelegate11.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        boolean boolean20 = filteringParserDelegate19._allowMultipleMatches;
        filteringParserDelegate19._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = filteringParserDelegate19.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate28 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser24, tokenFilter25, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = filteringParserDelegate28._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = null;
        filteringParserDelegate28.rootFilter = tokenFilter30;
        com.fasterxml.jackson.core.JsonParser jsonParser32 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter33 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate36 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser32, tokenFilter33, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder37 = filteringParserDelegate36.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext38 = filteringParserDelegate36._exposedContext;
        byte[] byteArray45 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate36.setRequestPayloadOnError(byteArray45, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext48 = filteringParserDelegate36._headContext;
        filteringParserDelegate28._headContext = tokenFilterContext48;
        filteringParserDelegate19._exposedContext = tokenFilterContext48;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate55 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser51, tokenFilter52, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext56 = filteringParserDelegate55._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter57 = null;
        filteringParserDelegate55.rootFilter = tokenFilter57;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter59 = filteringParserDelegate55.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder60 = filteringParserDelegate55.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter61 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate64 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate55, tokenFilter61, true, false);
        com.fasterxml.jackson.core.JsonParser jsonParser65 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter66 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate69 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser65, tokenFilter66, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder70 = filteringParserDelegate69.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext71 = filteringParserDelegate69._exposedContext;
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate69.setRequestPayloadOnError(byteArray78, "");
        filteringParserDelegate64.setRequestPayloadOnError(byteArray78, "hi!");
        filteringParserDelegate19.setRequestPayloadOnError(byteArray78, "hi!");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray78, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext87 = filteringParserDelegate11._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext87;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext6);
        org.junit.Assert.assertNull(tokenFilterContext12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(tokenFilter23);
        org.junit.Assert.assertNotNull(tokenFilterContext29);
        org.junit.Assert.assertNull(nonBlockingInputFeeder37);
        org.junit.Assert.assertNull(tokenFilterContext38);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext48);
        org.junit.Assert.assertNotNull(tokenFilterContext56);
        org.junit.Assert.assertNull(tokenFilter59);
        org.junit.Assert.assertNull(nonBlockingInputFeeder60);
        org.junit.Assert.assertNull(nonBlockingInputFeeder70);
        org.junit.Assert.assertNull(tokenFilterContext71);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext87);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        int int17 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = null;
        filteringParserDelegate4._currToken = jsonToken18;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext20 = filteringParserDelegate4._filterContext();
        boolean boolean22 = filteringParserDelegate4.hasTokenId((int) (short) 100);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate4.currentToken();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(jsonStreamContext20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNull(jsonToken24);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        java.io.OutputStream outputStream26 = null;
        int int27 = filteringParserDelegate4.releaseBuffered(outputStream26);
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec32 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4._itemFilter;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int11 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4.clearCurrentToken();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(tokenFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        int int8 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.readBinaryValue(base64Variant7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate14._itemFilter = tokenFilter15;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate14, tokenFilter17, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser21, tokenFilter22, true, false);
        boolean boolean26 = filteringParserDelegate25._allowMultipleMatches;
        filteringParserDelegate25._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = filteringParserDelegate25.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser30 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter31 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate34 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser30, tokenFilter31, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext35 = filteringParserDelegate34._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter36 = null;
        filteringParserDelegate34.rootFilter = tokenFilter36;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter39 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate42 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser38, tokenFilter39, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder43 = filteringParserDelegate42.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext44 = filteringParserDelegate42._exposedContext;
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate42.setRequestPayloadOnError(byteArray51, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext54 = filteringParserDelegate42._headContext;
        filteringParserDelegate34._headContext = tokenFilterContext54;
        filteringParserDelegate25._exposedContext = tokenFilterContext54;
        filteringParserDelegate20._exposedContext = tokenFilterContext54;
        filteringParserDelegate4._headContext = tokenFilterContext54;
        int int59 = filteringParserDelegate4.currentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(tokenFilter29);
        org.junit.Assert.assertNotNull(tokenFilterContext35);
        org.junit.Assert.assertNull(nonBlockingInputFeeder43);
        org.junit.Assert.assertNull(tokenFilterContext44);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder15 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._matchCount = (byte) 100;
        int int18 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            float float19 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder15 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._matchCount = (byte) 100;
        boolean boolean18 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder19 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean20 = filteringParserDelegate4.isExpectedStartArrayToken();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        com.fasterxml.jackson.core.util.RequestPayload requestPayload16 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        java.lang.Class<?> wildcardClass10 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        int int17 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = null;
        filteringParserDelegate4._currToken = jsonToken18;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        filteringParserDelegate4._currToken = jsonToken20;
        boolean boolean22 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = filteringParserDelegate4.isEnabled(feature24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonParser23);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        int int17 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(tokenFilter18);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        boolean boolean10 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.setFeatureMask(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken28 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonToken jsonToken30 = null;
        filteringParserDelegate4._currToken = jsonToken30;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal32 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter26);
        org.junit.Assert.assertNull(jsonToken27);
        org.junit.Assert.assertNull(jsonToken28);
        org.junit.Assert.assertNotNull(tokenFilterContext29);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4._itemFilter = tokenFilter9;
        int int11 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser12, tokenFilter13, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder17 = filteringParserDelegate16.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        filteringParserDelegate16._itemFilter = tokenFilter18;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        filteringParserDelegate16.rootFilter = tokenFilter20;
        boolean boolean22 = filteringParserDelegate16._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate27 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser23, tokenFilter24, true, false);
        boolean boolean28 = filteringParserDelegate27._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken29 = filteringParserDelegate27.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser30 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter31 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate34 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser30, tokenFilter31, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder35 = filteringParserDelegate34.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate34._exposedContext;
        boolean boolean37 = filteringParserDelegate34._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter39 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate42 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser38, tokenFilter39, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder43 = filteringParserDelegate42.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext44 = filteringParserDelegate42._exposedContext;
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate42.setRequestPayloadOnError(byteArray51, "");
        filteringParserDelegate34.setRequestPayloadOnError(byteArray51, "");
        com.fasterxml.jackson.core.JsonParser jsonParser56 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter57 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate60 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser56, tokenFilter57, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext61 = filteringParserDelegate60._headContext;
        filteringParserDelegate34._exposedContext = tokenFilterContext61;
        filteringParserDelegate27._exposedContext = tokenFilterContext61;
        filteringParserDelegate16._headContext = tokenFilterContext61;
        filteringParserDelegate4._exposedContext = tokenFilterContext61;
        // The following exception was thrown during execution in test generation
        try {
            int int66 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(nonBlockingInputFeeder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(jsonToken29);
        org.junit.Assert.assertNull(nonBlockingInputFeeder35);
        org.junit.Assert.assertNull(tokenFilterContext36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder43);
        org.junit.Assert.assertNull(tokenFilterContext44);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext61);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        int int14 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        boolean boolean16 = filteringParserDelegate4.hasToken(jsonToken15);
        filteringParserDelegate4._matchCount = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = filteringParserDelegate4.getParsingContext();
        boolean boolean9 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, true, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate14.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(outputStream9);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4.rootFilter;
        filteringParserDelegate4._matchCount = (short) 10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter14, false, false);
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(tokenFilter11);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        filteringParserDelegate4.clearCurrentToken();
        boolean boolean10 = filteringParserDelegate4.hasTokenId(0);
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser13 = filteringParserDelegate4.configure(feature11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4.rootFilter = tokenFilter12;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._includeImmediateParent = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        boolean boolean10 = filteringParserDelegate4._includePath;
        filteringParserDelegate4._matchCount = (byte) 1;
        boolean boolean13 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload14 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload14);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload16 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload16);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = filteringParserDelegate4.rootFilter;
        boolean boolean12 = filteringParserDelegate4.hasTokenId(1);
        boolean boolean13 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilter10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        filteringParserDelegate11._matchCount = '4';
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate11.getParsingContext();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate11.disable(feature15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload7 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._lastClearedToken;
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._exposedContext;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(tokenFilterContext11);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        int int17 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = null;
        filteringParserDelegate4._currToken = jsonToken18;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(jsonParser20);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.currentToken();
        boolean boolean13 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        java.io.Writer writer19 = null;
        int int20 = filteringParserDelegate4.releaseBuffered(writer19);
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = filteringParserDelegate4._itemFilter;
        int int24 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(tokenFilter23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder14 = filteringParserDelegate13.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate13._exposedContext;
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate13.setRequestPayloadOnError(byteArray22, "");
        boolean boolean25 = filteringParserDelegate13.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext26 = filteringParserDelegate13.getParsingContext();
        filteringParserDelegate13.clearCurrentToken();
        boolean boolean28 = filteringParserDelegate13.canParseAsync();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = filteringParserDelegate13.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser30 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter31 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate34 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser30, tokenFilter31, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder35 = filteringParserDelegate34.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate34._exposedContext;
        boolean boolean37 = filteringParserDelegate34._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter39 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate42 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser38, tokenFilter39, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder43 = filteringParserDelegate42.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext44 = filteringParserDelegate42._exposedContext;
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate42.setRequestPayloadOnError(byteArray51, "");
        filteringParserDelegate34.setRequestPayloadOnError(byteArray51, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter56 = filteringParserDelegate34.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken57 = null;
        filteringParserDelegate34._lastClearedToken = jsonToken57;
        com.fasterxml.jackson.core.JsonParser jsonParser59 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter60 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate63 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser59, tokenFilter60, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder64 = filteringParserDelegate63.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext65 = filteringParserDelegate63._exposedContext;
        boolean boolean66 = filteringParserDelegate63._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser67 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter68 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate71 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser67, tokenFilter68, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder72 = filteringParserDelegate71.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext73 = filteringParserDelegate71._exposedContext;
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate71.setRequestPayloadOnError(byteArray80, "");
        filteringParserDelegate63.setRequestPayloadOnError(byteArray80, "");
        boolean boolean85 = filteringParserDelegate63.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext86 = filteringParserDelegate63._headContext;
        filteringParserDelegate34._exposedContext = tokenFilterContext86;
        filteringParserDelegate13._exposedContext = tokenFilterContext86;
        filteringParserDelegate4._exposedContext = tokenFilterContext86;
        int int90 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            float float91 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nonBlockingInputFeeder14);
        org.junit.Assert.assertNull(tokenFilterContext15);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(tokenFilter29);
        org.junit.Assert.assertNull(nonBlockingInputFeeder35);
        org.junit.Assert.assertNull(tokenFilterContext36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder43);
        org.junit.Assert.assertNull(tokenFilterContext44);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter56);
        org.junit.Assert.assertNull(nonBlockingInputFeeder64);
        org.junit.Assert.assertNull(tokenFilterContext65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder72);
        org.junit.Assert.assertNull(tokenFilterContext73);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate14, tokenFilter16, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate14._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = null;
        filteringParserDelegate14._currToken = jsonToken21;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate14.currentToken();
        boolean boolean24 = filteringParserDelegate14._includePath;
        boolean boolean25 = filteringParserDelegate14._includeImmediateParent;
        int int26 = filteringParserDelegate14.getMatchCount();
        boolean boolean27 = filteringParserDelegate14._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken28 = null;
        boolean boolean29 = filteringParserDelegate14.hasToken(jsonToken28);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter31 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate34 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser30, tokenFilter31, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder35 = filteringParserDelegate34.getNonBlockingInputFeeder();
        boolean boolean36 = filteringParserDelegate34.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser37 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter38 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate41 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser37, tokenFilter38, true, false);
        boolean boolean42 = filteringParserDelegate41._allowMultipleMatches;
        filteringParserDelegate41._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser45 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter46 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate49 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser45, tokenFilter46, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder50 = filteringParserDelegate49.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext51 = filteringParserDelegate49._exposedContext;
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate49.setRequestPayloadOnError(byteArray58, "");
        filteringParserDelegate41.setRequestPayloadOnError(byteArray58, "");
        filteringParserDelegate34.setRequestPayloadOnError(byteArray58, "");
        filteringParserDelegate14.setRequestPayloadOnError(byteArray58, "hi!");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray58, "");
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder50);
        org.junit.Assert.assertNull(tokenFilterContext51);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        java.io.OutputStream outputStream14 = null;
        int int15 = filteringParserDelegate13.releaseBuffered(outputStream14);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate20._headContext;
        filteringParserDelegate20.setRequestPayloadOnError("");
        filteringParserDelegate20._matchCount = 10;
        filteringParserDelegate20._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload28 = null;
        filteringParserDelegate20.setRequestPayloadOnError(requestPayload28);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = filteringParserDelegate20._itemFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder31 = filteringParserDelegate20.getNonBlockingInputFeeder();
        filteringParserDelegate20._matchCount = (byte) 100;
        boolean boolean34 = filteringParserDelegate20._includeImmediateParent;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder35 = filteringParserDelegate20.getNonBlockingInputFeeder();
        int int36 = filteringParserDelegate20.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext37 = filteringParserDelegate20._headContext;
        filteringParserDelegate13._headContext = tokenFilterContext37;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter39 = null;
        filteringParserDelegate13._itemFilter = tokenFilter39;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext21);
        org.junit.Assert.assertNull(tokenFilter30);
        org.junit.Assert.assertNull(nonBlockingInputFeeder31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext37);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        filteringParserDelegate4._matchCount = 100;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser21 = filteringParserDelegate4.overrideStdFeatures((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        boolean boolean12 = filteringParserDelegate11._allowMultipleMatches;
        filteringParserDelegate11._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate19.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray28, "");
        com.fasterxml.jackson.core.JsonToken jsonToken35 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken35);
        org.junit.Assert.assertNull(tokenFilterContext36);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        int int8 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._headContext;
        java.lang.String str10 = filteringParserDelegate4.getCurrentName();
        int int11 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.nextIntValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        filteringParserDelegate4._allowMultipleMatches = true;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter9, true, false);
        java.io.Writer writer13 = null;
        int int14 = filteringParserDelegate4.releaseBuffered(writer13);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4._matchCount = (byte) -1;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload20 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload20);
        java.io.Writer writer22 = null;
        int int23 = filteringParserDelegate4.releaseBuffered(writer22);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload24 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload24);
        filteringParserDelegate4._includeImmediateParent = true;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser14, tokenFilter15, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder19 = filteringParserDelegate18.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate18._exposedContext;
        byte[] byteArray27 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate18.setRequestPayloadOnError(byteArray27, "");
        filteringParserDelegate13.setRequestPayloadOnError(byteArray27, "hi!");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter32 = filteringParserDelegate13.rootFilter;
        filteringParserDelegate13._matchCount = 100;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertNull(nonBlockingInputFeeder19);
        org.junit.Assert.assertNull(tokenFilterContext20);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter32);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4.clearCurrentToken();
        boolean boolean10 = filteringParserDelegate4.canParseAsync();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4._itemFilter;
        java.lang.Class<?> wildcardClass12 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(tokenFilter11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter12, true, true);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate15._headContext;
        boolean boolean17 = filteringParserDelegate15.isExpectedStartObjectToken();
        boolean boolean18 = filteringParserDelegate15._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        filteringParserDelegate15._currToken = jsonToken19;
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser21, tokenFilter22, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder26 = filteringParserDelegate25.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext27 = filteringParserDelegate25._exposedContext;
        boolean boolean28 = filteringParserDelegate25._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate33 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser29, tokenFilter30, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder34 = filteringParserDelegate33.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext35 = filteringParserDelegate33._exposedContext;
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate33.setRequestPayloadOnError(byteArray42, "");
        filteringParserDelegate25.setRequestPayloadOnError(byteArray42, "");
        com.fasterxml.jackson.core.JsonParser jsonParser47 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter48 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate51 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser47, tokenFilter48, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext52 = filteringParserDelegate51._headContext;
        filteringParserDelegate25._exposedContext = tokenFilterContext52;
        filteringParserDelegate15._headContext = tokenFilterContext52;
        int int55 = filteringParserDelegate15._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean56 = filteringParserDelegate15.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder26);
        org.junit.Assert.assertNull(tokenFilterContext27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder34);
        org.junit.Assert.assertNull(tokenFilterContext35);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, true);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate13.getValueAsInt((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(tokenFilter9);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext7 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getCurrentToken();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate12._headContext;
        filteringParserDelegate12.setRequestPayloadOnError("");
        filteringParserDelegate12._matchCount = 10;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate12._currToken;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser19, tokenFilter20, true, false);
        boolean boolean24 = filteringParserDelegate23._allowMultipleMatches;
        filteringParserDelegate23._includeImmediateParent = false;
        boolean boolean27 = filteringParserDelegate23.isExpectedStartObjectToken();
        int int28 = filteringParserDelegate23.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = filteringParserDelegate23._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext30 = filteringParserDelegate23._headContext;
        filteringParserDelegate12._headContext = tokenFilterContext30;
        filteringParserDelegate4._exposedContext = tokenFilterContext30;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser35 = filteringParserDelegate4.overrideFormatFeatures((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
        org.junit.Assert.assertNull(jsonToken18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(tokenFilterContext29);
        org.junit.Assert.assertNotNull(tokenFilterContext30);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        boolean boolean12 = filteringParserDelegate11._allowMultipleMatches;
        filteringParserDelegate11._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate19.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray28, "");
        com.fasterxml.jackson.core.JsonToken jsonToken35 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4._matchCount = 0;
        int int39 = filteringParserDelegate4.getCurrentTokenId();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken35);
        org.junit.Assert.assertNull(tokenFilterContext36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        int int14 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate4._currToken = jsonToken17;
        filteringParserDelegate4._matchCount = 100;
        filteringParserDelegate4._includePath = true;
        filteringParserDelegate4._includePath = true;
        filteringParserDelegate4._allowMultipleMatches = true;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder27 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean28 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean30 = filteringParserDelegate4.hasTokenId((int) (byte) 100);
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken33 = filteringParserDelegate4.currentToken();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(nonBlockingInputFeeder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jsonToken33);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema10 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        filteringParserDelegate4._includeImmediateParent = true;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser20 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate24 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser20, tokenFilter21, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder25 = filteringParserDelegate24.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = filteringParserDelegate24._exposedContext;
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate24.setRequestPayloadOnError(byteArray33, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate24._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext36;
        com.fasterxml.jackson.core.JsonToken jsonToken38 = filteringParserDelegate4.getLastClearedToken();
        boolean boolean39 = filteringParserDelegate4.isExpectedStartObjectToken();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(nonBlockingInputFeeder25);
        org.junit.Assert.assertNull(tokenFilterContext26);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext36);
        org.junit.Assert.assertNull(jsonToken38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        int int14 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        boolean boolean16 = filteringParserDelegate4.hasToken(jsonToken15);
        filteringParserDelegate4._matchCount = (short) -1;
        boolean boolean19 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken20;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation22 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._allowMultipleMatches = true;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate14.setRequestPayloadOnError("");
        filteringParserDelegate14._matchCount = 10;
        filteringParserDelegate14._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload22 = null;
        filteringParserDelegate14.setRequestPayloadOnError(requestPayload22);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = filteringParserDelegate14._itemFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder30 = filteringParserDelegate29.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate29._exposedContext;
        boolean boolean32 = filteringParserDelegate29._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder38 = filteringParserDelegate37.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate37._exposedContext;
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate37.setRequestPayloadOnError(byteArray46, "");
        filteringParserDelegate29.setRequestPayloadOnError(byteArray46, "");
        com.fasterxml.jackson.core.JsonParser jsonParser51 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate55 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser51, tokenFilter52, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext56 = filteringParserDelegate55._headContext;
        filteringParserDelegate29._exposedContext = tokenFilterContext56;
        filteringParserDelegate14._exposedContext = tokenFilterContext56;
        filteringParserDelegate4._exposedContext = tokenFilterContext56;
        com.fasterxml.jackson.core.JsonToken jsonToken60 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken60;
        boolean boolean62 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken63 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(tokenFilter24);
        org.junit.Assert.assertNull(nonBlockingInputFeeder30);
        org.junit.Assert.assertNull(tokenFilterContext31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder38);
        org.junit.Assert.assertNull(tokenFilterContext39);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        boolean boolean11 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = filteringParserDelegate4.getFilter();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(tokenFilter13);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._currToken = jsonToken10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter12, true, true);
        int int16 = filteringParserDelegate4.currentTokenId();
        filteringParserDelegate4.setRequestPayloadOnError("");
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter12, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate20._headContext;
        filteringParserDelegate20.setRequestPayloadOnError("");
        filteringParserDelegate20._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate30._headContext;
        filteringParserDelegate20._exposedContext = tokenFilterContext31;
        filteringParserDelegate4._headContext = tokenFilterContext31;
        boolean boolean34 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int35 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate40 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser36, tokenFilter37, true, false);
        boolean boolean41 = filteringParserDelegate40._allowMultipleMatches;
        filteringParserDelegate40._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter44 = filteringParserDelegate40.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser45 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter46 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate49 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser45, tokenFilter46, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext50 = filteringParserDelegate49._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter51 = null;
        filteringParserDelegate49.rootFilter = tokenFilter51;
        com.fasterxml.jackson.core.JsonParser jsonParser53 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter54 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate57 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser53, tokenFilter54, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder58 = filteringParserDelegate57.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext59 = filteringParserDelegate57._exposedContext;
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate57.setRequestPayloadOnError(byteArray66, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext69 = filteringParserDelegate57._headContext;
        filteringParserDelegate49._headContext = tokenFilterContext69;
        filteringParserDelegate40._exposedContext = tokenFilterContext69;
        boolean boolean72 = filteringParserDelegate40.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext73 = filteringParserDelegate40._headContext;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(tokenFilterContext31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(tokenFilter44);
        org.junit.Assert.assertNotNull(tokenFilterContext50);
        org.junit.Assert.assertNull(nonBlockingInputFeeder58);
        org.junit.Assert.assertNull(tokenFilterContext59);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext73);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext8 = filteringParserDelegate4._headContext;
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4.clearCurrentToken();
        boolean boolean10 = filteringParserDelegate4.canParseAsync();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser13, tokenFilter14, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext18 = filteringParserDelegate17._headContext;
        filteringParserDelegate17.setRequestPayloadOnError("");
        filteringParserDelegate17._matchCount = 10;
        filteringParserDelegate17._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload25 = null;
        filteringParserDelegate17.setRequestPayloadOnError(requestPayload25);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate17, tokenFilter27, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser31 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter32 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate35 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser31, tokenFilter32, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder36 = filteringParserDelegate35.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext37 = filteringParserDelegate35._exposedContext;
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate35.setRequestPayloadOnError(byteArray44, "");
        boolean boolean47 = filteringParserDelegate35.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext48 = filteringParserDelegate35.getParsingContext();
        filteringParserDelegate35.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser51 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate55 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser51, tokenFilter52, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder56 = filteringParserDelegate55.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext57 = filteringParserDelegate55._exposedContext;
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate55.setRequestPayloadOnError(byteArray64, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext67 = filteringParserDelegate55._headContext;
        filteringParserDelegate35._exposedContext = tokenFilterContext67;
        filteringParserDelegate30._exposedContext = tokenFilterContext67;
        filteringParserDelegate4._headContext = tokenFilterContext67;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(tokenFilterContext18);
        org.junit.Assert.assertNull(nonBlockingInputFeeder36);
        org.junit.Assert.assertNull(tokenFilterContext37);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext48);
        org.junit.Assert.assertNull(nonBlockingInputFeeder56);
        org.junit.Assert.assertNull(tokenFilterContext57);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext67);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4._itemFilter = tokenFilter8;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        filteringParserDelegate4.rootFilter = tokenFilter18;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec20 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter9, true, true);
        int int13 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        java.io.Writer writer11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(writer11);
        int int13 = filteringParserDelegate4.getMatchCount();
        boolean boolean14 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext22 = filteringParserDelegate21._headContext;
        filteringParserDelegate21.setRequestPayloadOnError("");
        filteringParserDelegate21._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate31 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser27, tokenFilter28, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate31._headContext;
        filteringParserDelegate21._exposedContext = tokenFilterContext32;
        filteringParserDelegate4._headContext = tokenFilterContext32;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext22);
        org.junit.Assert.assertNotNull(tokenFilterContext32);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.isEnabled(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter11);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._allowMultipleMatches = true;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate14.setRequestPayloadOnError("");
        filteringParserDelegate14._matchCount = 10;
        filteringParserDelegate14._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload22 = null;
        filteringParserDelegate14.setRequestPayloadOnError(requestPayload22);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = filteringParserDelegate14._itemFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder30 = filteringParserDelegate29.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate29._exposedContext;
        boolean boolean32 = filteringParserDelegate29._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder38 = filteringParserDelegate37.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate37._exposedContext;
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate37.setRequestPayloadOnError(byteArray46, "");
        filteringParserDelegate29.setRequestPayloadOnError(byteArray46, "");
        com.fasterxml.jackson.core.JsonParser jsonParser51 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate55 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser51, tokenFilter52, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext56 = filteringParserDelegate55._headContext;
        filteringParserDelegate29._exposedContext = tokenFilterContext56;
        filteringParserDelegate14._exposedContext = tokenFilterContext56;
        filteringParserDelegate4._exposedContext = tokenFilterContext56;
        com.fasterxml.jackson.core.JsonToken jsonToken60 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken60;
        boolean boolean62 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload63 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload63);
        boolean boolean65 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload66 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload66);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(tokenFilter24);
        org.junit.Assert.assertNull(nonBlockingInputFeeder30);
        org.junit.Assert.assertNull(tokenFilterContext31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder38);
        org.junit.Assert.assertNull(tokenFilterContext39);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext18 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext18;
        boolean boolean20 = filteringParserDelegate4._includeImmediateParent;
        filteringParserDelegate4._matchCount = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation23 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        int int17 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = filteringParserDelegate4.getFilter();
        boolean boolean19 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter20, false, true);
        com.fasterxml.jackson.core.JsonToken jsonToken24 = null;
        filteringParserDelegate4._currToken = jsonToken24;
        com.fasterxml.jackson.core.JsonToken jsonToken26 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext27 = filteringParserDelegate4._exposedContext;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(tokenFilter18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(jsonToken26);
        org.junit.Assert.assertNotNull(tokenFilterContext27);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        boolean boolean6 = filteringParserDelegate4._includePath;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        int int10 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.setFeatureMask(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.currentToken();
        java.lang.String str17 = filteringParserDelegate4.getCurrentName();
        int int18 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter19, false, true);
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4.getParsingContext();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext26;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate31 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter28, true, true);
        java.lang.String str32 = filteringParserDelegate4.getCurrentName();
        int int33 = filteringParserDelegate4._matchCount;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter9, true, true);
        int int13 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = filteringParserDelegate4.nextLongValue((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.JsonToken jsonToken21 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload22 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload22);
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(jsonToken21);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext26;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate31 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter28, true, true);
        int int32 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext38 = filteringParserDelegate37._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter39 = null;
        filteringParserDelegate37.rootFilter = tokenFilter39;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter41 = filteringParserDelegate37.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder42 = filteringParserDelegate37.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter43 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate46 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate37, tokenFilter43, true, false);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter48 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate51 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser47, tokenFilter48, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext52 = filteringParserDelegate51._headContext;
        filteringParserDelegate51.setRequestPayloadOnError("");
        filteringParserDelegate51._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser57 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter58 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate61 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser57, tokenFilter58, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext62 = filteringParserDelegate61._headContext;
        filteringParserDelegate51._exposedContext = tokenFilterContext62;
        filteringParserDelegate37._headContext = tokenFilterContext62;
        filteringParserDelegate4._headContext = tokenFilterContext62;
        com.fasterxml.jackson.core.JsonToken jsonToken66 = null;
        boolean boolean67 = filteringParserDelegate4.hasToken(jsonToken66);
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext38);
        org.junit.Assert.assertNull(tokenFilter41);
        org.junit.Assert.assertNull(nonBlockingInputFeeder42);
        org.junit.Assert.assertNotNull(tokenFilterContext52);
        org.junit.Assert.assertNotNull(tokenFilterContext62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        java.io.OutputStream outputStream7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(outputStream7);
        filteringParserDelegate4._matchCount = (byte) 100;
        com.fasterxml.jackson.core.SerializableString serializableString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.nextFieldName(serializableString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext19 = filteringParserDelegate4._filterContext();
        int int20 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext21 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation22 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext21);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4._itemFilter = tokenFilter10;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter16, false, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser21 = filteringParserDelegate4.enable(feature20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._allowMultipleMatches = true;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate14.setRequestPayloadOnError("");
        filteringParserDelegate14._matchCount = 10;
        filteringParserDelegate14._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload22 = null;
        filteringParserDelegate14.setRequestPayloadOnError(requestPayload22);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = filteringParserDelegate14._itemFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder30 = filteringParserDelegate29.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate29._exposedContext;
        boolean boolean32 = filteringParserDelegate29._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder38 = filteringParserDelegate37.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate37._exposedContext;
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate37.setRequestPayloadOnError(byteArray46, "");
        filteringParserDelegate29.setRequestPayloadOnError(byteArray46, "");
        com.fasterxml.jackson.core.JsonParser jsonParser51 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate55 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser51, tokenFilter52, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext56 = filteringParserDelegate55._headContext;
        filteringParserDelegate29._exposedContext = tokenFilterContext56;
        filteringParserDelegate14._exposedContext = tokenFilterContext56;
        filteringParserDelegate4._exposedContext = tokenFilterContext56;
        com.fasterxml.jackson.core.JsonToken jsonToken60 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken60;
        boolean boolean62 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(tokenFilter24);
        org.junit.Assert.assertNull(nonBlockingInputFeeder30);
        org.junit.Assert.assertNull(tokenFilterContext31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder38);
        org.junit.Assert.assertNull(tokenFilterContext39);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter9, true, true);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload13 = null;
        filteringParserDelegate12.setRequestPayloadOnError(requestPayload13);
        boolean boolean15 = filteringParserDelegate12.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = filteringParserDelegate12.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken28 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter26);
        org.junit.Assert.assertNull(jsonToken27);
        org.junit.Assert.assertNull(jsonToken28);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._matchCount = (-1);
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        int int10 = filteringParserDelegate4.currentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4._itemFilter = tokenFilter11;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4.clearCurrentToken();
        int int10 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken11;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getCurrentToken();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser20 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate24 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser20, tokenFilter21, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder25 = filteringParserDelegate24.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = filteringParserDelegate24._exposedContext;
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate24.setRequestPayloadOnError(byteArray33, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate24._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext36;
        int int38 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation39 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(nonBlockingInputFeeder25);
        org.junit.Assert.assertNull(tokenFilterContext26);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        int int17 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder18 = filteringParserDelegate4.getNonBlockingInputFeeder();
        java.io.Writer writer19 = null;
        int int20 = filteringParserDelegate4.releaseBuffered(writer19);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(nonBlockingInputFeeder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._currToken = jsonToken11;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getCurrentToken();
        boolean boolean14 = filteringParserDelegate4.canParseAsync();
        filteringParserDelegate4.setRequestPayloadOnError("");
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter9);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = (byte) 0;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.getValueAsInt((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        int int14 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload15 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4._lastClearedToken;
        java.lang.String str18 = filteringParserDelegate4.getCurrentName();
        boolean boolean19 = filteringParserDelegate4.canParseAsync();
        // The following exception was thrown during execution in test generation
        try {
            short short20 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        boolean boolean10 = filteringParserDelegate4.hasTokenId((int) 'a');
        int int11 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean12 = filteringParserDelegate4._includeImmediateParent;
        filteringParserDelegate4.clearCurrentToken();
        boolean boolean14 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder21 = filteringParserDelegate20.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext22 = filteringParserDelegate20._exposedContext;
        boolean boolean23 = filteringParserDelegate20._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate28 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser24, tokenFilter25, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder29 = filteringParserDelegate28.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext30 = filteringParserDelegate28._exposedContext;
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate28.setRequestPayloadOnError(byteArray37, "");
        filteringParserDelegate20.setRequestPayloadOnError(byteArray37, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter42 = filteringParserDelegate20.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken43 = null;
        filteringParserDelegate20._lastClearedToken = jsonToken43;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter45 = filteringParserDelegate20.getFilter();
        boolean boolean46 = filteringParserDelegate20.hasCurrentToken();
        filteringParserDelegate20._includePath = false;
        boolean boolean49 = filteringParserDelegate20.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext50 = filteringParserDelegate20._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext50;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNull(nonBlockingInputFeeder21);
        org.junit.Assert.assertNull(tokenFilterContext22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder29);
        org.junit.Assert.assertNull(tokenFilterContext30);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter42);
        org.junit.Assert.assertNull(tokenFilter45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext50);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        int int14 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate4._currToken = jsonToken17;
        filteringParserDelegate4._matchCount = 100;
        int int21 = filteringParserDelegate4.getCurrentTokenId();
        java.io.Writer writer22 = null;
        int int23 = filteringParserDelegate4.releaseBuffered(writer22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4._itemFilter = tokenFilter9;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, true, false);
        boolean boolean16 = filteringParserDelegate15._allowMultipleMatches;
        filteringParserDelegate15._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser19, tokenFilter20, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder24 = filteringParserDelegate23.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate23._exposedContext;
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate23.setRequestPayloadOnError(byteArray32, "");
        filteringParserDelegate15.setRequestPayloadOnError(byteArray32, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray32, "hi!");
        java.io.OutputStream outputStream39 = null;
        int int40 = filteringParserDelegate4.releaseBuffered(outputStream39);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation41 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder24);
        org.junit.Assert.assertNull(tokenFilterContext25);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, true, true);
        boolean boolean15 = filteringParserDelegate14.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate14.disable(feature16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        boolean boolean10 = filteringParserDelegate4.hasTokenId((int) (short) -1);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, false, true);
        boolean boolean15 = filteringParserDelegate4.hasCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = true;
        java.io.Writer writer18 = null;
        int int19 = filteringParserDelegate4.releaseBuffered(writer18);
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        boolean boolean9 = filteringParserDelegate4.hasToken(jsonToken8);
        boolean boolean10 = filteringParserDelegate4.hasCurrentToken();
        filteringParserDelegate4._matchCount = (short) 10;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._lastClearedToken;
        boolean boolean14 = filteringParserDelegate4._allowMultipleMatches;
        int int15 = filteringParserDelegate4.getMatchCount();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken6;
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter5);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        boolean boolean22 = filteringParserDelegate19._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate27 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser23, tokenFilter24, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder28 = filteringParserDelegate27.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = filteringParserDelegate27._exposedContext;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate27.setRequestPayloadOnError(byteArray36, "");
        filteringParserDelegate19.setRequestPayloadOnError(byteArray36, "");
        com.fasterxml.jackson.core.JsonParser jsonParser41 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter42 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate45 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser41, tokenFilter42, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext46 = filteringParserDelegate45._headContext;
        filteringParserDelegate19._exposedContext = tokenFilterContext46;
        filteringParserDelegate4._exposedContext = tokenFilterContext46;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload49 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload49);
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder28);
        org.junit.Assert.assertNull(tokenFilterContext29);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext46);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4._includePath = false;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser21 = filteringParserDelegate4.enable(feature20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._currToken = jsonToken11;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._includePath = false;
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate4.currentToken();
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        filteringParserDelegate4._includePath = true;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter12, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate20._headContext;
        filteringParserDelegate20.setRequestPayloadOnError("");
        filteringParserDelegate20._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate30._headContext;
        filteringParserDelegate20._exposedContext = tokenFilterContext31;
        filteringParserDelegate4._headContext = tokenFilterContext31;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter35 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate38 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser34, tokenFilter35, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate38._headContext;
        filteringParserDelegate38.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext42 = filteringParserDelegate38._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext42;
        java.io.Writer writer44 = null;
        int int45 = filteringParserDelegate4.releaseBuffered(writer44);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray46 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(tokenFilterContext31);
        org.junit.Assert.assertNotNull(tokenFilterContext39);
        org.junit.Assert.assertNotNull(tokenFilterContext42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        int int8 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._currToken = jsonToken11;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.currentToken();
        boolean boolean14 = filteringParserDelegate4._includePath;
        int int15 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        java.io.Writer writer11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(writer11);
        int int13 = filteringParserDelegate4.getMatchCount();
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        boolean boolean20 = filteringParserDelegate19._allowMultipleMatches;
        filteringParserDelegate19._includeImmediateParent = false;
        boolean boolean23 = filteringParserDelegate19.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate19._currToken;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate19._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext25;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = null;
        filteringParserDelegate4._currToken = jsonToken27;
        // The following exception was thrown during execution in test generation
        try {
            float float29 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jsonToken24);
        org.junit.Assert.assertNotNull(tokenFilterContext25);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        boolean boolean11 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean12 = filteringParserDelegate4.hasCurrentToken();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = filteringParserDelegate4.rootFilter;
        boolean boolean11 = filteringParserDelegate4.canParseAsync();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(tokenFilter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartArrayToken();
        filteringParserDelegate4._matchCount = (short) 10;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartArrayToken();
        java.io.Writer writer11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(writer11);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter14, true, true);
        int int18 = filteringParserDelegate17.getMatchCount();
        boolean boolean19 = filteringParserDelegate17._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType20 = filteringParserDelegate17.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        int int14 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean15 = filteringParserDelegate4.canParseAsync();
        // The following exception was thrown during execution in test generation
        try {
            byte byte16 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4._filterContext();
        boolean boolean16 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean18 = filteringParserDelegate4.hasTokenId((int) (short) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser19, tokenFilter20, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = null;
        filteringParserDelegate23._itemFilter = tokenFilter24;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder31 = filteringParserDelegate30.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate30._exposedContext;
        boolean boolean33 = filteringParserDelegate30._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter35 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate38 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser34, tokenFilter35, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder39 = filteringParserDelegate38.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext40 = filteringParserDelegate38._exposedContext;
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate38.setRequestPayloadOnError(byteArray47, "");
        filteringParserDelegate30.setRequestPayloadOnError(byteArray47, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = filteringParserDelegate30.rootFilter;
        boolean boolean53 = filteringParserDelegate30._allowMultipleMatches;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext54 = filteringParserDelegate30._headContext;
        filteringParserDelegate23._headContext = tokenFilterContext54;
        filteringParserDelegate4._headContext = tokenFilterContext54;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder31);
        org.junit.Assert.assertNull(tokenFilterContext32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder39);
        org.junit.Assert.assertNull(tokenFilterContext40);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext54);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        java.io.Writer writer11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(writer11);
        int int13 = filteringParserDelegate4.getMatchCount();
        boolean boolean14 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        boolean boolean20 = filteringParserDelegate19._allowMultipleMatches;
        filteringParserDelegate19._includeImmediateParent = false;
        boolean boolean23 = filteringParserDelegate19.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate19._currToken;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate19._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext25;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext27 = filteringParserDelegate4._exposedContext;
        java.io.OutputStream outputStream28 = null;
        int int29 = filteringParserDelegate4.releaseBuffered(outputStream28);
        com.fasterxml.jackson.core.JsonToken jsonToken30 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext31 = filteringParserDelegate4.getParsingContext();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jsonToken24);
        org.junit.Assert.assertNotNull(tokenFilterContext25);
        org.junit.Assert.assertNull(tokenFilterContext27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(jsonToken30);
        org.junit.Assert.assertNotNull(jsonStreamContext31);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        boolean boolean12 = filteringParserDelegate11._allowMultipleMatches;
        filteringParserDelegate11._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate19.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray28, "");
        com.fasterxml.jackson.core.JsonToken jsonToken35 = filteringParserDelegate4.getLastClearedToken();
        boolean boolean37 = filteringParserDelegate4.hasTokenId((int) (byte) 10);
        java.io.Writer writer38 = null;
        int int39 = filteringParserDelegate4.releaseBuffered(writer38);
        boolean boolean40 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken41 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken42 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken43 = filteringParserDelegate4.getCurrentToken();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jsonToken41);
        org.junit.Assert.assertNull(jsonToken42);
        org.junit.Assert.assertNull(jsonToken43);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken27;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = filteringParserDelegate4.getFilter();
        boolean boolean30 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken31 = null;
        filteringParserDelegate4._currToken = jsonToken31;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter33 = filteringParserDelegate4.rootFilter;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter26);
        org.junit.Assert.assertNull(tokenFilter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(tokenFilter33);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload9 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload9);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = filteringParserDelegate4._filterContext();
        boolean boolean12 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._currToken;
        java.lang.String str14 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec16 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        int int19 = filteringParserDelegate4.getCurrentTokenId();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._allowMultipleMatches = true;
        int int8 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(outputStream9);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, false, false);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartArrayToken();
        int int8 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        filteringParserDelegate4.rootFilter = tokenFilter14;
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload17 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload17);
        boolean boolean19 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = filteringParserDelegate4.getValueAsDouble((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        filteringParserDelegate4.rootFilter = tokenFilter12;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._matchCount = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.nextIntValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter9, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder14 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNull(nonBlockingInputFeeder14);
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        boolean boolean10 = filteringParserDelegate4.hasTokenId((int) 'a');
        int int11 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean12 = filteringParserDelegate4._includeImmediateParent;
        filteringParserDelegate4.clearCurrentToken();
        boolean boolean14 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str15 = filteringParserDelegate4.getCurrentName();
        filteringParserDelegate4._matchCount = 100;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._matchCount = (short) -1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = filteringParserDelegate4.currentToken();
        boolean boolean23 = filteringParserDelegate4.canParseAsync();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate28 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser24, tokenFilter25, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder29 = filteringParserDelegate28.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext30 = filteringParserDelegate28._exposedContext;
        boolean boolean31 = filteringParserDelegate28._includeImmediateParent;
        int int32 = filteringParserDelegate28.getFormatFeatures();
        filteringParserDelegate28.clearCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        filteringParserDelegate28._itemFilter = tokenFilter34;
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate40 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser36, tokenFilter37, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext41 = filteringParserDelegate40._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter42 = null;
        filteringParserDelegate40.rootFilter = tokenFilter42;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter44 = filteringParserDelegate40.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder45 = filteringParserDelegate40.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter46 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate49 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate40, tokenFilter46, true, false);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter51 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate54 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser50, tokenFilter51, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder55 = filteringParserDelegate54.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext56 = filteringParserDelegate54._exposedContext;
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate54.setRequestPayloadOnError(byteArray63, "");
        filteringParserDelegate49.setRequestPayloadOnError(byteArray63, "hi!");
        filteringParserDelegate28.setRequestPayloadOnError(byteArray63, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray63, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter72 = null;
        filteringParserDelegate4._itemFilter = tokenFilter72;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter74 = filteringParserDelegate4._itemFilter;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(tokenFilter21);
        org.junit.Assert.assertNull(jsonToken22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder29);
        org.junit.Assert.assertNull(tokenFilterContext30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext41);
        org.junit.Assert.assertNull(tokenFilter44);
        org.junit.Assert.assertNull(nonBlockingInputFeeder45);
        org.junit.Assert.assertNull(nonBlockingInputFeeder55);
        org.junit.Assert.assertNull(tokenFilterContext56);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter74);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._matchCount = (short) -1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken23 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken23;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, true, false);
        boolean boolean30 = filteringParserDelegate29._allowMultipleMatches;
        filteringParserDelegate29._includeImmediateParent = false;
        boolean boolean33 = filteringParserDelegate29.isExpectedStartObjectToken();
        int int34 = filteringParserDelegate29.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext35 = filteringParserDelegate29._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate29._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext36;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(tokenFilter21);
        org.junit.Assert.assertNull(jsonToken22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(tokenFilterContext35);
        org.junit.Assert.assertNotNull(tokenFilterContext36);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext15;
        int int17 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken18 = null;
        filteringParserDelegate4._currToken = jsonToken18;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        filteringParserDelegate4._currToken = jsonToken20;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate26 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser22, tokenFilter23, true, false);
        boolean boolean27 = filteringParserDelegate26._allowMultipleMatches;
        filteringParserDelegate26._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = filteringParserDelegate26.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser31 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter32 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate35 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser31, tokenFilter32, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate35._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = null;
        filteringParserDelegate35.rootFilter = tokenFilter37;
        com.fasterxml.jackson.core.JsonParser jsonParser39 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter40 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate43 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser39, tokenFilter40, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder44 = filteringParserDelegate43.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext45 = filteringParserDelegate43._exposedContext;
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate43.setRequestPayloadOnError(byteArray52, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext55 = filteringParserDelegate43._headContext;
        filteringParserDelegate35._headContext = tokenFilterContext55;
        filteringParserDelegate26._exposedContext = tokenFilterContext55;
        boolean boolean58 = filteringParserDelegate26.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext59 = filteringParserDelegate26._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext59;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(tokenFilter30);
        org.junit.Assert.assertNotNull(tokenFilterContext36);
        org.junit.Assert.assertNull(nonBlockingInputFeeder44);
        org.junit.Assert.assertNull(tokenFilterContext45);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext59);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4._itemFilter;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int11 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser14 = filteringParserDelegate4.disable(feature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(tokenFilter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(tokenFilter12);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4.rootFilter = tokenFilter11;
        boolean boolean13 = filteringParserDelegate4.canParseAsync();
        com.fasterxml.jackson.core.JsonToken jsonToken14 = null;
        filteringParserDelegate4._currToken = jsonToken14;
        boolean boolean17 = filteringParserDelegate4.hasTokenId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken18 = null;
        boolean boolean19 = filteringParserDelegate4.hasToken(jsonToken18);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(tokenFilter20);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4.rootFilter = tokenFilter8;
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, true, false);
        boolean boolean16 = filteringParserDelegate15._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate15.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser18, tokenFilter19, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder23 = filteringParserDelegate22.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate22._exposedContext;
        boolean boolean25 = filteringParserDelegate22._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder31 = filteringParserDelegate30.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate30._exposedContext;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate30.setRequestPayloadOnError(byteArray39, "");
        filteringParserDelegate22.setRequestPayloadOnError(byteArray39, "");
        com.fasterxml.jackson.core.JsonParser jsonParser44 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter45 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate48 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser44, tokenFilter45, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext49 = filteringParserDelegate48._headContext;
        filteringParserDelegate22._exposedContext = tokenFilterContext49;
        filteringParserDelegate15._exposedContext = tokenFilterContext49;
        filteringParserDelegate4._headContext = tokenFilterContext49;
        int int53 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext54 = filteringParserDelegate4._exposedContext;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNull(nonBlockingInputFeeder23);
        org.junit.Assert.assertNull(tokenFilterContext24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder31);
        org.junit.Assert.assertNull(tokenFilterContext32);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(tokenFilterContext54);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate4._headContext;
        filteringParserDelegate4._includePath = true;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        int int14 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate4._currToken = jsonToken17;
        filteringParserDelegate4._matchCount = 100;
        filteringParserDelegate4._includePath = true;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload25 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload25);
        boolean boolean27 = filteringParserDelegate4.hasCurrentToken();
        java.lang.String str28 = filteringParserDelegate4.getCurrentName();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._allowMultipleMatches = true;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext15 = filteringParserDelegate14._headContext;
        filteringParserDelegate14.setRequestPayloadOnError("");
        filteringParserDelegate14._matchCount = 10;
        filteringParserDelegate14._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload22 = null;
        filteringParserDelegate14.setRequestPayloadOnError(requestPayload22);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter24 = filteringParserDelegate14._itemFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate29 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser25, tokenFilter26, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder30 = filteringParserDelegate29.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate29._exposedContext;
        boolean boolean32 = filteringParserDelegate29._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder38 = filteringParserDelegate37.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate37._exposedContext;
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate37.setRequestPayloadOnError(byteArray46, "");
        filteringParserDelegate29.setRequestPayloadOnError(byteArray46, "");
        com.fasterxml.jackson.core.JsonParser jsonParser51 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter52 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate55 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser51, tokenFilter52, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext56 = filteringParserDelegate55._headContext;
        filteringParserDelegate29._exposedContext = tokenFilterContext56;
        filteringParserDelegate14._exposedContext = tokenFilterContext56;
        filteringParserDelegate4._exposedContext = tokenFilterContext56;
        com.fasterxml.jackson.core.JsonToken jsonToken60 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken60;
        boolean boolean62 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.util.RequestPayload requestPayload63 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload63);
        com.fasterxml.jackson.core.JsonToken jsonToken65 = null;
        filteringParserDelegate4._currToken = jsonToken65;
        filteringParserDelegate4._allowMultipleMatches = true;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(tokenFilter24);
        org.junit.Assert.assertNull(nonBlockingInputFeeder30);
        org.junit.Assert.assertNull(tokenFilterContext31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder38);
        org.junit.Assert.assertNull(tokenFilterContext39);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean6 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken18 = null;
        boolean boolean19 = filteringParserDelegate4.hasToken(jsonToken18);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = filteringParserDelegate4.nextLongValue((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = null;
        filteringParserDelegate4._currToken = jsonToken6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        boolean boolean7 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        java.io.Writer writer11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(writer11);
        boolean boolean13 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        boolean boolean12 = filteringParserDelegate11._allowMultipleMatches;
        filteringParserDelegate11._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate19.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray28, "");
        com.fasterxml.jackson.core.JsonToken jsonToken35 = filteringParserDelegate4.getLastClearedToken();
        boolean boolean37 = filteringParserDelegate4.hasTokenId((int) (byte) 10);
        int int38 = filteringParserDelegate4.getCurrentTokenId();
        boolean boolean39 = filteringParserDelegate4.hasCurrentToken();
        boolean boolean40 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal41 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        boolean boolean12 = filteringParserDelegate11._allowMultipleMatches;
        filteringParserDelegate11._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate19.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray28, "");
        com.fasterxml.jackson.core.JsonToken jsonToken35 = filteringParserDelegate4.getLastClearedToken();
        boolean boolean37 = filteringParserDelegate4.hasTokenId((int) (byte) 10);
        java.io.Writer writer38 = null;
        int int39 = filteringParserDelegate4.releaseBuffered(writer38);
        boolean boolean40 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken41 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType42 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jsonToken41);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4._itemFilter = tokenFilter9;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4.rootFilter = tokenFilter11;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        filteringParserDelegate4.clearCurrentToken();
        int int9 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4.clearCurrentToken();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext26;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate31 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter28, true, true);
        filteringParserDelegate31._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = filteringParserDelegate31.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter9);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        int int14 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken15;
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        filteringParserDelegate4._currToken = jsonToken17;
        filteringParserDelegate4._matchCount = 100;
        com.fasterxml.jackson.core.JsonParser jsonParser21 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation23 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(jsonParser22);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext9;
        java.io.Writer writer11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(writer11);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        filteringParserDelegate4._currToken = jsonToken13;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = filteringParserDelegate4.getFilter();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext26;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate31 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter28, true, true);
        java.lang.String str32 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter33 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext34 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation35 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(tokenFilter33);
        org.junit.Assert.assertNull(tokenFilterContext34);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4._matchCount;
        java.lang.String str10 = filteringParserDelegate4.getCurrentName();
        int int11 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        filteringParserDelegate4._allowMultipleMatches = true;
        java.io.OutputStream outputStream10 = null;
        int int11 = filteringParserDelegate4.releaseBuffered(outputStream10);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder12 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(nonBlockingInputFeeder12);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        int int10 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4._matchCount = 'a';
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser13, tokenFilter14, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder18 = filteringParserDelegate17.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext19 = filteringParserDelegate17._exposedContext;
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate17.setRequestPayloadOnError(byteArray26, "");
        boolean boolean29 = filteringParserDelegate17.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext30 = filteringParserDelegate17.getParsingContext();
        filteringParserDelegate17.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder38 = filteringParserDelegate37.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate37._exposedContext;
        byte[] byteArray46 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate37.setRequestPayloadOnError(byteArray46, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext49 = filteringParserDelegate37._headContext;
        filteringParserDelegate17._exposedContext = tokenFilterContext49;
        int int51 = filteringParserDelegate17._matchCount;
        int int52 = filteringParserDelegate17._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter53 = filteringParserDelegate17.getFilter();
        byte[] byteArray57 = new byte[] { (byte) 0, (byte) 1, (byte) 100 };
        filteringParserDelegate17.setRequestPayloadOnError(byteArray57, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray57, "");
        com.fasterxml.jackson.core.util.RequestPayload requestPayload62 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload62);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean64 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(nonBlockingInputFeeder18);
        org.junit.Assert.assertNull(tokenFilterContext19);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext30);
        org.junit.Assert.assertNull(nonBlockingInputFeeder38);
        org.junit.Assert.assertNull(tokenFilterContext39);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(tokenFilter53);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = null;
        boolean boolean13 = filteringParserDelegate4.hasToken(jsonToken12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter12, true, true);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate15._headContext;
        boolean boolean17 = filteringParserDelegate15.isExpectedStartObjectToken();
        boolean boolean18 = filteringParserDelegate15._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken19 = null;
        filteringParserDelegate15._currToken = jsonToken19;
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser21, tokenFilter22, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder26 = filteringParserDelegate25.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext27 = filteringParserDelegate25._exposedContext;
        boolean boolean28 = filteringParserDelegate25._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser29 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate33 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser29, tokenFilter30, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder34 = filteringParserDelegate33.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext35 = filteringParserDelegate33._exposedContext;
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate33.setRequestPayloadOnError(byteArray42, "");
        filteringParserDelegate25.setRequestPayloadOnError(byteArray42, "");
        com.fasterxml.jackson.core.JsonParser jsonParser47 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter48 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate51 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser47, tokenFilter48, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext52 = filteringParserDelegate51._headContext;
        filteringParserDelegate25._exposedContext = tokenFilterContext52;
        filteringParserDelegate15._headContext = tokenFilterContext52;
        boolean boolean56 = filteringParserDelegate15.hasTokenId((int) (byte) 0);
        java.lang.Class<?> wildcardClass57 = filteringParserDelegate15.getClass();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder26);
        org.junit.Assert.assertNull(tokenFilterContext27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder34);
        org.junit.Assert.assertNull(tokenFilterContext35);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includePath = true;
        int int12 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean13 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant14 = null;
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.readBinaryValue(base64Variant14, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        filteringParserDelegate4._allowMultipleMatches = true;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4.getParsingContext();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate30._headContext;
        filteringParserDelegate4._exposedContext = tokenFilterContext31;
        com.fasterxml.jackson.core.JsonToken jsonToken33 = filteringParserDelegate4.currentToken();
        boolean boolean35 = filteringParserDelegate4.hasTokenId((int) ' ');
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter36 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken38 = filteringParserDelegate4._currToken;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext31);
        org.junit.Assert.assertNull(jsonToken33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(tokenFilter36);
        org.junit.Assert.assertNull(tokenFilter37);
        org.junit.Assert.assertNull(jsonToken38);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4._filterContext();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken8;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._currToken = jsonToken11;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.getCurrentToken();
        boolean boolean14 = filteringParserDelegate4.canParseAsync();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation15 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4._matchCount = (byte) -1;
        boolean boolean21 = filteringParserDelegate4.hasTokenId((int) 'a');
        java.io.Writer writer22 = null;
        int int23 = filteringParserDelegate4.releaseBuffered(writer22);
        com.fasterxml.jackson.core.util.RequestPayload requestPayload24 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload24);
        com.fasterxml.jackson.core.JsonToken jsonToken26 = filteringParserDelegate4._lastClearedToken;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonToken26);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate4._itemFilter = tokenFilter15;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter11, true, true);
        boolean boolean15 = filteringParserDelegate14.isExpectedStartArrayToken();
        boolean boolean16 = filteringParserDelegate14.canParseAsync();
        int int17 = filteringParserDelegate14._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext18 = filteringParserDelegate14._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        filteringParserDelegate14._itemFilter = tokenFilter19;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate14._itemFilter;
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(tokenFilterContext18);
        org.junit.Assert.assertNull(tokenFilter21);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser6, tokenFilter7, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate10._itemFilter = tokenFilter11;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate10, tokenFilter13, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        boolean boolean22 = filteringParserDelegate21._allowMultipleMatches;
        filteringParserDelegate21._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter25 = filteringParserDelegate21.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate30._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter32 = null;
        filteringParserDelegate30.rootFilter = tokenFilter32;
        com.fasterxml.jackson.core.JsonParser jsonParser34 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter35 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate38 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser34, tokenFilter35, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder39 = filteringParserDelegate38.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext40 = filteringParserDelegate38._exposedContext;
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate38.setRequestPayloadOnError(byteArray47, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext50 = filteringParserDelegate38._headContext;
        filteringParserDelegate30._headContext = tokenFilterContext50;
        filteringParserDelegate21._exposedContext = tokenFilterContext50;
        filteringParserDelegate16._exposedContext = tokenFilterContext50;
        filteringParserDelegate4._exposedContext = tokenFilterContext50;
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number57 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(tokenFilter25);
        org.junit.Assert.assertNotNull(tokenFilterContext31);
        org.junit.Assert.assertNull(nonBlockingInputFeeder39);
        org.junit.Assert.assertNull(tokenFilterContext40);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext50);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        int int9 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, true);
        com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        filteringParserDelegate4._matchCount = (short) -1;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken23 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken23;
        com.fasterxml.jackson.core.JsonToken jsonToken25 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken25;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(tokenFilter21);
        org.junit.Assert.assertNull(jsonToken22);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        boolean boolean9 = filteringParserDelegate4.hasToken(jsonToken8);
        boolean boolean10 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4.rootFilter = tokenFilter11;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        boolean boolean6 = filteringParserDelegate4._includePath;
        int int7 = filteringParserDelegate4._matchCount;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        filteringParserDelegate4._allowMultipleMatches = false;
        int int12 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        filteringParserDelegate4.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter26 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken28 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext29 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter30 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate33 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter30, false, true);
        boolean boolean34 = filteringParserDelegate33._includePath;
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(tokenFilter26);
        org.junit.Assert.assertNull(jsonToken27);
        org.junit.Assert.assertNull(jsonToken28);
        org.junit.Assert.assertNotNull(tokenFilterContext29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getCurrentToken();
        boolean boolean9 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.nextIntValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        filteringParserDelegate4.setRequestPayloadOnError("hi!");
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext14 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext15 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.currentToken();
        boolean boolean17 = filteringParserDelegate4.isExpectedStartObjectToken();
        java.lang.String str18 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext19 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4._includePath = false;
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
        org.junit.Assert.assertNotNull(jsonStreamContext14);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(tokenFilterContext19);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = null;
        boolean boolean7 = filteringParserDelegate4.hasToken(jsonToken6);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext8 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.readBinaryValue(base64Variant9, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(tokenFilterContext8);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4._itemFilter = tokenFilter10;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._currToken = jsonToken11;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.currentToken();
        boolean boolean14 = filteringParserDelegate4._includePath;
        boolean boolean15 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter17 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate20 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser16, tokenFilter17, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate20._headContext;
        filteringParserDelegate20.setRequestPayloadOnError("");
        filteringParserDelegate20._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext31 = filteringParserDelegate30._headContext;
        filteringParserDelegate20._exposedContext = tokenFilterContext31;
        int int33 = filteringParserDelegate20._matchCount;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder34 = filteringParserDelegate20.getNonBlockingInputFeeder();
        boolean boolean35 = filteringParserDelegate20.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext36 = filteringParserDelegate20._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext36;
        java.lang.String str38 = filteringParserDelegate4.getCurrentName();
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(tokenFilterContext31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNull(nonBlockingInputFeeder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        int int14 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = null;
        boolean boolean16 = filteringParserDelegate4.hasToken(jsonToken15);
        filteringParserDelegate4._matchCount = (short) -1;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder19 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean20 = filteringParserDelegate4.hasCurrentToken();
        filteringParserDelegate4._includePath = true;
        com.fasterxml.jackson.core.JsonToken jsonToken23 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate4.currentToken();
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(nonBlockingInputFeeder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNull(jsonToken24);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(outputStream11);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate4.getNonBlockingInputFeeder();
        java.io.Writer writer14 = null;
        int int15 = filteringParserDelegate4.releaseBuffered(writer14);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder16 = filteringParserDelegate4.getNonBlockingInputFeeder();
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(nonBlockingInputFeeder16);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate4.getLastClearedToken();
        boolean boolean21 = filteringParserDelegate4.hasTokenId(1);
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = filteringParserDelegate4.isEnabled(feature22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

