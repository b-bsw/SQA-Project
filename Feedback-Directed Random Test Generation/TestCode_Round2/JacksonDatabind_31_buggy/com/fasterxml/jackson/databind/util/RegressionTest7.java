package com.fasterxml.jackson.databind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = tokenBuffer2._writeContext;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = tokenBuffer2.asParser();
        tokenBuffer2.writeFieldName("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_NUMBER_FLOAT]");
        tokenBuffer2.writeNullField("hi!");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        java.lang.Object obj14 = parser13.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext15 = parser13._parsingContext;
        boolean boolean17 = parser13.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser13);
        com.fasterxml.jackson.core.SerializableString serializableString19 = null;
        tokenBuffer18.writeString(serializableString19);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer18.setPrettyPrinter(prettyPrinter21);
        int int23 = tokenBuffer18.getFeatureMask();
        com.fasterxml.jackson.core.TreeNode treeNode24 = null;
        tokenBuffer18.writeTree(treeNode24);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser30 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment26, objectCodec27, true, true);
        java.lang.Object obj31 = parser30.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext32 = parser30._parsingContext;
        boolean boolean34 = parser30.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser30);
        boolean boolean36 = tokenBuffer35._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = tokenBuffer35._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = segment37._next;
        tokenBuffer18._last = segment37;
        com.fasterxml.jackson.core.JsonToken jsonToken41 = segment37.type((int) (byte) 0);
        tokenBuffer2._last = segment37;
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(jsonReadContext15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(jsonReadContext32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(segment37);
        org.junit.Assert.assertNull(segment38);
        org.junit.Assert.assertNull(jsonToken41);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        tokenBuffer9.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer9._objectId = '4';
        tokenBuffer9._generatorFeatures = '#';
        boolean boolean19 = tokenBuffer9._mayHaveNativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = tokenBuffer9.getCodec();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        java.lang.Object obj26 = parser25.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext27 = parser25._parsingContext;
        boolean boolean29 = parser25.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser25);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext31 = null;
        tokenBuffer30._writeContext = jsonWriteContext31;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer30.useDefaultPrettyPrinter();
        tokenBuffer30.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer30._objectId = '4';
        tokenBuffer30._generatorFeatures = '#';
        tokenBuffer30._closed = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser46 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment42, objectCodec43, true, true);
        java.lang.Object obj47 = parser46.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext48 = parser46._parsingContext;
        boolean boolean50 = parser46.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer51 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser46);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext52 = null;
        tokenBuffer51._writeContext = jsonWriteContext52;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator54 = tokenBuffer51.useDefaultPrettyPrinter();
        boolean boolean55 = jsonGenerator54.canOmitFields();
        int int56 = jsonGenerator54.getOutputBuffered();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter57 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonGenerator54.setPrettyPrinter(prettyPrinter57);
        tokenBuffer30.writeTypeId((java.lang.Object) prettyPrinter57);
        boolean boolean60 = tokenBuffer30._hasNativeTypeIds;
        boolean boolean61 = tokenBuffer30.canWriteBinaryNatively();
        com.fasterxml.jackson.core.FormatSchema formatSchema62 = null;
        boolean boolean63 = tokenBuffer30.canUseSchema(formatSchema62);
        com.fasterxml.jackson.core.JsonToken jsonToken64 = tokenBuffer30.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment65 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec66 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser69 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment65, objectCodec66, true, true);
        java.lang.Object obj70 = parser69.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext71 = parser69._parsingContext;
        boolean boolean73 = parser69.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer74 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser69);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext75 = null;
        tokenBuffer74._writeContext = jsonWriteContext75;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator77 = tokenBuffer74.useDefaultPrettyPrinter();
        tokenBuffer74.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer74._objectId = '4';
        tokenBuffer74._generatorFeatures = '#';
        tokenBuffer74._closed = true;
        boolean boolean86 = tokenBuffer74.canOmitFields();
        tokenBuffer74._hasNativeTypeIds = true;
        tokenBuffer74.writeNumber((short) 10);
        com.fasterxml.jackson.core.JsonToken jsonToken91 = tokenBuffer74.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer92 = tokenBuffer30.append(tokenBuffer74);
        tokenBuffer9.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer92);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectCodec20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(jsonReadContext27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(jsonReadContext48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jsonGenerator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + jsonToken64 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken64.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(jsonReadContext71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jsonGenerator77);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + jsonToken91 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken91.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(tokenBuffer92);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        boolean boolean10 = tokenBuffer9._closed;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext11 = tokenBuffer9._writeContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment12 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser16 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment12, objectCodec13, true, true);
        java.lang.Object obj17 = parser16.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext18 = parser16._parsingContext;
        boolean boolean20 = parser16.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser16);
        boolean boolean22 = tokenBuffer21._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment23 = tokenBuffer21._first;
        boolean boolean24 = segment23.hasIds();
        tokenBuffer9._first = segment23;
        java.lang.Object obj27 = segment23.findTypeId(1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment23, objectCodec28, false, false);
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = parser31.getTokenLocation();
        boolean boolean33 = parser31._hasNativeTypeIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser38 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment34, objectCodec35, true, true);
        java.lang.Object obj39 = parser38.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext40 = parser38._parsingContext;
        boolean boolean42 = parser38.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser38);
        boolean boolean44 = tokenBuffer43._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = tokenBuffer43._first;
        parser31._segment = segment45;
        com.fasterxml.jackson.core.JsonParser.Feature feature47 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser49 = parser31.configure(feature47, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(jsonReadContext18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(segment23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(jsonLocation32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(jsonReadContext40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(segment45);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        parser4.setLocation(jsonLocation5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        int int8 = parser4.getFormatFeatures();
        java.lang.String str9 = parser4.getValueAsString();
        boolean boolean10 = parser4._hasNativeTypeIds;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = parser4._currentObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        boolean boolean10 = parser4.getValueAsBoolean();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = null;
        parser15.setLocation(jsonLocation16);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext18 = parser15._parsingContext;
        parser4._parsingContext = jsonReadContext18;
        int int20 = parser4.getFeatureMask();
        java.lang.String str21 = parser4.nextFieldName();
        int int23 = parser4.nextIntValue(0);
        boolean boolean24 = parser4.canReadTypeId();
        boolean boolean25 = parser4._hasNativeObjectIds;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4, deserializationContext26);
        char[] charArray32 = new char[] { 'a', 'a', '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer27.writeRawValue(charArray32, 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: offset 97, count 35, length 4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonReadContext18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a', 'a', '4', '#' });
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        tokenBuffer9.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer9._objectId = '4';
        tokenBuffer9._generatorFeatures = '#';
        boolean boolean19 = tokenBuffer9._closed;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        tokenBuffer9._objectCodec = objectCodec20;
        tokenBuffer9._hasNativeObjectIds = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment24, objectCodec25, true, true);
        java.lang.Object obj29 = parser28.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext30 = parser28._parsingContext;
        boolean boolean32 = parser28.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer33 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser28);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext34 = null;
        tokenBuffer33._writeContext = jsonWriteContext34;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = tokenBuffer33.useDefaultPrettyPrinter();
        tokenBuffer33.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer33._objectId = '4';
        tokenBuffer33._generatorFeatures = '#';
        tokenBuffer33._closed = true;
        boolean boolean45 = tokenBuffer33.canOmitFields();
        tokenBuffer33._hasNativeTypeIds = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser52 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment48, objectCodec49, true, true);
        java.lang.Object obj53 = parser52.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext54 = parser52._parsingContext;
        boolean boolean56 = parser52.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser52);
        tokenBuffer57.writeObject((java.lang.Object) (-1.0d));
        int int60 = tokenBuffer57.getHighestEscapedChar();
        tokenBuffer57._objectId = (byte) 1;
        byte[] byteArray63 = new byte[] {};
        tokenBuffer57.writeBinary(byteArray63);
        tokenBuffer33.writeBinary(byteArray63);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer9.writeRawUTF8String(byteArray63, 2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(jsonReadContext30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(jsonReadContext54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.SerializableString serializableString10 = null;
        tokenBuffer9.writeString(serializableString10);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer9.setPrettyPrinter(prettyPrinter12);
        int int14 = tokenBuffer9.getFeatureMask();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = tokenBuffer9._last;
        java.lang.Object obj17 = segment15.findObjectId(3);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, true, true);
        java.lang.Object obj25 = parser24.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext26 = parser24._parsingContext;
        boolean boolean28 = parser24.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser24);
        com.fasterxml.jackson.core.SerializableString serializableString30 = null;
        tokenBuffer29.writeString(serializableString30);
        tokenBuffer29.writeStartObject();
        tokenBuffer29._hasNativeTypeIds = true;
        int int35 = tokenBuffer29._generatorFeatures;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser41 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment37, objectCodec38, true, true);
        java.lang.Object obj42 = parser41.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext43 = parser41._parsingContext;
        boolean boolean45 = parser41.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser41);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext47 = null;
        tokenBuffer46._writeContext = jsonWriteContext47;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = tokenBuffer46.useDefaultPrettyPrinter();
        boolean boolean50 = jsonGenerator49.canOmitFields();
        int int51 = jsonGenerator49.getOutputBuffered();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter52 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = jsonGenerator49.setPrettyPrinter(prettyPrinter52);
        tokenBuffer29.writeObjectField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT]", (java.lang.Object) jsonGenerator49);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment55 = segment15.appendRaw((int) (short) 1, (int) ' ', (java.lang.Object) tokenBuffer29);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser60 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment56, objectCodec57, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation61 = null;
        parser60.setLocation(jsonLocation61);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder63 = parser60._byteBuilder;
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        parser60.setCodec(objectCodec64);
        boolean boolean66 = parser60.isExpectedStartArrayToken();
        java.io.Writer writer67 = null;
        int int68 = parser60.releaseBuffered(writer67);
        com.fasterxml.jackson.core.JsonLocation jsonLocation69 = parser60._location;
        com.fasterxml.jackson.core.JsonLocation jsonLocation70 = parser60.getTokenLocation();
        tokenBuffer29._objectId = parser60;
        tokenBuffer29.writeOmittedField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_FLOAT]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertNotNull(segment15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(jsonReadContext26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 31 + "'", int35 == 31);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(jsonReadContext43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jsonGenerator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNull(segment55);
        org.junit.Assert.assertNull(byteArrayBuilder63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNull(jsonLocation69);
        org.junit.Assert.assertNotNull(jsonLocation70);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        parser4.setLocation(jsonLocation5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = parser4._location;
        boolean boolean9 = parser4.getValueAsBoolean();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser14 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec11, true, true);
        java.lang.Object obj15 = parser14.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext16 = parser14._parsingContext;
        boolean boolean18 = parser14.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser14);
        boolean boolean20 = tokenBuffer19._closed;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = tokenBuffer19._writeContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        java.lang.Object obj27 = parser26.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext28 = parser26._parsingContext;
        boolean boolean30 = parser26.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser26);
        boolean boolean32 = tokenBuffer31._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment33 = tokenBuffer31._first;
        boolean boolean34 = segment33.hasIds();
        tokenBuffer19._first = segment33;
        boolean boolean36 = segment33.hasIds();
        parser4._segment = segment33;
        int int38 = parser4.getFeatureMask();
        java.lang.Boolean boolean39 = parser4.nextBooleanValue();
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertNull(jsonLocation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(jsonReadContext16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(jsonReadContext28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(segment33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(boolean39);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        boolean boolean10 = parser4.getValueAsBoolean();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = null;
        parser15.setLocation(jsonLocation16);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext18 = parser15._parsingContext;
        parser4._parsingContext = jsonReadContext18;
        int int20 = parser4.getFeatureMask();
        java.lang.String str21 = parser4.nextFieldName();
        int int23 = parser4.nextIntValue(0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = parser4.getCodec();
        parser4.clearCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser28 = parser4.overrideFormatFeatures(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No FormatFeatures defined for parser of type com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonReadContext18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(objectCodec24);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer9.setPrettyPrinter(prettyPrinter12);
        com.fasterxml.jackson.core.SerializableString serializableString14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer9.writeRawValue(serializableString14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator13);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = tokenBuffer9.asParser();
        tokenBuffer9.writeNumber((float) (-1L));
        int int15 = tokenBuffer9.getOutputBuffered();
        tokenBuffer9.writeNumber((double) (byte) 10);
        tokenBuffer9._mayHaveNativeIds = false;
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        java.lang.Object obj13 = tokenBuffer9.getCurrentValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = tokenBuffer9.asParser(objectCodec14);
        tokenBuffer9._closed = true;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = tokenBuffer9.overrideStdFeatures((int) (byte) 0, (int) (short) 100);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        java.lang.Object obj26 = parser25.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext27 = parser25._parsingContext;
        boolean boolean29 = parser25.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser25);
        tokenBuffer30.writeObject((java.lang.Object) (-1.0d));
        int int33 = tokenBuffer30.getHighestEscapedChar();
        tokenBuffer30.writeNumber("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser40 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment36, objectCodec37, true, true);
        java.lang.Object obj41 = parser40.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext42 = parser40._parsingContext;
        boolean boolean44 = parser40.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser40);
        boolean boolean46 = tokenBuffer45._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment47 = tokenBuffer45._first;
        tokenBuffer30._last = segment47;
        tokenBuffer30.writeNumberField("", (long) 'a');
        int int52 = tokenBuffer30._appendAt;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment54 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser58 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment54, objectCodec55, true, true);
        java.lang.Object obj59 = parser58.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext60 = parser58._parsingContext;
        boolean boolean62 = parser58.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer63 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser58);
        boolean boolean64 = tokenBuffer63._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment65 = tokenBuffer63._first;
        boolean boolean66 = segment65.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment67 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser71 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment67, objectCodec68, true, true);
        java.lang.Object obj72 = parser71.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext73 = parser71._parsingContext;
        boolean boolean75 = parser71.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer76 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser71);
        tokenBuffer76.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment79 = tokenBuffer76._last;
        segment65._next = segment79;
        tokenBuffer30._appendRaw((-1), (java.lang.Object) segment65);
        tokenBuffer9.writeTypeId((java.lang.Object) tokenBuffer30);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer30.writeRaw("", (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(jsonReadContext27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(jsonReadContext42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(segment47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(jsonReadContext60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(segment65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(jsonReadContext73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(segment79);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        boolean boolean10 = tokenBuffer9._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer9._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        java.lang.Object obj18 = parser17.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext19 = parser17._parsingContext;
        boolean boolean21 = parser17.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser17);
        tokenBuffer22.writeObject((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.core.JsonToken jsonToken25 = tokenBuffer22.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = null;
        parser31.setLocation(jsonLocation32);
        int int34 = parser31.getFeatureMask();
        parser31.overrideCurrentName("hi!");
        parser31.setCurrentValue((java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment39, objectCodec40, true, true);
        java.lang.Object obj44 = parser43.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext45 = parser43._parsingContext;
        boolean boolean47 = parser43.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser43);
        com.fasterxml.jackson.core.SerializableString serializableString49 = null;
        tokenBuffer48.writeString(serializableString49);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter51 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = tokenBuffer48.setPrettyPrinter(prettyPrinter51);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = segment11.append(16, jsonToken25, (java.lang.Object) 16, (java.lang.Object) parser31, (java.lang.Object) tokenBuffer48);
        java.lang.Object obj55 = segment53.findTypeId((int) (short) 10);
        java.lang.Object obj57 = segment53.findTypeId(10);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser62 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec59, true, true);
        java.lang.Object obj63 = parser62.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext64 = parser62._parsingContext;
        boolean boolean66 = parser62.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer67 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser62);
        boolean boolean68 = tokenBuffer67._closed;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext69 = tokenBuffer67._writeContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment70 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser74 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment70, objectCodec71, true, true);
        java.lang.Object obj75 = parser74.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext76 = parser74._parsingContext;
        boolean boolean78 = parser74.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer79 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser74);
        boolean boolean80 = tokenBuffer79._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment81 = tokenBuffer79._first;
        boolean boolean82 = segment81.hasIds();
        tokenBuffer67._first = segment81;
        boolean boolean84 = segment81.hasIds();
        long long85 = segment81._tokenTypes;
        segment53._next = segment81;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment87 = segment53.next();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(segment11);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(jsonReadContext19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + jsonToken25 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken25.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(jsonReadContext45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertNotNull(segment53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(jsonReadContext64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext69);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(jsonReadContext76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(segment81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(segment87);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean7 = parser4._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.peekNextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        java.lang.Object obj14 = parser13.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext15 = parser13._parsingContext;
        boolean boolean17 = parser13.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser13);
        boolean boolean19 = parser13.getValueAsBoolean();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = null;
        parser24.setLocation(jsonLocation25);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext27 = parser24._parsingContext;
        parser13._parsingContext = jsonReadContext27;
        parser4._parsingContext = jsonReadContext27;
        int int30 = parser4.getTextOffset();
        com.fasterxml.jackson.core.SerializableString serializableString31 = null;
        boolean boolean32 = parser4.nextFieldName(serializableString31);
        boolean boolean33 = parser4._hasNativeIds;
        com.fasterxml.jackson.core.JsonToken jsonToken34 = parser4.nextToken();
        int int35 = parser4.getTextLength();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(jsonReadContext15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonReadContext27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(jsonToken34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        parser4.setLocation(jsonLocation5);
        boolean boolean8 = parser4.hasTokenId(0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        java.lang.String str14 = parser13.nextFieldName();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = null;
        parser13._byteBuilder = byteArrayBuilder15;
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = parser13.getCurrentLocation();
        parser4.setLocation(jsonLocation17);
        boolean boolean19 = parser4.hasCurrentToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = parser4.getBinaryValue(base64Variant20);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jsonLocation17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        java.lang.Object obj13 = tokenBuffer9.getCurrentValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = tokenBuffer9.asParser(objectCodec14);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec17, true, true);
        java.lang.Object obj21 = parser20.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext22 = parser20._parsingContext;
        boolean boolean24 = parser20.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser20);
        tokenBuffer25.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = tokenBuffer25._last;
        tokenBuffer9._last = segment28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = segment28.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(jsonReadContext22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(segment28);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        java.lang.Object obj6 = parser4.getEmbeddedObject();
        java.io.Writer writer7 = null;
        int int8 = parser4.releaseBuffered(writer7);
        java.io.Writer writer9 = null;
        int int10 = parser4.releaseBuffered(writer9);
        java.lang.String str11 = parser4.getValueAsString();
        int int12 = parser4.getFormatFeatures();
        int int13 = parser4.getTextOffset();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        tokenBuffer2.writeNull();
        boolean boolean4 = tokenBuffer2._hasNativeId;
        tokenBuffer2.writeNull();
        boolean boolean6 = tokenBuffer2.canWriteBinaryNatively();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = tokenBuffer2.getCharacterEscapes();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = tokenBuffer2.forceUseOfBigDecimal(true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = tokenBuffer9._writeContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        java.lang.Object obj16 = parser15.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext17 = parser15._parsingContext;
        boolean boolean19 = parser15.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser15);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext21 = null;
        tokenBuffer20._writeContext = jsonWriteContext21;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = tokenBuffer20.useDefaultPrettyPrinter();
        tokenBuffer20.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer20._objectId = '4';
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser32 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment28, objectCodec29, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation33 = null;
        parser32.setLocation(jsonLocation33);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder35 = parser32._byteBuilder;
        java.io.OutputStream outputStream36 = null;
        int int37 = parser32.releaseBuffered(outputStream36);
        tokenBuffer20.writeObjectId((java.lang.Object) int37);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec39, true);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext42 = tokenBuffer41._writeContext;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = tokenBuffer41.useDefaultPrettyPrinter();
        tokenBuffer20.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer41);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = tokenBuffer20._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment47 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser51 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment47, objectCodec48, true, true);
        java.lang.Object obj52 = parser51.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext53 = parser51._parsingContext;
        boolean boolean55 = parser51.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer56 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser51);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext57 = null;
        tokenBuffer56._writeContext = jsonWriteContext57;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator59 = tokenBuffer56.useDefaultPrettyPrinter();
        tokenBuffer56.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer56._objectId = '4';
        tokenBuffer56._generatorFeatures = '#';
        tokenBuffer56._closed = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser72 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment68, objectCodec69, true, true);
        java.lang.Object obj73 = parser72.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext74 = parser72._parsingContext;
        boolean boolean76 = parser72.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer77 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser72);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext78 = null;
        tokenBuffer77._writeContext = jsonWriteContext78;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator80 = tokenBuffer77.useDefaultPrettyPrinter();
        boolean boolean81 = jsonGenerator80.canOmitFields();
        int int82 = jsonGenerator80.getOutputBuffered();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter83 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator84 = jsonGenerator80.setPrettyPrinter(prettyPrinter83);
        tokenBuffer56.writeTypeId((java.lang.Object) prettyPrinter83);
        boolean boolean86 = tokenBuffer56._hasNativeTypeIds;
        boolean boolean87 = tokenBuffer56.canWriteBinaryNatively();
        com.fasterxml.jackson.core.FormatSchema formatSchema88 = null;
        boolean boolean89 = tokenBuffer56.canUseSchema(formatSchema88);
        com.fasterxml.jackson.core.JsonToken jsonToken90 = tokenBuffer56.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment91 = segment45.append(2, jsonToken90);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer9.writeObjectRef((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(characterEscapes7);
        org.junit.Assert.assertNotNull(tokenBuffer9);
        org.junit.Assert.assertNotNull(jsonWriteContext10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(jsonReadContext17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertNull(byteArrayBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(jsonWriteContext42);
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNotNull(segment45);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(jsonReadContext53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jsonGenerator59);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(jsonReadContext74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jsonGenerator80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + jsonToken90 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken90.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(segment91);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        int int9 = parser4.getCurrentTokenId();
        boolean boolean11 = parser4.hasTokenId(35);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser4.getCurrentToken();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonToken12);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        parser4.setLocation(jsonLocation5);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext7 = parser4._parsingContext;
        int int8 = parser4.getTextLength();
        boolean boolean9 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.getCurrentToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        java.lang.Object obj16 = parser15.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext17 = parser15._parsingContext;
        boolean boolean19 = parser15.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser15);
        boolean boolean21 = parser15.getValueAsBoolean();
        java.io.Writer writer22 = null;
        int int23 = parser15.releaseBuffered(writer22);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment24, objectCodec25, true, true);
        java.lang.Object obj29 = parser28.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext30 = parser28._parsingContext;
        boolean boolean32 = parser28.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer33 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser28);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext34 = null;
        tokenBuffer33._writeContext = jsonWriteContext34;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = tokenBuffer33.useDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment37 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser41 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment37, objectCodec38, true, true);
        java.lang.Object obj42 = parser41.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext43 = parser41._parsingContext;
        boolean boolean44 = parser41.isClosed();
        long long45 = parser41.getValueAsLong();
        com.fasterxml.jackson.core.JsonParser jsonParser46 = tokenBuffer33.asParser((com.fasterxml.jackson.core.JsonParser) parser41);
        tokenBuffer33.writeRawValue("hi!");
        parser15.setCurrentValue((java.lang.Object) tokenBuffer33);
        parser4.setCurrentValue((java.lang.Object) parser15);
        com.fasterxml.jackson.core.JsonParser jsonParser53 = parser4.overrideStdFeatures((int) (byte) -1, (int) (short) 100);
        boolean boolean54 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonToken jsonToken55 = parser4.getLastClearedToken();
        boolean boolean56 = parser4.canReadObjectId();
        org.junit.Assert.assertNotNull(jsonReadContext7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(jsonReadContext17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(jsonReadContext30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(jsonReadContext43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jsonToken55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        tokenBuffer9.writeObject((java.lang.Object) (-1.0d));
        int int12 = tokenBuffer9.getHighestEscapedChar();
        tokenBuffer9._objectId = (byte) 1;
        byte[] byteArray15 = new byte[] {};
        tokenBuffer9.writeBinary(byteArray15);
        boolean boolean17 = tokenBuffer9.isClosed();
        tokenBuffer9.writeNumberField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT]", (int) (short) 100);
        tokenBuffer9._mayHaveNativeIds = true;
        boolean boolean23 = tokenBuffer9.canWriteTypeId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment24 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment24, objectCodec25, true, true);
        java.lang.Object obj29 = parser28.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext30 = parser28._parsingContext;
        boolean boolean32 = parser28.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer33 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser28);
        com.fasterxml.jackson.core.SerializableString serializableString34 = null;
        tokenBuffer33.writeString(serializableString34);
        tokenBuffer33.writeStartObject();
        tokenBuffer33._hasNativeTypeIds = true;
        byte[] byteArray41 = new byte[] { (byte) 10 };
        tokenBuffer33.writeBinaryField("hi!", byteArray41);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer44 = tokenBuffer33.forceUseOfBigDecimal(true);
        java.lang.Object obj45 = null;
        tokenBuffer44._objectId = obj45;
        tokenBuffer9.writeObjectId((java.lang.Object) tokenBuffer44);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment49 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser53 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment49, objectCodec50, true, true);
        java.lang.Object obj54 = parser53.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext55 = parser53._parsingContext;
        boolean boolean57 = parser53.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser53);
        tokenBuffer58.writeObject((java.lang.Object) (-1.0d));
        int int61 = tokenBuffer58.getHighestEscapedChar();
        tokenBuffer58.writeNumber("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment64 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser68 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment64, objectCodec65, true, true);
        java.lang.Object obj69 = parser68.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext70 = parser68._parsingContext;
        boolean boolean72 = parser68.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer73 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser68);
        boolean boolean74 = tokenBuffer73._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment75 = tokenBuffer73._first;
        tokenBuffer58._last = segment75;
        com.fasterxml.jackson.core.JsonToken jsonToken77 = tokenBuffer58.firstToken();
        java.lang.Object obj78 = tokenBuffer58.getOutputTarget();
        tokenBuffer58.writeEndObject();
        tokenBuffer9._appendRaw((int) (short) 1, (java.lang.Object) tokenBuffer58);
        tokenBuffer9.writeNumber("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(jsonReadContext30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(tokenBuffer44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(jsonReadContext55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(jsonReadContext70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(segment75);
        org.junit.Assert.assertTrue("'" + jsonToken77 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken77.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        tokenBuffer9.writeObject((java.lang.Object) (-1.0d));
        int int12 = tokenBuffer9.getHighestEscapedChar();
        tokenBuffer9.writeNumber("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser19 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment15, objectCodec16, true, true);
        java.lang.Object obj20 = parser19.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext21 = parser19._parsingContext;
        boolean boolean23 = parser19.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser19);
        boolean boolean25 = tokenBuffer24._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = tokenBuffer24._first;
        tokenBuffer9._last = segment26;
        tokenBuffer9.writeNumberField("", (long) 'a');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser35 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment31, objectCodec32, true, true);
        java.lang.Object obj36 = parser35.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext37 = parser35._parsingContext;
        boolean boolean39 = parser35.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer40 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser35);
        boolean boolean41 = tokenBuffer40._closed;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext42 = tokenBuffer40._writeContext;
        tokenBuffer9._writeContext = jsonWriteContext42;
        tokenBuffer9.writeString("");
        boolean boolean46 = tokenBuffer9._mayHaveNativeIds;
        boolean boolean47 = tokenBuffer9._hasNativeObjectIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser52 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment48, objectCodec49, true, true);
        java.lang.Object obj53 = parser52.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext54 = parser52._parsingContext;
        boolean boolean56 = parser52.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser52);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext58 = null;
        tokenBuffer57._writeContext = jsonWriteContext58;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = tokenBuffer57.useDefaultPrettyPrinter();
        java.lang.Object obj61 = tokenBuffer57.getCurrentValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser63 = tokenBuffer57.asParser(objectCodec62);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment64 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser68 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment64, objectCodec65, true, true);
        java.lang.Object obj69 = parser68.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext70 = parser68._parsingContext;
        boolean boolean72 = parser68.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer73 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser68);
        tokenBuffer73.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment76 = tokenBuffer73._last;
        tokenBuffer57._last = segment76;
        tokenBuffer9._first = segment76;
        tokenBuffer9.writeObjectFieldStart("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(jsonReadContext21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(segment26);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(jsonReadContext37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(jsonReadContext54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(jsonReadContext70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(segment76);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        tokenBuffer9.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer9._objectId = '4';
        tokenBuffer9._generatorFeatures = '#';
        tokenBuffer9._closed = true;
        java.math.BigDecimal bigDecimal21 = null;
        tokenBuffer9.writeNumber(bigDecimal21);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = tokenBuffer9.setFeatureMask((int) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = tokenBuffer9.setCodec(objectCodec25);
        java.lang.Object obj27 = tokenBuffer9._typeId;
        java.math.BigInteger bigInteger28 = null;
        tokenBuffer9.writeNumber(bigInteger28);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.SerializableString serializableString10 = null;
        tokenBuffer9.writeString(serializableString10);
        boolean boolean12 = tokenBuffer9.canWriteBinaryNatively();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        java.lang.Object obj18 = parser17.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext19 = parser17._parsingContext;
        boolean boolean21 = parser17.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser17);
        tokenBuffer22.writeObject((java.lang.Object) (-1.0d));
        int int25 = tokenBuffer22.getHighestEscapedChar();
        tokenBuffer22.writeNumber("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser32 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment28, objectCodec29, true, true);
        java.lang.Object obj33 = parser32.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext34 = parser32._parsingContext;
        boolean boolean36 = parser32.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser32);
        boolean boolean38 = tokenBuffer37._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = tokenBuffer37._first;
        tokenBuffer22._last = segment39;
        com.fasterxml.jackson.core.JsonToken jsonToken41 = tokenBuffer22.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser46 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment42, objectCodec43, true, true);
        java.lang.Object obj47 = parser46.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext48 = parser46._parsingContext;
        boolean boolean50 = parser46.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer51 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser46);
        tokenBuffer51.writeObject((java.lang.Object) (-1.0d));
        int int54 = tokenBuffer51.getHighestEscapedChar();
        tokenBuffer51.writeNumber("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment57 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser61 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment57, objectCodec58, true, true);
        java.lang.Object obj62 = parser61.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext63 = parser61._parsingContext;
        boolean boolean65 = parser61.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer66 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser61);
        boolean boolean67 = tokenBuffer66._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = tokenBuffer66._first;
        tokenBuffer51._last = segment68;
        tokenBuffer9._append(jsonToken41, (java.lang.Object) tokenBuffer51);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator72 = tokenBuffer9.setFeatureMask(100);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment73 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser77 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment73, objectCodec74, true, true);
        java.lang.Object obj78 = parser77.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext79 = parser77._parsingContext;
        boolean boolean81 = parser77.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer82 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser77);
        com.fasterxml.jackson.core.SerializableString serializableString83 = null;
        tokenBuffer82.writeString(serializableString83);
        tokenBuffer82.writeStartObject();
        tokenBuffer82._hasNativeTypeIds = true;
        int int88 = tokenBuffer82._generatorFeatures;
        tokenBuffer82._generatorFeatures = 15;
        boolean boolean91 = tokenBuffer82._mayHaveNativeIds;
        tokenBuffer9.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer82);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(jsonReadContext19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(jsonReadContext34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(segment39);
        org.junit.Assert.assertTrue("'" + jsonToken41 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken41.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(jsonReadContext48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(jsonReadContext63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(segment68);
        org.junit.Assert.assertNotNull(jsonGenerator72);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(jsonReadContext79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 31 + "'", int88 == 31);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        tokenBuffer9.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer9._objectId = '4';
        tokenBuffer9._generatorFeatures = '#';
        tokenBuffer9._closed = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        java.lang.Object obj26 = parser25.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext27 = parser25._parsingContext;
        boolean boolean29 = parser25.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser25);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext31 = null;
        tokenBuffer30._writeContext = jsonWriteContext31;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer30.useDefaultPrettyPrinter();
        boolean boolean34 = jsonGenerator33.canOmitFields();
        int int35 = jsonGenerator33.getOutputBuffered();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator33.setPrettyPrinter(prettyPrinter36);
        tokenBuffer9.writeTypeId((java.lang.Object) prettyPrinter36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = tokenBuffer9._objectCodec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser44 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment40, objectCodec41, true, true);
        java.lang.Object obj45 = parser44.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext46 = parser44._parsingContext;
        boolean boolean48 = parser44.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer49 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser44);
        boolean boolean50 = tokenBuffer49._closed;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext51 = tokenBuffer49._writeContext;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment52, objectCodec53, true, true);
        java.lang.Object obj57 = parser56.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext58 = parser56._parsingContext;
        boolean boolean60 = parser56.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer61 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser56);
        boolean boolean62 = tokenBuffer61._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment63 = tokenBuffer61._first;
        boolean boolean64 = segment63.hasIds();
        tokenBuffer49._first = segment63;
        java.lang.Object obj67 = segment63.findTypeId(1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser71 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment63, objectCodec68, false, false);
        segment63._tokenTypes = (-1);
        boolean boolean74 = segment63.hasIds();
        tokenBuffer9._first = segment63;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter76 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator77 = tokenBuffer9.setPrettyPrinter(prettyPrinter76);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(jsonReadContext27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNull(objectCodec39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(jsonReadContext46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext51);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(jsonReadContext58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(segment63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jsonGenerator77);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        tokenBuffer9.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer9._objectId = '4';
        tokenBuffer9._generatorFeatures = '#';
        tokenBuffer9._closed = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        java.lang.Object obj26 = parser25.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext27 = parser25._parsingContext;
        boolean boolean29 = parser25.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser25);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext31 = null;
        tokenBuffer30._writeContext = jsonWriteContext31;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer30.useDefaultPrettyPrinter();
        boolean boolean34 = jsonGenerator33.canOmitFields();
        int int35 = jsonGenerator33.getOutputBuffered();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator33.setPrettyPrinter(prettyPrinter36);
        tokenBuffer9.writeTypeId((java.lang.Object) prettyPrinter36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = tokenBuffer9._objectCodec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser44 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment40, objectCodec41, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation45 = null;
        parser44.setLocation(jsonLocation45);
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext47 = parser44._parsingContext;
        int int48 = parser44.getTextLength();
        boolean boolean49 = parser44.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken50 = parser44.getCurrentToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser55 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment51, objectCodec52, true, true);
        java.lang.Object obj56 = parser55.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext57 = parser55._parsingContext;
        boolean boolean59 = parser55.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer60 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser55);
        boolean boolean61 = parser55.getValueAsBoolean();
        java.io.Writer writer62 = null;
        int int63 = parser55.releaseBuffered(writer62);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment64 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser68 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment64, objectCodec65, true, true);
        java.lang.Object obj69 = parser68.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext70 = parser68._parsingContext;
        boolean boolean72 = parser68.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer73 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser68);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext74 = null;
        tokenBuffer73._writeContext = jsonWriteContext74;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator76 = tokenBuffer73.useDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment77 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec78 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser81 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment77, objectCodec78, true, true);
        java.lang.Object obj82 = parser81.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext83 = parser81._parsingContext;
        boolean boolean84 = parser81.isClosed();
        long long85 = parser81.getValueAsLong();
        com.fasterxml.jackson.core.JsonParser jsonParser86 = tokenBuffer73.asParser((com.fasterxml.jackson.core.JsonParser) parser81);
        tokenBuffer73.writeRawValue("hi!");
        parser55.setCurrentValue((java.lang.Object) tokenBuffer73);
        parser44.setCurrentValue((java.lang.Object) parser55);
        com.fasterxml.jackson.core.JsonParser jsonParser93 = parser44.overrideStdFeatures((int) (byte) -1, (int) (short) 100);
        tokenBuffer9.writeObjectId((java.lang.Object) (byte) -1);
        com.fasterxml.jackson.core.SerializableString serializableString95 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator96 = tokenBuffer9.setRootValueSeparator(serializableString95);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(jsonReadContext27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNull(objectCodec39);
        org.junit.Assert.assertNotNull(jsonReadContext47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jsonToken50);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(jsonReadContext57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(jsonReadContext70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jsonGenerator76);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(jsonReadContext83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(jsonParser86);
        org.junit.Assert.assertNotNull(jsonParser93);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        java.lang.Object obj5 = parser4.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext6 = parser4._parsingContext;
        boolean boolean8 = parser4.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext10 = null;
        tokenBuffer9._writeContext = jsonWriteContext10;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer9.useDefaultPrettyPrinter();
        tokenBuffer9.writeObject((java.lang.Object) (byte) 100);
        tokenBuffer9._objectId = '4';
        tokenBuffer9._generatorFeatures = '#';
        tokenBuffer9._closed = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        java.lang.Object obj26 = parser25.getCurrentValue();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext27 = parser25._parsingContext;
        boolean boolean29 = parser25.getValueAsBoolean(false);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser25);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext31 = null;
        tokenBuffer30._writeContext = jsonWriteContext31;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = tokenBuffer30.useDefaultPrettyPrinter();
        boolean boolean34 = jsonGenerator33.canOmitFields();
        int int35 = jsonGenerator33.getOutputBuffered();
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = jsonGenerator33.setPrettyPrinter(prettyPrinter36);
        tokenBuffer9.writeTypeId((java.lang.Object) prettyPrinter36);
        boolean boolean39 = tokenBuffer9._hasNativeTypeIds;
        boolean boolean40 = tokenBuffer9.canWriteBinaryNatively();
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = null;
        boolean boolean42 = tokenBuffer9.canUseSchema(formatSchema41);
        tokenBuffer9._hasNativeObjectIds = true;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = tokenBuffer9.forceUseOfBigDecimal(false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(jsonReadContext6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(jsonReadContext27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tokenBuffer46);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation5 = null;
        parser4.setLocation(jsonLocation5);
        int int7 = parser4.getFeatureMask();
        parser4.overrideCurrentName("hi!");
        parser4.setCurrentValue((java.lang.Object) (byte) 10);
        boolean boolean13 = parser4.hasTokenId((int) (short) 10);
        boolean boolean14 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        tokenBuffer15.writeNumber(2.0d);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter18 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = tokenBuffer15.setPrettyPrinter(prettyPrinter18);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonGenerator19);
    }
}

