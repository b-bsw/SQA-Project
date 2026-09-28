package com.fasterxml.jackson.core.filter;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.nextIntValue((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.enable(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version7 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            short short7 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version7 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.nextLongValue((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.enable(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = filteringParserDelegate4.getValueAsDouble((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
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
            int int10 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
            float float10 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
            int int10 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation7 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
            boolean boolean10 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version8 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = filteringParserDelegate4.nextLongValue((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.readBinaryValue(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
            byte byte12 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.readBinaryValue(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.overrideStdFeatures((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
            byte[] byteArray10 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.SerializableString serializableString5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.nextFieldName(serializableString5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
            int int12 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = filteringParserDelegate4.getBinaryValue(base64Variant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
            java.lang.String str10 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean7 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        java.lang.Class<?> wildcardClass7 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
            int int13 = filteringParserDelegate4.getTextLength();
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
            com.fasterxml.jackson.core.JsonLocation jsonLocation12 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.overrideFormatFeatures(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
            boolean boolean12 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
            com.fasterxml.jackson.core.Version version12 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
            java.lang.String str12 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
            int int11 = filteringParserDelegate4.getValueAsInt((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.isEnabled(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema6 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema7 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.SerializableString serializableString8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.nextFieldName(serializableString8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
            java.lang.Object obj10 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.enable(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = filteringParserDelegate4.getBinaryValue(base64Variant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = filteringParserDelegate4.getValueAsLong();
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
            java.lang.Boolean boolean10 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
            java.lang.Number number10 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        java.lang.Class<?> wildcardClass8 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.disable(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isEnabled(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
            java.lang.String str11 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec8 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
            int int11 = filteringParserDelegate4.nextIntValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
            java.math.BigDecimal bigDecimal14 = filteringParserDelegate4.getDecimalValue();
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
            com.fasterxml.jackson.core.ObjectCodec objectCodec11 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getValueAsInt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.canUseSchema(formatSchema7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
            boolean boolean14 = filteringParserDelegate4.canReadObjectId();
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
            boolean boolean14 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
            double double14 = filteringParserDelegate4.getValueAsDouble((double) (-1));
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
            long long12 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
            int int14 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._headContext;
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
            char[] charArray11 = filteringParserDelegate4.getTextCharacters();
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = filteringParserDelegate4.getEmbeddedObject();
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.requiresCustomCodec();
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
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
            java.lang.String str10 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
            java.lang.String str12 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
            java.lang.Boolean boolean13 = filteringParserDelegate4.nextBooleanValue();
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.getValueAsString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.disable(feature15);
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser14 = filteringParserDelegate4.configure(feature12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation9 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.overrideStdFeatures((int) (short) 0, (int) ' ');
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
            java.lang.Object obj10 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
            com.fasterxml.jackson.core.FormatSchema formatSchema11 = filteringParserDelegate4.getSchema();
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.setFeatureMask((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version7 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = filteringParserDelegate4.nextLongValue(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = filteringParserDelegate4.getBinaryValue(base64Variant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.nextIntValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.nextIntValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
            int int16 = filteringParserDelegate4.getTextOffset();
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec6 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.disable(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger14 = filteringParserDelegate4.getBigIntegerValue();
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
            com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4.nextValue();
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.setFeatureMask((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.getValueAsLong();
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
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
            byte byte10 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getValueAsInt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken14 = null;
        boolean boolean15 = filteringParserDelegate13.hasToken(jsonToken14);
        java.io.Writer writer16 = null;
        int int17 = filteringParserDelegate13.releaseBuffered(writer16);
        com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate13._currToken;
        filteringParserDelegate13._includePath = false;
        filteringParserDelegate13._includeImmediateParent = false;
        boolean boolean23 = filteringParserDelegate13.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jsonToken18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonParser8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation6 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
            com.fasterxml.jackson.core.Version version14 = filteringParserDelegate4.version();
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
            long long11 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.isEnabled(feature15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
            long long12 = filteringParserDelegate4.nextLongValue((long) (short) 10);
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            byte byte8 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
            java.lang.Object obj15 = filteringParserDelegate4.getObjectId();
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation9 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
            java.lang.Object obj11 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
            java.lang.Object obj14 = filteringParserDelegate4.getEmbeddedObject();
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = filteringParserDelegate4.nextFieldName();
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
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        // The following exception was thrown during execution in test generation
        try {
            short short9 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
            java.lang.Boolean boolean12 = filteringParserDelegate11.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
            boolean boolean10 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = filteringParserDelegate4.getBinaryValue();
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
            short short11 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
            com.fasterxml.jackson.core.JsonLocation jsonLocation14 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
            boolean boolean10 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
            float float15 = filteringParserDelegate4.getFloatValue();
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
            java.math.BigInteger bigInteger22 = filteringParserDelegate4.getBigIntegerValue();
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
            int int11 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
            java.lang.String str16 = filteringParserDelegate4.getText();
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
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = filteringParserDelegate4.getValueAsString();
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
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.Class<?> wildcardClass15 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.nextIntValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
            java.lang.Boolean boolean14 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.readBinaryValue(outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
            boolean boolean11 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
            int int12 = filteringParserDelegate4.nextIntValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema8 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = filteringParserDelegate4.getBinaryValue(base64Variant7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.getValueAsBoolean();
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
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
            com.fasterxml.jackson.core.Version version11 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation15 = filteringParserDelegate4.getCurrentLocation();
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
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
            java.lang.String str14 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
            java.lang.String str15 = filteringParserDelegate4.getText();
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate14.getValueAsBoolean(false);
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
            java.lang.Object obj13 = filteringParserDelegate4.getEmbeddedObject();
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = filteringParserDelegate4.getInputSource();
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
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
            com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = filteringParserDelegate4.getValueAsString("");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        java.lang.Class<?> wildcardClass12 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
            char[] charArray10 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
            java.lang.Object obj12 = filteringParserDelegate4.getInputSource();
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
            double double11 = filteringParserDelegate4.getDoubleValue();
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
            java.math.BigDecimal bigDecimal14 = filteringParserDelegate4.getDecimalValue();
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
            boolean boolean19 = filteringParserDelegate4.requiresCustomCodec();
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
            byte byte16 = filteringParserDelegate4.getByteValue();
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
            int int11 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
            com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.configure(feature14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
            java.lang.Number number13 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.configure(feature13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
            boolean boolean12 = filteringParserDelegate11.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.enable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        java.lang.Class<?> wildcardClass7 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = filteringParserDelegate4.getDecimalValue();
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
            com.fasterxml.jackson.core.JsonLocation jsonLocation11 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = filteringParserDelegate16.getValueAsString("");
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
            com.fasterxml.jackson.core.ObjectCodec objectCodec10 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.getValueAsString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        com.fasterxml.jackson.core.SerializableString serializableString14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.nextFieldName(serializableString14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
            java.math.BigDecimal bigDecimal10 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.SerializableString serializableString10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.nextFieldName(serializableString10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
            boolean boolean14 = filteringParserDelegate13.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
            com.fasterxml.jackson.core.JsonParser.NumberType numberType11 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
            boolean boolean10 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
            java.math.BigDecimal bigDecimal10 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.isEnabled(feature13);
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
            boolean boolean11 = filteringParserDelegate4.getBooleanValue();
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
            java.lang.String str13 = filteringParserDelegate4.getText();
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
            java.lang.String str14 = filteringParserDelegate4.nextTextValue();
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = filteringParserDelegate4.nextLongValue((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
            java.lang.Object obj10 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.setFeatureMask((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
            com.fasterxml.jackson.core.FormatSchema formatSchema13 = filteringParserDelegate4.getSchema();
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.disable(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = filteringParserDelegate4.getBinaryValue(base64Variant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
            boolean boolean16 = filteringParserDelegate4.isClosed();
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
            java.lang.String str14 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
            java.math.BigInteger bigInteger14 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.overrideFormatFeatures((int) ' ', (int) (byte) 1);
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = filteringParserDelegate4.getValueAsString("hi!");
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
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
            boolean boolean13 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.overrideStdFeatures(0, 1);
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
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
            com.fasterxml.jackson.core.JsonToken jsonToken14 = filteringParserDelegate4.nextValue();
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, false, false);
        java.io.Writer writer20 = null;
        int int21 = filteringParserDelegate19.releaseBuffered(writer20);
        boolean boolean22 = filteringParserDelegate19._allowMultipleMatches;
        java.io.OutputStream outputStream23 = null;
        int int24 = filteringParserDelegate19.releaseBuffered(outputStream23);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate19._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext25;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext25);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
            byte[] byteArray16 = filteringParserDelegate4.getBinaryValue();
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
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
            com.fasterxml.jackson.core.JsonParser jsonParser24 = filteringParserDelegate4.overrideStdFeatures((int) (short) 1, (int) (byte) 100);
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        int int7 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = filteringParserDelegate16.getBinaryValue();
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
            boolean boolean19 = filteringParserDelegate4.isClosed();
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.nextFieldName(serializableString12);
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.canUseSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = filteringParserDelegate14.getText();
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.nextIntValue(1);
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
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
            int int19 = filteringParserDelegate4.getFeatureMask();
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = filteringParserDelegate4.getValueAsDouble();
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
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec7 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.overrideStdFeatures((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, false, true);
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, false, false);
        java.io.Writer writer20 = null;
        int int21 = filteringParserDelegate19.releaseBuffered(writer20);
        boolean boolean22 = filteringParserDelegate19._allowMultipleMatches;
        java.io.OutputStream outputStream23 = null;
        int int24 = filteringParserDelegate19.releaseBuffered(outputStream23);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate19._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext25;
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
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext25);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
            java.lang.String str11 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
            filteringParserDelegate4.setCurrentValue((java.lang.Object) 100);
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = filteringParserDelegate16.getValueAsLong((long) 10);
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
            int int11 = filteringParserDelegate4.getValueAsInt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate4.disable(feature18);
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = null;
        filteringParserDelegate4._headContext = tokenFilterContext16;
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate4.enable(feature18);
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
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.Base64Variant base64Variant7 = null;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.readBinaryValue(base64Variant7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal17 = filteringParserDelegate16.getDecimalValue();
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
            byte[] byteArray15 = filteringParserDelegate4.getBinaryValue();
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
            java.lang.Object obj15 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.nextLongValue((long) 100);
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
            java.lang.Object obj14 = filteringParserDelegate13.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = filteringParserDelegate4.getBinaryValue(base64Variant9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.skipChildren();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4.rootFilter = tokenFilter8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
            java.lang.Boolean boolean11 = filteringParserDelegate4.nextBooleanValue();
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
            double double16 = filteringParserDelegate4.getValueAsDouble((double) (byte) 0);
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
            com.fasterxml.jackson.core.JsonParser.NumberType numberType13 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, false, false);
        java.io.Writer writer20 = null;
        int int21 = filteringParserDelegate19.releaseBuffered(writer20);
        boolean boolean22 = filteringParserDelegate19._allowMultipleMatches;
        java.io.OutputStream outputStream23 = null;
        int int24 = filteringParserDelegate19.releaseBuffered(outputStream23);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate19._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext25;
        // The following exception was thrown during execution in test generation
        try {
            long long28 = filteringParserDelegate4.nextLongValue((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext25);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(jsonToken25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = null;
        filteringParserDelegate4._headContext = tokenFilterContext16;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation18 = filteringParserDelegate4.getTokenLocation();
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
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.nextFieldName(serializableString12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.disable(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
            com.fasterxml.jackson.core.FormatSchema formatSchema13 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext19);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.SerializableString serializableString8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.nextFieldName(serializableString8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger16 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        boolean boolean11 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = filteringParserDelegate4.getValueAsLong();
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = null;
        boolean boolean14 = filteringParserDelegate12.hasToken(jsonToken13);
        java.io.Writer writer15 = null;
        int int16 = filteringParserDelegate12.releaseBuffered(writer15);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate12._currToken;
        filteringParserDelegate12._includePath = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext20 = filteringParserDelegate12._headContext;
        filteringParserDelegate12._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate26 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate12, tokenFilter23, true, true);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(jsonToken17);
        org.junit.Assert.assertNotNull(tokenFilterContext20);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
            int int12 = filteringParserDelegate4.getValueAsInt((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        filteringParserDelegate18._currToken = jsonToken19;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser23 = filteringParserDelegate18.overrideStdFeatures((int) 'a', (int) (short) 10);
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
            double double19 = filteringParserDelegate18.getValueAsDouble();
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = null;
        filteringParserDelegate12._exposedContext = tokenFilterContext13;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken20 = null;
        boolean boolean21 = filteringParserDelegate19.hasToken(jsonToken20);
        java.io.Writer writer22 = null;
        int int23 = filteringParserDelegate19.releaseBuffered(writer22);
        com.fasterxml.jackson.core.JsonToken jsonToken24 = filteringParserDelegate19._currToken;
        filteringParserDelegate19._includePath = false;
        com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate19.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext28 = filteringParserDelegate19._headContext;
        filteringParserDelegate12._exposedContext = tokenFilterContext28;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken30 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(jsonToken24);
        org.junit.Assert.assertNull(jsonToken27);
        org.junit.Assert.assertNotNull(tokenFilterContext28);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean9 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        com.fasterxml.jackson.core.SerializableString serializableString21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = filteringParserDelegate18.nextFieldName(serializableString21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.Class<?> wildcardClass17 = filteringParserDelegate14.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = filteringParserDelegate4.readBinaryValue(outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
            java.lang.String str10 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema16);
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, false, false);
        java.io.Writer writer20 = null;
        int int21 = filteringParserDelegate19.releaseBuffered(writer20);
        boolean boolean22 = filteringParserDelegate19._allowMultipleMatches;
        java.io.OutputStream outputStream23 = null;
        int int24 = filteringParserDelegate19.releaseBuffered(outputStream23);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate19._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext25;
        // The following exception was thrown during execution in test generation
        try {
            long long27 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext25);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
            java.lang.Object obj21 = filteringParserDelegate4.getObjectId();
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate14.nextToken();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.Base64Variant base64Variant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = filteringParserDelegate4.getBinaryValue(base64Variant12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext11);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema9 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4.rootFilter = tokenFilter8;
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.canUseSchema(formatSchema10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
            boolean boolean11 = filteringParserDelegate4.getValueAsBoolean();
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
            com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
            java.lang.String str12 = filteringParserDelegate4.getValueAsString();
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.canReadTypeId();
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
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
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema9 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation9 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.disable(feature14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
            int int19 = filteringParserDelegate4.getFeatureMask();
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
            int int37 = filteringParserDelegate4.getValueAsInt(10);
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        com.fasterxml.jackson.core.Base64Variant base64Variant14 = null;
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = filteringParserDelegate4.readBinaryValue(base64Variant14, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        int int7 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
            double double14 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation7 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
            com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4.nextToken();
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
            int int12 = filteringParserDelegate4.nextIntValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, false, false);
        java.io.Writer writer20 = null;
        int int21 = filteringParserDelegate19.releaseBuffered(writer20);
        boolean boolean22 = filteringParserDelegate19._allowMultipleMatches;
        java.io.OutputStream outputStream23 = null;
        int int24 = filteringParserDelegate19.releaseBuffered(outputStream23);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate19._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext25;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(tokenFilterContext12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext25);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isEnabled(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
            java.math.BigInteger bigInteger13 = filteringParserDelegate4.getBigIntegerValue();
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
            java.lang.Class<?> wildcardClass16 = jsonToken15.getClass();
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.overrideFormatFeatures((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
            int int20 = filteringParserDelegate18.getValueAsInt((int) ' ');
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.setFeatureMask((int) 'a');
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
            com.fasterxml.jackson.core.JsonParser jsonParser21 = filteringParserDelegate4.overrideStdFeatures((-1), 10);
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
            int int17 = filteringParserDelegate13.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec22);
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = filteringParserDelegate4.getBinaryValue(base64Variant8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
            java.lang.Object obj15 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.overrideFormatFeatures((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
            java.lang.String str12 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext10);
        org.junit.Assert.assertNull(tokenFilter15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
            com.fasterxml.jackson.core.FormatSchema formatSchema11 = filteringParserDelegate4.getSchema();
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.disable(feature16);
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
        org.junit.Assert.assertNotNull(jsonParser15);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = filteringParserDelegate4.getObjectId();
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = filteringParserDelegate4.getText();
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
            boolean boolean12 = filteringParserDelegate4.requiresCustomCodec();
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
            int int10 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
            com.fasterxml.jackson.core.FormatSchema formatSchema11 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate4.getBooleanValue();
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = filteringParserDelegate4.getValueAsLong((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.isEnabled(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.isEnabled(feature19);
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
        org.junit.Assert.assertNull(tokenFilter18);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
            long long15 = filteringParserDelegate14.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
            boolean boolean11 = filteringParserDelegate4.canReadObjectId();
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
            float float11 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
            float float13 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        int int7 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        com.fasterxml.jackson.core.JsonParser jsonParser12 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter13 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate16 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser12, tokenFilter13, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = null;
        boolean boolean18 = filteringParserDelegate16.hasToken(jsonToken17);
        java.io.Writer writer19 = null;
        int int20 = filteringParserDelegate16.releaseBuffered(writer19);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext21 = filteringParserDelegate16._filterContext();
        boolean boolean22 = filteringParserDelegate16.isExpectedStartArrayToken();
        boolean boolean24 = filteringParserDelegate16.hasTokenId(10);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
            int int16 = filteringParserDelegate4.getTextOffset();
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        int int7 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = filteringParserDelegate4.getValueAsDouble((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
            int int11 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        // The following exception was thrown during execution in test generation
        try {
            float float7 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
            com.fasterxml.jackson.core.JsonLocation jsonLocation16 = filteringParserDelegate4.getTokenLocation();
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.readBinaryValue(outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
            double double21 = filteringParserDelegate18.getValueAsDouble();
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
            java.lang.Object obj22 = filteringParserDelegate4.getEmbeddedObject();
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
            boolean boolean16 = filteringParserDelegate13.isClosed();
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.lang.Class<?> wildcardClass8 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNull(tokenFilter6);
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.nextFieldName(serializableString12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext11 = filteringParserDelegate4._headContext;
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
        org.junit.Assert.assertNotNull(tokenFilterContext11);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
            java.lang.Boolean boolean14 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
            int int11 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
            boolean boolean12 = filteringParserDelegate4.getValueAsBoolean(false);
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec10 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.isEnabled(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        com.fasterxml.jackson.core.SerializableString serializableString19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.nextFieldName(serializableString19);
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
            byte[] byteArray17 = filteringParserDelegate4.getBinaryValue();
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.setFeatureMask((-1));
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
            double double11 = filteringParserDelegate4.getValueAsDouble((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
            java.lang.Boolean boolean22 = filteringParserDelegate4.nextBooleanValue();
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._lastClearedToken;
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        boolean boolean9 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate4.readBinaryValue(base64Variant10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
            com.fasterxml.jackson.core.JsonLocation jsonLocation16 = filteringParserDelegate4.getTokenLocation();
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
            boolean boolean11 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
            long long15 = filteringParserDelegate4.nextLongValue((long) (short) 0);
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
            int int14 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken7;
        int int9 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
            long long12 = filteringParserDelegate4.getValueAsLong((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
            java.math.BigInteger bigInteger12 = filteringParserDelegate4.getBigIntegerValue();
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
            filteringParserDelegate13.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            float float9 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
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
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType15 = filteringParserDelegate4.getNumberType();
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
            char[] charArray12 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
            int int10 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass14 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
            boolean boolean12 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        int int7 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        filteringParserDelegate4._itemFilter = tokenFilter7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isEnabled(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        int int7 = filteringParserDelegate4.getCurrentTokenId();
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream6 = null;
        int int7 = filteringParserDelegate4.releaseBuffered(outputStream6);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.setFeatureMask((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = filteringParserDelegate18.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
            long long20 = filteringParserDelegate4.getLongValue();
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isEnabled(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
            char[] charArray37 = filteringParserDelegate4.getTextCharacters();
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
            double double11 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        int int7 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        java.lang.String str9 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
            java.lang.String str11 = filteringParserDelegate4.getValueAsString();
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
            int int19 = filteringParserDelegate4.getTextLength();
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
            boolean boolean15 = filteringParserDelegate14.getBooleanValue();
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
            java.lang.String str18 = filteringParserDelegate4.getValueAsString("");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
            com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._nextToken2();
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = filteringParserDelegate4.getBinaryValue(base64Variant9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        java.io.Writer writer7 = null;
        int int8 = filteringParserDelegate4.releaseBuffered(writer7);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.nextLongValue((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.configure(feature16, false);
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.setFeatureMask((int) (byte) 100);
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.getIntValue();
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
            long long20 = filteringParserDelegate4.getValueAsLong((long) 100);
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        com.fasterxml.jackson.core.Base64Variant base64Variant13 = null;
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.readBinaryValue(base64Variant13, outputStream14);
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema11 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
            java.lang.String str36 = filteringParserDelegate4.nextTextValue();
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        boolean boolean15 = filteringParserDelegate4.isExpectedStartObjectToken();
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
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.isEnabled(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
            long long19 = filteringParserDelegate4.nextLongValue((long) (byte) -1);
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate13.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate13.overrideStdFeatures((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream6 = null;
        int int7 = filteringParserDelegate4.releaseBuffered(outputStream6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNull(tokenFilter15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = null;
        filteringParserDelegate4._exposedContext = tokenFilterContext5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = null;
        filteringParserDelegate4._currToken = jsonToken7;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext9 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate15._headContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken25 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNotNull(tokenFilterContext24);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
            com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.nextValue();
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._currToken;
        boolean boolean8 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.Base64Variant base64Variant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = filteringParserDelegate4.getBinaryValue(base64Variant9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
            int int12 = filteringParserDelegate4.getTextLength();
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
            double double26 = filteringParserDelegate4.getValueAsDouble((double) (byte) 100);
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        filteringParserDelegate4.rootFilter = tokenFilter9;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        filteringParserDelegate4.clearCurrentToken();
        java.io.Writer writer9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(writer9);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken11;
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = filteringParserDelegate4.isEnabled(feature13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = filteringParserDelegate4.readBinaryValue(outputStream13);
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
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.isEnabled(feature17);
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        boolean boolean6 = filteringParserDelegate4.hasToken(jsonToken5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        filteringParserDelegate4._allowMultipleMatches = false;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        java.lang.Class<?> wildcardClass11 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema12 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        filteringParserDelegate4._allowMultipleMatches = true;
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
        com.fasterxml.jackson.core.JsonToken jsonToken20 = filteringParserDelegate11._lastClearedToken;
        filteringParserDelegate11.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) filteringParserDelegate11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(jsonToken16);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNull(jsonToken20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._lastClearedToken;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            float float10 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext5 = filteringParserDelegate4._filterContext();
        int int6 = filteringParserDelegate4.getMatchCount();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec8 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonStreamContext5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        java.io.Writer writer5 = null;
        int int6 = filteringParserDelegate4.releaseBuffered(writer5);
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        java.lang.String str8 = filteringParserDelegate4.getCurrentName();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        java.lang.Class<?> wildcardClass10 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, false, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.FormatSchema formatSchema17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.canUseSchema(formatSchema17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(tokenFilter16);
    }
}

