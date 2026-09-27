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
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext14 = tokenBuffer1.getOutputContext();
        tokenBuffer1.writeStringField("hi!", "");
        tokenBuffer1.writeNumber((float) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = tokenBuffer1.setCodec(objectCodec20);
        com.fasterxml.jackson.core.SerializableString serializableString22 = null;
        tokenBuffer1.writeString(serializableString22);
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        com.fasterxml.jackson.core.Base64Variant base64Variant27 = null;
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer26.writeBinary(base64Variant27, byteArray33, (int) (short) 1, (int) (short) 0);
        tokenBuffer26.writeStartArray((int) (byte) 1);
        tokenBuffer26.writeNumber((long) 'a');
        tokenBuffer26.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]", (float) 490332L);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = tokenBuffer26.useDefaultPrettyPrinter();
        tokenBuffer1._appendRaw(100, (java.lang.Object) jsonGenerator44);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser47 = tokenBuffer1.asParser(objectCodec46);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonWriteContext14);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(jsonGenerator44);
        org.junit.Assert.assertNotNull(jsonParser47);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        int int43 = tokenBuffer1.getFeatureMask();
        boolean boolean44 = tokenBuffer1.canWriteObjectId();
        java.lang.Object obj45 = tokenBuffer1._objectId;
        tokenBuffer1.writeNumber((short) (byte) 0);
        boolean boolean48 = tokenBuffer1._hasNativeId;
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 79 + "'", int43 == 79);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.lang.Object obj2 = tokenBuffer1._objectId;
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer1._first;
        java.lang.Object obj16 = segment14.findObjectId((int) 'a');
        int int18 = segment14.rawType((int) (short) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        java.math.BigInteger bigInteger23 = null;
        tokenBuffer22.writeNumber(bigInteger23);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser29 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment25, objectCodec26, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = parser29.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation31 = parser29.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = parser29.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment33 = parser29._segment;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment34 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser38 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment34, objectCodec35, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = null;
        boolean boolean40 = parser38.canUseSchema(formatSchema39);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder41 = parser38._byteBuilder;
        int int42 = parser38._segmentPtr;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext43 = parser38._parsingContext;
        parser29._parsingContext = jsonReadContext43;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        com.fasterxml.jackson.core.Base64Variant base64Variant47 = null;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer46.writeBinary(base64Variant47, byteArray53, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString57 = null;
        tokenBuffer46.writeString(serializableString57);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment59 = tokenBuffer46._first;
        java.lang.Object obj61 = segment59.findObjectId((int) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser63 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment59, objectCodec62);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap64 = null;
        segment59._nativeIds = intMap64;
        segment59._tokenTypes = 97;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = segment14.appendRaw(16, (int) (byte) -1, (java.lang.Object) tokenBuffer22, (java.lang.Object) parser29, (java.lang.Object) segment59);
        int int70 = segment59.rawType(0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonLocation31);
        org.junit.Assert.assertNotNull(jsonLocation32);
        org.junit.Assert.assertNull(segment33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(byteArrayBuilder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext43);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(segment68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer7.writeBinary(base64Variant8, byteArray14, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        tokenBuffer7.writeString(serializableString18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer7._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap25 = null;
        segment20._nativeIds = intMap25;
        parser4._segment = segment20;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap28 = segment20._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec31);
        java.math.BigInteger bigInteger33 = null;
        tokenBuffer32.writeNumber(bigInteger33);
        tokenBuffer32.writeBooleanField("hi!", false);
        tokenBuffer32.writeNumber((double) '4');
        java.lang.Object obj40 = tokenBuffer32.getOutputTarget();
        tokenBuffer32.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = tokenBuffer32.getCharacterEscapes();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = null;
        boolean boolean51 = parser49.canUseSchema(formatSchema50);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder52 = parser49._byteBuilder;
        int int53 = parser49._segmentPtr;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext54 = parser49._parsingContext;
        tokenBuffer32._typeId = parser49;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object[] objArray57 = segment56._tokens;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser62 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec59, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = parser62.skipChildren();
        java.io.Writer writer64 = null;
        int int65 = parser62.releaseBuffered(writer64);
        boolean boolean66 = parser62.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema67 = null;
        boolean boolean68 = parser62.canUseSchema(formatSchema67);
        boolean boolean69 = parser62._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment70 = parser62._segment;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment71 = segment20.appendRaw(100, (int) (short) 10, (java.lang.Object) tokenBuffer32, (java.lang.Object) segment56, (java.lang.Object) parser62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec72 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser73 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec72);
        com.fasterxml.jackson.core.JsonToken jsonToken75 = segment20.type(5);
        java.lang.Object obj77 = segment20.findObjectId(3);
        java.lang.Object obj79 = segment20.findTypeId(97);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap80 = segment20._nativeIds;
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment20);
        org.junit.Assert.assertNull(intMap28);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(characterEscapes44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(byteArrayBuilder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertArrayEquals(objArray57, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(segment70);
        org.junit.Assert.assertNotNull(segment71);
        org.junit.Assert.assertNull(jsonToken75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(intMap80);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        tokenBuffer1._hasNativeId = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        int int14 = parser13.getCurrentTokenId();
        tokenBuffer1._typeId = int14;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        java.math.BigInteger bigInteger18 = null;
        tokenBuffer17.writeNumber(bigInteger18);
        com.fasterxml.jackson.core.Version version20 = tokenBuffer17.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        com.fasterxml.jackson.core.Base64Variant base64Variant23 = null;
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer22.writeBinary(base64Variant23, byteArray29, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString33 = null;
        tokenBuffer22.writeString(serializableString33);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment35 = tokenBuffer22._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser39 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment35, objectCodec36, false, false);
        boolean boolean40 = parser39.isClosed();
        tokenBuffer17._objectId = boolean40;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        com.fasterxml.jackson.core.Base64Variant base64Variant44 = null;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer43.writeBinary(base64Variant44, byteArray50, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString54 = null;
        tokenBuffer43.writeString(serializableString54);
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec57);
        com.fasterxml.jackson.core.Base64Variant base64Variant59 = null;
        byte[] byteArray65 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer58.writeBinary(base64Variant59, byteArray65, (int) (short) 1, (int) (short) 0);
        tokenBuffer43.writeBinaryField("", byteArray65);
        java.lang.Object obj70 = tokenBuffer43._typeId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec71 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer72 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec71);
        java.math.BigInteger bigInteger73 = null;
        tokenBuffer72.writeNumber(bigInteger73);
        tokenBuffer72.writeBooleanField("hi!", false);
        tokenBuffer72.writeNumber((double) '4');
        java.lang.Object obj80 = tokenBuffer72.getOutputTarget();
        tokenBuffer72.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator84 = tokenBuffer72.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext85 = tokenBuffer72.getOutputContext();
        tokenBuffer43._writeContext = jsonWriteContext85;
        tokenBuffer17._writeContext = jsonWriteContext85;
        tokenBuffer1._writeContext = jsonWriteContext85;
        com.fasterxml.jackson.core.Version version89 = tokenBuffer1.version();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment90 = tokenBuffer1._last;
        tokenBuffer1.writeNumber("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(version20);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(jsonGenerator84);
        org.junit.Assert.assertNotNull(jsonWriteContext85);
        org.junit.Assert.assertNotNull(version89);
        org.junit.Assert.assertNotNull(segment90);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder8 = parser4._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = parser4.setFeatureMask(1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation15 = parser4.getTokenLocation();
        boolean boolean16 = parser4.canReadTypeId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser21 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment17, objectCodec18, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = parser21.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation23 = parser21.getTokenLocation();
        parser4.setLocation(jsonLocation23);
        parser4._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = parser31.skipChildren();
        java.io.Writer writer33 = null;
        int int34 = parser31.releaseBuffered(writer33);
        boolean boolean35 = parser31.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema36 = null;
        boolean boolean37 = parser31.canUseSchema(formatSchema36);
        boolean boolean38 = parser31._closed;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder39 = null;
        parser31._byteBuilder = byteArrayBuilder39;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment41 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser45 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment41, objectCodec42, true, true);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder46 = null;
        parser45._byteBuilder = byteArrayBuilder46;
        com.fasterxml.jackson.core.JsonLocation jsonLocation48 = parser45.getTokenLocation();
        parser31.setLocation(jsonLocation48);
        com.fasterxml.jackson.core.JsonLocation jsonLocation50 = parser31.getCurrentLocation();
        parser4._location = jsonLocation50;
        long long52 = parser4.getValueAsLong();
        boolean boolean53 = parser4.isClosed();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonLocation15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(jsonLocation23);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonLocation48);
        org.junit.Assert.assertNotNull(jsonLocation50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        long long8 = parser4.nextLongValue((long) (short) 10);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder9 = null;
        parser4._byteBuilder = byteArrayBuilder9;
        int int11 = parser4.getTextLength();
        int int12 = parser4.getValueAsInt();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        tokenBuffer1.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext11 = tokenBuffer1.getOutputContext();
        tokenBuffer1.writeNullField("");
        tokenBuffer1.writeNumberField("hi!", (-1));
        int int17 = tokenBuffer1._generatorFeatures;
        boolean boolean18 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeNumberField("", (double) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = parser26.skipChildren();
        java.io.Writer writer28 = null;
        int int29 = parser26.releaseBuffered(writer28);
        boolean boolean30 = parser26.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = null;
        boolean boolean32 = parser26.canUseSchema(formatSchema31);
        boolean boolean33 = parser26._closed;
        java.lang.String str34 = parser26.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = parser26.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser36 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        java.math.BigInteger bigInteger39 = null;
        tokenBuffer38.writeNumber(bigInteger39);
        tokenBuffer38.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = tokenBuffer38.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = tokenBuffer48.setHighestNonEscapedChar((-1));
        tokenBuffer38.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.SerializableString serializableString57 = null;
        tokenBuffer38.writeString(serializableString57);
        com.fasterxml.jackson.core.ObjectCodec objectCodec60 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer61 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec60);
        com.fasterxml.jackson.core.Base64Variant base64Variant62 = null;
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer61.writeBinary(base64Variant62, byteArray68, (int) (short) 1, (int) (short) 0);
        tokenBuffer38.writeBinaryField("", byteArray68);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment73 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object[] objArray74 = segment73._tokens;
        tokenBuffer38.writeObject((java.lang.Object) segment73);
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer77 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec76);
        tokenBuffer77.writeNumber((short) -1);
        tokenBuffer77.writeNumberField("", (int) '4');
        java.lang.Object obj83 = tokenBuffer77._objectId;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext84 = tokenBuffer77._writeContext;
        tokenBuffer38._writeContext = jsonWriteContext84;
        tokenBuffer1._objectId = tokenBuffer38;
        boolean boolean87 = tokenBuffer1.canWriteTypeId();
        org.junit.Assert.assertNotNull(jsonWriteContext11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(jsonLocation35);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(jsonWriteContext84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1._mayHaveNativeIds = true;
        tokenBuffer1._appendAt = (byte) -1;
        boolean boolean13 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer1._first;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(segment14);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        boolean boolean8 = parser4._closed;
        boolean boolean9 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.nextToken();
        boolean boolean11 = parser4.canReadTypeId();
        char[] charArray12 = parser4.getTextCharacters();
        boolean boolean13 = parser4._hasNativeObjectIds;
        int int14 = parser4.getTextLength();
        java.io.Writer writer15 = null;
        int int16 = parser4.releaseBuffered(writer15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1._appendAt = (short) 100;
        tokenBuffer1.writeEndObject();
        tokenBuffer1._closed = true;
        int int17 = tokenBuffer1.getFeatureMask();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeStartObject();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        tokenBuffer12.writeNumber((short) -1);
        tokenBuffer12.writeNumberField("", (int) '4');
        int int18 = tokenBuffer12.getFeatureMask();
        tokenBuffer12._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        java.math.BigInteger bigInteger23 = null;
        tokenBuffer22.writeNumber(bigInteger23);
        tokenBuffer22.writeBooleanField("hi!", false);
        tokenBuffer22.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext30 = tokenBuffer22.getOutputContext();
        tokenBuffer12._writeContext = jsonWriteContext30;
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer12.writeNumber(bigInteger32);
        boolean boolean34 = tokenBuffer12.canWriteObjectId();
        tokenBuffer12._hasNativeObjectIds = false;
        tokenBuffer12.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        tokenBuffer39.writeNumber((short) -1);
        tokenBuffer39.writeNumberField("", (int) '4');
        int int45 = tokenBuffer39.getFeatureMask();
        tokenBuffer39._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer49 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec48);
        java.math.BigInteger bigInteger50 = null;
        tokenBuffer49.writeNumber(bigInteger50);
        tokenBuffer49.writeBooleanField("hi!", false);
        tokenBuffer49.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext57 = tokenBuffer49.getOutputContext();
        tokenBuffer39._writeContext = jsonWriteContext57;
        tokenBuffer12._writeContext = jsonWriteContext57;
        tokenBuffer1._appendRaw(1, (java.lang.Object) tokenBuffer12);
        boolean boolean61 = tokenBuffer1._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonToken jsonToken62 = tokenBuffer1.firstToken();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 79 + "'", int18 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 79 + "'", int45 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + jsonToken62 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken62.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        boolean boolean7 = parser4.canUseSchema(formatSchema6);
        parser4.overrideCurrentName("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        tokenBuffer11.writeEndArray();
        boolean boolean18 = tokenBuffer11.canWriteObjectId();
        tokenBuffer11.writeNumber((long) 0);
        tokenBuffer11._hasNativeId = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = tokenBuffer11.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        com.fasterxml.jackson.core.Base64Variant base64Variant26 = null;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer25.writeBinary(base64Variant26, byteArray32, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        tokenBuffer25.writeString(serializableString36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = tokenBuffer25._first;
        java.lang.Object obj40 = segment38.findObjectId((int) 'a');
        int int42 = segment38.rawType((int) (short) 0);
        int int44 = segment38.rawType((int) (byte) -1);
        tokenBuffer11._last = segment38;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = tokenBuffer48.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec57);
        java.math.BigInteger bigInteger59 = null;
        tokenBuffer58.writeNumber(bigInteger59);
        tokenBuffer58.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator65 = tokenBuffer58.setHighestNonEscapedChar((-1));
        tokenBuffer48.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken67 = tokenBuffer48.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer69 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec68);
        com.fasterxml.jackson.core.Base64Variant base64Variant70 = null;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer69.writeBinary(base64Variant70, byteArray76, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString80 = null;
        tokenBuffer69.writeString(serializableString80);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment82 = tokenBuffer69._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment83 = segment38.append(79, jsonToken67, (java.lang.Object) segment82);
        parser4._segment = segment82;
        long long86 = parser4.nextLongValue((long) 'a');
        java.lang.String str87 = parser4.getValueAsString();
        int int88 = parser4.getFeatureMask();
        int int89 = parser4.getTextLength();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(jsonGenerator65);
        org.junit.Assert.assertTrue("'" + jsonToken67 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken67.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment82);
        org.junit.Assert.assertNotNull(segment83);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 97L + "'", long86 == 97L);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        java.math.BigDecimal bigDecimal9 = null;
        tokenBuffer1.writeNumber(bigDecimal9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        java.math.BigInteger bigInteger13 = null;
        tokenBuffer12.writeNumber(bigInteger13);
        tokenBuffer12.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = tokenBuffer12.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        java.math.BigInteger bigInteger23 = null;
        tokenBuffer22.writeNumber(bigInteger23);
        tokenBuffer22.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer22.setHighestNonEscapedChar((-1));
        tokenBuffer12.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken31 = tokenBuffer12.firstToken();
        tokenBuffer1._append(jsonToken31);
        boolean boolean33 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter34 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser36 = tokenBuffer1.asParser(objectCodec35);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator19);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertTrue("'" + jsonToken31 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken31.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(prettyPrinter34);
        org.junit.Assert.assertNotNull(jsonParser36);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        boolean boolean12 = parser11.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = parser11.skipChildren();
        boolean boolean14 = parser11.canReadObjectId();
        parser11.overrideCurrentName("hi!");
        tokenBuffer1._typeId = parser11;
        tokenBuffer1._generatorFeatures = 10;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        tokenBuffer21.writeNumber((double) '4');
        java.lang.Object obj29 = tokenBuffer21.getOutputTarget();
        tokenBuffer21.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes33 = tokenBuffer21.getCharacterEscapes();
        tokenBuffer21._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser37 = tokenBuffer21.asParser(objectCodec36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        tokenBuffer39.writeNumber((short) -1);
        tokenBuffer39.writeNumberField("", (int) '4');
        int int45 = tokenBuffer39.getFeatureMask();
        tokenBuffer39._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer49 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec48);
        java.math.BigInteger bigInteger50 = null;
        tokenBuffer49.writeNumber(bigInteger50);
        tokenBuffer49.writeBooleanField("hi!", false);
        tokenBuffer49.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext57 = tokenBuffer49.getOutputContext();
        tokenBuffer39._writeContext = jsonWriteContext57;
        java.math.BigInteger bigInteger59 = null;
        tokenBuffer39.writeNumber(bigInteger59);
        boolean boolean61 = tokenBuffer39.canWriteObjectId();
        tokenBuffer39._hasNativeObjectIds = false;
        tokenBuffer39.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer66 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec65);
        tokenBuffer66.writeNumber((short) -1);
        tokenBuffer66.writeNumberField("", (int) '4');
        int int72 = tokenBuffer66.getFeatureMask();
        tokenBuffer66._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer76 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec75);
        java.math.BigInteger bigInteger77 = null;
        tokenBuffer76.writeNumber(bigInteger77);
        tokenBuffer76.writeBooleanField("hi!", false);
        tokenBuffer76.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext84 = tokenBuffer76.getOutputContext();
        tokenBuffer66._writeContext = jsonWriteContext84;
        tokenBuffer39._writeContext = jsonWriteContext84;
        tokenBuffer21._writeContext = jsonWriteContext84;
        tokenBuffer1._writeContext = jsonWriteContext84;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(characterEscapes33);
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 79 + "'", int45 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 79 + "'", int72 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext84);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = parser4._segment;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext9 = parser4.getParsingContext();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.peekNextToken();
        boolean boolean11 = parser4.hasTextCharacters();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertNull(segment8);
        org.junit.Assert.assertNotNull(jsonStreamContext9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = parser4._segment;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = parser4._location;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        parser4._codec = objectCodec9;
        boolean boolean11 = parser4.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = parser4.getTokenLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNull(segment7);
        org.junit.Assert.assertNull(jsonLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeArrayFieldStart("");
        java.lang.Object obj6 = tokenBuffer1._typeId;
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = tokenBuffer1.firstToken();
        tokenBuffer1.close();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(formatSchema7);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer1._first;
        java.lang.Object obj16 = segment14.findObjectId((int) 'a');
        java.lang.Object obj18 = segment14.findTypeId((int) (short) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment14, objectCodec19, false, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = parser22.getSchema();
        java.lang.String str25 = parser22.getValueAsString("hi!");
        boolean boolean26 = parser22.isClosed();
        boolean boolean27 = parser22._hasNativeObjectIds;
        java.io.Writer writer28 = null;
        int int29 = parser22.releaseBuffered(writer28);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeStartArray((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        java.math.BigInteger bigInteger17 = null;
        tokenBuffer16.writeNumber(bigInteger17);
        tokenBuffer16.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode22 = null;
        tokenBuffer16.writeTree(treeNode22);
        tokenBuffer1._appendRaw((int) '4', (java.lang.Object) tokenBuffer16);
        tokenBuffer16.writeString("");
        java.math.BigInteger bigInteger27 = null;
        tokenBuffer16.writeNumber(bigInteger27);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer16.writeBinary(base64Variant17, byteArray23, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinaryField("", byteArray23);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        com.fasterxml.jackson.core.Base64Variant base64Variant30 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer29.writeBinary(base64Variant30, byteArray36, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString40 = null;
        tokenBuffer29.writeString(serializableString40);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = tokenBuffer29._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        java.math.BigInteger bigInteger46 = null;
        tokenBuffer45.writeNumber(bigInteger46);
        tokenBuffer45.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = tokenBuffer45.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        java.math.BigInteger bigInteger56 = null;
        tokenBuffer55.writeNumber(bigInteger56);
        tokenBuffer55.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = tokenBuffer55.setHighestNonEscapedChar((-1));
        tokenBuffer45.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken64 = tokenBuffer45.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment66 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser70 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment66, objectCodec67, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = parser70.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation72 = parser70.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment74 = segment42.append((int) (short) 1, jsonToken64, (java.lang.Object) (short) 1, (java.lang.Object) jsonLocation72, (java.lang.Object) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer76 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec75);
        java.math.BigInteger bigInteger77 = null;
        tokenBuffer76.writeNumber(bigInteger77);
        tokenBuffer76.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator83 = tokenBuffer76.setHighestNonEscapedChar((-1));
        tokenBuffer1._append(jsonToken64, (java.lang.Object) jsonGenerator83);
        com.fasterxml.jackson.core.FormatSchema formatSchema85 = null;
        boolean boolean86 = tokenBuffer1.canUseSchema(formatSchema85);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment87 = tokenBuffer1._last;
        tokenBuffer1.writeOmittedField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment90 = tokenBuffer1._first;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_OBJECT]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment42);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertTrue("'" + jsonToken64 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken64.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertNotNull(jsonLocation72);
        org.junit.Assert.assertNull(segment74);
        org.junit.Assert.assertNotNull(jsonGenerator83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(segment87);
        org.junit.Assert.assertNotNull(segment90);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        boolean boolean7 = parser4._closed;
        java.lang.Object obj8 = parser4.getEmbeddedObject();
        boolean boolean10 = parser4.getValueAsBoolean(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        boolean boolean7 = tokenBuffer1.canWriteBinaryNatively();
        com.fasterxml.jackson.core.TreeNode treeNode8 = null;
        tokenBuffer1.writeTree(treeNode8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        com.fasterxml.jackson.core.TreeNode treeNode21 = null;
        tokenBuffer1.writeTree(treeNode21);
        tokenBuffer1._hasNativeTypeIds = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = tokenBuffer1._objectCodec;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        java.math.BigInteger bigInteger28 = null;
        tokenBuffer27.writeNumber(bigInteger28);
        tokenBuffer27.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer27.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec36);
        java.math.BigInteger bigInteger38 = null;
        tokenBuffer37.writeNumber(bigInteger38);
        tokenBuffer37.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = tokenBuffer37.setHighestNonEscapedChar((-1));
        tokenBuffer27.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer47 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec46);
        java.math.BigInteger bigInteger48 = null;
        tokenBuffer47.writeNumber(bigInteger48);
        tokenBuffer47.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator54 = tokenBuffer47.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec56);
        java.math.BigInteger bigInteger58 = null;
        tokenBuffer57.writeNumber(bigInteger58);
        tokenBuffer57.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator64 = tokenBuffer57.setHighestNonEscapedChar((-1));
        tokenBuffer47.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer27.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer47);
        tokenBuffer27.writeNumber((int) ' ');
        int int69 = tokenBuffer27.getFeatureMask();
        boolean boolean70 = tokenBuffer27.canWriteObjectId();
        boolean boolean71 = tokenBuffer27.isClosed();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer72 = tokenBuffer1.append(tokenBuffer27);
        tokenBuffer27.writeBooleanField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]", true);
        tokenBuffer27._generatorFeatures = (short) 10;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment78 = tokenBuffer27._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec79 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser80 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment78, objectCodec79);
        com.fasterxml.jackson.core.JsonToken jsonToken81 = parser80.getLastClearedToken();
        boolean boolean82 = parser80._hasNativeObjectIds;
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(objectCodec25);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertNotNull(jsonGenerator44);
        org.junit.Assert.assertNotNull(jsonGenerator54);
        org.junit.Assert.assertNotNull(jsonGenerator64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 79 + "'", int69 == 79);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(tokenBuffer72);
        org.junit.Assert.assertNotNull(segment78);
        org.junit.Assert.assertNull(jsonToken81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter4 = tokenBuffer1.getPrettyPrinter();
        boolean boolean5 = tokenBuffer1.canWriteObjectId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = tokenBuffer1.asParser(objectCodec6);
        tokenBuffer1.flush();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        java.io.InputStream inputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tokenBuffer1.writeBinary(base64Variant10, inputStream11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(prettyPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(formatSchema9);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        boolean boolean12 = parser11.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = parser11.skipChildren();
        boolean boolean14 = parser11.canReadObjectId();
        parser11.overrideCurrentName("hi!");
        tokenBuffer1._typeId = parser11;
        tokenBuffer1._generatorFeatures = 10;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        long long21 = segment20._tokenTypes;
        java.lang.Object obj23 = segment20.findObjectId(1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec27);
        java.math.BigInteger bigInteger29 = null;
        tokenBuffer28.writeNumber(bigInteger29);
        tokenBuffer28.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = tokenBuffer28.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        java.math.BigInteger bigInteger39 = null;
        tokenBuffer38.writeNumber(bigInteger39);
        tokenBuffer38.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = tokenBuffer38.setHighestNonEscapedChar((-1));
        tokenBuffer28.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken47 = tokenBuffer28.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = segment25.append(6, jsonToken47);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment49 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser53 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment49, objectCodec50, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema54 = null;
        boolean boolean55 = parser53.canUseSchema(formatSchema54);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder56 = parser53._byteBuilder;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        parser53._codec = objectCodec57;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment59 = segment20.append(4, jsonToken47, (java.lang.Object) parser53);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser64 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment60, objectCodec61, true, true);
        boolean boolean65 = parser64.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser66 = parser64.skipChildren();
        boolean boolean67 = parser64.canReadObjectId();
        parser64.overrideCurrentName("hi!");
        boolean boolean70 = parser64._hasNativeTypeIds;
        com.fasterxml.jackson.core.JsonToken jsonToken71 = parser64.getLastClearedToken();
        tokenBuffer1._append(jsonToken47, (java.lang.Object) jsonToken71);
        tokenBuffer1.flush();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(byteArrayBuilder56);
        org.junit.Assert.assertNull(segment59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(jsonToken71);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer16.writeBinary(base64Variant17, byteArray23, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinaryField("", byteArray23);
        int int28 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        tokenBuffer1._objectCodec = objectCodec29;
        java.math.BigDecimal bigDecimal31 = null;
        tokenBuffer1.writeNumber(bigDecimal31);
        java.math.BigDecimal bigDecimal33 = null;
        tokenBuffer1.writeNumber(bigDecimal33);
        tokenBuffer1._closed = false;
        int int37 = tokenBuffer1._generatorFeatures;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 79 + "'", int37 == 79);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = tokenBuffer1._objectCodec;
        tokenBuffer1.writeArrayFieldStart("hi!");
        tokenBuffer1.flush();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        java.math.BigInteger bigInteger20 = null;
        tokenBuffer19.writeNumber(bigInteger20);
        tokenBuffer19.writeBooleanField("hi!", false);
        tokenBuffer19.writeNumber((double) '4');
        java.lang.Object obj27 = tokenBuffer19.getOutputTarget();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer19.setFeatureMask((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        tokenBuffer31.writeString("hi!");
        java.lang.Object obj39 = tokenBuffer31._typeId;
        tokenBuffer31.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41);
        java.math.BigInteger bigInteger43 = null;
        tokenBuffer42.writeNumber(bigInteger43);
        tokenBuffer42.writeBooleanField("hi!", false);
        tokenBuffer42.writeString("hi!");
        tokenBuffer42.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = tokenBuffer42._first;
        tokenBuffer31._first = segment52;
        segment52._tokenTypes = (byte) 100;
        tokenBuffer19._first = segment52;
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer19);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser62 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec59, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema63 = null;
        boolean boolean64 = parser62.canUseSchema(formatSchema63);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder65 = parser62._byteBuilder;
        java.io.OutputStream outputStream66 = null;
        int int67 = parser62.releaseBuffered(outputStream66);
        double double68 = parser62.getValueAsDouble();
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        parser62._codec = objectCodec69;
        int int71 = parser62.getValueAsInt();
        int int72 = parser62.getFeatureMask();
        parser62._segmentPtr = (byte) 1;
        com.fasterxml.jackson.core.JsonParser jsonParser75 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser62);
        boolean boolean76 = tokenBuffer1._hasNativeId;
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNull(objectCodec14);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(segment52);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(byteArrayBuilder65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = parser4.skipChildren();
        boolean boolean7 = parser4.canReadObjectId();
        parser4.overrideCurrentName("hi!");
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = parser4.getLastClearedToken();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser4.peekNextToken();
        boolean boolean13 = parser4.hasTextCharacters();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        tokenBuffer1.writeString("");
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        tokenBuffer1.writeBinaryField("", byteArray16);
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        java.math.BigInteger bigInteger21 = null;
        tokenBuffer20.writeNumber(bigInteger21);
        com.fasterxml.jackson.core.Version version23 = tokenBuffer20.version();
        tokenBuffer20._hasNativeObjectIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec27);
        com.fasterxml.jackson.core.Base64Variant base64Variant29 = null;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer28.writeBinary(base64Variant29, byteArray35, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString39 = null;
        tokenBuffer28.writeString(serializableString39);
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        com.fasterxml.jackson.core.Base64Variant base64Variant44 = null;
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer43.writeBinary(base64Variant44, byteArray50, (int) (short) 1, (int) (short) 0);
        tokenBuffer28.writeBinaryField("", byteArray50);
        tokenBuffer20.writeBinaryField("", byteArray50);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRawUTF8String(byteArray50, 13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNull(formatSchema18);
        org.junit.Assert.assertNotNull(version23);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        java.lang.Object obj8 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeStartArray((int) (short) -1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser15 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment11, objectCodec12, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = parser15.skipChildren();
        java.io.Writer writer17 = null;
        int int18 = parser15.releaseBuffered(writer17);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder19 = parser15._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext20 = null;
        parser15._parsingContext = jsonReadContext20;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = parser15._codec;
        boolean boolean23 = parser15.canReadObjectId();
        boolean boolean24 = parser15.getValueAsBoolean();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder25 = parser15._byteBuilder;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment26 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser30 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment26, objectCodec27, true, true);
        boolean boolean31 = parser30.isExpectedStartArrayToken();
        boolean boolean32 = parser30._hasNativeIds;
        int int34 = parser30.getValueAsInt((-1));
        boolean boolean35 = parser30.canReadTypeId();
        boolean boolean37 = parser30.getValueAsBoolean(false);
        parser30._segmentPtr = 16;
        com.fasterxml.jackson.core.JsonLocation jsonLocation40 = parser30.getTokenLocation();
        parser15._location = jsonLocation40;
        int int42 = parser15.getTextOffset();
        com.fasterxml.jackson.core.JsonToken jsonToken43 = parser15.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeObjectRef((java.lang.Object) jsonToken43);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonGenerationException; message: No native support for writing Object Ids");
        } catch (com.fasterxml.jackson.core.JsonGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder19);
        org.junit.Assert.assertNull(objectCodec22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(byteArrayBuilder25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jsonLocation40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(jsonToken43);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.Version version4 = tokenBuffer1.version();
        boolean boolean5 = tokenBuffer1._closed;
        tokenBuffer1.writeArrayFieldStart("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = parser13.skipChildren();
        java.io.Writer writer15 = null;
        int int16 = parser13.releaseBuffered(writer15);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder17 = parser13._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext18 = null;
        parser13._parsingContext = jsonReadContext18;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = parser13.nextToken();
        boolean boolean21 = parser13.canReadTypeId();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) parser13);
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT]", (long) 35);
        tokenBuffer1.writeStringField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]", "[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_OBJECT]");
        tokenBuffer1.writeNumber((short) 0);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder17);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        boolean boolean11 = parser4._closed;
        java.lang.String str12 = parser4.getText();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = parser4._codec;
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(objectCodec13);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        boolean boolean7 = parser4.canUseSchema(formatSchema6);
        parser4.overrideCurrentName("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        tokenBuffer11.writeEndArray();
        boolean boolean18 = tokenBuffer11.canWriteObjectId();
        tokenBuffer11.writeNumber((long) 0);
        tokenBuffer11._hasNativeId = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = tokenBuffer11.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        com.fasterxml.jackson.core.Base64Variant base64Variant26 = null;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer25.writeBinary(base64Variant26, byteArray32, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        tokenBuffer25.writeString(serializableString36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = tokenBuffer25._first;
        java.lang.Object obj40 = segment38.findObjectId((int) 'a');
        int int42 = segment38.rawType((int) (short) 0);
        int int44 = segment38.rawType((int) (byte) -1);
        tokenBuffer11._last = segment38;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = tokenBuffer48.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec57);
        java.math.BigInteger bigInteger59 = null;
        tokenBuffer58.writeNumber(bigInteger59);
        tokenBuffer58.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator65 = tokenBuffer58.setHighestNonEscapedChar((-1));
        tokenBuffer48.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken67 = tokenBuffer48.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer69 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec68);
        com.fasterxml.jackson.core.Base64Variant base64Variant70 = null;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer69.writeBinary(base64Variant70, byteArray76, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString80 = null;
        tokenBuffer69.writeString(serializableString80);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment82 = tokenBuffer69._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment83 = segment38.append(79, jsonToken67, (java.lang.Object) segment82);
        parser4._segment = segment82;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext85 = parser4._parsingContext;
        com.fasterxml.jackson.core.JsonParser jsonParser86 = parser4.skipChildren();
        long long87 = parser4.getValueAsLong();
        com.fasterxml.jackson.core.JsonLocation jsonLocation88 = parser4._location;
        java.lang.String str89 = parser4.getText();
        boolean boolean90 = parser4.getValueAsBoolean();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(jsonGenerator65);
        org.junit.Assert.assertTrue("'" + jsonToken67 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken67.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment82);
        org.junit.Assert.assertNotNull(segment83);
        org.junit.Assert.assertNotNull(jsonReadContext85);
        org.junit.Assert.assertNotNull(jsonParser86);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNull(jsonLocation88);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec17, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken21 = parser20.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer23 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec22);
        com.fasterxml.jackson.core.Base64Variant base64Variant24 = null;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer23.writeBinary(base64Variant24, byteArray30, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString34 = null;
        tokenBuffer23.writeString(serializableString34);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = tokenBuffer23._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser40 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment36, objectCodec37, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap41 = null;
        segment36._nativeIds = intMap41;
        parser20._segment = segment36;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap44 = segment36._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        tokenBuffer48.writeNumber((double) '4');
        java.lang.Object obj56 = tokenBuffer48.getOutputTarget();
        tokenBuffer48.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes60 = tokenBuffer48.getCharacterEscapes();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment61 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser65 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment61, objectCodec62, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema66 = null;
        boolean boolean67 = parser65.canUseSchema(formatSchema66);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder68 = parser65._byteBuilder;
        int int69 = parser65._segmentPtr;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext70 = parser65._parsingContext;
        tokenBuffer48._typeId = parser65;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment72 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object[] objArray73 = segment72._tokens;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment74 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser78 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment74, objectCodec75, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = parser78.skipChildren();
        java.io.Writer writer80 = null;
        int int81 = parser78.releaseBuffered(writer80);
        boolean boolean82 = parser78.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema83 = null;
        boolean boolean84 = parser78.canUseSchema(formatSchema83);
        boolean boolean85 = parser78._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment86 = parser78._segment;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment87 = segment36.appendRaw(100, (int) (short) 10, (java.lang.Object) tokenBuffer48, (java.lang.Object) segment72, (java.lang.Object) parser78);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment88 = segment36._next;
        tokenBuffer1._last = segment36;
        int int90 = tokenBuffer1._generatorFeatures;
        tokenBuffer1.writeEndArray();
        boolean boolean92 = tokenBuffer1.canOmitFields();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertNull(jsonToken21);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment36);
        org.junit.Assert.assertNull(intMap44);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(characterEscapes60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(byteArrayBuilder68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext70);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertArrayEquals(objArray73, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(jsonParser79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(segment86);
        org.junit.Assert.assertNotNull(segment87);
        org.junit.Assert.assertNotNull(segment88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 79 + "'", int90 == 79);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        tokenBuffer2.writeBooleanField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL]", false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        java.math.BigInteger bigInteger8 = null;
        tokenBuffer7.writeNumber(bigInteger8);
        tokenBuffer7.writeBooleanField("hi!", false);
        tokenBuffer7.writeString("hi!");
        tokenBuffer7.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = tokenBuffer7._first;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = tokenBuffer7.setHighestNonEscapedChar((int) (short) 1);
        boolean boolean20 = tokenBuffer7.canOmitFields();
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        tokenBuffer7._objectCodec = objectCodec21;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        java.math.BigInteger bigInteger25 = null;
        tokenBuffer24.writeNumber(bigInteger25);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter27 = tokenBuffer24.getPrettyPrinter();
        boolean boolean28 = tokenBuffer24.canWriteObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment29 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser33 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment29, objectCodec30, true, true);
        int int34 = parser33.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = parser33._codec;
        long long37 = parser33.nextLongValue((long) (short) 10);
        boolean boolean38 = parser33.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser39 = tokenBuffer24.asParser((com.fasterxml.jackson.core.JsonParser) parser33);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = tokenBuffer7.asParser(jsonParser39);
        tokenBuffer7._appendAt = (short) 1;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = tokenBuffer7.setHighestNonEscapedChar(1);
        tokenBuffer2.writeObjectId((java.lang.Object) tokenBuffer7);
        org.junit.Assert.assertNotNull(segment17);
        org.junit.Assert.assertNotNull(jsonGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(prettyPrinter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(objectCodec35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(jsonGenerator44);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        tokenBuffer1._hasNativeObjectIds = false;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter10 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeFieldName("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.useDefaultPrettyPrinter();
        tokenBuffer1.writeString("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_STRING]");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = tokenBuffer1.setCharacterEscapes(characterEscapes16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        java.math.BigInteger bigInteger20 = null;
        tokenBuffer19.writeNumber(bigInteger20);
        tokenBuffer19.writeBooleanField("hi!", false);
        boolean boolean25 = tokenBuffer19.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        com.fasterxml.jackson.core.Base64Variant base64Variant28 = null;
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer27.writeBinary(base64Variant28, byteArray34, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString38 = null;
        tokenBuffer27.writeString(serializableString38);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = tokenBuffer27._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        java.math.BigInteger bigInteger44 = null;
        tokenBuffer43.writeNumber(bigInteger44);
        tokenBuffer43.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = tokenBuffer43.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec52 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer53 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec52);
        java.math.BigInteger bigInteger54 = null;
        tokenBuffer53.writeNumber(bigInteger54);
        tokenBuffer53.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator60 = tokenBuffer53.setHighestNonEscapedChar((-1));
        tokenBuffer43.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken62 = tokenBuffer43.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment64 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser68 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment64, objectCodec65, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser69 = parser68.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation70 = parser68.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment72 = segment40.append((int) (short) 1, jsonToken62, (java.lang.Object) (short) 1, (java.lang.Object) jsonLocation70, (java.lang.Object) (byte) 0);
        tokenBuffer19._append(jsonToken62);
        com.fasterxml.jackson.core.JsonParser jsonParser74 = tokenBuffer19.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment75 = tokenBuffer19._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment76 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser80 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment76, objectCodec77, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser81 = parser80.skipChildren();
        java.io.Writer writer82 = null;
        int int83 = parser80.releaseBuffered(writer82);
        boolean boolean84 = parser80.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema85 = null;
        boolean boolean86 = parser80.canUseSchema(formatSchema85);
        com.fasterxml.jackson.core.JsonToken jsonToken87 = parser80.nextValue();
        boolean boolean88 = parser80.canReadObjectId();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder89 = null;
        parser80._byteBuilder = byteArrayBuilder89;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext91 = parser80._parsingContext;
        com.fasterxml.jackson.core.JsonParser jsonParser92 = tokenBuffer19.asParser((com.fasterxml.jackson.core.JsonParser) parser80);
        long long94 = jsonParser92.nextLongValue((long) 0);
        tokenBuffer1._objectId = jsonParser92;
        org.junit.Assert.assertNull(prettyPrinter10);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonGenerator17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment40);
        org.junit.Assert.assertNotNull(jsonGenerator50);
        org.junit.Assert.assertNotNull(jsonGenerator60);
        org.junit.Assert.assertTrue("'" + jsonToken62 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken62.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertNotNull(jsonLocation70);
        org.junit.Assert.assertNull(segment72);
        org.junit.Assert.assertNotNull(jsonParser74);
        org.junit.Assert.assertNotNull(segment75);
        org.junit.Assert.assertNotNull(jsonParser81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(jsonToken87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(jsonReadContext91);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 0L + "'", long94 == 0L);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        int int7 = parser4.nextIntValue(10);
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = parser4.getSchema();
        java.lang.String str9 = parser4.getText();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = parser4._segment;
        boolean boolean11 = parser4.canReadTypeId();
        int int12 = parser4.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            float float13 = parser4.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(formatSchema8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(segment10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder8 = parser4._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        boolean boolean13 = parser4._hasNativeObjectIds;
        int int14 = parser4.getTextLength();
        int int15 = parser4.getTextOffset();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = parser4.getCodec();
        long long18 = parser4.nextLongValue((long) (short) -1);
        boolean boolean19 = parser4.canReadTypeId();
        parser4._segmentPtr = 0;
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(objectCodec16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        boolean boolean11 = parser4._closed;
        java.lang.String str12 = parser4.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = parser4.getCurrentLocation();
        java.io.Writer writer14 = null;
        int int15 = parser4.releaseBuffered(writer14);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = parser4._segment;
        boolean boolean17 = parser4.canReadObjectId();
        double double19 = parser4.getValueAsDouble((double) 11);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(segment16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 11.0d + "'", double19 == 11.0d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = parser4.skipChildren();
        boolean boolean7 = parser4.canReadObjectId();
        parser4.overrideCurrentName("hi!");
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = parser4.getParsingContext();
        parser4._segmentPtr = (short) -1;
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
        org.junit.Assert.assertNull(jsonToken13);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer16.writeBinary(base64Variant17, byteArray23, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinaryField("", byteArray23);
        int int28 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        tokenBuffer1._objectCodec = objectCodec29;
        java.math.BigDecimal bigDecimal31 = null;
        tokenBuffer1.writeNumber(bigDecimal31);
        java.math.BigDecimal bigDecimal33 = null;
        tokenBuffer1.writeNumber(bigDecimal33);
        tokenBuffer1._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        tokenBuffer39.writeNumber((short) -1);
        tokenBuffer39.writeNumberField("", (int) '4');
        int int45 = tokenBuffer39.getFeatureMask();
        tokenBuffer39._mayHaveNativeIds = true;
        int int48 = tokenBuffer39.getFeatureMask();
        java.lang.Object obj49 = tokenBuffer39._typeId;
        byte[] byteArray54 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        tokenBuffer39.writeBinaryField("", byteArray54);
        tokenBuffer1.writeBinaryField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT, FIELD_NAME([TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]), VALUE_NUMBER_FLOAT]", byteArray54);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 79 + "'", int45 == 79);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 79 + "'", int48 == 79);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode7 = null;
        tokenBuffer1.writeTree(treeNode7);
        java.lang.Object obj9 = tokenBuffer1._typeId;
        int int10 = tokenBuffer1.getHighestEscapedChar();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = tokenBuffer1.setFeatureMask((int) '4');
        tokenBuffer1.writeNullField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, END_ARRAY, VALUE_NUMBER_INT]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jsonGenerator12);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        int int7 = parser4._segmentPtr;
        double double9 = parser4.getValueAsDouble(10.0d);
        boolean boolean11 = parser4.getValueAsBoolean(false);
        parser4.overrideCurrentName("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_NULL]");
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = parser4.getCurrentLocation();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation14);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.nextValue();
        parser4.overrideCurrentName("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]");
        boolean boolean17 = parser4.requiresCustomCodec();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(jsonStreamContext13);
        org.junit.Assert.assertNull(jsonToken14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer1._first;
        java.lang.Object obj16 = segment14.findObjectId((int) 'a');
        boolean boolean17 = segment14.hasIds();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = segment14.next();
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        com.fasterxml.jackson.core.Base64Variant base64Variant21 = null;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer20.writeBinary(base64Variant21, byteArray27, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString31 = null;
        tokenBuffer20.writeString(serializableString31);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment33 = tokenBuffer20._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser37 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment33, objectCodec34, false, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser39 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment33, objectCodec38);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = segment33._next;
        segment14._next = segment40;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(segment18);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment33);
        org.junit.Assert.assertNull(segment40);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        int int10 = tokenBuffer1.getFeatureMask();
        boolean boolean11 = tokenBuffer1.canWriteTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        tokenBuffer14.writeNumber((short) -1);
        int int17 = tokenBuffer14.getFeatureMask();
        int int18 = tokenBuffer14.getHighestEscapedChar();
        tokenBuffer14._closed = false;
        boolean boolean21 = tokenBuffer14.canWriteTypeId();
        tokenBuffer14._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        com.fasterxml.jackson.core.Base64Variant base64Variant26 = null;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer25.writeBinary(base64Variant26, byteArray32, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        tokenBuffer25.writeString(serializableString36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer40 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec39);
        com.fasterxml.jackson.core.Base64Variant base64Variant41 = null;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer40.writeBinary(base64Variant41, byteArray47, (int) (short) 1, (int) (short) 0);
        tokenBuffer25.writeBinaryField("", byteArray47);
        tokenBuffer14.writeBinary(byteArray47);
        tokenBuffer1.writeBinaryField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE]", byteArray47);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment54 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser58 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment54, objectCodec55, true, true);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder59 = null;
        parser58._byteBuilder = byteArrayBuilder59;
        java.lang.Boolean boolean61 = parser58.nextBooleanValue();
        java.lang.String str62 = parser58.getCurrentName();
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.copyCurrentEvent((com.fasterxml.jackson.core.JsonParser) parser58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(boolean61);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        boolean boolean3 = tokenBuffer2.canWriteTypeId();
        tokenBuffer2._hasNativeId = true;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer2.setCharacterEscapes(characterEscapes6);
        com.fasterxml.jackson.core.JsonToken jsonToken8 = tokenBuffer2.firstToken();
        tokenBuffer2._hasNativeId = false;
        int int11 = tokenBuffer2.getHighestEscapedChar();
        tokenBuffer2._hasNativeId = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(jsonGenerator7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        java.io.OutputStream outputStream8 = null;
        int int9 = parser4.releaseBuffered(outputStream8);
        parser4._closed = true;
        boolean boolean12 = parser4.isClosed();
        double double13 = parser4.getValueAsDouble();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger14 = parser4.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        int int7 = parser4._segmentPtr;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        parser4._location = jsonLocation8;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext10 = parser4._parsingContext;
        java.io.Writer writer11 = null;
        int int12 = parser4.releaseBuffered(writer11);
        double double14 = parser4.getValueAsDouble(0.0d);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = parser4.nextValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder5 = null;
        parser4._byteBuilder = byteArrayBuilder5;
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext8 = parser4._parsingContext;
        // The following exception was thrown during execution in test generation
        try {
            short short9 = parser4.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertNotNull(jsonReadContext8);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        int int7 = parser4.nextIntValue(10);
        com.fasterxml.jackson.core.FormatSchema formatSchema8 = parser4.getSchema();
        java.lang.String str9 = parser4.getText();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = parser4._segment;
        boolean boolean11 = parser4.canReadTypeId();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = parser4.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(formatSchema8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(segment10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = tokenBuffer1.setFeatureMask((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        java.math.BigInteger bigInteger14 = null;
        tokenBuffer13.writeNumber(bigInteger14);
        tokenBuffer13.writeBooleanField("hi!", false);
        tokenBuffer13.writeString("hi!");
        java.lang.Object obj21 = tokenBuffer13._typeId;
        tokenBuffer13.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        java.math.BigInteger bigInteger25 = null;
        tokenBuffer24.writeNumber(bigInteger25);
        tokenBuffer24.writeBooleanField("hi!", false);
        tokenBuffer24.writeString("hi!");
        tokenBuffer24.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment34 = tokenBuffer24._first;
        tokenBuffer13._first = segment34;
        segment34._tokenTypes = (byte) 100;
        tokenBuffer1._first = segment34;
        java.lang.Object obj40 = segment34.findTypeId((int) (byte) 10);
        java.lang.Object obj42 = segment34.findObjectId((int) (byte) 0);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap43 = segment34._nativeIds;
        java.lang.Object[] objArray44 = segment34._tokens;
        java.lang.Object[] objArray45 = segment34._tokens;
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(jsonGenerator11);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(segment34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(intMap43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null, hi!, null, hi!, , null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null, hi!, null, hi!, , null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[null, hi!, null, hi!, , null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[null, hi!, null, hi!, , null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        tokenBuffer1._objectCodec = objectCodec7;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = tokenBuffer1.setCodec(objectCodec9);
        org.junit.Assert.assertNotNull(jsonGenerator10);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer16.writeBinary(base64Variant17, byteArray23, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinaryField("", byteArray23);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer1.setPrettyPrinter(prettyPrinter28);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes30 = tokenBuffer1.getCharacterEscapes();
        boolean boolean31 = tokenBuffer1.canWriteBinaryNatively();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNull(characterEscapes30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = parser4.getCodec();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = parser4.nextToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser4.getSchema();
        int int11 = parser4.getValueAsInt();
        boolean boolean12 = parser4.isExpectedStartArrayToken();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertNull(objectCodec8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1._mayHaveNativeIds = true;
        tokenBuffer1._appendAt = (byte) -1;
        boolean boolean13 = tokenBuffer1._closed;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = null;
        parser4._byteBuilder = byteArrayBuilder7;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        boolean boolean11 = parser4.getValueAsBoolean();
        // The following exception was thrown during execution in test generation
        try {
            parser4._checkIsNumber();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        java.lang.Object obj9 = tokenBuffer1._typeId;
        tokenBuffer1.writeStartArray();
        tokenBuffer1.writeNumber((short) (byte) 1);
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_OBJECT]", 35L);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec17, true, true);
        int int21 = parser20.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = parser20.nextValue();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder23 = null;
        parser20._byteBuilder = byteArrayBuilder23;
        boolean boolean25 = parser20._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonParser jsonParser26 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser20);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(jsonToken22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jsonParser26);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        int int10 = tokenBuffer1.getFeatureMask();
        java.lang.Object obj11 = tokenBuffer1._typeId;
        tokenBuffer1.writeNullField("");
        tokenBuffer1.writeArrayFieldStart("hi!");
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter16 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext17 = tokenBuffer1.getOutputContext();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(prettyPrinter16);
        org.junit.Assert.assertNotNull(jsonWriteContext17);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer1.asParser(objectCodec16);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter18 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeNumber((float) 100L);
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNull(prettyPrinter18);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        boolean boolean3 = tokenBuffer2.canWriteTypeId();
        java.lang.Object obj4 = tokenBuffer2._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = tokenBuffer2.getCodec();
        com.fasterxml.jackson.core.JsonGenerator.Feature feature6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = tokenBuffer2.disable(feature6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(objectCodec5);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = tokenBuffer1._objectCodec;
        tokenBuffer1.writeArrayFieldStart("hi!");
        tokenBuffer1.flush();
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        java.math.BigInteger bigInteger20 = null;
        tokenBuffer19.writeNumber(bigInteger20);
        tokenBuffer19.writeBooleanField("hi!", false);
        tokenBuffer19.writeNumber((double) '4');
        java.lang.Object obj27 = tokenBuffer19.getOutputTarget();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer19.setFeatureMask((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        tokenBuffer31.writeString("hi!");
        java.lang.Object obj39 = tokenBuffer31._typeId;
        tokenBuffer31.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41);
        java.math.BigInteger bigInteger43 = null;
        tokenBuffer42.writeNumber(bigInteger43);
        tokenBuffer42.writeBooleanField("hi!", false);
        tokenBuffer42.writeString("hi!");
        tokenBuffer42.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment52 = tokenBuffer42._first;
        tokenBuffer31._first = segment52;
        segment52._tokenTypes = (byte) 100;
        tokenBuffer19._first = segment52;
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer19);
        boolean boolean58 = tokenBuffer19.canOmitFields();
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer60 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec59);
        java.math.BigInteger bigInteger61 = null;
        tokenBuffer60.writeNumber(bigInteger61);
        tokenBuffer60.writeBooleanField("hi!", false);
        tokenBuffer60.writeString("hi!");
        tokenBuffer60.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext70 = tokenBuffer60.getOutputContext();
        tokenBuffer19._writeContext = jsonWriteContext70;
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNull(objectCodec14);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(segment52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jsonWriteContext70);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1._mayHaveNativeIds = true;
        tokenBuffer1._appendAt = (byte) -1;
        boolean boolean13 = tokenBuffer1._hasNativeTypeIds;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeNumber((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        boolean boolean7 = tokenBuffer1.canWriteTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        java.math.BigInteger bigInteger10 = null;
        tokenBuffer9.writeNumber(bigInteger10);
        tokenBuffer9.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = tokenBuffer9.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        java.math.BigInteger bigInteger20 = null;
        tokenBuffer19.writeNumber(bigInteger20);
        tokenBuffer19.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = tokenBuffer19.setHighestNonEscapedChar((-1));
        tokenBuffer9.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        java.math.BigInteger bigInteger30 = null;
        tokenBuffer29.writeNumber(bigInteger30);
        tokenBuffer29.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = tokenBuffer29.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        java.math.BigInteger bigInteger40 = null;
        tokenBuffer39.writeNumber(bigInteger40);
        tokenBuffer39.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = tokenBuffer39.setHighestNonEscapedChar((-1));
        tokenBuffer29.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer9.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer29);
        tokenBuffer9.writeNumber((int) ' ');
        int int51 = tokenBuffer9.getFeatureMask();
        boolean boolean52 = tokenBuffer9.canWriteObjectId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer54 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec53);
        com.fasterxml.jackson.core.Base64Variant base64Variant55 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer54.writeBinary(base64Variant55, byteArray61, (int) (short) 1, (int) (short) 0);
        tokenBuffer9.writeBinary(byteArray61);
        tokenBuffer1.writeBinary(byteArray61);
        tokenBuffer1.writeObjectFieldStart("");
        java.lang.Object obj69 = tokenBuffer1.getOutputTarget();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 79 + "'", int51 == 79);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter4 = tokenBuffer1.getPrettyPrinter();
        boolean boolean5 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1.flush();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setCharacterEscapes(characterEscapes7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = tokenBuffer1.asParser(objectCodec9);
        org.junit.Assert.assertNull(prettyPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonParser10);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.Version version4 = tokenBuffer1.version();
        tokenBuffer1._hasNativeObjectIds = true;
        com.fasterxml.jackson.core.FormatSchema formatSchema7 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment8 = tokenBuffer1._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation14 = parser13._location;
        com.fasterxml.jackson.databind.DeserializationContext deserializationContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = tokenBuffer1.deserialize((com.fasterxml.jackson.core.JsonParser) parser13, deserializationContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertNull(formatSchema7);
        org.junit.Assert.assertNotNull(segment8);
        org.junit.Assert.assertNull(jsonLocation14);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer7.writeBinary(base64Variant8, byteArray14, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        tokenBuffer7.writeString(serializableString18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer7._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap25 = null;
        segment20._nativeIds = intMap25;
        parser4._segment = segment20;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap28 = segment20._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec31);
        java.math.BigInteger bigInteger33 = null;
        tokenBuffer32.writeNumber(bigInteger33);
        tokenBuffer32.writeBooleanField("hi!", false);
        tokenBuffer32.writeNumber((double) '4');
        java.lang.Object obj40 = tokenBuffer32.getOutputTarget();
        tokenBuffer32.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = tokenBuffer32.getCharacterEscapes();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = null;
        boolean boolean51 = parser49.canUseSchema(formatSchema50);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder52 = parser49._byteBuilder;
        int int53 = parser49._segmentPtr;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext54 = parser49._parsingContext;
        tokenBuffer32._typeId = parser49;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object[] objArray57 = segment56._tokens;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser62 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec59, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = parser62.skipChildren();
        java.io.Writer writer64 = null;
        int int65 = parser62.releaseBuffered(writer64);
        boolean boolean66 = parser62.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema67 = null;
        boolean boolean68 = parser62.canUseSchema(formatSchema67);
        boolean boolean69 = parser62._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment70 = parser62._segment;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment71 = segment20.appendRaw(100, (int) (short) 10, (java.lang.Object) tokenBuffer32, (java.lang.Object) segment56, (java.lang.Object) parser62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec73 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer74 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec73);
        java.math.BigInteger bigInteger75 = null;
        tokenBuffer74.writeNumber(bigInteger75);
        tokenBuffer74.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator81 = tokenBuffer74.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec83 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer84 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec83);
        java.math.BigInteger bigInteger85 = null;
        tokenBuffer84.writeNumber(bigInteger85);
        tokenBuffer84.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator91 = tokenBuffer84.setHighestNonEscapedChar((-1));
        tokenBuffer74.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken93 = tokenBuffer74.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment94 = segment71.append(16, jsonToken93);
        com.fasterxml.jackson.core.ObjectCodec objectCodec95 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser98 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment94, objectCodec95, true, true);
        long long99 = segment94._tokenTypes;
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment20);
        org.junit.Assert.assertNull(intMap28);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(characterEscapes44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(byteArrayBuilder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertArrayEquals(objArray57, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(segment70);
        org.junit.Assert.assertNotNull(segment71);
        org.junit.Assert.assertNotNull(jsonGenerator81);
        org.junit.Assert.assertNotNull(jsonGenerator91);
        org.junit.Assert.assertTrue("'" + jsonToken93 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken93.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(segment94);
        org.junit.Assert.assertTrue("'" + long99 + "' != '" + 12L + "'", long99 == 12L);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        java.math.BigDecimal bigDecimal9 = null;
        tokenBuffer1.writeNumber(bigDecimal9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        java.math.BigInteger bigInteger13 = null;
        tokenBuffer12.writeNumber(bigInteger13);
        tokenBuffer12.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = tokenBuffer12.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        java.math.BigInteger bigInteger23 = null;
        tokenBuffer22.writeNumber(bigInteger23);
        tokenBuffer22.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer22.setHighestNonEscapedChar((-1));
        tokenBuffer12.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken31 = tokenBuffer12.firstToken();
        tokenBuffer1._append(jsonToken31);
        tokenBuffer1.writeEndArray();
        tokenBuffer1.close();
        tokenBuffer1.writeStartObject();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser40 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment36, objectCodec37, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema41 = null;
        boolean boolean42 = parser40.canUseSchema(formatSchema41);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder43 = parser40._byteBuilder;
        java.io.OutputStream outputStream44 = null;
        int int45 = parser40.releaseBuffered(outputStream44);
        double double46 = parser40.getValueAsDouble();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        parser40._codec = objectCodec47;
        tokenBuffer1.writeObject((java.lang.Object) parser40);
        boolean boolean50 = parser40._hasNativeTypeIds;
        boolean boolean51 = parser40.isClosed();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator19);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertTrue("'" + jsonToken31 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken31.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(byteArrayBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        java.lang.Object obj7 = tokenBuffer1._objectId;
        tokenBuffer1.writeNullField("hi!");
        boolean boolean10 = tokenBuffer1._hasNativeId;
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        parser4._closed = true;
        boolean boolean8 = parser4._hasNativeIds;
        java.lang.Object obj9 = parser4.getEmbeddedObject();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer((com.fasterxml.jackson.core.JsonParser) parser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.peekNextToken();
        double double8 = parser4.getValueAsDouble();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        parser4.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = tokenBuffer1._first;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext44 = tokenBuffer1._writeContext;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        java.math.BigInteger bigInteger47 = null;
        tokenBuffer46.writeNumber(bigInteger47);
        tokenBuffer46.writeBooleanField("hi!", false);
        tokenBuffer46.writeString("hi!");
        java.lang.Object obj54 = tokenBuffer46._typeId;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator56 = tokenBuffer46.setCharacterEscapes(characterEscapes55);
        com.fasterxml.jackson.core.JsonToken jsonToken57 = tokenBuffer46.firstToken();
        tokenBuffer46.writeEndArray();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer59 = tokenBuffer1.append(tokenBuffer46);
        tokenBuffer1.writeStartArray((int) 'a');
        boolean boolean62 = tokenBuffer1.canWriteBinaryNatively();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(segment43);
        org.junit.Assert.assertNotNull(jsonWriteContext44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(jsonGenerator56);
        org.junit.Assert.assertTrue("'" + jsonToken57 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken57.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(tokenBuffer59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        java.lang.Object obj7 = parser4.getInputSource();
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = parser4._location;
        parser4._segmentPtr = 'a';
        long long12 = parser4.nextLongValue((long) (byte) -1);
        boolean boolean13 = parser4.isClosed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(jsonLocation8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = tokenBuffer1._objectCodec;
        tokenBuffer1.writeStartArray(6);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12, true);
        boolean boolean15 = tokenBuffer14.canWriteTypeId();
        tokenBuffer14._hasNativeId = true;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment18, objectCodec19, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken23 = parser22.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        com.fasterxml.jackson.core.Base64Variant base64Variant26 = null;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer25.writeBinary(base64Variant26, byteArray32, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        tokenBuffer25.writeString(serializableString36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = tokenBuffer25._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser42 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment38, objectCodec39, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap43 = null;
        segment38._nativeIds = intMap43;
        parser22._segment = segment38;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap46 = segment38._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser50 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment38, objectCodec47, false, true);
        com.fasterxml.jackson.core.JsonToken jsonToken52 = segment38.type(0);
        tokenBuffer14._append(jsonToken52);
        tokenBuffer1._append(jsonToken52);
        com.fasterxml.jackson.core.TreeNode treeNode55 = null;
        tokenBuffer1.writeTree(treeNode55);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNull(objectCodec9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jsonToken23);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment38);
        org.junit.Assert.assertNull(intMap46);
        org.junit.Assert.assertTrue("'" + jsonToken52 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken52.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        int int7 = parser4._segmentPtr;
        double double9 = parser4.getValueAsDouble(10.0d);
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = parser4.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            parser4._handleEOF();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Internal error: this code path should never get executed");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(jsonLocation10);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeStartArray((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        java.math.BigInteger bigInteger17 = null;
        tokenBuffer16.writeNumber(bigInteger17);
        tokenBuffer16.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode22 = null;
        tokenBuffer16.writeTree(treeNode22);
        tokenBuffer1._appendRaw((int) '4', (java.lang.Object) tokenBuffer16);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter25 = tokenBuffer16.getPrettyPrinter();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = tokenBuffer16.useDefaultPrettyPrinter();
        tokenBuffer16.writeStartObject();
        boolean boolean28 = tokenBuffer16._hasNativeId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        java.math.BigInteger bigInteger31 = null;
        tokenBuffer30.writeNumber(bigInteger31);
        tokenBuffer30.writeBooleanField("hi!", false);
        tokenBuffer30.writeString("hi!");
        tokenBuffer30.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment40 = tokenBuffer30._first;
        segment40._tokenTypes = (short) -1;
        tokenBuffer16._first = segment40;
        java.lang.Object obj45 = segment40.get(1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(prettyPrinter25);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(segment40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1._mayHaveNativeIds = true;
        tokenBuffer1._appendAt = (byte) -1;
        boolean boolean13 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeEndObject();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = parser4.skipChildren();
        int int8 = parser4.getTextLength();
        boolean boolean9 = parser4._hasNativeIds;
        int int10 = parser4._segmentPtr;
        int int11 = parser4._segmentPtr;
        java.lang.Object obj12 = parser4.getInputSource();
        java.lang.Object obj13 = parser4.getInputSource();
        com.fasterxml.jackson.core.Base64Variant base64Variant14 = null;
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = parser4.readBinaryValue(base64Variant14, outputStream15);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        boolean boolean12 = parser11.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = parser11.skipChildren();
        boolean boolean14 = parser11.canReadObjectId();
        parser11.overrideCurrentName("hi!");
        tokenBuffer1._typeId = parser11;
        tokenBuffer1._generatorFeatures = 10;
        tokenBuffer1._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = tokenBuffer1.getCodec();
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        java.math.BigInteger bigInteger25 = null;
        tokenBuffer24.writeNumber(bigInteger25);
        tokenBuffer24.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = tokenBuffer24.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        java.math.BigInteger bigInteger35 = null;
        tokenBuffer34.writeNumber(bigInteger35);
        tokenBuffer34.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = tokenBuffer34.setHighestNonEscapedChar((-1));
        tokenBuffer24.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken43 = tokenBuffer24.firstToken();
        com.fasterxml.jackson.core.TreeNode treeNode44 = null;
        tokenBuffer24.writeTree(treeNode44);
        tokenBuffer24.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = tokenBuffer24._objectCodec;
        tokenBuffer1._typeId = objectCodec47;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(objectCodec22);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertTrue("'" + jsonToken43 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken43.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(objectCodec47);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        int int10 = tokenBuffer1.getFeatureMask();
        java.lang.Object obj11 = tokenBuffer1._typeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = parser17.skipChildren();
        java.io.Writer writer19 = null;
        int int20 = parser17.releaseBuffered(writer19);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder21 = parser17._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext22 = null;
        parser17._parsingContext = jsonReadContext22;
        com.fasterxml.jackson.core.JsonToken jsonToken24 = parser17.nextToken();
        tokenBuffer1._appendRaw(52, (java.lang.Object) parser17);
        tokenBuffer1.writeOmittedField("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        java.math.BigInteger bigInteger30 = null;
        tokenBuffer29.writeNumber(bigInteger30);
        tokenBuffer29.writeBooleanField("hi!", false);
        boolean boolean35 = tokenBuffer29.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec36);
        tokenBuffer37.writeNumber((short) -1);
        tokenBuffer37.writeNumberField("", (int) '4');
        int int43 = tokenBuffer37.getFeatureMask();
        tokenBuffer37._mayHaveNativeIds = true;
        int int46 = tokenBuffer37.getFeatureMask();
        java.lang.Object obj47 = tokenBuffer37._typeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment49 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser53 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment49, objectCodec50, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = parser53.skipChildren();
        java.io.Writer writer55 = null;
        int int56 = parser53.releaseBuffered(writer55);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder57 = parser53._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext58 = null;
        parser53._parsingContext = jsonReadContext58;
        com.fasterxml.jackson.core.JsonToken jsonToken60 = parser53.nextToken();
        tokenBuffer37._appendRaw(52, (java.lang.Object) parser53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer63 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec62);
        java.math.BigInteger bigInteger64 = null;
        tokenBuffer63.writeNumber(bigInteger64);
        tokenBuffer63.writeBooleanField("hi!", false);
        tokenBuffer63.writeString("hi!");
        tokenBuffer63.writeString("");
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        tokenBuffer63.writeBinaryField("", byteArray78);
        tokenBuffer37.writeBinary(byteArray78);
        tokenBuffer29.writeBinary(byteArray78);
        tokenBuffer1.writeBinary(byteArray78);
        tokenBuffer1.close();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder21);
        org.junit.Assert.assertNull(jsonToken24);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 79 + "'", int43 == 79);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 79 + "'", int46 == 79);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder57);
        org.junit.Assert.assertNull(jsonToken60);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        boolean boolean7 = parser4.canUseSchema(formatSchema6);
        parser4.overrideCurrentName("");
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        tokenBuffer11.writeEndArray();
        boolean boolean18 = tokenBuffer11.canWriteObjectId();
        tokenBuffer11.writeNumber((long) 0);
        tokenBuffer11._hasNativeId = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = tokenBuffer11.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        com.fasterxml.jackson.core.Base64Variant base64Variant26 = null;
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer25.writeBinary(base64Variant26, byteArray32, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString36 = null;
        tokenBuffer25.writeString(serializableString36);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment38 = tokenBuffer25._first;
        java.lang.Object obj40 = segment38.findObjectId((int) 'a');
        int int42 = segment38.rawType((int) (short) 0);
        int int44 = segment38.rawType((int) (byte) -1);
        tokenBuffer11._last = segment38;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = tokenBuffer48.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec57);
        java.math.BigInteger bigInteger59 = null;
        tokenBuffer58.writeNumber(bigInteger59);
        tokenBuffer58.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator65 = tokenBuffer58.setHighestNonEscapedChar((-1));
        tokenBuffer48.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken67 = tokenBuffer48.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer69 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec68);
        com.fasterxml.jackson.core.Base64Variant base64Variant70 = null;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer69.writeBinary(base64Variant70, byteArray76, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString80 = null;
        tokenBuffer69.writeString(serializableString80);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment82 = tokenBuffer69._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment83 = segment38.append(79, jsonToken67, (java.lang.Object) segment82);
        parser4._segment = segment82;
        long long86 = parser4.getValueAsLong((long) (byte) 0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment87 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec88 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser91 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment87, objectCodec88, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser92 = parser91.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation93 = parser91.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation94 = parser91.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation95 = parser91.getTokenLocation();
        parser4.setLocation(jsonLocation95);
        com.fasterxml.jackson.core.JsonToken jsonToken97 = parser4.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 6 + "'", int44 == 6);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(jsonGenerator65);
        org.junit.Assert.assertTrue("'" + jsonToken67 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken67.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment82);
        org.junit.Assert.assertNotNull(segment83);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertNotNull(jsonParser92);
        org.junit.Assert.assertNotNull(jsonLocation93);
        org.junit.Assert.assertNotNull(jsonLocation94);
        org.junit.Assert.assertNotNull(jsonLocation95);
        org.junit.Assert.assertNull(jsonToken97);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer1.asParser(objectCodec16);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser23 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment19, objectCodec20, true, true);
        int int24 = parser23.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken25 = parser23.nextValue();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder26 = null;
        parser23._byteBuilder = byteArrayBuilder26;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext28 = null;
        parser23._parsingContext = jsonReadContext28;
        tokenBuffer1._appendRaw((int) (byte) 10, (java.lang.Object) parser23);
        java.math.BigDecimal bigDecimal32 = null;
        tokenBuffer1.writeNumberField("", bigDecimal32);
        tokenBuffer1._hasNativeTypeIds = true;
        tokenBuffer1.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        tokenBuffer38.writeNumber((short) -1);
        tokenBuffer38.writeNumberField("", (int) '4');
        int int44 = tokenBuffer38.getFeatureMask();
        tokenBuffer38._mayHaveNativeIds = true;
        int int47 = tokenBuffer38.getFeatureMask();
        tokenBuffer38.writeEndObject();
        int int49 = tokenBuffer38._generatorFeatures;
        tokenBuffer1._objectId = tokenBuffer38;
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT]", (double) 490332L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        com.fasterxml.jackson.core.Base64Variant base64Variant56 = null;
        byte[] byteArray62 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer55.writeBinary(base64Variant56, byteArray62, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString66 = null;
        tokenBuffer55.writeString(serializableString66);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment68 = tokenBuffer55._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec69 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser72 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment68, objectCodec69, false, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec73 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser74 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment68, objectCodec73);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment75 = segment68._next;
        tokenBuffer1._last = segment68;
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(jsonToken25);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 79 + "'", int44 == 79);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 79 + "'", int47 == 79);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 79 + "'", int49 == 79);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment68);
        org.junit.Assert.assertNull(segment75);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        tokenBuffer1.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = tokenBuffer1._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        tokenBuffer1._objectCodec = objectCodec12;
        boolean boolean14 = tokenBuffer1._hasNativeTypeIds;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = tokenBuffer1.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = tokenBuffer1._objectCodec;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes17 = tokenBuffer1.getCharacterEscapes();
        org.junit.Assert.assertNotNull(segment11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonGenerator15);
        org.junit.Assert.assertNull(objectCodec16);
        org.junit.Assert.assertNull(characterEscapes17);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter4 = tokenBuffer1.getPrettyPrinter();
        boolean boolean5 = tokenBuffer1.canWriteObjectId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = tokenBuffer1.asParser(objectCodec6);
        tokenBuffer1.flush();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = tokenBuffer1.setFeatureMask((int) (short) -1);
        jsonGenerator10.writeNumberField("[TokenBuffer: VALUE_NULL]", (int) (short) 1);
        org.junit.Assert.assertNull(prettyPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(jsonGenerator10);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        boolean boolean7 = tokenBuffer1.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        tokenBuffer9.writeNumber((short) -1);
        tokenBuffer9.writeNumberField("", (int) '4');
        int int15 = tokenBuffer9.getFeatureMask();
        tokenBuffer9._mayHaveNativeIds = true;
        int int18 = tokenBuffer9.getFeatureMask();
        java.lang.Object obj19 = tokenBuffer9._typeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment21 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment21, objectCodec22, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = parser25.skipChildren();
        java.io.Writer writer27 = null;
        int int28 = parser25.releaseBuffered(writer27);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder29 = parser25._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext30 = null;
        parser25._parsingContext = jsonReadContext30;
        com.fasterxml.jackson.core.JsonToken jsonToken32 = parser25.nextToken();
        tokenBuffer9._appendRaw(52, (java.lang.Object) parser25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34);
        java.math.BigInteger bigInteger36 = null;
        tokenBuffer35.writeNumber(bigInteger36);
        tokenBuffer35.writeBooleanField("hi!", false);
        tokenBuffer35.writeString("hi!");
        tokenBuffer35.writeString("");
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        tokenBuffer35.writeBinaryField("", byteArray50);
        tokenBuffer9.writeBinary(byteArray50);
        tokenBuffer1.writeBinary(byteArray50);
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 79 + "'", int18 == 79);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder29);
        org.junit.Assert.assertNull(jsonToken32);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41);
        com.fasterxml.jackson.core.Base64Variant base64Variant43 = null;
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer42.writeBinary(base64Variant43, byteArray49, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString53 = null;
        tokenBuffer42.writeString(serializableString53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec56);
        com.fasterxml.jackson.core.Base64Variant base64Variant58 = null;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer57.writeBinary(base64Variant58, byteArray64, (int) (short) 1, (int) (short) 0);
        tokenBuffer42.writeBinaryField("", byteArray64);
        tokenBuffer21.writeBinary(byteArray64);
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer71 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec70);
        com.fasterxml.jackson.core.Base64Variant base64Variant72 = null;
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer71.writeBinary(base64Variant72, byteArray78, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString82 = null;
        tokenBuffer71.writeString(serializableString82);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer84 = tokenBuffer21.append(tokenBuffer71);
        boolean boolean85 = tokenBuffer21._closed;
        tokenBuffer21.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]", 100L);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment89 = tokenBuffer21._first;
        java.lang.Object obj91 = segment89.findObjectId(5);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(tokenBuffer84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(segment89);
        org.junit.Assert.assertNull(obj91);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        boolean boolean11 = parser4._closed;
        boolean boolean12 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.nextToken();
        double double14 = parser4.getValueAsDouble();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder8 = parser4._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = parser4.setFeatureMask((int) (short) 10);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = null;
        parser4._byteBuilder = byteArrayBuilder15;
        double double18 = parser4.getValueAsDouble((double) 53024807772L);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser23 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment19, objectCodec20, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = parser23.skipChildren();
        java.io.Writer writer25 = null;
        int int26 = parser23.releaseBuffered(writer25);
        boolean boolean27 = parser23.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema28 = null;
        boolean boolean29 = parser23.canUseSchema(formatSchema28);
        boolean boolean30 = parser23._closed;
        java.lang.String str31 = parser23.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = parser23.getCurrentLocation();
        parser4.setLocation(jsonLocation32);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.3024807772E10d + "'", double18 == 5.3024807772E10d);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(jsonLocation32);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeFieldName("hi!");
        tokenBuffer1.writeNumberField("", (double) '4');
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer47 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec46);
        java.math.BigInteger bigInteger48 = null;
        tokenBuffer47.writeNumber(bigInteger48);
        tokenBuffer47.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode53 = null;
        tokenBuffer47.writeTree(treeNode53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer56 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec55);
        tokenBuffer56.writeNumber((short) -1);
        tokenBuffer56.writeNumberField("", (int) '4');
        int int62 = tokenBuffer56.getFeatureMask();
        tokenBuffer56._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec65 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer66 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec65);
        java.math.BigInteger bigInteger67 = null;
        tokenBuffer66.writeNumber(bigInteger67);
        tokenBuffer66.writeBooleanField("hi!", false);
        tokenBuffer66.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext74 = tokenBuffer66.getOutputContext();
        tokenBuffer56._writeContext = jsonWriteContext74;
        tokenBuffer47._typeId = jsonWriteContext74;
        boolean boolean77 = tokenBuffer47.canWriteTypeId();
        java.math.BigInteger bigInteger78 = null;
        tokenBuffer47.writeNumber(bigInteger78);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer80 = tokenBuffer1.append(tokenBuffer47);
        boolean boolean81 = tokenBuffer47.canWriteBinaryNatively();
        tokenBuffer47._hasNativeId = false;
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 79 + "'", int62 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(tokenBuffer80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        int int7 = parser4._segmentPtr;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        parser4._location = jsonLocation8;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = parser4.getParsingContext();
        java.lang.Object obj11 = parser4.getEmbeddedObject();
        int int12 = parser4.getFeatureMask();
        double double14 = parser4.getValueAsDouble((double) 97L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        tokenBuffer1.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext11 = tokenBuffer1.getOutputContext();
        tokenBuffer1.writeNullField("");
        tokenBuffer1.writeNumberField("hi!", (-1));
        int int17 = tokenBuffer1._generatorFeatures;
        boolean boolean18 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeNumberField("", (double) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = parser26.skipChildren();
        java.io.Writer writer28 = null;
        int int29 = parser26.releaseBuffered(writer28);
        boolean boolean30 = parser26.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = null;
        boolean boolean32 = parser26.canUseSchema(formatSchema31);
        boolean boolean33 = parser26._closed;
        java.lang.String str34 = parser26.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = parser26.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser36 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser26);
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = tokenBuffer1.asParser(objectCodec39);
        java.lang.String str41 = tokenBuffer1.toString();
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = tokenBuffer1.getCodec();
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = tokenBuffer1.getCodec();
        org.junit.Assert.assertNotNull(jsonWriteContext11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(jsonLocation35);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_STRING, VALUE_STRING, FIELD_NAME(), VALUE_NULL, FIELD_NAME(hi!), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_FLOAT, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_ARRAY]" + "'", str41, "[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_STRING, VALUE_STRING, FIELD_NAME(), VALUE_NULL, FIELD_NAME(hi!), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_FLOAT, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_ARRAY]");
        org.junit.Assert.assertNull(objectCodec42);
        org.junit.Assert.assertNull(objectCodec43);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        boolean boolean7 = tokenBuffer1._closed;
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]");
        com.fasterxml.jackson.core.TreeNode treeNode10 = null;
        tokenBuffer1.writeTree(treeNode10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        java.math.BigInteger bigInteger14 = null;
        tokenBuffer13.writeNumber(bigInteger14);
        tokenBuffer13.writeBooleanField("hi!", false);
        tokenBuffer13.writeEndArray();
        tokenBuffer13._hasNativeObjectIds = false;
        tokenBuffer13.close();
        boolean boolean23 = tokenBuffer13._closed;
        com.fasterxml.jackson.core.TreeNode treeNode24 = null;
        tokenBuffer13.writeTree(treeNode24);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext26 = tokenBuffer13.getOutputContext();
        tokenBuffer1._typeId = jsonWriteContext26;
        com.fasterxml.jackson.core.SerializableString serializableString28 = null;
        tokenBuffer1.writeString(serializableString28);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jsonWriteContext26);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = parser4.skipChildren();
        boolean boolean7 = parser4.canReadObjectId();
        parser4.overrideCurrentName("hi!");
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = parser4.getParsingContext();
        boolean boolean11 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = parser4.getCurrentToken();
        int int14 = parser4.nextIntValue(52);
        int int15 = parser4.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jsonToken12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        boolean boolean7 = tokenBuffer1.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer9.writeBinary(base64Variant10, byteArray16, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString20 = null;
        tokenBuffer9.writeString(serializableString20);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = tokenBuffer9._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        java.math.BigInteger bigInteger26 = null;
        tokenBuffer25.writeNumber(bigInteger26);
        tokenBuffer25.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer25.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34);
        java.math.BigInteger bigInteger36 = null;
        tokenBuffer35.writeNumber(bigInteger36);
        tokenBuffer35.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = tokenBuffer35.setHighestNonEscapedChar((-1));
        tokenBuffer25.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken44 = tokenBuffer25.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment46 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser50 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment46, objectCodec47, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = parser50.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation52 = parser50.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment54 = segment22.append((int) (short) 1, jsonToken44, (java.lang.Object) (short) 1, (java.lang.Object) jsonLocation52, (java.lang.Object) (byte) 0);
        tokenBuffer1._append(jsonToken44);
        com.fasterxml.jackson.core.JsonParser jsonParser56 = tokenBuffer1.asParser();
        boolean boolean57 = tokenBuffer1._hasNativeId;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment22);
        org.junit.Assert.assertNotNull(jsonGenerator32);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertTrue("'" + jsonToken44 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken44.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(jsonLocation52);
        org.junit.Assert.assertNull(segment54);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        com.fasterxml.jackson.core.JsonToken jsonToken7 = parser4.nextToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        byte[] byteArray16 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer9.writeBinary(base64Variant10, byteArray16, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString20 = null;
        tokenBuffer9.writeString(serializableString20);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = tokenBuffer9._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap27 = null;
        segment22._nativeIds = intMap27;
        segment22._tokenTypes = 1;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment32 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34);
        java.math.BigInteger bigInteger36 = null;
        tokenBuffer35.writeNumber(bigInteger36);
        tokenBuffer35.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = tokenBuffer35.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        java.math.BigInteger bigInteger46 = null;
        tokenBuffer45.writeNumber(bigInteger46);
        tokenBuffer45.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = tokenBuffer45.setHighestNonEscapedChar((-1));
        tokenBuffer35.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken54 = tokenBuffer35.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment55 = segment32.append(6, jsonToken54);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = segment22.append((int) '4', jsonToken54);
        parser4._segment = segment22;
        boolean boolean58 = parser4._closed;
        com.fasterxml.jackson.core.JsonToken jsonToken59 = parser4.nextToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = parser4._segment;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap61 = segment60._nativeIds;
        com.fasterxml.jackson.core.JsonToken jsonToken63 = segment60.type(9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNull(jsonToken7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment22);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertTrue("'" + jsonToken54 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken54.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment55);
        org.junit.Assert.assertNotNull(segment56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + jsonToken59 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken59.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(segment60);
        org.junit.Assert.assertNull(intMap61);
        org.junit.Assert.assertNull(jsonToken63);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer1.asParser(objectCodec16);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser23 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment19, objectCodec20, true, true);
        int int24 = parser23.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken25 = parser23.nextValue();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder26 = null;
        parser23._byteBuilder = byteArrayBuilder26;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext28 = null;
        parser23._parsingContext = jsonReadContext28;
        tokenBuffer1._appendRaw((int) (byte) 10, (java.lang.Object) parser23);
        java.math.BigDecimal bigDecimal32 = null;
        tokenBuffer1.writeNumberField("", bigDecimal32);
        boolean boolean34 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1.writeNumber((double) 11);
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL]", 8805212L);
        tokenBuffer1._hasNativeTypeIds = true;
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(jsonToken25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode7 = null;
        tokenBuffer1.writeTree(treeNode7);
        java.lang.Object obj9 = tokenBuffer1._typeId;
        int int10 = tokenBuffer1.getHighestEscapedChar();
        com.fasterxml.jackson.core.SerializableString serializableString11 = null;
        tokenBuffer1.writeString(serializableString11);
        tokenBuffer1._hasNativeTypeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = tokenBuffer1.setCodec(objectCodec15);
        boolean boolean17 = tokenBuffer1.canOmitFields();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode7 = null;
        tokenBuffer1.writeTree(treeNode7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        tokenBuffer10.writeNumber((short) -1);
        tokenBuffer10.writeNumberField("", (int) '4');
        int int16 = tokenBuffer10.getFeatureMask();
        tokenBuffer10._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        java.math.BigInteger bigInteger21 = null;
        tokenBuffer20.writeNumber(bigInteger21);
        tokenBuffer20.writeBooleanField("hi!", false);
        tokenBuffer20.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext28 = tokenBuffer20.getOutputContext();
        tokenBuffer10._writeContext = jsonWriteContext28;
        tokenBuffer1._typeId = jsonWriteContext28;
        boolean boolean31 = tokenBuffer1.canWriteTypeId();
        tokenBuffer1.writeNumber("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = tokenBuffer1._objectCodec;
        tokenBuffer1._generatorFeatures = ' ';
        tokenBuffer1.flush();
        java.math.BigDecimal bigDecimal18 = null;
        tokenBuffer1.writeNumber(bigDecimal18);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = null;
        boolean boolean21 = tokenBuffer1.canUseSchema(formatSchema20);
        tokenBuffer1.writeObject((java.lang.Object) 1L);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = tokenBuffer1.setFeatureMask(3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNull(objectCodec14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonGenerator25);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        boolean boolean11 = parser4._closed;
        java.lang.String str12 = parser4.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = parser4.getCurrentLocation();
        boolean boolean14 = parser4.canReadObjectId();
        boolean boolean15 = parser4.canReadObjectId();
        java.io.OutputStream outputStream16 = null;
        int int17 = parser4.releaseBuffered(outputStream16);
        parser4.clearCurrentToken();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = parser4.setFeatureMask((int) (byte) 1);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(jsonParser20);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = null;
        boolean boolean7 = parser4.canUseSchema(formatSchema6);
        boolean boolean8 = parser4.getValueAsBoolean();
        boolean boolean9 = parser4._hasNativeTypeIds;
        double double10 = parser4.getValueAsDouble();
        java.lang.String str11 = parser4.getCurrentName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1.writeNumber((long) 0);
        java.lang.Object obj11 = tokenBuffer1._typeId;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext12 = tokenBuffer1._writeContext;
        tokenBuffer1.writeNumber(16);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(jsonWriteContext12);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1.writeNumber((long) 0);
        tokenBuffer1._hasNativeId = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        com.fasterxml.jackson.core.Base64Variant base64Variant16 = null;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer15.writeBinary(base64Variant16, byteArray22, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString26 = null;
        tokenBuffer15.writeString(serializableString26);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = tokenBuffer15._first;
        java.lang.Object obj30 = segment28.findObjectId((int) 'a');
        int int32 = segment28.rawType((int) (short) 0);
        int int34 = segment28.rawType((int) (byte) -1);
        tokenBuffer1._last = segment28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec36);
        com.fasterxml.jackson.core.Base64Variant base64Variant38 = null;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer37.writeBinary(base64Variant38, byteArray44, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString48 = null;
        tokenBuffer37.writeString(serializableString48);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment50 = tokenBuffer37._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec51 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser54 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment50, objectCodec51, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap55 = null;
        segment50._nativeIds = intMap55;
        segment50._tokenTypes = 1;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer63 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec62);
        java.math.BigInteger bigInteger64 = null;
        tokenBuffer63.writeNumber(bigInteger64);
        tokenBuffer63.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator70 = tokenBuffer63.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec72 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer73 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec72);
        java.math.BigInteger bigInteger74 = null;
        tokenBuffer73.writeNumber(bigInteger74);
        tokenBuffer73.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator80 = tokenBuffer73.setHighestNonEscapedChar((-1));
        tokenBuffer63.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken82 = tokenBuffer63.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment83 = segment60.append(6, jsonToken82);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment84 = segment50.append((int) '4', jsonToken82);
        segment28._next = segment50;
        java.lang.Object obj87 = segment28.findTypeId(5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(formatSchema13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment50);
        org.junit.Assert.assertNotNull(jsonGenerator70);
        org.junit.Assert.assertNotNull(jsonGenerator80);
        org.junit.Assert.assertTrue("'" + jsonToken82 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken82.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment83);
        org.junit.Assert.assertNotNull(segment84);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        java.lang.Object obj9 = tokenBuffer1._typeId;
        tokenBuffer1.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        java.math.BigInteger bigInteger13 = null;
        tokenBuffer12.writeNumber(bigInteger13);
        tokenBuffer12.writeBooleanField("hi!", false);
        tokenBuffer12.writeString("hi!");
        tokenBuffer12.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = tokenBuffer12._first;
        tokenBuffer1._first = segment22;
        tokenBuffer1.writeNullField("");
        java.math.BigInteger bigInteger26 = null;
        tokenBuffer1.writeNumber(bigInteger26);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter28 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser34 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment30, objectCodec31, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = parser34.skipChildren();
        java.io.Writer writer36 = null;
        int int37 = parser34.releaseBuffered(writer36);
        boolean boolean38 = parser34.isExpectedStartArrayToken();
        java.lang.String str39 = parser34.getCurrentName();
        boolean boolean40 = parser34._hasNativeTypeIds;
        com.fasterxml.jackson.core.Version version41 = parser34.version();
        parser34.clearCurrentToken();
        tokenBuffer1.writeObjectField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_OBJECT]", (java.lang.Object) parser34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        com.fasterxml.jackson.core.Base64Variant base64Variant46 = null;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer45.writeBinary(base64Variant46, byteArray52, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString56 = null;
        tokenBuffer45.writeString(serializableString56);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = tokenBuffer45._first;
        java.lang.Object obj60 = segment58.findObjectId((int) 'a');
        java.lang.Object obj62 = segment58.findTypeId((int) (short) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser66 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec63, false, true);
        long long67 = segment58._tokenTypes;
        long long68 = segment58._tokenTypes;
        tokenBuffer1._first = segment58;
        int int70 = tokenBuffer1.getFeatureMask();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(segment22);
        org.junit.Assert.assertNull(prettyPrinter28);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 198L + "'", long67 == 198L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 198L + "'", long68 == 198L);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 79 + "'", int70 == 79);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        java.io.OutputStream outputStream8 = null;
        int int9 = parser4.releaseBuffered(outputStream8);
        double double10 = parser4.getValueAsDouble();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        parser4._codec = objectCodec11;
        int int13 = parser4.getValueAsInt();
        int int14 = parser4.getFeatureMask();
        parser4._segmentPtr = (byte) 1;
        int int18 = parser4.getValueAsInt(100);
        boolean boolean19 = parser4._hasNativeTypeIds;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        java.io.OutputStream outputStream8 = null;
        int int9 = parser4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.peekNextToken();
        int int11 = parser4._segmentPtr;
        boolean boolean12 = parser4.canReadObjectId();
        com.fasterxml.jackson.core.Version version13 = parser4.version();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(version13);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, false);
        com.fasterxml.jackson.core.FormatSchema formatSchema3 = null;
        boolean boolean4 = tokenBuffer2.canUseSchema(formatSchema3);
        tokenBuffer2._hasNativeObjectIds = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec7);
        java.math.BigInteger bigInteger9 = null;
        tokenBuffer8.writeNumber(bigInteger9);
        com.fasterxml.jackson.core.Version version11 = tokenBuffer8.version();
        boolean boolean12 = tokenBuffer8.canWriteTypeId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        tokenBuffer8._objectCodec = objectCodec13;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = tokenBuffer8.asParser(objectCodec15);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer2.asParser(jsonParser16);
        long long18 = jsonParser17.getValueAsLong();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        boolean boolean8 = parser4.isClosed();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = parser4.peekNextToken();
        int int10 = parser4.getTextLength();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment2 = null;
        tokenBuffer1._last = segment2;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer1.setFeatureMask((int) 'a');
        boolean boolean6 = tokenBuffer1.canOmitFields();
        java.lang.Object obj7 = tokenBuffer1._typeId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = tokenBuffer1._objectCodec;
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objectCodec8);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder8 = parser4._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = parser4.nextToken();
        boolean boolean12 = parser4.canReadTypeId();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext13 = parser4.getParsingContext();
        boolean boolean14 = parser4.isClosed();
        boolean boolean15 = parser4.canReadObjectId();
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = parser4.isEnabled(feature16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder8);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jsonStreamContext13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        boolean boolean12 = parser11.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = parser11.skipChildren();
        boolean boolean14 = parser11.canReadObjectId();
        parser11.overrideCurrentName("hi!");
        tokenBuffer1._typeId = parser11;
        tokenBuffer1._generatorFeatures = 10;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        long long21 = segment20._tokenTypes;
        java.lang.Object obj23 = segment20.findObjectId(1);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec27);
        java.math.BigInteger bigInteger29 = null;
        tokenBuffer28.writeNumber(bigInteger29);
        tokenBuffer28.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = tokenBuffer28.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        java.math.BigInteger bigInteger39 = null;
        tokenBuffer38.writeNumber(bigInteger39);
        tokenBuffer38.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = tokenBuffer38.setHighestNonEscapedChar((-1));
        tokenBuffer28.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken47 = tokenBuffer28.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment48 = segment25.append(6, jsonToken47);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment49 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec50 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser53 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment49, objectCodec50, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema54 = null;
        boolean boolean55 = parser53.canUseSchema(formatSchema54);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder56 = parser53._byteBuilder;
        com.fasterxml.jackson.core.ObjectCodec objectCodec57 = null;
        parser53._codec = objectCodec57;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment59 = segment20.append(4, jsonToken47, (java.lang.Object) parser53);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment60 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec61 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser64 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment60, objectCodec61, true, true);
        boolean boolean65 = parser64.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser66 = parser64.skipChildren();
        boolean boolean67 = parser64.canReadObjectId();
        parser64.overrideCurrentName("hi!");
        boolean boolean70 = parser64._hasNativeTypeIds;
        com.fasterxml.jackson.core.JsonToken jsonToken71 = parser64.getLastClearedToken();
        tokenBuffer1._append(jsonToken47, (java.lang.Object) jsonToken71);
        tokenBuffer1.writeStartArray((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser jsonParser75 = tokenBuffer1.asParser();
        java.lang.Object obj76 = tokenBuffer1._objectId;
        com.fasterxml.jackson.core.SerializableString serializableString77 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeFieldName(serializableString77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(byteArrayBuilder56);
        org.junit.Assert.assertNull(segment59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(jsonToken71);
        org.junit.Assert.assertNotNull(jsonParser75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec17, true, true);
        boolean boolean21 = parser20.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = parser20.skipChildren();
        boolean boolean23 = parser20.canReadObjectId();
        parser20.overrideCurrentName("hi!");
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext26 = parser20.getParsingContext();
        boolean boolean27 = parser20._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = parser20.skipChildren();
        int int29 = parser20.getCurrentTokenId();
        parser20.clearCurrentToken();
        tokenBuffer1.writeObjectId((java.lang.Object) parser20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        java.math.BigInteger bigInteger35 = null;
        tokenBuffer34.writeNumber(bigInteger35);
        tokenBuffer34.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator41 = tokenBuffer34.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec43 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer44 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec43);
        java.math.BigInteger bigInteger45 = null;
        tokenBuffer44.writeNumber(bigInteger45);
        tokenBuffer44.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = tokenBuffer44.setHighestNonEscapedChar((-1));
        tokenBuffer34.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.SerializableString serializableString53 = null;
        tokenBuffer34.writeString(serializableString53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec56);
        com.fasterxml.jackson.core.Base64Variant base64Variant58 = null;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer57.writeBinary(base64Variant58, byteArray64, (int) (short) 1, (int) (short) 0);
        tokenBuffer34.writeBinaryField("", byteArray64);
        tokenBuffer1.writeBinaryField("[TokenBuffer: ]", byteArray64);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jsonStreamContext26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(jsonGenerator41);
        org.junit.Assert.assertNotNull(jsonGenerator51);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        java.lang.String str9 = parser4.getCurrentName();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        parser4._codec = objectCodec10;
        long long13 = parser4.getValueAsLong((long) 100);
        boolean boolean14 = parser4.hasTextCharacters();
        int int15 = parser4._segmentPtr;
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        java.lang.Object obj7 = tokenBuffer1._objectId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        java.math.BigInteger bigInteger10 = null;
        tokenBuffer9.writeNumber(bigInteger10);
        tokenBuffer9.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = tokenBuffer9.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        java.math.BigInteger bigInteger20 = null;
        tokenBuffer19.writeNumber(bigInteger20);
        tokenBuffer19.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator26 = tokenBuffer19.setHighestNonEscapedChar((-1));
        tokenBuffer9.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        java.math.BigInteger bigInteger30 = null;
        tokenBuffer29.writeNumber(bigInteger30);
        tokenBuffer29.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator36 = tokenBuffer29.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        java.math.BigInteger bigInteger40 = null;
        tokenBuffer39.writeNumber(bigInteger40);
        tokenBuffer39.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator46 = tokenBuffer39.setHighestNonEscapedChar((-1));
        tokenBuffer29.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer9.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer29);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer50 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec49);
        com.fasterxml.jackson.core.Base64Variant base64Variant51 = null;
        byte[] byteArray57 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer50.writeBinary(base64Variant51, byteArray57, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString61 = null;
        tokenBuffer50.writeString(serializableString61);
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer65 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec64);
        com.fasterxml.jackson.core.Base64Variant base64Variant66 = null;
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer65.writeBinary(base64Variant66, byteArray72, (int) (short) 1, (int) (short) 0);
        tokenBuffer50.writeBinaryField("", byteArray72);
        tokenBuffer29.writeBinary(byteArray72);
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer29);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment79 = tokenBuffer29._first;
        com.fasterxml.jackson.core.JsonGenerator.Feature feature80 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator82 = tokenBuffer29.configure(feature80, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(jsonGenerator16);
        org.junit.Assert.assertNotNull(jsonGenerator26);
        org.junit.Assert.assertNotNull(jsonGenerator36);
        org.junit.Assert.assertNotNull(jsonGenerator46);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment79);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeStartArray((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        java.math.BigInteger bigInteger17 = null;
        tokenBuffer16.writeNumber(bigInteger17);
        tokenBuffer16.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode22 = null;
        tokenBuffer16.writeTree(treeNode22);
        tokenBuffer1._appendRaw((int) '4', (java.lang.Object) tokenBuffer16);
        tokenBuffer16.writeNumber((int) (byte) 1);
        com.fasterxml.jackson.core.SerializableString serializableString27 = null;
        tokenBuffer16.writeString(serializableString27);
        tokenBuffer16.writeStartObject();
        tokenBuffer16._generatorFeatures = '4';
        tokenBuffer16.writeObjectFieldStart("[TokenBuffer: VALUE_EMBEDDED_OBJECT]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer7.writeBinary(base64Variant8, byteArray14, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        tokenBuffer7.writeString(serializableString18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer7._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap25 = null;
        segment20._nativeIds = intMap25;
        parser4._segment = segment20;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap28 = segment20._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec31);
        java.math.BigInteger bigInteger33 = null;
        tokenBuffer32.writeNumber(bigInteger33);
        tokenBuffer32.writeBooleanField("hi!", false);
        tokenBuffer32.writeNumber((double) '4');
        java.lang.Object obj40 = tokenBuffer32.getOutputTarget();
        tokenBuffer32.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = tokenBuffer32.getCharacterEscapes();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = null;
        boolean boolean51 = parser49.canUseSchema(formatSchema50);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder52 = parser49._byteBuilder;
        int int53 = parser49._segmentPtr;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext54 = parser49._parsingContext;
        tokenBuffer32._typeId = parser49;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object[] objArray57 = segment56._tokens;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser62 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec59, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = parser62.skipChildren();
        java.io.Writer writer64 = null;
        int int65 = parser62.releaseBuffered(writer64);
        boolean boolean66 = parser62.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema67 = null;
        boolean boolean68 = parser62.canUseSchema(formatSchema67);
        boolean boolean69 = parser62._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment70 = parser62._segment;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment71 = segment20.appendRaw(100, (int) (short) 10, (java.lang.Object) tokenBuffer32, (java.lang.Object) segment56, (java.lang.Object) parser62);
        boolean boolean72 = parser62.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext73 = parser62.getParsingContext();
        boolean boolean74 = parser62._hasNativeObjectIds;
        int int75 = parser62.getTextOffset();
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment20);
        org.junit.Assert.assertNull(intMap28);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(characterEscapes44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(byteArrayBuilder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertArrayEquals(objArray57, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(segment70);
        org.junit.Assert.assertNotNull(segment71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jsonStreamContext73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer7.writeBinary(base64Variant8, byteArray14, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        tokenBuffer7.writeString(serializableString18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer7._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap25 = null;
        segment20._nativeIds = intMap25;
        parser4._segment = segment20;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec40);
        java.math.BigInteger bigInteger42 = null;
        tokenBuffer41.writeNumber(bigInteger42);
        tokenBuffer41.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = tokenBuffer41.setHighestNonEscapedChar((-1));
        tokenBuffer31.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken50 = tokenBuffer31.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = segment28.append(6, jsonToken50);
        segment20._next = segment28;
        long long53 = segment20._tokenTypes;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap54 = segment20._nativeIds;
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment20);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertTrue("'" + jsonToken50 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken50.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment51);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 198L + "'", long53 == 198L);
        org.junit.Assert.assertNull(intMap54);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder8 = parser4._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        boolean boolean13 = parser4._hasNativeObjectIds;
        int int14 = parser4.getTextLength();
        boolean boolean15 = parser4.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken17 = parser4.getLastClearedToken();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonLocation16);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = parser4.getTokenLocation();
        parser4._segmentPtr = (short) -1;
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertNotNull(jsonLocation8);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeStartArray((int) (byte) 1);
        tokenBuffer1.writeString("");
        boolean boolean16 = tokenBuffer1._hasNativeTypeIds;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        tokenBuffer1.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext11 = tokenBuffer1.getOutputContext();
        tokenBuffer1.writeNullField("");
        tokenBuffer1.writeNumberField("hi!", (-1));
        int int17 = tokenBuffer1._generatorFeatures;
        boolean boolean18 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeNumberField("", (double) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = parser26.skipChildren();
        java.io.Writer writer28 = null;
        int int29 = parser26.releaseBuffered(writer28);
        boolean boolean30 = parser26.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = null;
        boolean boolean32 = parser26.canUseSchema(formatSchema31);
        boolean boolean33 = parser26._closed;
        java.lang.String str34 = parser26.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = parser26.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser36 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser26);
        tokenBuffer1.writeString("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]");
        tokenBuffer1.writeString("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT]");
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw('#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriteContext11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(jsonLocation35);
        org.junit.Assert.assertNotNull(jsonParser36);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeStartArray((int) (byte) 1);
        tokenBuffer1.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer17 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec16);
        java.math.BigInteger bigInteger18 = null;
        tokenBuffer17.writeNumber(bigInteger18);
        tokenBuffer17.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = tokenBuffer17.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer27 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec26);
        java.math.BigInteger bigInteger28 = null;
        tokenBuffer27.writeNumber(bigInteger28);
        tokenBuffer27.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = tokenBuffer27.setHighestNonEscapedChar((-1));
        tokenBuffer17.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken36 = tokenBuffer17.firstToken();
        java.lang.Object obj37 = tokenBuffer17.getOutputTarget();
        java.lang.Object obj38 = tokenBuffer17._objectId;
        tokenBuffer1.writeObjectField("[TokenBuffer: ]", obj38);
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = tokenBuffer1.asParser(objectCodec40);
        tokenBuffer1.writeNull();
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_EMBEDDED_OBJECT, START_ARRAY, END_ARRAY, START_ARRAY]", (double) 11);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(jsonGenerator24);
        org.junit.Assert.assertNotNull(jsonGenerator34);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(jsonParser41);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        int int7 = parser4.nextIntValue(10);
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = parser4._location;
        int int9 = parser4.getValueAsInt();
        long long11 = parser4.nextLongValue((long) 52);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(jsonLocation8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        tokenBuffer1.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext11 = tokenBuffer1.getOutputContext();
        tokenBuffer1.writeNullField("");
        tokenBuffer1.writeNumberField("hi!", (-1));
        int int17 = tokenBuffer1._generatorFeatures;
        boolean boolean18 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeNumberField("", (double) '#');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = parser26.skipChildren();
        java.io.Writer writer28 = null;
        int int29 = parser26.releaseBuffered(writer28);
        boolean boolean30 = parser26.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema31 = null;
        boolean boolean32 = parser26.canUseSchema(formatSchema31);
        boolean boolean33 = parser26._closed;
        java.lang.String str34 = parser26.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = parser26.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParser jsonParser36 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser26);
        tokenBuffer1.writeArrayFieldStart("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]");
        tokenBuffer1.flush();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec40);
        tokenBuffer41.writeNumber((short) -1);
        tokenBuffer41.writeNumberField("", (int) '4');
        int int47 = tokenBuffer41.getFeatureMask();
        tokenBuffer41._mayHaveNativeIds = true;
        int int50 = tokenBuffer41.getFeatureMask();
        tokenBuffer41.writeEndObject();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser57 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment53, objectCodec54, true, true);
        int int58 = parser57.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken59 = parser57.nextValue();
        int int60 = parser57._segmentPtr;
        tokenBuffer41._appendRaw(1, (java.lang.Object) int60);
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator63 = tokenBuffer41.setCodec(objectCodec62);
        java.math.BigDecimal bigDecimal64 = null;
        tokenBuffer41.writeNumber(bigDecimal64);
        tokenBuffer41.writeObjectFieldStart("[TokenBuffer: VALUE_NULL]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer69 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec68);
        tokenBuffer69.writeNumber((short) -1);
        int int72 = tokenBuffer69.getFeatureMask();
        tokenBuffer69.writeEndObject();
        tokenBuffer69.writeArrayFieldStart("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec76 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer77 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec76);
        java.math.BigInteger bigInteger78 = null;
        tokenBuffer77.writeNumber(bigInteger78);
        tokenBuffer77.writeBooleanField("hi!", false);
        tokenBuffer77.writeString("hi!");
        tokenBuffer77.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment87 = tokenBuffer77._first;
        boolean boolean88 = segment87.hasIds();
        tokenBuffer69._first = segment87;
        long long90 = segment87._tokenTypes;
        tokenBuffer41._first = segment87;
        boolean boolean92 = tokenBuffer41.canWriteObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer93 = tokenBuffer1.append(tokenBuffer41);
        tokenBuffer93.writeStringField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE]", "[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_STRING, VALUE_STRING, FIELD_NAME(), VALUE_NULL, FIELD_NAME(hi!), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_FLOAT, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_ARRAY]");
        org.junit.Assert.assertNotNull(jsonWriteContext11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 79 + "'", int17 == 79);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(jsonLocation35);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 79 + "'", int47 == 79);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 79 + "'", int50 == 79);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(jsonToken59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator63);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 79 + "'", int72 == 79);
        org.junit.Assert.assertNotNull(segment87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 490332L + "'", long90 == 490332L);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(tokenBuffer93);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        int int43 = tokenBuffer1.getFeatureMask();
        boolean boolean44 = tokenBuffer1.canWriteObjectId();
        java.lang.Object obj45 = tokenBuffer1._objectId;
        java.lang.Object obj46 = tokenBuffer1._objectId;
        com.fasterxml.jackson.core.FormatSchema formatSchema47 = null;
        boolean boolean48 = tokenBuffer1.canUseSchema(formatSchema47);
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = tokenBuffer1._objectCodec;
        tokenBuffer1._hasNativeObjectIds = false;
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 79 + "'", int43 == 79);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(objectCodec49);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer7.writeBinary(base64Variant8, byteArray14, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        tokenBuffer7.writeString(serializableString18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer7._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap25 = null;
        segment20._nativeIds = intMap25;
        parser4._segment = segment20;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap28 = segment20._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer32 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec31);
        java.math.BigInteger bigInteger33 = null;
        tokenBuffer32.writeNumber(bigInteger33);
        tokenBuffer32.writeBooleanField("hi!", false);
        tokenBuffer32.writeNumber((double) '4');
        java.lang.Object obj40 = tokenBuffer32.getOutputTarget();
        tokenBuffer32.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes44 = tokenBuffer32.getCharacterEscapes();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment45 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser49 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment45, objectCodec46, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema50 = null;
        boolean boolean51 = parser49.canUseSchema(formatSchema50);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder52 = parser49._byteBuilder;
        int int53 = parser49._segmentPtr;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext54 = parser49._parsingContext;
        tokenBuffer32._typeId = parser49;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment56 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        java.lang.Object[] objArray57 = segment56._tokens;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec59 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser62 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec59, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser63 = parser62.skipChildren();
        java.io.Writer writer64 = null;
        int int65 = parser62.releaseBuffered(writer64);
        boolean boolean66 = parser62.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema67 = null;
        boolean boolean68 = parser62.canUseSchema(formatSchema67);
        boolean boolean69 = parser62._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment70 = parser62._segment;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment71 = segment20.appendRaw(100, (int) (short) 10, (java.lang.Object) tokenBuffer32, (java.lang.Object) segment56, (java.lang.Object) parser62);
        com.fasterxml.jackson.core.ObjectCodec objectCodec72 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser73 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec72);
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = parser73._codec;
        java.lang.Object obj75 = parser73.getEmbeddedObject();
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment20);
        org.junit.Assert.assertNull(intMap28);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(characterEscapes44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(byteArrayBuilder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(jsonReadContext54);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertArrayEquals(objArray57, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(segment70);
        org.junit.Assert.assertNotNull(segment71);
        org.junit.Assert.assertNull(objectCodec74);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = tokenBuffer1.getCodec();
        int int11 = tokenBuffer1.getHighestEscapedChar();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        com.fasterxml.jackson.core.Base64Variant base64Variant14 = null;
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer13.writeBinary(base64Variant14, byteArray20, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString24 = null;
        tokenBuffer13.writeString(serializableString24);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer28 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec27);
        com.fasterxml.jackson.core.Base64Variant base64Variant29 = null;
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer28.writeBinary(base64Variant29, byteArray35, (int) (short) 1, (int) (short) 0);
        tokenBuffer13.writeBinaryField("", byteArray35);
        tokenBuffer1.writeBinary(byteArray35);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment41 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser45 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment41, objectCodec42, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken46 = parser45.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        com.fasterxml.jackson.core.Base64Variant base64Variant49 = null;
        byte[] byteArray55 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer48.writeBinary(base64Variant49, byteArray55, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString59 = null;
        tokenBuffer48.writeString(serializableString59);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment61 = tokenBuffer48._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser65 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment61, objectCodec62, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap66 = null;
        segment61._nativeIds = intMap66;
        parser45._segment = segment61;
        java.lang.Object[] objArray69 = segment61._tokens;
        java.lang.Object[] objArray70 = segment61._tokens;
        tokenBuffer1._first = segment61;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertNull(objectCodec10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(jsonToken46);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment61);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[[], null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = parser4.getCurrentToken();
        int int6 = parser4.getCurrentTokenId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        parser4._codec = objectCodec7;
        int int10 = parser4.getValueAsInt((int) '#');
        com.fasterxml.jackson.core.JsonToken jsonToken11 = parser4.nextToken();
        java.lang.Boolean boolean12 = parser4.nextBooleanValue();
        boolean boolean13 = parser4.canReadTypeId();
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        java.math.BigDecimal bigDecimal9 = null;
        tokenBuffer1.writeNumber(bigDecimal9);
        tokenBuffer1._hasNativeId = true;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext13 = tokenBuffer1._writeContext;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        com.fasterxml.jackson.core.Base64Variant base64Variant16 = null;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer15.writeBinary(base64Variant16, byteArray22, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString26 = null;
        tokenBuffer15.writeString(serializableString26);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        com.fasterxml.jackson.core.Base64Variant base64Variant31 = null;
        byte[] byteArray37 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer30.writeBinary(base64Variant31, byteArray37, (int) (short) 1, (int) (short) 0);
        tokenBuffer15.writeBinaryField("", byteArray37);
        java.lang.Object obj42 = tokenBuffer15._typeId;
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer15);
        tokenBuffer1.close();
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        tokenBuffer1._objectCodec = objectCodec45;
        boolean boolean47 = tokenBuffer1._hasNativeObjectIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer49 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec48);
        java.math.BigInteger bigInteger50 = null;
        tokenBuffer49.writeNumber(bigInteger50);
        tokenBuffer49.writeBooleanField("hi!", false);
        tokenBuffer49.writeString("hi!");
        tokenBuffer49.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext59 = tokenBuffer49.getOutputContext();
        tokenBuffer49.writeNullField("");
        java.math.BigDecimal bigDecimal63 = null;
        tokenBuffer49.writeNumberField("", bigDecimal63);
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer49);
        tokenBuffer49.writeNumber("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL]");
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonWriteContext13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext59);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment2 = null;
        tokenBuffer1._last = segment2;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer1.setFeatureMask((int) 'a');
        boolean boolean6 = tokenBuffer1.canOmitFields();
        java.lang.Object obj7 = tokenBuffer1._typeId;
        boolean boolean8 = tokenBuffer1.canOmitFields();
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeNumber("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        boolean boolean3 = tokenBuffer2.canWriteTypeId();
        com.fasterxml.jackson.core.Version version4 = tokenBuffer2.version();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(version4);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        int int10 = tokenBuffer1.getFeatureMask();
        java.lang.Object obj11 = tokenBuffer1._typeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = parser17.skipChildren();
        java.io.Writer writer19 = null;
        int int20 = parser17.releaseBuffered(writer19);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder21 = parser17._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext22 = null;
        parser17._parsingContext = jsonReadContext22;
        com.fasterxml.jackson.core.JsonToken jsonToken24 = parser17.nextToken();
        tokenBuffer1._appendRaw(52, (java.lang.Object) parser17);
        tokenBuffer1.writeOmittedField("hi!");
        tokenBuffer1.writeStartArray();
        tokenBuffer1.writeEndObject();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser31 = tokenBuffer1.asParser(objectCodec30);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder21);
        org.junit.Assert.assertNull(jsonToken24);
        org.junit.Assert.assertNotNull(jsonParser31);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        java.io.OutputStream outputStream8 = null;
        int int9 = parser4.releaseBuffered(outputStream8);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = parser4.peekNextToken();
        int int11 = parser4._segmentPtr;
        boolean boolean12 = parser4.canReadObjectId();
        boolean boolean13 = parser4.canReadObjectId();
        parser4.overrideCurrentName("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), START_OBJECT, END_ARRAY, VALUE_NULL, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_NULL]), VALUE_NUMBER_INT]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment2 = null;
        tokenBuffer1._last = segment2;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer1.setFeatureMask((int) 'a');
        boolean boolean6 = tokenBuffer1.canOmitFields();
        java.lang.Object obj7 = tokenBuffer1.getOutputTarget();
        java.lang.Object obj8 = tokenBuffer1.getOutputTarget();
        com.fasterxml.jackson.core.SerializableString serializableString9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeString(serializableString9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        boolean boolean6 = parser4._hasNativeObjectIds;
        boolean boolean7 = parser4.isExpectedStartArrayToken();
        double double9 = parser4.getValueAsDouble((double) 97L);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer13 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec12);
        java.math.BigInteger bigInteger14 = null;
        tokenBuffer13.writeNumber(bigInteger14);
        tokenBuffer13.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = tokenBuffer13.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer23 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec22);
        java.math.BigInteger bigInteger24 = null;
        tokenBuffer23.writeNumber(bigInteger24);
        tokenBuffer23.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = tokenBuffer23.setHighestNonEscapedChar((-1));
        tokenBuffer13.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken32 = tokenBuffer13.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment33 = segment10.append(6, jsonToken32);
        parser4._segment = segment10;
        com.fasterxml.jackson.core.FormatSchema formatSchema35 = parser4.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment36 = parser4._segment;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser38 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment36, objectCodec37);
        com.fasterxml.jackson.core.JsonToken jsonToken39 = parser38.getLastClearedToken();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertTrue("'" + jsonToken32 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken32.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment33);
        org.junit.Assert.assertNull(formatSchema35);
        org.junit.Assert.assertNotNull(segment36);
        org.junit.Assert.assertNull(jsonToken39);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeString("");
        tokenBuffer1._closed = true;
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_STRING, VALUE_STRING, FIELD_NAME(), VALUE_NULL, FIELD_NAME(hi!), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_FLOAT, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_ARRAY]", (double) 100.0f);
        com.fasterxml.jackson.core.Base64Variant base64Variant48 = null;
        java.io.InputStream inputStream49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = tokenBuffer1.writeBinary(base64Variant48, inputStream49, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = tokenBuffer1._first;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext44 = tokenBuffer1._writeContext;
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        java.math.BigInteger bigInteger47 = null;
        tokenBuffer46.writeNumber(bigInteger47);
        tokenBuffer46.writeBooleanField("hi!", false);
        tokenBuffer46.writeString("hi!");
        java.lang.Object obj54 = tokenBuffer46._typeId;
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes55 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator56 = tokenBuffer46.setCharacterEscapes(characterEscapes55);
        com.fasterxml.jackson.core.JsonToken jsonToken57 = tokenBuffer46.firstToken();
        tokenBuffer46.writeEndArray();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer59 = tokenBuffer1.append(tokenBuffer46);
        com.fasterxml.jackson.core.ObjectCodec objectCodec60 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser61 = tokenBuffer46.asParser(objectCodec60);
        tokenBuffer46.writeEndObject();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(segment43);
        org.junit.Assert.assertNotNull(jsonWriteContext44);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(jsonGenerator56);
        org.junit.Assert.assertTrue("'" + jsonToken57 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken57.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(tokenBuffer59);
        org.junit.Assert.assertNotNull(jsonParser61);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = parser4.skipChildren();
        boolean boolean7 = parser4.canReadObjectId();
        parser4.overrideCurrentName("hi!");
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = parser4.getParsingContext();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment11 = parser4._segment;
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = null;
        parser4._codec = objectCodec12;
        char[] charArray14 = parser4.getTextCharacters();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jsonStreamContext10);
        org.junit.Assert.assertNull(segment11);
        org.junit.Assert.assertNull(charArray14);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeStartArray((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        java.math.BigInteger bigInteger17 = null;
        tokenBuffer16.writeNumber(bigInteger17);
        tokenBuffer16.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode22 = null;
        tokenBuffer16.writeTree(treeNode22);
        tokenBuffer1._appendRaw((int) '4', (java.lang.Object) tokenBuffer16);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment25 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec26 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser29 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment25, objectCodec26, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = parser29.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation31 = parser29.getTokenLocation();
        com.fasterxml.jackson.core.Version version32 = parser29.version();
        tokenBuffer1.writeObjectId((java.lang.Object) version32);
        tokenBuffer1.writeNumber((long) (byte) -1);
        int int36 = tokenBuffer1._generatorFeatures;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonLocation31);
        org.junit.Assert.assertNotNull(version32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79 + "'", int36 == 79);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder5 = null;
        parser4._byteBuilder = byteArrayBuilder5;
        java.lang.String str7 = parser4.getCurrentName();
        boolean boolean8 = parser4.hasTextCharacters();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        java.lang.String str9 = parser4.getCurrentName();
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.Version version11 = parser4.version();
        parser4.clearCurrentToken();
        boolean boolean13 = parser4._closed;
        com.fasterxml.jackson.core.JsonToken jsonToken14 = parser4.nextValue();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser16 = parser4.disable(feature15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        tokenBuffer1.writeBoolean(true);
        com.fasterxml.jackson.core.SerializableString serializableString9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = tokenBuffer1.setRootValueSeparator(serializableString9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        java.math.BigDecimal bigDecimal9 = null;
        tokenBuffer1.writeNumber(bigDecimal9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        java.math.BigInteger bigInteger13 = null;
        tokenBuffer12.writeNumber(bigInteger13);
        tokenBuffer12.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator19 = tokenBuffer12.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer22 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec21);
        java.math.BigInteger bigInteger23 = null;
        tokenBuffer22.writeNumber(bigInteger23);
        tokenBuffer22.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = tokenBuffer22.setHighestNonEscapedChar((-1));
        tokenBuffer12.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken31 = tokenBuffer12.firstToken();
        tokenBuffer1._append(jsonToken31);
        tokenBuffer1.writeNumber((short) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec35 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer36 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec35);
        java.math.BigInteger bigInteger37 = null;
        tokenBuffer36.writeNumber(bigInteger37);
        tokenBuffer36.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = tokenBuffer36.setHighestNonEscapedChar((-1));
        tokenBuffer36.writeNumberField("hi!", (long) '4');
        tokenBuffer1._objectId = tokenBuffer36;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext48 = tokenBuffer36._writeContext;
        com.fasterxml.jackson.core.ObjectCodec objectCodec49 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator50 = tokenBuffer36.setCodec(objectCodec49);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext51 = tokenBuffer36._writeContext;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter52 = tokenBuffer36.getPrettyPrinter();
        tokenBuffer36.writeNumberField("", (float) 97);
        boolean boolean56 = tokenBuffer36.canWriteBinaryNatively();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator19);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertTrue("'" + jsonToken31 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken31.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(jsonGenerator43);
        org.junit.Assert.assertNotNull(jsonWriteContext48);
        org.junit.Assert.assertNotNull(jsonGenerator50);
        org.junit.Assert.assertNotNull(jsonWriteContext51);
        org.junit.Assert.assertNull(prettyPrinter52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        int int4 = tokenBuffer1.getFeatureMask();
        int int5 = tokenBuffer1.getHighestEscapedChar();
        tokenBuffer1._closed = false;
        boolean boolean8 = tokenBuffer1.canWriteTypeId();
        tokenBuffer1._closed = false;
        tokenBuffer1.writeBoolean(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        java.math.BigInteger bigInteger15 = null;
        tokenBuffer14.writeNumber(bigInteger15);
        tokenBuffer14.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = tokenBuffer14.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec23);
        java.math.BigInteger bigInteger25 = null;
        tokenBuffer24.writeNumber(bigInteger25);
        tokenBuffer24.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = tokenBuffer24.setHighestNonEscapedChar((-1));
        tokenBuffer14.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.SerializableString serializableString33 = null;
        tokenBuffer14.writeString(serializableString33);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer37 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec36);
        com.fasterxml.jackson.core.Base64Variant base64Variant38 = null;
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer37.writeBinary(base64Variant38, byteArray44, (int) (short) 1, (int) (short) 0);
        tokenBuffer14.writeBinaryField("", byteArray44);
        tokenBuffer14.writeNumber(52);
        tokenBuffer14.writeFieldName("");
        java.math.BigDecimal bigDecimal53 = null;
        tokenBuffer14.writeNumber(bigDecimal53);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = tokenBuffer1.append(tokenBuffer14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonGenerator21);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(tokenBuffer55);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, false);
        com.fasterxml.jackson.core.JsonToken jsonToken5 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer7 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6);
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer7.writeBinary(base64Variant8, byteArray14, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString18 = null;
        tokenBuffer7.writeString(serializableString18);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment20 = tokenBuffer7._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser24 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment20, objectCodec21, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap25 = null;
        segment20._nativeIds = intMap25;
        parser4._segment = segment20;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec40);
        java.math.BigInteger bigInteger42 = null;
        tokenBuffer41.writeNumber(bigInteger42);
        tokenBuffer41.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = tokenBuffer41.setHighestNonEscapedChar((-1));
        tokenBuffer31.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken50 = tokenBuffer31.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = segment28.append(6, jsonToken50);
        segment20._next = segment28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser54 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment28, objectCodec53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = parser54.getCodec();
        double double57 = parser54.getValueAsDouble((double) 7);
        java.lang.String str58 = parser54.nextTextValue();
        org.junit.Assert.assertNull(jsonToken5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment20);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertTrue("'" + jsonToken50 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken50.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment51);
        org.junit.Assert.assertNull(objectCodec55);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 7.0d + "'", double57 == 7.0d);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = parser4.getCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = parser4.getTokenLocation();
        int int12 = parser4.nextIntValue(1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = parser4.getCurrentLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = parser4._codec;
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objectCodec9);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertNull(objectCodec14);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext9 = tokenBuffer1.getOutputContext();
        com.fasterxml.jackson.core.Version version10 = tokenBuffer1.version();
        java.lang.Object obj11 = tokenBuffer1._typeId;
        com.fasterxml.jackson.core.Version version12 = tokenBuffer1.version();
        com.fasterxml.jackson.core.Version version13 = tokenBuffer1.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        java.math.BigInteger bigInteger17 = null;
        tokenBuffer16.writeNumber(bigInteger17);
        tokenBuffer16.writeBooleanField("hi!", false);
        tokenBuffer16.writeString("hi!");
        tokenBuffer16.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext26 = tokenBuffer16.getOutputContext();
        tokenBuffer16.writeNullField("");
        tokenBuffer16.writeNumberField("hi!", (-1));
        int int32 = tokenBuffer16._generatorFeatures;
        boolean boolean33 = tokenBuffer16._hasNativeTypeIds;
        tokenBuffer1.writeObjectField("[TokenBuffer: ]", (java.lang.Object) tokenBuffer16);
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRawValue("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriteContext9);
        org.junit.Assert.assertNotNull(version10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertNotNull(jsonWriteContext26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 79 + "'", int32 == 79);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._appendRaw(10, (java.lang.Object) 100);
        java.lang.Object obj5 = tokenBuffer1._objectId;
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        java.lang.Object obj21 = tokenBuffer1.getOutputTarget();
        boolean boolean22 = tokenBuffer1._hasNativeTypeIds;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw("[TokenBuffer: VALUE_EMBEDDED_OBJECT, START_ARRAY, VALUE_STRING, VALUE_NUMBER_FLOAT]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        int int10 = tokenBuffer1.getFeatureMask();
        java.lang.Object obj11 = tokenBuffer1._typeId;
        tokenBuffer1.writeNullField("hi!");
        java.lang.Object obj14 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeBoolean(true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = tokenBuffer1._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = segment17._next;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = segment17.type(6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(segment17);
        org.junit.Assert.assertNull(segment18);
        org.junit.Assert.assertNull(jsonToken20);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        com.fasterxml.jackson.core.TreeNode treeNode21 = null;
        tokenBuffer1.writeTree(treeNode21);
        tokenBuffer1.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = tokenBuffer1._objectCodec;
        java.math.BigInteger bigInteger25 = null;
        tokenBuffer1.writeNumber(bigInteger25);
        boolean boolean27 = tokenBuffer1.canWriteTypeId();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes28 = tokenBuffer1.getCharacterEscapes();
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        java.math.BigInteger bigInteger31 = null;
        tokenBuffer30.writeNumber(bigInteger31);
        tokenBuffer30.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode36 = null;
        tokenBuffer30.writeTree(treeNode36);
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer39 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec38);
        tokenBuffer39.writeNumber((short) -1);
        tokenBuffer39.writeNumberField("", (int) '4');
        int int45 = tokenBuffer39.getFeatureMask();
        tokenBuffer39._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer49 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec48);
        java.math.BigInteger bigInteger50 = null;
        tokenBuffer49.writeNumber(bigInteger50);
        tokenBuffer49.writeBooleanField("hi!", false);
        tokenBuffer49.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext57 = tokenBuffer49.getOutputContext();
        tokenBuffer39._writeContext = jsonWriteContext57;
        tokenBuffer30._typeId = jsonWriteContext57;
        tokenBuffer30._mayHaveNativeIds = true;
        tokenBuffer30.writeEndArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec64 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer65 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec64);
        tokenBuffer65.writeNumber((short) -1);
        tokenBuffer65.writeNumberField("", (int) '4');
        int int71 = tokenBuffer65.getFeatureMask();
        tokenBuffer65._mayHaveNativeIds = true;
        int int74 = tokenBuffer65.getFeatureMask();
        java.lang.Object obj75 = tokenBuffer65._typeId;
        byte[] byteArray80 = new byte[] { (byte) 100, (byte) 0, (byte) 1 };
        tokenBuffer65.writeBinaryField("", byteArray80);
        tokenBuffer30.writeBinaryField("[TokenBuffer: VALUE_NULL]", byteArray80);
        tokenBuffer1.writeBinary(byteArray80);
        tokenBuffer1.close();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(objectCodec24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(characterEscapes28);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 79 + "'", int45 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext57);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 79 + "'", int71 == 79);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 79 + "'", int74 == 79);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        boolean boolean8 = parser4._closed;
        boolean boolean9 = parser4.hasTextCharacters();
        parser4.overrideCurrentName("");
        parser4._closed = true;
        boolean boolean14 = parser4.isExpectedStartArrayToken();
        // The following exception was thrown during execution in test generation
        try {
            parser4._checkIsNumber();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        int int4 = tokenBuffer1.getFeatureMask();
        tokenBuffer1.writeEndObject();
        tokenBuffer1.writeNumber((double) 79);
        tokenBuffer1.writeStartArray();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = parser4.nextValue();
        boolean boolean12 = parser4.canReadObjectId();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder13 = null;
        parser4._byteBuilder = byteArrayBuilder13;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext15 = parser4._parsingContext;
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = parser4.canUseSchema(formatSchema16);
        boolean boolean18 = parser4.canReadTypeId();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jsonReadContext15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer1._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser18 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment14, objectCodec15, false, false);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap19 = null;
        segment14._nativeIds = intMap19;
        segment14._tokenTypes = 1;
        boolean boolean23 = segment14.hasIds();
        com.fasterxml.jackson.core.ObjectCodec objectCodec25 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer26 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec25);
        java.math.BigInteger bigInteger27 = null;
        tokenBuffer26.writeNumber(bigInteger27);
        tokenBuffer26.writeBooleanField("hi!", false);
        tokenBuffer26.writeEndArray();
        boolean boolean33 = tokenBuffer26.canWriteObjectId();
        tokenBuffer26.writeNumber((long) 0);
        tokenBuffer26._hasNativeId = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema38 = tokenBuffer26.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer40 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec39);
        com.fasterxml.jackson.core.Base64Variant base64Variant41 = null;
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer40.writeBinary(base64Variant41, byteArray47, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString51 = null;
        tokenBuffer40.writeString(serializableString51);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment53 = tokenBuffer40._first;
        java.lang.Object obj55 = segment53.findObjectId((int) 'a');
        int int57 = segment53.rawType((int) (short) 0);
        int int59 = segment53.rawType((int) (byte) -1);
        tokenBuffer26._last = segment53;
        com.fasterxml.jackson.core.JsonToken jsonToken61 = tokenBuffer26.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec62 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer63 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec62);
        com.fasterxml.jackson.core.Base64Variant base64Variant64 = null;
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer63.writeBinary(base64Variant64, byteArray70, (int) (short) 1, (int) (short) 0);
        tokenBuffer63._appendAt = (short) 100;
        tokenBuffer63.writeNull();
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator78 = tokenBuffer63.setCodec(objectCodec77);
        tokenBuffer63.writeEndObject();
        boolean boolean80 = tokenBuffer63.isClosed();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment81 = segment14.append((int) (short) 1, jsonToken61, (java.lang.Object) boolean80);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(formatSchema38);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 6 + "'", int59 == 6);
        org.junit.Assert.assertTrue("'" + jsonToken61 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken61.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(jsonGenerator78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(segment81);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.Version version4 = tokenBuffer1.version();
        boolean boolean5 = tokenBuffer1._closed;
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec6, true);
        boolean boolean9 = tokenBuffer8.canWriteTypeId();
        java.lang.Object obj10 = tokenBuffer8._objectId;
        tokenBuffer1.writeTypeId(obj10);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.setCharacterEscapes(characterEscapes12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = tokenBuffer1.asParser();
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonParser14);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        int int4 = tokenBuffer1.getFeatureMask();
        tokenBuffer1.writeEndObject();
        tokenBuffer1.writeArrayFieldStart("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer9 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec8);
        java.math.BigInteger bigInteger10 = null;
        tokenBuffer9.writeNumber(bigInteger10);
        tokenBuffer9.writeBooleanField("hi!", false);
        tokenBuffer9.writeString("hi!");
        tokenBuffer9.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = tokenBuffer9._first;
        boolean boolean20 = segment19.hasIds();
        tokenBuffer1._first = segment19;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = tokenBuffer1.useDefaultPrettyPrinter();
        boolean boolean23 = tokenBuffer1._hasNativeObjectIds;
        int int24 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.core.TreeNode treeNode25 = null;
        tokenBuffer1.writeTree(treeNode25);
        com.fasterxml.jackson.core.ObjectCodec objectCodec27 = null;
        tokenBuffer1._objectCodec = objectCodec27;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment29 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser33 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment29, objectCodec30, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = parser33.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation35 = parser33.getTokenLocation();
        double double36 = parser33.getValueAsDouble();
        int int37 = parser33.getValueAsInt();
        int int38 = parser33._segmentPtr;
        boolean boolean39 = parser33.isExpectedStartArrayToken();
        tokenBuffer1.writeObjectId((java.lang.Object) boolean39);
        boolean boolean41 = tokenBuffer1.canOmitFields();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(segment19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonLocation35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        java.lang.Object obj9 = tokenBuffer1._typeId;
        tokenBuffer1.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer12 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec11);
        java.math.BigInteger bigInteger13 = null;
        tokenBuffer12.writeNumber(bigInteger13);
        tokenBuffer12.writeBooleanField("hi!", false);
        tokenBuffer12.writeString("hi!");
        tokenBuffer12.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = tokenBuffer12._first;
        tokenBuffer1._first = segment22;
        tokenBuffer1.writeNullField("");
        java.math.BigInteger bigInteger26 = null;
        tokenBuffer1.writeNumber(bigInteger26);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter28 = tokenBuffer1.getPrettyPrinter();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment30 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser34 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment30, objectCodec31, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = parser34.skipChildren();
        java.io.Writer writer36 = null;
        int int37 = parser34.releaseBuffered(writer36);
        boolean boolean38 = parser34.isExpectedStartArrayToken();
        java.lang.String str39 = parser34.getCurrentName();
        boolean boolean40 = parser34._hasNativeTypeIds;
        com.fasterxml.jackson.core.Version version41 = parser34.version();
        parser34.clearCurrentToken();
        tokenBuffer1.writeObjectField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT]), START_OBJECT]", (java.lang.Object) parser34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        com.fasterxml.jackson.core.Base64Variant base64Variant46 = null;
        byte[] byteArray52 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer45.writeBinary(base64Variant46, byteArray52, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString56 = null;
        tokenBuffer45.writeString(serializableString56);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = tokenBuffer45._first;
        java.lang.Object obj60 = segment58.findObjectId((int) 'a');
        java.lang.Object obj62 = segment58.findTypeId((int) (short) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec63 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser66 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment58, objectCodec63, false, true);
        long long67 = segment58._tokenTypes;
        long long68 = segment58._tokenTypes;
        tokenBuffer1._first = segment58;
        tokenBuffer1.flush();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator72 = tokenBuffer1.setHighestNonEscapedChar((int) (byte) -1);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(segment22);
        org.junit.Assert.assertNull(prettyPrinter28);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(version41);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 198L + "'", long67 == 198L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 198L + "'", long68 == 198L);
        org.junit.Assert.assertNotNull(jsonGenerator72);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder9 = null;
        parser4._byteBuilder = byteArrayBuilder9;
        double double12 = parser4.getValueAsDouble((double) 32L);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertNotNull(jsonLocation8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer16.writeBinary(base64Variant17, byteArray23, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinaryField("", byteArray23);
        int int28 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        tokenBuffer31.writeString("hi!");
        tokenBuffer31.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext41 = tokenBuffer31.getOutputContext();
        tokenBuffer1.writeObjectField("", (java.lang.Object) tokenBuffer31);
        boolean boolean43 = tokenBuffer31._hasNativeTypeIds;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer31.writeRaw("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(jsonWriteContext41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        int int43 = tokenBuffer1.getFeatureMask();
        boolean boolean44 = tokenBuffer1.canWriteObjectId();
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        com.fasterxml.jackson.core.Base64Variant base64Variant47 = null;
        byte[] byteArray53 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer46.writeBinary(base64Variant47, byteArray53, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinary(byteArray53);
        int int58 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._hasNativeTypeIds = true;
        tokenBuffer1.writeStartArray((int) '#');
        tokenBuffer1.close();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 79 + "'", int43 == 79);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 79 + "'", int58 == 79);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        java.io.Writer writer8 = null;
        int int9 = parser4.releaseBuffered(writer8);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parser4.setSchema(formatSchema10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
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
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34);
        java.math.BigInteger bigInteger36 = null;
        tokenBuffer35.writeNumber(bigInteger36);
        tokenBuffer35.writeBooleanField("hi!", false);
        boolean boolean41 = tokenBuffer35.canWriteBinaryNatively();
        com.fasterxml.jackson.core.ObjectCodec objectCodec42 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer43 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec42);
        tokenBuffer43.writeNumber((short) -1);
        tokenBuffer43.writeNumberField("", (int) '4');
        int int49 = tokenBuffer43.getFeatureMask();
        tokenBuffer43._mayHaveNativeIds = true;
        int int52 = tokenBuffer43.getFeatureMask();
        java.lang.Object obj53 = tokenBuffer43._typeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment55 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser59 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment55, objectCodec56, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = parser59.skipChildren();
        java.io.Writer writer61 = null;
        int int62 = parser59.releaseBuffered(writer61);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder63 = parser59._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext64 = null;
        parser59._parsingContext = jsonReadContext64;
        com.fasterxml.jackson.core.JsonToken jsonToken66 = parser59.nextToken();
        tokenBuffer43._appendRaw(52, (java.lang.Object) parser59);
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer69 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec68);
        java.math.BigInteger bigInteger70 = null;
        tokenBuffer69.writeNumber(bigInteger70);
        tokenBuffer69.writeBooleanField("hi!", false);
        tokenBuffer69.writeString("hi!");
        tokenBuffer69.writeString("");
        byte[] byteArray84 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 };
        tokenBuffer69.writeBinaryField("", byteArray84);
        tokenBuffer43.writeBinary(byteArray84);
        tokenBuffer35.writeBinary(byteArray84);
        tokenBuffer1.writeBinary(byteArray84);
        com.fasterxml.jackson.core.JsonToken jsonToken89 = tokenBuffer1.firstToken();
        boolean boolean90 = tokenBuffer1.isClosed();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext19);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 79 + "'", int49 == 79);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 79 + "'", int52 == 79);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder63);
        org.junit.Assert.assertNull(jsonToken66);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1 });
        org.junit.Assert.assertTrue("'" + jsonToken89 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT + "'", jsonToken89.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder8 = parser4._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        boolean boolean13 = parser4._hasNativeObjectIds;
        double double14 = parser4.getValueAsDouble();
        int int15 = parser4.getFeatureMask();
        double double16 = parser4.getValueAsDouble();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        int int43 = tokenBuffer1.getFeatureMask();
        boolean boolean44 = tokenBuffer1.canWriteObjectId();
        java.lang.Object obj45 = tokenBuffer1._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment46 = tokenBuffer1._last;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        tokenBuffer48.writeNumber((double) '4');
        java.lang.Object obj56 = tokenBuffer48.getOutputTarget();
        tokenBuffer48.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes60 = tokenBuffer48.getCharacterEscapes();
        tokenBuffer48._closed = false;
        boolean boolean63 = tokenBuffer48._hasNativeId;
        boolean boolean64 = tokenBuffer48._mayHaveNativeIds;
        com.fasterxml.jackson.core.SerializableString serializableString65 = null;
        tokenBuffer48.writeString(serializableString65);
        tokenBuffer1.writeObject((java.lang.Object) serializableString65);
        com.fasterxml.jackson.core.SerializableString serializableString68 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator69 = tokenBuffer1.setRootValueSeparator(serializableString68);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 79 + "'", int43 == 79);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(segment46);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(characterEscapes60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = tokenBuffer1._first;
        tokenBuffer1.writeNumber((short) (byte) 1);
        tokenBuffer1.writeFieldName("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator49 = tokenBuffer1.setFeatureMask(0);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(segment43);
        org.junit.Assert.assertNotNull(jsonGenerator49);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        java.math.BigInteger bigInteger11 = null;
        tokenBuffer10.writeNumber(bigInteger11);
        tokenBuffer1._objectId = bigInteger11;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        com.fasterxml.jackson.core.Base64Variant base64Variant16 = null;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer15.writeBinary(base64Variant16, byteArray22, (int) (short) 1, (int) (short) 0);
        tokenBuffer15.writeStartArray((int) (byte) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        java.math.BigInteger bigInteger31 = null;
        tokenBuffer30.writeNumber(bigInteger31);
        tokenBuffer30.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode36 = null;
        tokenBuffer30.writeTree(treeNode36);
        tokenBuffer15._appendRaw((int) '4', (java.lang.Object) tokenBuffer30);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment39 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser43 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment39, objectCodec40, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser44 = parser43.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation45 = parser43.getTokenLocation();
        com.fasterxml.jackson.core.Version version46 = parser43.version();
        tokenBuffer15.writeObjectId((java.lang.Object) version46);
        tokenBuffer1._objectId = tokenBuffer15;
        com.fasterxml.jackson.core.FormatSchema formatSchema49 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator51 = tokenBuffer1.setHighestNonEscapedChar(14);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNotNull(jsonLocation45);
        org.junit.Assert.assertNotNull(version46);
        org.junit.Assert.assertNull(formatSchema49);
        org.junit.Assert.assertNotNull(jsonGenerator51);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        long long8 = parser4.nextLongValue((long) (short) 10);
        boolean boolean9 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.Base64Variant base64Variant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = parser4.getBinaryValue(base64Variant10);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = tokenBuffer1.getCharacterEscapes();
        tokenBuffer1._closed = false;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = tokenBuffer1.asParser(objectCodec16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        com.fasterxml.jackson.core.Base64Variant base64Variant21 = null;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer20.writeBinary(base64Variant21, byteArray27, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString31 = null;
        tokenBuffer20.writeString(serializableString31);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment33 = tokenBuffer20._first;
        java.lang.Object obj35 = segment33.findObjectId((int) 'a');
        int int37 = segment33.rawType((int) (short) 0);
        int int39 = segment33.rawType((int) '4');
        tokenBuffer1.writeObjectField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]", (java.lang.Object) int39);
        tokenBuffer1.writeObjectFieldStart("hi!");
        tokenBuffer1.writeBooleanField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]", true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer47 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec46);
        tokenBuffer47.writeNumber((short) -1);
        int int50 = tokenBuffer47.getFeatureMask();
        tokenBuffer47.writeNumberField("", (double) 6);
        java.math.BigDecimal bigDecimal55 = null;
        tokenBuffer47.writeNumberField("hi!", bigDecimal55);
        com.fasterxml.jackson.core.JsonParser jsonParser57 = tokenBuffer47.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer58 = tokenBuffer1.append(tokenBuffer47);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6 + "'", int37 == 6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 79 + "'", int50 == 79);
        org.junit.Assert.assertNotNull(jsonParser57);
        org.junit.Assert.assertNotNull(tokenBuffer58);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = parser4.getCodec();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = parser4.nextToken();
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext10 = parser4._parsingContext;
        com.fasterxml.jackson.core.SerializableString serializableString11 = null;
        boolean boolean12 = parser4.nextFieldName(serializableString11);
        java.lang.Boolean boolean13 = parser4.nextBooleanValue();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = parser4.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertNull(objectCodec8);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertNotNull(jsonReadContext10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        com.fasterxml.jackson.core.TreeNode treeNode21 = null;
        tokenBuffer1.writeTree(treeNode21);
        tokenBuffer1.writeEndObject();
        tokenBuffer1.writeNullField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT]");
        java.lang.Object obj26 = tokenBuffer1._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = tokenBuffer1._last;
        tokenBuffer1.writeStringField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_NULL]", "");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = tokenBuffer1.setHighestNonEscapedChar((int) (short) 100);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(segment27);
        org.junit.Assert.assertNotNull(jsonGenerator32);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
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
        java.lang.Object obj37 = parser27.getEmbeddedObject();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext19);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1.writeNumber((long) 0);
        tokenBuffer1._hasNativeId = false;
        com.fasterxml.jackson.core.Version version13 = tokenBuffer1.version();
        tokenBuffer1.writeNumber((short) (byte) 100);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment16 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser20 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment16, objectCodec17, true, true);
        int int21 = parser20.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken22 = parser20.nextValue();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder23 = null;
        parser20._byteBuilder = byteArrayBuilder23;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext25 = null;
        parser20._parsingContext = jsonReadContext25;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser20);
        boolean boolean28 = parser20.isClosed();
        boolean boolean29 = parser20.requiresCustomCodec();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = parser20._currentObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(version13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(jsonToken22);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeStartArray((int) (byte) 1);
        tokenBuffer1.writeString("");
        tokenBuffer1._closed = false;
        int int18 = tokenBuffer1._appendAt;
        boolean boolean19 = tokenBuffer1._closed;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = parser4.getNumberValue();
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
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        java.math.BigDecimal bigDecimal9 = null;
        tokenBuffer1.writeNumber(bigDecimal9);
        tokenBuffer1._hasNativeId = true;
        java.math.BigDecimal bigDecimal13 = null;
        tokenBuffer1.writeNumber(bigDecimal13);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment15 = tokenBuffer1._first;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap16 = segment15._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer19 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec18);
        com.fasterxml.jackson.core.Base64Variant base64Variant20 = null;
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer19.writeBinary(base64Variant20, byteArray26, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString30 = null;
        tokenBuffer19.writeString(serializableString30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer34 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec33);
        com.fasterxml.jackson.core.Base64Variant base64Variant35 = null;
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer34.writeBinary(base64Variant35, byteArray41, (int) (short) 1, (int) (short) 0);
        tokenBuffer19.writeBinaryField("", byteArray41);
        com.fasterxml.jackson.core.ObjectCodec objectCodec46 = tokenBuffer19._objectCodec;
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = tokenBuffer48.setHighestNonEscapedChar((-1));
        tokenBuffer19._typeId = (-1);
        com.fasterxml.jackson.core.JsonToken jsonToken57 = tokenBuffer19.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment58 = segment15.append((int) '#', jsonToken57);
        boolean boolean59 = segment58.hasIds();
        java.lang.Object[] objArray60 = segment58._tokens;
        com.fasterxml.jackson.core.JsonToken jsonToken62 = segment58.type((int) (short) 10);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(segment15);
        org.junit.Assert.assertNotNull(intMap16);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(objectCodec46);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertTrue("'" + jsonToken57 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken57.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
        org.junit.Assert.assertNotNull(segment58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertArrayEquals(objArray60, new java.lang.Object[] { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertNull(jsonToken62);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer2 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0, true);
        boolean boolean3 = tokenBuffer2.canWriteTypeId();
        tokenBuffer2._closed = false;
        java.lang.Object obj6 = tokenBuffer2._typeId;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer8 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec7);
        java.math.BigInteger bigInteger9 = null;
        tokenBuffer8.writeNumber(bigInteger9);
        tokenBuffer8.writeBooleanField("hi!", false);
        tokenBuffer8.writeString("hi!");
        tokenBuffer8.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = tokenBuffer8._first;
        segment18._tokenTypes = (short) -1;
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap21 = segment18._nativeIds;
        tokenBuffer2._last = segment18;
        java.io.InputStream inputStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = tokenBuffer2.writeBinary(inputStream23, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(segment18);
        org.junit.Assert.assertNull(intMap21);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer1.setFeatureMask(6);
        tokenBuffer1.writeNullField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]");
        tokenBuffer1.writeBooleanField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]", false);
        org.junit.Assert.assertNotNull(jsonGenerator5);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        boolean boolean14 = tokenBuffer1._hasNativeTypeIds;
        tokenBuffer1.writeNumber((long) 10);
        boolean boolean17 = tokenBuffer1.isClosed();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment14 = tokenBuffer1._first;
        java.lang.Object obj16 = segment14.findObjectId((int) 'a');
        java.lang.Object obj18 = segment14.findTypeId((int) (short) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment14, objectCodec19, false, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = parser22.getSchema();
        int int24 = parser22.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = parser22._currentObject();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer42 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec41);
        com.fasterxml.jackson.core.Base64Variant base64Variant43 = null;
        byte[] byteArray49 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer42.writeBinary(base64Variant43, byteArray49, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString53 = null;
        tokenBuffer42.writeString(serializableString53);
        com.fasterxml.jackson.core.ObjectCodec objectCodec56 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer57 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec56);
        com.fasterxml.jackson.core.Base64Variant base64Variant58 = null;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer57.writeBinary(base64Variant58, byteArray64, (int) (short) 1, (int) (short) 0);
        tokenBuffer42.writeBinaryField("", byteArray64);
        tokenBuffer21.writeBinary(byteArray64);
        com.fasterxml.jackson.core.ObjectCodec objectCodec70 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer71 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec70);
        com.fasterxml.jackson.core.Base64Variant base64Variant72 = null;
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer71.writeBinary(base64Variant72, byteArray78, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString82 = null;
        tokenBuffer71.writeString(serializableString82);
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer84 = tokenBuffer21.append(tokenBuffer71);
        com.fasterxml.jackson.core.ObjectCodec objectCodec85 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser86 = tokenBuffer84.asParser(objectCodec85);
        int int87 = tokenBuffer84.getHighestEscapedChar();
        int int88 = tokenBuffer84.getHighestEscapedChar();
        tokenBuffer84._hasNativeObjectIds = true;
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(tokenBuffer84);
        org.junit.Assert.assertNotNull(jsonParser86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        boolean boolean7 = parser4._hasNativeIds;
        int int8 = parser4.getTextOffset();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = parser4.peekNextToken();
        int int10 = parser4.getTextLength();
        parser4.clearCurrentToken();
        boolean boolean12 = parser4.hasTextCharacters();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jsonToken9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        java.lang.Object obj7 = parser4.getInputSource();
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = parser4._location;
        parser4._segmentPtr = 'a';
        long long12 = parser4.nextLongValue((long) (byte) -1);
        com.fasterxml.jackson.core.JsonToken jsonToken13 = parser4.peekNextToken();
        int int14 = parser4.getFeatureMask();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(jsonLocation8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(jsonToken13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1._appendRaw(10, (java.lang.Object) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer6 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec5);
        tokenBuffer6.writeNumber((short) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        tokenBuffer10.writeNumber((short) -1);
        tokenBuffer10.writeNumberField("", (int) '4');
        int int16 = tokenBuffer10.getFeatureMask();
        tokenBuffer10._mayHaveNativeIds = true;
        int int19 = tokenBuffer10.getFeatureMask();
        java.lang.Object obj20 = tokenBuffer10._typeId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment22 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec23 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser26 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment22, objectCodec23, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = parser26.skipChildren();
        java.io.Writer writer28 = null;
        int int29 = parser26.releaseBuffered(writer28);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder30 = parser26._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext31 = null;
        parser26._parsingContext = jsonReadContext31;
        com.fasterxml.jackson.core.JsonToken jsonToken33 = parser26.nextToken();
        tokenBuffer10._appendRaw(52, (java.lang.Object) parser26);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = tokenBuffer6.asParser((com.fasterxml.jackson.core.JsonParser) parser26);
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer6);
        java.lang.Object obj37 = tokenBuffer6._typeId;
        tokenBuffer6.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]", 52L);
        com.fasterxml.jackson.core.ObjectCodec objectCodec41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = tokenBuffer6.setCodec(objectCodec41);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 79 + "'", int19 == 79);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder30);
        org.junit.Assert.assertNull(jsonToken33);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(jsonGenerator42);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        com.fasterxml.jackson.core.TreeNode treeNode21 = null;
        tokenBuffer1.writeTree(treeNode21);
        tokenBuffer1._hasNativeTypeIds = false;
        tokenBuffer1.writeOmittedField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser31 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment27, objectCodec28, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser32 = parser31.skipChildren();
        java.io.Writer writer33 = null;
        int int34 = parser31.releaseBuffered(writer33);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder35 = parser31._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext36 = null;
        parser31._parsingContext = jsonReadContext36;
        com.fasterxml.jackson.core.ObjectCodec objectCodec38 = parser31._codec;
        boolean boolean39 = parser31.canReadObjectId();
        boolean boolean40 = parser31.getValueAsBoolean();
        tokenBuffer1.writeTypeId((java.lang.Object) parser31);
        boolean boolean43 = parser31.getValueAsBoolean(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = parser31._currentObject();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder35);
        org.junit.Assert.assertNull(objectCodec38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = tokenBuffer1._first;
        tokenBuffer1.writeNumberField("", 100);
        tokenBuffer1.flush();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(segment43);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1._hasNativeObjectIds;
        tokenBuffer1.writeStartArray();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder8 = parser4._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext9 = null;
        parser4._parsingContext = jsonReadContext9;
        com.fasterxml.jackson.core.FormatSchema formatSchema11 = null;
        boolean boolean12 = parser4.canUseSchema(formatSchema11);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = parser4.setFeatureMask(1);
        boolean boolean15 = parser4.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation16 = parser4._location;
        boolean boolean17 = parser4.isExpectedStartArrayToken();
        parser4._segmentPtr = 52;
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jsonLocation16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        com.fasterxml.jackson.core.JsonParser jsonParser7 = parser4.skipChildren();
        int int8 = parser4.getTextLength();
        boolean boolean9 = parser4._hasNativeIds;
        int int10 = parser4._segmentPtr;
        int int11 = parser4._segmentPtr;
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = parser4.getTokenLocation();
        boolean boolean13 = parser4.canReadTypeId();
        parser4._segmentPtr = 97;
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = parser4._codec;
        boolean boolean17 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.Base64Variant base64Variant18 = null;
        java.io.OutputStream outputStream19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = parser4.readBinaryValue(base64Variant18, outputStream19);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectCodec16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        boolean boolean6 = parser4._hasNativeObjectIds;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = parser11.skipChildren();
        java.io.Writer writer13 = null;
        int int14 = parser11.releaseBuffered(writer13);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder15 = parser11._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext16 = null;
        parser11._parsingContext = jsonReadContext16;
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = null;
        boolean boolean19 = parser11.canUseSchema(formatSchema18);
        com.fasterxml.jackson.core.JsonParser jsonParser21 = parser11.setFeatureMask(1);
        com.fasterxml.jackson.core.JsonLocation jsonLocation22 = parser11.getTokenLocation();
        parser4._location = jsonLocation22;
        int int24 = parser4.getTextOffset();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNotNull(jsonLocation22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        int int7 = parser4._segmentPtr;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        parser4._location = jsonLocation8;
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = parser4.getSchema();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(formatSchema10);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        int int10 = tokenBuffer1.getFeatureMask();
        java.lang.Object obj11 = tokenBuffer1._typeId;
        tokenBuffer1.writeNullField("hi!");
        java.lang.Object obj14 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeBoolean(true);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = tokenBuffer1._last;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment18 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser22 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment18, objectCodec19, true, true);
        boolean boolean23 = parser22.isExpectedStartArrayToken();
        boolean boolean24 = parser22._hasNativeObjectIds;
        boolean boolean25 = parser22.isExpectedStartArrayToken();
        double double27 = parser22.getValueAsDouble((double) 97L);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = new com.fasterxml.jackson.databind.util.TokenBuffer.Segment();
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer41 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec40);
        java.math.BigInteger bigInteger42 = null;
        tokenBuffer41.writeNumber(bigInteger42);
        tokenBuffer41.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator48 = tokenBuffer41.setHighestNonEscapedChar((-1));
        tokenBuffer31.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken50 = tokenBuffer31.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment51 = segment28.append(6, jsonToken50);
        parser22._segment = segment28;
        com.fasterxml.jackson.core.FormatSchema formatSchema53 = parser22.getSchema();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment54 = parser22._segment;
        com.fasterxml.jackson.core.ObjectCodec objectCodec55 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser58 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment54, objectCodec55, false, false);
        segment17._next = segment54;
        com.fasterxml.jackson.core.ObjectCodec objectCodec60 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser61 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment54, objectCodec60);
        com.fasterxml.jackson.core.Version version62 = parser61.version();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(segment17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(jsonGenerator48);
        org.junit.Assert.assertTrue("'" + jsonToken50 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken50.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(segment51);
        org.junit.Assert.assertNull(formatSchema53);
        org.junit.Assert.assertNotNull(segment54);
        org.junit.Assert.assertNotNull(version62);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        tokenBuffer1._appendAt = (short) 100;
        tokenBuffer1.writeFieldName("");
        tokenBuffer1.writeBoolean(true);
        tokenBuffer1.writeEndObject();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes19 = tokenBuffer1.getCharacterEscapes();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNull(characterEscapes19);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment7 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser11 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment7, objectCodec8, true, true);
        boolean boolean12 = parser11.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = parser11.skipChildren();
        boolean boolean14 = parser11.canReadObjectId();
        parser11.overrideCurrentName("hi!");
        tokenBuffer1._typeId = parser11;
        tokenBuffer1._generatorFeatures = 10;
        com.fasterxml.jackson.core.SerializableString serializableString20 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.writeRaw(serializableString20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Called operation not supported for TokenBuffer");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = parser4.skipChildren();
        int int8 = parser4.getValueAsInt((int) (byte) 0);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = parser4._segment;
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder10 = parser4._byteBuilder;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = parser4.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(segment9);
        org.junit.Assert.assertNull(byteArrayBuilder10);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        tokenBuffer1.writeOmittedField("");
        tokenBuffer1.writeNumber((short) (byte) 1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer1.useDefaultPrettyPrinter();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment19 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser23 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment19, objectCodec20, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = parser23.skipChildren();
        java.io.Writer writer25 = null;
        int int26 = parser23.releaseBuffered(writer25);
        boolean boolean27 = parser23.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema28 = null;
        boolean boolean29 = parser23.canUseSchema(formatSchema28);
        boolean boolean30 = parser23._closed;
        java.lang.String str31 = parser23.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation32 = parser23.getCurrentLocation();
        tokenBuffer1.writeObject((java.lang.Object) jsonLocation32);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34);
        java.math.BigInteger bigInteger36 = null;
        tokenBuffer35.writeNumber(bigInteger36);
        tokenBuffer35.writeBooleanField("hi!", false);
        tokenBuffer35.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext43 = tokenBuffer35.getOutputContext();
        boolean boolean44 = tokenBuffer35.canWriteBinaryNatively();
        com.fasterxml.jackson.core.JsonParser jsonParser45 = tokenBuffer35.asParser();
        tokenBuffer35.writeArrayFieldStart("[TokenBuffer: ]");
        com.fasterxml.jackson.core.ObjectCodec objectCodec48 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer49 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec48);
        tokenBuffer49._appendRaw(10, (java.lang.Object) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec53 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer54 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec53);
        com.fasterxml.jackson.core.Base64Variant base64Variant55 = null;
        byte[] byteArray61 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer54.writeBinary(base64Variant55, byteArray61, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString65 = null;
        tokenBuffer54.writeString(serializableString65);
        com.fasterxml.jackson.core.ObjectCodec objectCodec68 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer69 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec68);
        com.fasterxml.jackson.core.Base64Variant base64Variant70 = null;
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer69.writeBinary(base64Variant70, byteArray76, (int) (short) 1, (int) (short) 0);
        tokenBuffer54.writeBinaryField("", byteArray76);
        tokenBuffer49._objectId = byteArray76;
        tokenBuffer35.writeBinary(byteArray76);
        tokenBuffer1.writeBinary(byteArray76);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(jsonLocation32);
        org.junit.Assert.assertNotNull(jsonWriteContext43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        parser4.clearCurrentToken();
        boolean boolean10 = parser4.hasTextCharacters();
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = parser4.readBinaryValue(outputStream11);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        int int7 = parser4._segmentPtr;
        boolean boolean8 = parser4._hasNativeTypeIds;
        java.io.Writer writer9 = null;
        int int10 = parser4.releaseBuffered(writer9);
        com.fasterxml.jackson.core.JsonParser.Feature feature11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser12 = parser4.disable(feature11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        boolean boolean42 = parser27.getValueAsBoolean();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser2 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1);
        com.fasterxml.jackson.core.JsonToken jsonToken3 = parser2.getLastClearedToken();
        parser2.overrideCurrentName("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, END_ARRAY, VALUE_NUMBER_INT]");
        org.junit.Assert.assertNull(jsonToken3);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        boolean boolean11 = parser4._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = parser4.getParsingContext();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer14 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec13);
        com.fasterxml.jackson.core.Base64Variant base64Variant15 = null;
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer14.writeBinary(base64Variant15, byteArray21, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString25 = null;
        tokenBuffer14.writeString(serializableString25);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment27 = tokenBuffer14._first;
        java.lang.Object obj29 = segment27.findObjectId((int) 'a');
        java.lang.Object obj31 = segment27.findTypeId((int) (short) 0);
        int int33 = segment27.rawType(0);
        int int35 = segment27.rawType(52);
        parser4._segment = segment27;
        int int37 = parser4.getTextLength();
        boolean boolean38 = parser4._closed;
        boolean boolean39 = parser4.canReadTypeId();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        int int4 = tokenBuffer1.getFeatureMask();
        tokenBuffer1.writeEndObject();
        tokenBuffer1.writeNumber((double) 79);
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = tokenBuffer1.setCodec(objectCodec8);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment10 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser14 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment10, objectCodec11, true, true);
        int int15 = parser14.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec16 = parser14._codec;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = parser14.skipChildren();
        int int18 = parser14.getTextLength();
        boolean boolean19 = parser14._hasNativeIds;
        int int20 = parser14._segmentPtr;
        int int21 = parser14._segmentPtr;
        com.fasterxml.jackson.core.JsonLocation jsonLocation22 = parser14.getTokenLocation();
        boolean boolean23 = parser14._hasNativeObjectIds;
        // The following exception was thrown during execution in test generation
        try {
            tokenBuffer1.copyCurrentStructure((com.fasterxml.jackson.core.JsonParser) parser14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(objectCodec16);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(jsonLocation22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1.writeNumber((long) 0);
        tokenBuffer1._hasNativeId = false;
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        com.fasterxml.jackson.core.Base64Variant base64Variant16 = null;
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer15.writeBinary(base64Variant16, byteArray22, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString26 = null;
        tokenBuffer15.writeString(serializableString26);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment28 = tokenBuffer15._first;
        java.lang.Object obj30 = segment28.findObjectId((int) 'a');
        int int32 = segment28.rawType((int) (short) 0);
        int int34 = segment28.rawType((int) (byte) -1);
        tokenBuffer1._last = segment28;
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        java.math.BigInteger bigInteger39 = null;
        tokenBuffer38.writeNumber(bigInteger39);
        tokenBuffer38.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator45 = tokenBuffer38.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec47 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer48 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec47);
        java.math.BigInteger bigInteger49 = null;
        tokenBuffer48.writeNumber(bigInteger49);
        tokenBuffer48.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = tokenBuffer48.setHighestNonEscapedChar((-1));
        tokenBuffer38.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken57 = tokenBuffer38.firstToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec58 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer59 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec58);
        com.fasterxml.jackson.core.Base64Variant base64Variant60 = null;
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer59.writeBinary(base64Variant60, byteArray66, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString70 = null;
        tokenBuffer59.writeString(serializableString70);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment72 = tokenBuffer59._first;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment73 = segment28.append(79, jsonToken57, (java.lang.Object) segment72);
        java.lang.Object obj75 = segment73.findTypeId(6);
        java.util.TreeMap<java.lang.Integer, java.lang.Object> intMap76 = segment73._nativeIds;
        com.fasterxml.jackson.core.ObjectCodec objectCodec77 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser78 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment73, objectCodec77);
        com.fasterxml.jackson.core.JsonToken jsonToken79 = parser78.peekNextToken();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(formatSchema13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 6 + "'", int34 == 6);
        org.junit.Assert.assertNotNull(jsonGenerator45);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertTrue("'" + jsonToken57 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken57.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment72);
        org.junit.Assert.assertNotNull(segment73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(intMap76);
        org.junit.Assert.assertTrue("'" + jsonToken79 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken79.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = null;
        boolean boolean6 = parser4.canUseSchema(formatSchema5);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = parser4._byteBuilder;
        boolean boolean8 = parser4._closed;
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        parser4.setCodec(objectCodec9);
        long long11 = parser4.getValueAsLong();
        double double12 = parser4.getValueAsDouble();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArrayBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment4 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec5 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser8 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment4, objectCodec5, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser9 = parser8.skipChildren();
        java.io.Writer writer10 = null;
        int int11 = parser8.releaseBuffered(writer10);
        boolean boolean12 = parser8.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = null;
        boolean boolean14 = parser8.canUseSchema(formatSchema13);
        boolean boolean15 = parser8._closed;
        tokenBuffer1._typeId = boolean15;
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        java.math.BigInteger bigInteger19 = null;
        tokenBuffer18.writeNumber(bigInteger19);
        tokenBuffer18.writeBooleanField("hi!", false);
        tokenBuffer18.writeNumber((double) '4');
        java.lang.Object obj26 = tokenBuffer18.getOutputTarget();
        tokenBuffer18.writeNumberField("hi!", 0.0f);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = tokenBuffer18.useDefaultPrettyPrinter();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext31 = tokenBuffer18.getOutputContext();
        tokenBuffer1._writeContext = jsonWriteContext31;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext33 = tokenBuffer1.getOutputContext();
        tokenBuffer1.writeStartArray(0);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter36 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = tokenBuffer1.setPrettyPrinter(prettyPrinter36);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(jsonGenerator30);
        org.junit.Assert.assertNotNull(jsonWriteContext31);
        org.junit.Assert.assertNotNull(jsonWriteContext33);
        org.junit.Assert.assertNotNull(jsonGenerator37);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.Version version4 = tokenBuffer1.version();
        boolean boolean5 = tokenBuffer1._closed;
        tokenBuffer1.writeArrayFieldStart("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment9 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser13 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment9, objectCodec10, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = parser13.skipChildren();
        java.io.Writer writer15 = null;
        int int16 = parser13.releaseBuffered(writer15);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder17 = parser13._byteBuilder;
        com.fasterxml.jackson.core.json.JsonReadContext jsonReadContext18 = null;
        parser13._parsingContext = jsonReadContext18;
        com.fasterxml.jackson.core.JsonToken jsonToken20 = parser13.nextToken();
        boolean boolean21 = parser13.canReadTypeId();
        tokenBuffer1.writeObjectField("hi!", (java.lang.Object) parser13);
        long long24 = parser13.getValueAsLong((long) (byte) 100);
        org.junit.Assert.assertNotNull(version4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(byteArrayBuilder17);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        java.io.Writer writer6 = null;
        int int7 = parser4.releaseBuffered(writer6);
        boolean boolean8 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = null;
        boolean boolean10 = parser4.canUseSchema(formatSchema9);
        boolean boolean11 = parser4._closed;
        java.lang.String str12 = parser4.getText();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = parser4.getCurrentLocation();
        boolean boolean14 = parser4.canReadObjectId();
        boolean boolean15 = parser4.canReadObjectId();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext16 = parser4.getParsingContext();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment17 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser21 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment17, objectCodec18, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = null;
        boolean boolean23 = parser21.canUseSchema(formatSchema22);
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder24 = parser21._byteBuilder;
        java.io.OutputStream outputStream25 = null;
        int int26 = parser21.releaseBuffered(outputStream25);
        double double27 = parser21.getValueAsDouble();
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        parser21._codec = objectCodec28;
        boolean boolean30 = parser21._closed;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec32 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser35 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment31, objectCodec32, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = parser35.skipChildren();
        java.io.Writer writer37 = null;
        int int38 = parser35.releaseBuffered(writer37);
        boolean boolean39 = parser35.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec40 = parser35.getCodec();
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = parser35.getTokenLocation();
        parser21._location = jsonLocation41;
        parser4.setLocation(jsonLocation41);
        com.fasterxml.jackson.core.JsonToken jsonToken44 = parser4.getLastClearedToken();
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonStreamContext16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(byteArrayBuilder24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonParser36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(objectCodec40);
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertNull(jsonToken44);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = tokenBuffer1.setFeatureMask(6);
        com.fasterxml.jackson.core.FormatSchema formatSchema6 = tokenBuffer1.getSchema();
        tokenBuffer1.writeStartArray();
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertNull(formatSchema6);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        java.lang.Object obj7 = parser4.getInputSource();
        java.lang.String str8 = parser4.getCurrentName();
        int int10 = parser4.getValueAsInt((int) (byte) -1);
        com.fasterxml.jackson.core.JsonToken jsonToken11 = parser4.peekNextToken();
        int int12 = parser4._segmentPtr;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = parser4.skipChildren();
        boolean boolean7 = parser4.canReadObjectId();
        parser4.overrideCurrentName("hi!");
        boolean boolean10 = parser4._hasNativeTypeIds;
        com.fasterxml.jackson.core.JsonToken jsonToken11 = parser4.getLastClearedToken();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder12 = null;
        parser4._byteBuilder = byteArrayBuilder12;
        int int14 = parser4.getFeatureMask();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        com.fasterxml.jackson.core.TreeNode treeNode21 = null;
        tokenBuffer1.writeTree(treeNode21);
        tokenBuffer1.writeNull();
        com.fasterxml.jackson.core.TreeNode treeNode24 = null;
        tokenBuffer1.writeTree(treeNode24);
        tokenBuffer1.writeOmittedField("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NULL]");
        tokenBuffer1.writeEndArray();
        tokenBuffer1.writeString("[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(), VALUE_NUMBER_INT]");
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.TreeNode treeNode7 = null;
        tokenBuffer1.writeTree(treeNode7);
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer10 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec9);
        tokenBuffer10.writeNumber((short) -1);
        tokenBuffer10.writeNumberField("", (int) '4');
        int int16 = tokenBuffer10.getFeatureMask();
        tokenBuffer10._mayHaveNativeIds = true;
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        java.math.BigInteger bigInteger21 = null;
        tokenBuffer20.writeNumber(bigInteger21);
        tokenBuffer20.writeBooleanField("hi!", false);
        tokenBuffer20.writeString("hi!");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext28 = tokenBuffer20.getOutputContext();
        tokenBuffer10._writeContext = jsonWriteContext28;
        tokenBuffer1._typeId = jsonWriteContext28;
        tokenBuffer1._mayHaveNativeIds = true;
        tokenBuffer1.writeEndArray();
        java.lang.Object obj34 = tokenBuffer1._objectId;
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment35 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser39 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment35, objectCodec36, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = parser39.skipChildren();
        java.io.Writer writer41 = null;
        int int42 = parser39.releaseBuffered(writer41);
        boolean boolean43 = parser39.isExpectedStartArrayToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema44 = null;
        boolean boolean45 = parser39.canUseSchema(formatSchema44);
        boolean boolean46 = parser39._hasNativeObjectIds;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext47 = parser39.getParsingContext();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext48 = parser39.getParsingContext();
        com.fasterxml.jackson.core.JsonParser jsonParser49 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 79 + "'", int16 == 79);
        org.junit.Assert.assertNotNull(jsonWriteContext28);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jsonStreamContext47);
        org.junit.Assert.assertNotNull(jsonStreamContext48);
        org.junit.Assert.assertNotNull(jsonParser49);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        boolean boolean8 = tokenBuffer1.canWriteObjectId();
        tokenBuffer1.writeNumber((long) 0);
        tokenBuffer1.writeBoolean(false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer15 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec14);
        tokenBuffer15._appendRaw(10, (java.lang.Object) 100);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer20 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec19);
        com.fasterxml.jackson.core.Base64Variant base64Variant21 = null;
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer20.writeBinary(base64Variant21, byteArray27, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString31 = null;
        tokenBuffer20.writeString(serializableString31);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer35 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec34);
        com.fasterxml.jackson.core.Base64Variant base64Variant36 = null;
        byte[] byteArray42 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer35.writeBinary(base64Variant36, byteArray42, (int) (short) 1, (int) (short) 0);
        tokenBuffer20.writeBinaryField("", byteArray42);
        tokenBuffer15._objectId = byteArray42;
        tokenBuffer1.writeBinaryField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]", byteArray42);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment49 = tokenBuffer1._first;
        java.lang.Object obj51 = segment49.findObjectId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment49);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.FormatSchema formatSchema5 = parser4.getSchema();
        int int7 = parser4.nextIntValue(10);
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.nextToken();
        int int10 = parser4.getValueAsInt((int) (short) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = parser4.skipChildren();
        boolean boolean12 = parser4.isExpectedStartArrayToken();
        java.io.OutputStream outputStream13 = null;
        int int14 = parser4.releaseBuffered(outputStream13);
        org.junit.Assert.assertNull(formatSchema5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec6 = parser4._codec;
        boolean boolean7 = parser4.isClosed();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.nextToken();
        boolean boolean9 = parser4.hasTextCharacters();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectCodec6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter4 = tokenBuffer1.getPrettyPrinter();
        boolean boolean5 = tokenBuffer1.canWriteObjectId();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment6 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec7 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser10 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment6, objectCodec7, true, true);
        int int11 = parser10.getTextLength();
        com.fasterxml.jackson.core.ObjectCodec objectCodec12 = parser10._codec;
        long long14 = parser10.nextLongValue((long) (short) 10);
        boolean boolean15 = parser10.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = tokenBuffer1.asParser((com.fasterxml.jackson.core.JsonParser) parser10);
        com.fasterxml.jackson.core.JsonToken jsonToken17 = parser10.nextToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType18 = parser10.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: N/A; line: -1, column: -1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(prettyPrinter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(objectCodec12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNull(jsonToken17);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        boolean boolean5 = parser4.isExpectedStartArrayToken();
        boolean boolean6 = parser4._hasNativeIds;
        int int8 = parser4.getValueAsInt((-1));
        boolean boolean9 = parser4.requiresCustomCodec();
        boolean boolean10 = parser4.hasTextCharacters();
        long long12 = parser4.getValueAsLong((long) (byte) 1);
        long long14 = parser4.nextLongValue((long) 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        java.lang.Object obj21 = tokenBuffer1.getOutputTarget();
        java.lang.Object obj22 = tokenBuffer1._objectId;
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = tokenBuffer1.getSchema();
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer25 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec24);
        java.math.BigInteger bigInteger26 = null;
        tokenBuffer25.writeNumber(bigInteger26);
        tokenBuffer25.writeBooleanField("hi!", false);
        tokenBuffer25.writeString("hi!");
        tokenBuffer25.writeString("");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment35 = tokenBuffer25._first;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator37 = tokenBuffer25.setHighestNonEscapedChar((int) (short) 1);
        tokenBuffer1.writeObject((java.lang.Object) (short) 1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec39 = null;
        tokenBuffer1._objectCodec = objectCodec39;
        tokenBuffer1.writeStringField("[TokenBuffer: VALUE_NULL]", "[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, END_ARRAY, VALUE_NUMBER_INT]");
        com.fasterxml.jackson.core.Version version44 = tokenBuffer1.version();
        tokenBuffer1.writeEndArray();
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(formatSchema23);
        org.junit.Assert.assertNotNull(segment35);
        org.junit.Assert.assertNotNull(jsonGenerator37);
        org.junit.Assert.assertNotNull(version44);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        tokenBuffer1.writeNumber((short) -1);
        tokenBuffer1.writeNumberField("", (int) '4');
        int int7 = tokenBuffer1.getFeatureMask();
        tokenBuffer1._mayHaveNativeIds = true;
        int int10 = tokenBuffer1.getFeatureMask();
        tokenBuffer1.writeEndObject();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment13 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser17 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment13, objectCodec14, true, true);
        int int18 = parser17.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = parser17.nextValue();
        int int20 = parser17._segmentPtr;
        tokenBuffer1._appendRaw(1, (java.lang.Object) int20);
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = tokenBuffer1.setCodec(objectCodec22);
        java.math.BigDecimal bigDecimal24 = null;
        tokenBuffer1.writeNumber(bigDecimal24);
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_NULL]", (double) (short) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec29 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer30 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec29);
        tokenBuffer30.writeNumber((short) -1);
        tokenBuffer30.writeNumberField("", (int) '4');
        int int36 = tokenBuffer30.getFeatureMask();
        tokenBuffer30._mayHaveNativeIds = true;
        tokenBuffer30.writeObjectFieldStart("");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes41 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator42 = tokenBuffer30.setCharacterEscapes(characterEscapes41);
        tokenBuffer1.writeObject((java.lang.Object) tokenBuffer30);
        com.fasterxml.jackson.core.ObjectCodec objectCodec45 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer46 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec45);
        java.math.BigInteger bigInteger47 = null;
        tokenBuffer46.writeNumber(bigInteger47);
        tokenBuffer46.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator53 = tokenBuffer46.setHighestNonEscapedChar((-1));
        java.math.BigDecimal bigDecimal54 = null;
        tokenBuffer46.writeNumber(bigDecimal54);
        tokenBuffer46._hasNativeId = true;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext58 = tokenBuffer46._writeContext;
        tokenBuffer46.writeStartArray();
        tokenBuffer46.writeStartObject();
        tokenBuffer1._appendRaw((int) (short) 10, (java.lang.Object) tokenBuffer46);
        tokenBuffer46.writeObjectFieldStart("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, END_ARRAY]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 79 + "'", int7 == 79);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 79 + "'", int10 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jsonGenerator23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 79 + "'", int36 == 79);
        org.junit.Assert.assertNotNull(jsonGenerator42);
        org.junit.Assert.assertNotNull(jsonGenerator53);
        org.junit.Assert.assertNotNull(jsonWriteContext58);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeEndArray();
        tokenBuffer1._hasNativeObjectIds = false;
        com.fasterxml.jackson.core.PrettyPrinter prettyPrinter10 = tokenBuffer1.getPrettyPrinter();
        tokenBuffer1.writeFieldName("hi!");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = tokenBuffer1.useDefaultPrettyPrinter();
        tokenBuffer1._hasNativeObjectIds = false;
        tokenBuffer1.writeObjectFieldStart("[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL, VALUE_NUMBER_FLOAT, FIELD_NAME(hi!), VALUE_NULL, FIELD_NAME([TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]), VALUE_STRING]");
        org.junit.Assert.assertNull(prettyPrinter10);
        org.junit.Assert.assertNotNull(jsonGenerator13);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        tokenBuffer1.writeOmittedField("");
        tokenBuffer1.writeStartArray();
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer18 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec17);
        com.fasterxml.jackson.core.Base64Variant base64Variant19 = null;
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer18.writeBinary(base64Variant19, byteArray25, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString29 = null;
        tokenBuffer18.writeString(serializableString29);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment31 = tokenBuffer18._first;
        java.lang.Object obj33 = segment31.findObjectId((int) (byte) -1);
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser35 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment31, objectCodec34);
        com.fasterxml.jackson.core.JsonToken jsonToken36 = parser35.nextToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec37 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer38 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec37);
        java.math.BigInteger bigInteger39 = null;
        tokenBuffer38.writeNumber(bigInteger39);
        tokenBuffer38.writeBooleanField("hi!", false);
        tokenBuffer1._append(jsonToken36, (java.lang.Object) "hi!");
        tokenBuffer1._generatorFeatures = 15;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + jsonToken36 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT + "'", jsonToken36.equals(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT));
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeNumber((double) '4');
        java.lang.Object obj9 = tokenBuffer1.getOutputTarget();
        tokenBuffer1.writeNumberField("hi!", 0.0f);
        tokenBuffer1._hasNativeObjectIds = true;
        tokenBuffer1._mayHaveNativeIds = false;
        java.lang.Object obj17 = tokenBuffer1._objectId;
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        tokenBuffer1.writeString("hi!");
        boolean boolean9 = tokenBuffer1._hasNativeId;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = tokenBuffer1.asParser();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonParser10);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer21 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec20);
        java.math.BigInteger bigInteger22 = null;
        tokenBuffer21.writeNumber(bigInteger22);
        tokenBuffer21.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = tokenBuffer21.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator38 = tokenBuffer31.setHighestNonEscapedChar((-1));
        tokenBuffer21.writeObjectField("", (java.lang.Object) (-1));
        tokenBuffer1.serialize((com.fasterxml.jackson.core.JsonGenerator) tokenBuffer21);
        tokenBuffer1.writeNumber((int) ' ');
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment43 = tokenBuffer1._first;
        tokenBuffer1.writeNumber((short) (byte) 1);
        tokenBuffer1.writeFieldName("hi!");
        java.math.BigDecimal bigDecimal48 = null;
        tokenBuffer1.writeNumber(bigDecimal48);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment50 = tokenBuffer1._last;
        tokenBuffer1.writeNumberField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, FIELD_NAME(), VALUE_EMBEDDED_OBJECT, VALUE_NULL]", (long) 52);
        java.lang.Object obj54 = null;
        tokenBuffer1._typeId = obj54;
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator28);
        org.junit.Assert.assertNotNull(jsonGenerator38);
        org.junit.Assert.assertNotNull(segment43);
        org.junit.Assert.assertNotNull(segment50);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer16.writeBinary(base64Variant17, byteArray23, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinaryField("", byteArray23);
        int int28 = tokenBuffer1._appendAt;
        com.fasterxml.jackson.core.ObjectCodec objectCodec30 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer31 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec30);
        java.math.BigInteger bigInteger32 = null;
        tokenBuffer31.writeNumber(bigInteger32);
        tokenBuffer31.writeBooleanField("hi!", false);
        tokenBuffer31.writeString("hi!");
        tokenBuffer31.writeString("");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext41 = tokenBuffer31.getOutputContext();
        tokenBuffer1.writeObjectField("", (java.lang.Object) tokenBuffer31);
        tokenBuffer1.writeNumber(838492L);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext45 = tokenBuffer1._writeContext;
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(jsonWriteContext41);
        org.junit.Assert.assertNotNull(jsonWriteContext45);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        int int7 = parser4._segmentPtr;
        com.fasterxml.jackson.core.JsonLocation jsonLocation8 = null;
        parser4._location = jsonLocation8;
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext10 = parser4.getParsingContext();
        parser4.close();
        java.lang.String str12 = parser4.getCurrentName();
        int int13 = parser4.getTextOffset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(jsonStreamContext10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser5 = parser4.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonLocation jsonLocation7 = parser4.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = parser4.getCurrentToken();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = parser4.getCodec();
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        parser4._codec = objectCodec10;
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertNotNull(jsonLocation7);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(objectCodec9);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec1 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser4 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment0, objectCodec1, true, true);
        int int5 = parser4.getTextLength();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = parser4.nextValue();
        com.fasterxml.jackson.core.util.ByteArrayBuilder byteArrayBuilder7 = null;
        parser4._byteBuilder = byteArrayBuilder7;
        java.lang.String str9 = parser4.getCurrentName();
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = parser4.getTokenLocation();
        char[] charArray11 = parser4.getTextCharacters();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jsonToken6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        java.math.BigInteger bigInteger2 = null;
        tokenBuffer1.writeNumber(bigInteger2);
        tokenBuffer1.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = tokenBuffer1.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer11 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec10);
        java.math.BigInteger bigInteger12 = null;
        tokenBuffer11.writeNumber(bigInteger12);
        tokenBuffer11.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = tokenBuffer11.setHighestNonEscapedChar((-1));
        tokenBuffer1.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken20 = tokenBuffer1.firstToken();
        com.fasterxml.jackson.core.TreeNode treeNode21 = null;
        tokenBuffer1.writeTree(treeNode21);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = tokenBuffer1.asParser();
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer24 = new com.fasterxml.jackson.databind.util.TokenBuffer(jsonParser23);
        tokenBuffer24.writeStartArray();
        tokenBuffer24.writeNumber(79);
        tokenBuffer24._closed = true;
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertTrue("'" + jsonToken20 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken20.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(jsonParser23);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer1 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec0);
        com.fasterxml.jackson.core.Base64Variant base64Variant2 = null;
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer1.writeBinary(base64Variant2, byteArray8, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString12 = null;
        tokenBuffer1.writeString(serializableString12);
        com.fasterxml.jackson.core.ObjectCodec objectCodec15 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer16 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec15);
        com.fasterxml.jackson.core.Base64Variant base64Variant17 = null;
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer16.writeBinary(base64Variant17, byteArray23, (int) (short) 1, (int) (short) 0);
        tokenBuffer1.writeBinaryField("", byteArray23);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer29 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec28);
        com.fasterxml.jackson.core.Base64Variant base64Variant30 = null;
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        tokenBuffer29.writeBinary(base64Variant30, byteArray36, (int) (short) 1, (int) (short) 0);
        com.fasterxml.jackson.core.SerializableString serializableString40 = null;
        tokenBuffer29.writeString(serializableString40);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment42 = tokenBuffer29._first;
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer45 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec44);
        java.math.BigInteger bigInteger46 = null;
        tokenBuffer45.writeNumber(bigInteger46);
        tokenBuffer45.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator52 = tokenBuffer45.setHighestNonEscapedChar((-1));
        com.fasterxml.jackson.core.ObjectCodec objectCodec54 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer55 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec54);
        java.math.BigInteger bigInteger56 = null;
        tokenBuffer55.writeNumber(bigInteger56);
        tokenBuffer55.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator62 = tokenBuffer55.setHighestNonEscapedChar((-1));
        tokenBuffer45.writeObjectField("", (java.lang.Object) (-1));
        com.fasterxml.jackson.core.JsonToken jsonToken64 = tokenBuffer45.firstToken();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment66 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec67 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer.Parser parser70 = new com.fasterxml.jackson.databind.util.TokenBuffer.Parser(segment66, objectCodec67, true, true);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = parser70.skipChildren();
        com.fasterxml.jackson.core.JsonLocation jsonLocation72 = parser70.getTokenLocation();
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment74 = segment42.append((int) (short) 1, jsonToken64, (java.lang.Object) (short) 1, (java.lang.Object) jsonLocation72, (java.lang.Object) (byte) 0);
        com.fasterxml.jackson.core.ObjectCodec objectCodec75 = null;
        com.fasterxml.jackson.databind.util.TokenBuffer tokenBuffer76 = new com.fasterxml.jackson.databind.util.TokenBuffer(objectCodec75);
        java.math.BigInteger bigInteger77 = null;
        tokenBuffer76.writeNumber(bigInteger77);
        tokenBuffer76.writeBooleanField("hi!", false);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator83 = tokenBuffer76.setHighestNonEscapedChar((-1));
        tokenBuffer1._append(jsonToken64, (java.lang.Object) jsonGenerator83);
        com.fasterxml.jackson.core.FormatSchema formatSchema85 = null;
        boolean boolean86 = tokenBuffer1.canUseSchema(formatSchema85);
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment87 = tokenBuffer1._last;
        tokenBuffer1.writeOmittedField("[TokenBuffer: VALUE_NULL, FIELD_NAME(hi!), VALUE_FALSE, VALUE_NULL]");
        com.fasterxml.jackson.databind.util.TokenBuffer.Segment segment90 = tokenBuffer1._first;
        tokenBuffer1._generatorFeatures = 11;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator94 = tokenBuffer1.setFeatureMask((int) (short) -1);
        tokenBuffer1.flush();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(segment42);
        org.junit.Assert.assertNotNull(jsonGenerator52);
        org.junit.Assert.assertNotNull(jsonGenerator62);
        org.junit.Assert.assertTrue("'" + jsonToken64 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_NULL + "'", jsonToken64.equals(com.fasterxml.jackson.core.JsonToken.VALUE_NULL));
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertNotNull(jsonLocation72);
        org.junit.Assert.assertNull(segment74);
        org.junit.Assert.assertNotNull(jsonGenerator83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(segment87);
        org.junit.Assert.assertNotNull(segment90);
        org.junit.Assert.assertNotNull(jsonGenerator94);
    }
}

