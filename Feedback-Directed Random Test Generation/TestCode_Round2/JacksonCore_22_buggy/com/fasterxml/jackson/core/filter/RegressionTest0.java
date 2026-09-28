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
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.nextIntValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.canUseSchema(formatSchema5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec5);
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
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.overrideFormatFeatures((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.setFeatureMask((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken5 = filteringParserDelegate4.nextValue();
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
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = filteringParserDelegate4.getValueAsDouble((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.disable(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = filteringParserDelegate4.getValueAsDouble((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = filteringParserDelegate4.getValueAsLong((long) (short) 100);
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
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = filteringParserDelegate4.getValueAsDouble((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken17 = filteringParserDelegate4.nextValue();
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean8 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser6 = filteringParserDelegate4.disable(feature5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = filteringParserDelegate4.getCurrentValue();
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
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext16);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isEnabled(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.configure(feature8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = filteringParserDelegate4.getTypeId();
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType7 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = filteringParserDelegate4.getValueAsDouble((double) (short) 10);
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser29 = filteringParserDelegate4.configure(feature27, false);
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
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        boolean boolean27 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger28 = filteringParserDelegate4.getBigIntegerValue();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser28 = filteringParserDelegate4.overrideFormatFeatures((int) ' ', (int) (byte) 1);
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.disable(feature7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) 100.0d);
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.isEnabled(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = filteringParserDelegate4.getValueAsInt((int) (short) 1);
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
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = filteringParserDelegate4.getTypeId();
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType17 = filteringParserDelegate4.getNumberType();
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getText(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser34 = filteringParserDelegate4.enable(feature33);
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
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.configure(feature7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.getText(writer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.setFeatureMask(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        // The following exception was thrown during execution in test generation
        try {
            double double26 = filteringParserDelegate4.getDoubleValue();
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.readBinaryValue(outputStream18);
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = filteringParserDelegate4.nextLongValue((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.Base64Variant base64Variant6 = null;
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.readBinaryValue(base64Variant6, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.SerializableString serializableString6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.nextFieldName(serializableString6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean29 = filteringParserDelegate4.nextBooleanValue();
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
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = filteringParserDelegate4.getNumberValue();
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            float float9 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext16);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = filteringParserDelegate4.getValueAsInt((int) (short) 1);
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
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.overrideStdFeatures((int) (byte) 1, 0);
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.overrideStdFeatures((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.getValueAsInt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.SerializableString serializableString9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.nextFieldName(serializableString9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            byte byte18 = filteringParserDelegate4.getByteValue();
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.overrideFormatFeatures((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = filteringParserDelegate4.getBinaryValue(base64Variant17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext16);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            float float7 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version8 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            int int34 = filteringParserDelegate4.getValueAsInt((-1));
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
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = filteringParserDelegate4.getText(writer19);
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
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate4.nextToken();
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
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        boolean boolean9 = filteringParserDelegate4.hasToken(jsonToken8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.overrideStdFeatures(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.isEnabled(feature17);
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = filteringParserDelegate4.getValueAsInt((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        // The following exception was thrown during execution in test generation
        try {
            short short26 = filteringParserDelegate4.getShortValue();
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.getFeatureMask();
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser18 = filteringParserDelegate4.disable(feature17);
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        java.lang.String str6 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean9 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
            java.lang.String str20 = filteringParserDelegate4.getValueAsString("hi!");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal8 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = filteringParserDelegate4.getBinaryValue();
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
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.getText(writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate4._headContext;
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = filteringParserDelegate4.readBinaryValue(outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext16);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean9 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = filteringParserDelegate4.getValueAsDouble((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec18);
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
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec29 = filteringParserDelegate4.getCodec();
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
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation9 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includePath;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.readBinaryValue(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean6 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getValueAsInt((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean9 = filteringParserDelegate4.hasTokenId(10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        // The following exception was thrown during execution in test generation
        try {
            double double26 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate9.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.setFeatureMask((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.enable(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        boolean boolean27 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.Base64Variant base64Variant28 = null;
        java.io.OutputStream outputStream29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = filteringParserDelegate4.readBinaryValue(base64Variant28, outputStream29);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.readBinaryValue(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser27 = filteringParserDelegate4.disable(feature26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getText(writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        boolean boolean27 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = filteringParserDelegate4.getCurrentValue();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = tokenFilter8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = filteringParserDelegate4.getValueAsString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        java.lang.Class<?> wildcardClass18 = jsonStreamContext17.getClass();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
            com.fasterxml.jackson.core.JsonParser jsonParser21 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 0, (int) (byte) 0);
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.SerializableString serializableString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.nextFieldName(serializableString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation26 = filteringParserDelegate4.getCurrentLocation();
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate12._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext24;
        com.fasterxml.jackson.core.SerializableString serializableString26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = filteringParserDelegate4.nextFieldName(serializableString26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext24);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema6 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser19 = filteringParserDelegate4.disable(feature18);
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.readBinaryValue(outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = filteringParserDelegate9.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.getText(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        boolean boolean27 = filteringParserDelegate4._allowMultipleMatches;
        java.io.Writer writer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = filteringParserDelegate4.getText(writer28);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getValueAsInt(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate13._headContext;
        filteringParserDelegate13.setRequestPayloadOnError("");
        filteringParserDelegate13._matchCount = (byte) 0;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter20 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate23 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser19, tokenFilter20, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder24 = filteringParserDelegate23.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext25 = filteringParserDelegate23._exposedContext;
        boolean boolean26 = filteringParserDelegate23._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate31 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser27, tokenFilter28, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder32 = filteringParserDelegate31.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate31._exposedContext;
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate31.setRequestPayloadOnError(byteArray40, "");
        filteringParserDelegate23.setRequestPayloadOnError(byteArray40, "");
        com.fasterxml.jackson.core.JsonParser jsonParser45 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter46 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate49 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser45, tokenFilter46, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext50 = filteringParserDelegate49._headContext;
        filteringParserDelegate23._exposedContext = tokenFilterContext50;
        filteringParserDelegate13._headContext = tokenFilterContext50;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken53 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder24);
        org.junit.Assert.assertNull(tokenFilterContext25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder32);
        org.junit.Assert.assertNull(tokenFilterContext33);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext50);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        boolean boolean27 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = filteringParserDelegate4.getEmbeddedObject();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.nextIntValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = filteringParserDelegate4.getValueAsString();
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
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.getValueAsInt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        boolean boolean9 = filteringParserDelegate4.hasToken(jsonToken8);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken15 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate17.finishToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        com.fasterxml.jackson.core.Base64Variant base64Variant11 = null;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate10.readBinaryValue(base64Variant11, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = filteringParserDelegate4.getParsingContext();
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.configure(feature9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean6 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = filteringParserDelegate4.getValueAsDouble((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getValueAsInt(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate12._headContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken25 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext24);
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
        org.junit.Assert.assertNotNull(tokenFilterContext24);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = filteringParserDelegate4.getInputSource();
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
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.setFeatureMask((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.disable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray10 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = (byte) 0;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder15 = filteringParserDelegate14.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate14._exposedContext;
        boolean boolean17 = filteringParserDelegate14._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser18, tokenFilter19, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder23 = filteringParserDelegate22.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate22._exposedContext;
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate22.setRequestPayloadOnError(byteArray31, "");
        filteringParserDelegate14.setRequestPayloadOnError(byteArray31, "");
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate40 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser36, tokenFilter37, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext41 = filteringParserDelegate40._headContext;
        filteringParserDelegate14._exposedContext = tokenFilterContext41;
        filteringParserDelegate4._headContext = tokenFilterContext41;
        // The following exception was thrown during execution in test generation
        try {
            long long45 = filteringParserDelegate4.getValueAsLong((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
        org.junit.Assert.assertNull(tokenFilterContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder23);
        org.junit.Assert.assertNull(tokenFilterContext24);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext41);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = filteringParserDelegate4.getText();
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.finishToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4.rootFilter = tokenFilter8;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartArrayToken();
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4._matchCount = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = filteringParserDelegate4.getValueAsLong((long) (byte) 100);
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        boolean boolean10 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = filteringParserDelegate4.getBinaryValue(base64Variant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.SerializableString serializableString6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.nextFieldName(serializableString6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.disable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken22 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        filteringParserDelegate4._includeImmediateParent = false;
        filteringParserDelegate4._matchCount = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = filteringParserDelegate4.getDoubleValue();
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate10.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.nextIntValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = filteringParserDelegate4.readBinaryValue(outputStream27);
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = filteringParserDelegate4.readBinaryValue(outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = filteringParserDelegate4.getValueAsDouble((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version11 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        java.io.OutputStream outputStream9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(outputStream9);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        filteringParserDelegate4.rootFilter = tokenFilter11;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.nextIntValue(10);
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
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter10, true, false);
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = filteringParserDelegate4.configure(feature14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        boolean boolean15 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version8 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        boolean boolean9 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.isEnabled(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate10.nextIntValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        boolean boolean9 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate13._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate13.rootFilter = tokenFilter15;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder22 = filteringParserDelegate21.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate21._exposedContext;
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate21.setRequestPayloadOnError(byteArray30, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate21._headContext;
        filteringParserDelegate13._headContext = tokenFilterContext33;
        filteringParserDelegate4._exposedContext = tokenFilterContext33;
        // The following exception was thrown during execution in test generation
        try {
            long long36 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder22);
        org.junit.Assert.assertNull(tokenFilterContext23);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext33);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
            boolean boolean12 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.overrideStdFeatures(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        java.io.OutputStream outputStream9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(outputStream9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter12 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate15 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser11, tokenFilter12, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate15._headContext;
        filteringParserDelegate15.setRequestPayloadOnError("");
        filteringParserDelegate15._matchCount = 10;
        com.fasterxml.jackson.core.JsonParser jsonParser21 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser21, tokenFilter22, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext26 = filteringParserDelegate25._headContext;
        filteringParserDelegate15._exposedContext = tokenFilterContext26;
        int int28 = filteringParserDelegate15._matchCount;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = filteringParserDelegate15.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) tokenFilter29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(tokenFilterContext16);
        org.junit.Assert.assertNotNull(tokenFilterContext26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNull(tokenFilter29);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
            double double20 = filteringParserDelegate4.getValueAsDouble((double) (short) 10);
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray28 = filteringParserDelegate4.getTextCharacters();
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        java.lang.String str6 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation26 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        // The following exception was thrown during execution in test generation
        try {
            double double35 = filteringParserDelegate4.getValueAsDouble((double) (byte) 100);
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
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.disable(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        boolean boolean6 = filteringParserDelegate4.canParseAsync();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        // The following exception was thrown during execution in test generation
        try {
            byte byte14 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        filteringParserDelegate4._matchCount = (byte) 10;
        boolean boolean14 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation15 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = filteringParserDelegate4.canUseSchema(formatSchema18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        boolean boolean38 = filteringParserDelegate37._allowMultipleMatches;
        filteringParserDelegate37._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter41 = filteringParserDelegate37.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser42 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter43 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate46 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser42, tokenFilter43, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext47 = filteringParserDelegate46._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter48 = null;
        filteringParserDelegate46.rootFilter = tokenFilter48;
        com.fasterxml.jackson.core.JsonParser jsonParser50 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter51 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate54 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser50, tokenFilter51, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder55 = filteringParserDelegate54.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext56 = filteringParserDelegate54._exposedContext;
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate54.setRequestPayloadOnError(byteArray63, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext66 = filteringParserDelegate54._headContext;
        filteringParserDelegate46._headContext = tokenFilterContext66;
        filteringParserDelegate37._exposedContext = tokenFilterContext66;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken69 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext66);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(tokenFilter41);
        org.junit.Assert.assertNotNull(tokenFilterContext47);
        org.junit.Assert.assertNull(nonBlockingInputFeeder55);
        org.junit.Assert.assertNull(tokenFilterContext56);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext66);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean9 = filteringParserDelegate4.hasTokenId(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._allowMultipleMatches = true;
        int int8 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean9 = filteringParserDelegate4.hasTokenId(10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = filteringParserDelegate4.nextLongValue((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = filteringParserDelegate4.getValueAsDouble((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        boolean boolean6 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser8 = filteringParserDelegate4.setFeatureMask((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        // The following exception was thrown during execution in test generation
        try {
            int int28 = filteringParserDelegate4.getIntValue();
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate12._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext24;
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = filteringParserDelegate4.isEnabled(feature26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext24);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.enable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean19 = filteringParserDelegate17.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version10 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            float float11 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._lastClearedToken;
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = filteringParserDelegate4.getBinaryValue(base64Variant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getCurrentValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = filteringParserDelegate4.getValueAsLong((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        com.fasterxml.jackson.core.Base64Variant base64Variant29 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray30 = filteringParserDelegate4.getBinaryValue(base64Variant29);
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
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        filteringParserDelegate4._matchCount = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isEnabled(feature8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = filteringParserDelegate10.getText(writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        java.io.OutputStream outputStream9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(outputStream9);
        com.fasterxml.jackson.core.Base64Variant base64Variant11 = null;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.readBinaryValue(base64Variant11, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        // The following exception was thrown during execution in test generation
        try {
            int int37 = filteringParserDelegate4.getValueAsInt((int) (byte) 1);
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
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken27 = filteringParserDelegate4.nextValue();
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.nextIntValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean9 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        java.io.OutputStream outputStream9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(outputStream9);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation27 = filteringParserDelegate4.getCurrentLocation();
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
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType6 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        filteringParserDelegate4._currToken = jsonToken18;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = filteringParserDelegate4.getTextOffset();
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
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version6 = filteringParserDelegate4.version();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.canUseSchema(formatSchema7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation14 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        boolean boolean24 = filteringParserDelegate12.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext25 = filteringParserDelegate12.getParsingContext();
        filteringParserDelegate12.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser28 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter29 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate32 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser28, tokenFilter29, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder33 = filteringParserDelegate32.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext34 = filteringParserDelegate32._exposedContext;
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate32.setRequestPayloadOnError(byteArray41, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext44 = filteringParserDelegate32._headContext;
        filteringParserDelegate12._exposedContext = tokenFilterContext44;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken46 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext25);
        org.junit.Assert.assertNull(nonBlockingInputFeeder33);
        org.junit.Assert.assertNull(tokenFilterContext34);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext44);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate11.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(outputStream11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includePath = true;
        boolean boolean12 = filteringParserDelegate4.canParseAsync();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter14 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate17 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser13, tokenFilter14, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext18 = filteringParserDelegate17._exposedContext;
        boolean boolean19 = filteringParserDelegate17._includePath;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(tokenFilterContext18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = filteringParserDelegate4.getValueAsLong((long) (byte) 0);
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray17 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken16);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._currToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            short short11 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(outputStream11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
            java.math.BigInteger bigInteger18 = filteringParserDelegate4.getBigIntegerValue();
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.isEnabled(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.finishToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate17.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(tokenFilter8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = (byte) 0;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType9 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser38 = filteringParserDelegate4.configure(feature36, true);
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
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.isEnabled(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
            boolean boolean39 = filteringParserDelegate4.getBooleanValue();
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = filteringParserDelegate9.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType11 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate17.releaseBuffered(outputStream18);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = filteringParserDelegate17.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.canUseSchema(formatSchema8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.nextLongValue((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = filteringParserDelegate4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includePath = true;
        boolean boolean12 = filteringParserDelegate4.canParseAsync();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType13 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = null;
        boolean boolean7 = filteringParserDelegate4.hasToken(jsonToken6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean6 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser32 = filteringParserDelegate4.enable(feature31);
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
        org.junit.Assert.assertNull(tokenFilter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        // The following exception was thrown during execution in test generation
        try {
            int int27 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken26);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        com.fasterxml.jackson.core.Base64Variant base64Variant21 = null;
        java.io.OutputStream outputStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = filteringParserDelegate4.readBinaryValue(base64Variant21, outputStream22);
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
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser13 = filteringParserDelegate10.overrideStdFeatures((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser41 = filteringParserDelegate4.setFeatureMask(100);
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
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        boolean boolean6 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec7 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser10 = filteringParserDelegate4.configure(feature8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder13 = filteringParserDelegate12.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate12._exposedContext;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate12.setRequestPayloadOnError(byteArray21, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate12._headContext;
        filteringParserDelegate4._headContext = tokenFilterContext24;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext24);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser.Feature feature9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.isEnabled(feature9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.overrideFormatFeatures((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        com.fasterxml.jackson.core.JsonToken jsonToken18 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken18);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate13._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate13.rootFilter = tokenFilter15;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder22 = filteringParserDelegate21.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate21._exposedContext;
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate21.setRequestPayloadOnError(byteArray30, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate21._headContext;
        filteringParserDelegate13._headContext = tokenFilterContext33;
        filteringParserDelegate4._exposedContext = tokenFilterContext33;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray36 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder22);
        org.junit.Assert.assertNull(tokenFilterContext23);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext33);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(tokenFilterContext10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonParser7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        boolean boolean9 = filteringParserDelegate4.hasToken(jsonToken8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation10 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            short short18 = filteringParserDelegate4.getShortValue();
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
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = filteringParserDelegate4.getBigIntegerValue();
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
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        // The following exception was thrown during execution in test generation
        try {
            int int27 = filteringParserDelegate4.getIntValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken26);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = (byte) 0;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter11 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate14 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser10, tokenFilter11, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder15 = filteringParserDelegate14.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext16 = filteringParserDelegate14._exposedContext;
        boolean boolean17 = filteringParserDelegate14._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter19 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate22 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser18, tokenFilter19, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder23 = filteringParserDelegate22.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext24 = filteringParserDelegate22._exposedContext;
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate22.setRequestPayloadOnError(byteArray31, "");
        filteringParserDelegate14.setRequestPayloadOnError(byteArray31, "");
        com.fasterxml.jackson.core.JsonParser jsonParser36 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter37 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate40 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser36, tokenFilter37, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext41 = filteringParserDelegate40._headContext;
        filteringParserDelegate14._exposedContext = tokenFilterContext41;
        filteringParserDelegate4._headContext = tokenFilterContext41;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
        org.junit.Assert.assertNull(tokenFilterContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder23);
        org.junit.Assert.assertNull(tokenFilterContext24);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext41);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser9 = filteringParserDelegate4.setFeatureMask((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        // The following exception was thrown during execution in test generation
        try {
            int int39 = filteringParserDelegate4.getText(writer38);
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
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        java.io.OutputStream outputStream9 = null;
        int int10 = filteringParserDelegate4.releaseBuffered(outputStream9);
        // The following exception was thrown during execution in test generation
        try {
            byte byte11 = filteringParserDelegate4.getByteValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = filteringParserDelegate4.canUseSchema(formatSchema15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean10 = filteringParserDelegate4.nextBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        int int9 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType10 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        // The following exception was thrown during execution in test generation
        try {
            long long39 = filteringParserDelegate4.getLongValue();
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
        org.junit.Assert.assertNull(jsonToken38);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = filteringParserDelegate4.getValueAsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(jsonStreamContext15);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType27 = filteringParserDelegate4.getNumberType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken26);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includePath = true;
        int int12 = filteringParserDelegate4.getFormatFeatures();
        boolean boolean13 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec14);
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = filteringParserDelegate4._filterContext();
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.SerializableString serializableString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.nextFieldName(serializableString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4._currToken;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = filteringParserDelegate4.getValueAsBoolean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getLastClearedToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.overrideFormatFeatures((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        java.lang.Class<?> wildcardClass10 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.FormatSchema formatSchema10 = filteringParserDelegate4.getSchema();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = filteringParserDelegate4.getValueAsString();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = filteringParserDelegate4.nextTextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
            java.lang.Object obj11 = filteringParserDelegate4.getTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.getValueAsBoolean(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(tokenFilterContext10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.getCurrentToken();
        boolean boolean9 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.disable(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        boolean boolean9 = filteringParserDelegate4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate13 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser9, tokenFilter10, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext14 = filteringParserDelegate13._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        filteringParserDelegate13.rootFilter = tokenFilter15;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate21 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser17, tokenFilter18, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder22 = filteringParserDelegate21.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext23 = filteringParserDelegate21._exposedContext;
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate21.setRequestPayloadOnError(byteArray30, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext33 = filteringParserDelegate21._headContext;
        filteringParserDelegate13._headContext = tokenFilterContext33;
        filteringParserDelegate4._exposedContext = tokenFilterContext33;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation36 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNotNull(tokenFilterContext14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder22);
        org.junit.Assert.assertNull(tokenFilterContext23);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext33);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        com.fasterxml.jackson.core.JsonParser jsonParser14 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter15 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate18 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser14, tokenFilter15, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext19 = filteringParserDelegate18._exposedContext;
        boolean boolean20 = filteringParserDelegate18._includePath;
        int int21 = filteringParserDelegate18._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCurrentValue((java.lang.Object) int21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertNull(tokenFilterContext19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = filteringParserDelegate4.getValueAsLong((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.getFilter();
        java.lang.Class<?> wildcardClass9 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
            boolean boolean37 = filteringParserDelegate4.hasTextCharacters();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger14 = filteringParserDelegate4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4.rootFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder9 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter8);
        org.junit.Assert.assertNull(nonBlockingInputFeeder9);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = filteringParserDelegate4.getValueAsInt((int) (byte) 100);
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        com.fasterxml.jackson.core.JsonParser jsonParser26 = filteringParserDelegate4.skipChildren();
        // The following exception was thrown during execution in test generation
        try {
            int int27 = filteringParserDelegate4.getFeatureMask();
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
        org.junit.Assert.assertNotNull(jsonParser26);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = filteringParserDelegate4.getValueAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        // The following exception was thrown during execution in test generation
        try {
            double double19 = filteringParserDelegate4.getValueAsDouble(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        // The following exception was thrown during execution in test generation
        try {
            short short8 = filteringParserDelegate4.getShortValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.nextToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            long long54 = filteringParserDelegate4.getValueAsLong(100L);
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.canReadTypeId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.getValueAsBoolean();
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
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.finishToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        java.lang.Class<?> wildcardClass11 = filteringParserDelegate4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(tokenFilterContext10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(outputStream11);
        // The following exception was thrown during execution in test generation
        try {
            float float13 = filteringParserDelegate4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.isEnabled(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal18 = filteringParserDelegate4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        // The following exception was thrown during execution in test generation
        try {
            double double18 = filteringParserDelegate4.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = filteringParserDelegate4.getLongValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(nonBlockingInputFeeder18);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        int int10 = filteringParserDelegate9.currentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate9.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        // The following exception was thrown during execution in test generation
        try {
            long long50 = filteringParserDelegate4.getValueAsLong((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.io.OutputStream outputStream18 = null;
        int int19 = filteringParserDelegate17.releaseBuffered(outputStream18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = filteringParserDelegate17.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        int int22 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser24 = filteringParserDelegate4.setFeatureMask((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        boolean boolean8 = filteringParserDelegate4.canParseAsync();
        boolean boolean9 = filteringParserDelegate4._allowMultipleMatches;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = filteringParserDelegate4.canReadObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = filteringParserDelegate4.readBinaryValue(outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder15);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        // The following exception was thrown during execution in test generation
        try {
            int int35 = filteringParserDelegate4.getIntValue();
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
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        int int10 = filteringParserDelegate9.currentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = filteringParserDelegate9.getValueAsLong(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = filteringParserDelegate4.requiresCustomCodec();
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
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = filteringParserDelegate4.getText();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = filteringParserDelegate4.getTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation12 = filteringParserDelegate4.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = filteringParserDelegate4.readBinaryValue(base64Variant20, outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(tokenFilterContext15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        int int28 = filteringParserDelegate4.currentTokenId();
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser31 = filteringParserDelegate4.configure(feature29, false);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser7, tokenFilter8, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder12 = filteringParserDelegate11.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate11._exposedContext;
        boolean boolean14 = filteringParserDelegate11._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter16 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate19 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser15, tokenFilter16, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder20 = filteringParserDelegate19.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext21 = filteringParserDelegate19._exposedContext;
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate19.setRequestPayloadOnError(byteArray28, "");
        filteringParserDelegate11.setRequestPayloadOnError(byteArray28, "");
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext38 = filteringParserDelegate37._headContext;
        filteringParserDelegate11._exposedContext = tokenFilterContext38;
        filteringParserDelegate4._exposedContext = tokenFilterContext38;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNull(nonBlockingInputFeeder12);
        org.junit.Assert.assertNull(tokenFilterContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertNull(tokenFilterContext21);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext38);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        boolean boolean16 = filteringParserDelegate4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext17 = filteringParserDelegate4.getParsingContext();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = filteringParserDelegate4.getFeatureMask();
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
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        com.fasterxml.jackson.core.JsonParser.Feature feature55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser56 = filteringParserDelegate4.disable(feature55);
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        int int8 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setSchema(formatSchema10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate10 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter7, true, true);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder11 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.isNaN();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
            int int55 = filteringParserDelegate4.getValueAsInt();
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
            byte[] byteArray11 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.setCodec(objectCodec8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jsonToken7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = null;
        filteringParserDelegate4._currToken = jsonToken6;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate12._headContext;
        filteringParserDelegate12.setRequestPayloadOnError("");
        filteringParserDelegate12._matchCount = 10;
        filteringParserDelegate12._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload20 = null;
        filteringParserDelegate12.setRequestPayloadOnError(requestPayload20);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate12, tokenFilter22, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder31 = filteringParserDelegate30.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate30._exposedContext;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate30.setRequestPayloadOnError(byteArray39, "");
        boolean boolean42 = filteringParserDelegate30.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext43 = filteringParserDelegate30.getParsingContext();
        filteringParserDelegate30.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser46 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter47 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate50 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser46, tokenFilter47, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder51 = filteringParserDelegate50.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext52 = filteringParserDelegate50._exposedContext;
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate50.setRequestPayloadOnError(byteArray59, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext62 = filteringParserDelegate50._headContext;
        filteringParserDelegate30._exposedContext = tokenFilterContext62;
        filteringParserDelegate25._exposedContext = tokenFilterContext62;
        filteringParserDelegate4._exposedContext = tokenFilterContext62;
        // The following exception was thrown during execution in test generation
        try {
            long long66 = filteringParserDelegate4.getValueAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
        org.junit.Assert.assertNull(nonBlockingInputFeeder31);
        org.junit.Assert.assertNull(tokenFilterContext32);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext43);
        org.junit.Assert.assertNull(nonBlockingInputFeeder51);
        org.junit.Assert.assertNull(tokenFilterContext52);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext62);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.Version version33 = filteringParserDelegate4.version();
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
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
            java.lang.String str16 = filteringParserDelegate4.nextTextValue();
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        boolean boolean9 = filteringParserDelegate4.hasToken(jsonToken8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.setFeatureMask(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4._includePath = false;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser13 = filteringParserDelegate4.overrideStdFeatures((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        boolean boolean8 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter9, true, false);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = filteringParserDelegate4.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = filteringParserDelegate4.nextLongValue((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getInputSource();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.overrideFormatFeatures((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation10 = filteringParserDelegate9.getCurrentLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter21 = null;
        filteringParserDelegate19._itemFilter = tokenFilter21;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter23 = null;
        filteringParserDelegate19.rootFilter = tokenFilter23;
        boolean boolean25 = filteringParserDelegate19._includePath;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        boolean boolean31 = filteringParserDelegate30._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken32 = filteringParserDelegate30.getLastClearedToken();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter34 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate37 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser33, tokenFilter34, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder38 = filteringParserDelegate37.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext39 = filteringParserDelegate37._exposedContext;
        boolean boolean40 = filteringParserDelegate37._includeImmediateParent;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter42 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate45 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser41, tokenFilter42, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder46 = filteringParserDelegate45.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext47 = filteringParserDelegate45._exposedContext;
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate45.setRequestPayloadOnError(byteArray54, "");
        filteringParserDelegate37.setRequestPayloadOnError(byteArray54, "");
        com.fasterxml.jackson.core.JsonParser jsonParser59 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter60 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate63 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser59, tokenFilter60, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext64 = filteringParserDelegate63._headContext;
        filteringParserDelegate37._exposedContext = tokenFilterContext64;
        filteringParserDelegate30._exposedContext = tokenFilterContext64;
        filteringParserDelegate19._headContext = tokenFilterContext64;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken68 = filteringParserDelegate4._nextTokenWithBuffering(tokenFilterContext64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(tokenFilter14);
        org.junit.Assert.assertNull(nonBlockingInputFeeder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(jsonToken32);
        org.junit.Assert.assertNull(nonBlockingInputFeeder38);
        org.junit.Assert.assertNull(tokenFilterContext39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder46);
        org.junit.Assert.assertNull(tokenFilterContext47);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext64);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation12 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        filteringParserDelegate4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = filteringParserDelegate4.skipChildren();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        boolean boolean9 = filteringParserDelegate4.hasToken(jsonToken8);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser11 = filteringParserDelegate4.setFeatureMask(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        com.fasterxml.jackson.core.util.RequestPayload requestPayload35 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = filteringParserDelegate4.getValueAsString();
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
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = null;
        filteringParserDelegate4._currToken = jsonToken6;
        com.fasterxml.jackson.core.JsonParser jsonParser8 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate12 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser8, tokenFilter9, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext13 = filteringParserDelegate12._headContext;
        filteringParserDelegate12.setRequestPayloadOnError("");
        filteringParserDelegate12._matchCount = 10;
        filteringParserDelegate12._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload20 = null;
        filteringParserDelegate12.setRequestPayloadOnError(requestPayload20);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter22 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate25 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate12, tokenFilter22, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter27 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate30 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser26, tokenFilter27, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder31 = filteringParserDelegate30.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext32 = filteringParserDelegate30._exposedContext;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate30.setRequestPayloadOnError(byteArray39, "");
        boolean boolean42 = filteringParserDelegate30.hasCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext43 = filteringParserDelegate30.getParsingContext();
        filteringParserDelegate30.setRequestPayloadOnError("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser46 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter47 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate50 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser46, tokenFilter47, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder51 = filteringParserDelegate50.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext52 = filteringParserDelegate50._exposedContext;
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate50.setRequestPayloadOnError(byteArray59, "");
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext62 = filteringParserDelegate50._headContext;
        filteringParserDelegate30._exposedContext = tokenFilterContext62;
        filteringParserDelegate25._exposedContext = tokenFilterContext62;
        filteringParserDelegate4._exposedContext = tokenFilterContext62;
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.finishToken();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNotNull(tokenFilterContext13);
        org.junit.Assert.assertNull(nonBlockingInputFeeder31);
        org.junit.Assert.assertNull(tokenFilterContext32);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext43);
        org.junit.Assert.assertNull(nonBlockingInputFeeder51);
        org.junit.Assert.assertNull(tokenFilterContext52);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(tokenFilterContext62);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
            com.fasterxml.jackson.core.JsonLocation jsonLocation39 = filteringParserDelegate4.getTokenLocation();
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        // The following exception was thrown during execution in test generation
        try {
            float float19 = filteringParserDelegate17.getFloatValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = null;
        boolean boolean11 = filteringParserDelegate4.hasToken(jsonToken10);
        boolean boolean12 = filteringParserDelegate4._includePath;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken13 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.JsonToken jsonToken12 = filteringParserDelegate4.currentToken();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.isClosed();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate9 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter6, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._currToken;
        java.io.OutputStream outputStream11 = null;
        int int12 = filteringParserDelegate4.releaseBuffered(outputStream11);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser15 = filteringParserDelegate4.overrideFormatFeatures(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        com.fasterxml.jackson.core.Base64Variant base64Variant11 = null;
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.readBinaryValue(base64Variant11, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(tokenFilterContext10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4.rootFilter = tokenFilter8;
        filteringParserDelegate4.setRequestPayloadOnError("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        int int8 = filteringParserDelegate4.getMatchCount();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
            com.fasterxml.jackson.core.JsonToken jsonToken19 = filteringParserDelegate4._nextToken2();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = filteringParserDelegate4.currentToken();
        boolean boolean9 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation10 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = filteringParserDelegate4.hasTextCharacters();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
            int int16 = filteringParserDelegate4.getIntValue();
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = filteringParserDelegate4.overrideStdFeatures((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = filteringParserDelegate4.canReadTypeId();
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
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        com.fasterxml.jackson.core.JsonToken jsonToken6 = filteringParserDelegate4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext7 = filteringParserDelegate4._filterContext();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNotNull(jsonStreamContext7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = filteringParserDelegate4.isClosed();
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
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        filteringParserDelegate4.rootFilter = tokenFilter8;
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = filteringParserDelegate4.getText(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.overrideCurrentName("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Can not currently override name during filtering read");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        int int10 = filteringParserDelegate4.getFormatFeatures();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getTextOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = filteringParserDelegate4.readBinaryValue(outputStream21);
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
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getTextLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        filteringParserDelegate4.setRequestPayloadOnError("");
        java.io.OutputStream outputStream8 = null;
        int int9 = filteringParserDelegate4.releaseBuffered(outputStream8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.getValueAsBoolean(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = filteringParserDelegate4.getCurrentValue();
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
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder7 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = filteringParserDelegate4._itemFilter;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter9 = filteringParserDelegate4._itemFilter;
        boolean boolean10 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken11 = filteringParserDelegate4._nextToken2();
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
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = null;
        boolean boolean7 = filteringParserDelegate4.hasToken(jsonToken6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = filteringParserDelegate4.getValueAsString("");
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._currToken = jsonToken8;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation10 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        int int6 = filteringParserDelegate4._matchCount;
        int int7 = filteringParserDelegate4._matchCount;
        filteringParserDelegate4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4.isExpectedStartObjectToken();
        java.lang.String str6 = filteringParserDelegate4.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = filteringParserDelegate4.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        boolean boolean15 = filteringParserDelegate4.isExpectedStartObjectToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken16 = filteringParserDelegate4.nextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = filteringParserDelegate4.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = filteringParserDelegate4.getValueAsInt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        // The following exception was thrown during execution in test generation
        try {
            filteringParserDelegate4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter6 = null;
        filteringParserDelegate4._itemFilter = tokenFilter6;
        boolean boolean8 = filteringParserDelegate4._allowMultipleMatches;
        boolean boolean9 = filteringParserDelegate4._includePath;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter10 = null;
        filteringParserDelegate4.rootFilter = tokenFilter10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        boolean boolean7 = filteringParserDelegate4._includeImmediateParent;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext8 = filteringParserDelegate4.getParsingContext();
        java.lang.Class<?> wildcardClass9 = jsonStreamContext8.getClass();
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter8 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate11 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate((com.fasterxml.jackson.core.JsonParser) filteringParserDelegate4, tokenFilter8, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = filteringParserDelegate11.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        filteringParserDelegate4._includePath = true;
        boolean boolean12 = filteringParserDelegate4.canParseAsync();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = filteringParserDelegate4.requiresCustomCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        com.fasterxml.jackson.core.FormatSchema formatSchema37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = filteringParserDelegate4.canUseSchema(formatSchema37);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation12 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertNull(tokenFilterContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = filteringParserDelegate4.nextFieldName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = 10;
        filteringParserDelegate4._includeImmediateParent = true;
        com.fasterxml.jackson.core.util.RequestPayload requestPayload12 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload12);
        com.fasterxml.jackson.core.SerializableString serializableString14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = filteringParserDelegate4.nextFieldName(serializableString14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        int int27 = filteringParserDelegate4.getFormatFeatures();
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter28 = null;
        filteringParserDelegate4.rootFilter = tokenFilter28;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.ObjectCodec objectCodec30 = filteringParserDelegate4.getCodec();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nonBlockingInputFeeder13);
        org.junit.Assert.assertNull(tokenFilterContext14);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNull(jsonToken26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext5 = filteringParserDelegate4._headContext;
        filteringParserDelegate4.setRequestPayloadOnError("");
        filteringParserDelegate4._matchCount = (byte) 0;
        com.fasterxml.jackson.core.JsonToken jsonToken10 = filteringParserDelegate4._lastClearedToken;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = filteringParserDelegate4.getFeatureMask();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tokenFilterContext5);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal20 = filteringParserDelegate4.getDecimalValue();
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
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter5 = null;
        filteringParserDelegate4._itemFilter = tokenFilter5;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter7 = filteringParserDelegate4.rootFilter;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = null;
        filteringParserDelegate4._lastClearedToken = jsonToken8;
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = filteringParserDelegate4.isEnabled(feature10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tokenFilter7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext6 = filteringParserDelegate4._exposedContext;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        filteringParserDelegate4.setRequestPayloadOnError(byteArray13, "");
        com.fasterxml.jackson.core.util.RequestPayload requestPayload16 = null;
        filteringParserDelegate4.setRequestPayloadOnError(requestPayload16);
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter18 = null;
        filteringParserDelegate4._itemFilter = tokenFilter18;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = filteringParserDelegate4.requiresCustomCodec();
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        com.fasterxml.jackson.core.async.NonBlockingInputFeeder nonBlockingInputFeeder5 = filteringParserDelegate4.getNonBlockingInputFeeder();
        boolean boolean6 = filteringParserDelegate4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext7 = filteringParserDelegate4._headContext;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonLocation jsonLocation8 = filteringParserDelegate4.getTokenLocation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nonBlockingInputFeeder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tokenFilterContext7);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.fasterxml.jackson.core.JsonParser jsonParser0 = null;
        com.fasterxml.jackson.core.filter.TokenFilter tokenFilter1 = null;
        com.fasterxml.jackson.core.filter.FilteringParserDelegate filteringParserDelegate4 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate(jsonParser0, tokenFilter1, true, false);
        boolean boolean5 = filteringParserDelegate4._allowMultipleMatches;
        filteringParserDelegate4._includeImmediateParent = false;
        boolean boolean8 = filteringParserDelegate4.isExpectedStartObjectToken();
        int int9 = filteringParserDelegate4.getCurrentTokenId();
        com.fasterxml.jackson.core.filter.TokenFilterContext tokenFilterContext10 = filteringParserDelegate4._exposedContext;
        boolean boolean11 = filteringParserDelegate4.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = filteringParserDelegate4.getEmbeddedObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(tokenFilterContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

