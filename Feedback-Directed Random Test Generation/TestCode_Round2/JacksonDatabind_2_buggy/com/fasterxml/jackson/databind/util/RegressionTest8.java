package com.fasterxml.jackson.databind.util;

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
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        java.lang.String str9 = parser4.getValueAsString("");
        com.fasterxml.jackson.core.JsonParser jsonParser10 = parser4.skipChildren();
        java.io.OutputStream outputStream11 = null;
        int int12 = jsonParser10.releaseBuffered(outputStream11);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(jsonParser10);
        int int14 = jsonParser10.getValueAsInt();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        long long11 = parser4.getValueAsLong();
        parser4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext13 = parser4.getParsingContext();
        int int14 = parser4.getFeatureMask();
        java.lang.String str15 = parser4.getCurrentName();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        com.fasterxml.jackson.core.Base64Variant base64Variant18 = null;
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer17.writeBinary(base64Variant18, byteArray24, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString28 = null;
        tokenBuffer17.writeString(serializableString28);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec31);
        com.fasterxml.jackson.core.Base64Variant base64Variant33 = null;
        byte[] byteArray39 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer32.writeBinary(base64Variant33, byteArray39, (int) (short) 1, (int) (short) 0);
        tokenBuffer17.writeBinaryField("", byteArray39);
        int int44 = tokenBuffer17._appendAt;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        tokenBuffer17._objectCodec = objectCodec45;
        java.math.BigDecimal bigDecimal47 = null;
        tokenBuffer17.writeNumber(bigDecimal47);
        tokenBuffer17.writeNumber((int) (byte) 1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment52, objectCodec53, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema57 = parser56.getSchema();
        int int59 = parser56.nextIntValue(10);
        com.fasterxml.jackson.core.FormatSchema formatSchema60 = parser56.getSchema();
        java.lang.String str61 = parser56.getText();
        com.fasterxml.jackson.core.JsonToken jsonToken62 = parser56.nextValue();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment63 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser67 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment63, objectCodec64, true, true);
        int int68 = parser67.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = parser67._codec;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext70 = parser67._parsingContext;
        parser56._parsingContext = jsonReadContext70;
        tokenBuffer17.writeObjectField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]", (java.lang.Object) jsonReadContext70);
        parser4._parsingContext = jsonReadContext70;
        // The following exception was thrown during execution in test generation
        try {
            int int74 = parser4.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(jsonStreamContext13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertNull(formatSchema57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNull(formatSchema60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(jsonToken62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(objectCodec69);
        org.junit.Assert.assertNotNull(jsonReadContext70);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        tokenBuffer1.writeObjectFieldStart("");
        tokenBuffer1.writeBooleanField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE]", false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode7 = null;
        tokenBuffer1.writeTree(treeNode7);
        java.lang.Object obj9 = tokenBuffer1._typeId;
        tokenBuffer1.writeOmittedField("[TokenBuffer: VALUE_NULL]");
        tokenBuffer1.writeBoolean(false);
        tokenBuffer1.writeNumberField("", (double) 6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        tokenBuffer11.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext19 = tokenBuffer11.getOutputContext();
        tokenBuffer1._writeContext = jsonWriteContext19;
        java.math.BigInteger bigInteger21 = null;
        tokenBuffer1.writeNumber(bigInteger21);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment23 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser27 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment23, objectCodec24, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = parser27.skipChildren();
        java.io.Writer writer29 = null;
        int int30 = parser27.releaseBuffered(writer29);
        boolean boolean31 = parser27.isExpectedStartArrayToken();
        java.lang.String str32 = parser27.getCurrentName();
        tokenBuffer1.writeTypeId((java.lang.Object) parser27);
        int int34 = parser27.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        parser27._codec = objectCodec35;
        boolean boolean37 = parser27._hasNativeIds;
        com.fasterxml.jackson.core.JsonLocation jsonLocation38 = parser27.getCurrentLocation();
        boolean boolean39 = parser27.getValueAsBoolean();
        parser27.clearCurrentToken();
        boolean boolean41 = parser27._hasNativeIds;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext19);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jsonLocation38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }
}

