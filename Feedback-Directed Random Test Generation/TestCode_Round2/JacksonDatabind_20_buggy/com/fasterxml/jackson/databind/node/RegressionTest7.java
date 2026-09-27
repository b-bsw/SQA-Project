package com.fasterxml.jackson.databind.node;

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
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode10.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = objectNode10.traverse();
        boolean boolean15 = objectNode10.has((-1));
        int int16 = objectNode10.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        long long21 = objectNode20.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode20.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser23 = objectNode20.traverse();
        boolean boolean25 = objectNode20.has((-1));
        int int26 = objectNode20.asInt();
        boolean boolean28 = objectNode20.hasNonNull((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode20.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        boolean boolean34 = objectNode32.has("");
        boolean boolean35 = objectNode32.isShort();
        long long37 = objectNode32.asLong((long) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode20._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode32);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode32);
        boolean boolean40 = objectNode1.isArray();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        java.lang.String str8 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode10.remove("");
        boolean boolean16 = objectNode10.isMissingNode();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode10.without((java.util.Collection<java.lang.String>) strList19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode1.retain((java.util.Collection<java.lang.String>) strList19);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        long long34 = objectNode33.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode33.get(1);
        double double37 = objectNode33.doubleValue();
        boolean boolean38 = objectNode33.isNull();
        boolean boolean39 = objectNode33.canConvertToLong();
        java.lang.Number number40 = objectNode33.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList42 = objectNode33.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList43 = objectNode24.findParents("", jsonNodeList42);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode22.setAll(objectNode24);
        boolean boolean46 = objectNode24.asBoolean(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(number40);
        org.junit.Assert.assertNotNull(jsonNodeList42);
        org.junit.Assert.assertNotNull(jsonNodeList43);
        org.junit.Assert.assertNotNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode8.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        boolean boolean15 = objectNode13.has("");
        boolean boolean16 = objectNode13.isContainerNode();
        boolean boolean17 = objectNode13.isFloatingPointNumber();
        boolean boolean18 = objectNode13.isNumber();
        boolean boolean19 = objectNode13.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode10._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        long long23 = objectNode22.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode22.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode22.remove("");
        boolean boolean28 = objectNode22.isMissingNode();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode22.without((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode20.remove((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode1.retain((java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList37 = objectNode1.findValuesAsText("");
        com.fasterxml.jackson.core.JsonParser jsonParser38 = objectNode1.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        long long42 = objectNode41.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode41.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode41.remove("");
        boolean boolean47 = objectNode41.isMissingNode();
        int int49 = objectNode41.asInt((int) (byte) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode1.set("", (com.fasterxml.jackson.databind.JsonNode) objectNode41);
        java.math.BigInteger bigInteger51 = objectNode41.bigIntegerValue();
        boolean boolean53 = objectNode41.has((int) 'a');
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode41.get((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNull(jsonNode44);
        org.junit.Assert.assertNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(bigInteger51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(jsonNode55);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isPojo();
        boolean boolean6 = objectNode1.isBoolean();
        boolean boolean7 = objectNode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.get("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode11.get(1);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap15 = objectNode11._children;
        boolean boolean16 = objectNode11.isArray();
        boolean boolean18 = objectNode11.hasNonNull((int) '#');
        boolean boolean19 = objectNode1.equals((java.lang.Object) boolean18);
        boolean boolean20 = objectNode1.isInt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonNode9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isInt();
        boolean boolean5 = objectNode1.isFloat();
        int int7 = objectNode1.asInt((int) (short) 0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        long long10 = objectNode9.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode9.get(1);
        double double13 = objectNode9.doubleValue();
        boolean boolean14 = objectNode9.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode9.findParents("hi!");
        boolean boolean18 = objectNode9.has((int) (byte) -1);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        long long21 = objectNode20.longValue();
        boolean boolean22 = objectNode20.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode20.findValue("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode27.deepCopy();
        byte[] byteArray30 = objectNode29.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor31 = objectNode29.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        int int34 = objectNode33.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap35 = objectNode33._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode29.setAll(strMap35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        long long39 = objectNode38.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode38.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        boolean boolean45 = objectNode43.has("");
        boolean boolean46 = objectNode43.isContainerNode();
        boolean boolean47 = objectNode43.isFloatingPointNumber();
        boolean boolean48 = objectNode43.isNumber();
        boolean boolean49 = objectNode43.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode40._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode43);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        long long53 = objectNode52.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode52.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = objectNode52.remove("");
        boolean boolean58 = objectNode52.isMissingNode();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = objectNode52.without((java.util.Collection<java.lang.String>) strList61);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode64 = objectNode50.remove((java.util.Collection<java.lang.String>) strList61);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = objectNode29.remove((java.util.Collection<java.lang.String>) strList61);
        boolean boolean67 = objectNode29.hasNonNull("");
        int int68 = objectNode29.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode69 = objectNode20._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode29);
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode29.retain(strArray71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode9.retain(strArray71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode1.retain(strArray71);
        byte[] byteArray75 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.BinaryNode binaryNode76 = objectNode74.binaryNode(byteArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNull(byteArray30);
        org.junit.Assert.assertNotNull(jsonNodeItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNull(jsonNode55);
        org.junit.Assert.assertNull(jsonNode57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objectNode63);
        org.junit.Assert.assertNotNull(objectNode64);
        org.junit.Assert.assertNotNull(objectNode65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objectNode69);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode3.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        int int8 = objectNode7.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode7._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode3.setAll(strMap9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = objectNode3.traverse();
        int int12 = objectNode3.asInt();
        boolean boolean13 = objectNode3.isLong();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = objectNode3.put("hi!", byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1 });
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        java.lang.String str8 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode10.remove("");
        boolean boolean16 = objectNode10.isMissingNode();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode10.without((java.util.Collection<java.lang.String>) strList19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode1.retain((java.util.Collection<java.lang.String>) strList19);
        double double23 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        java.lang.String str28 = objectNode26.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType29 = objectNode26.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        boolean boolean33 = objectNode31.has("");
        boolean boolean34 = objectNode31.isContainerNode();
        boolean boolean35 = objectNode31.isFloatingPointNumber();
        boolean boolean36 = objectNode31.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode26.putAll(objectNode31);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        long long41 = objectNode40.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode40.get(1);
        double double44 = objectNode40.doubleValue();
        boolean boolean45 = objectNode40.isNull();
        boolean boolean46 = objectNode40.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap47 = objectNode40._children;
        int int48 = objectNode40.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode26.set("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        boolean boolean50 = objectNode40.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        long long54 = objectNode53.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode55 = objectNode53.deepCopy();
        byte[] byteArray56 = objectNode55.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor57 = objectNode55.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory58);
        int int60 = objectNode59.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap61 = objectNode59._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = objectNode55.setAll(strMap61);
        java.math.BigInteger bigInteger63 = objectNode55.bigIntegerValue();
        boolean boolean64 = objectNode55.isDouble();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode66 = objectNode55.findParent("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = objectNode55.findParent("{}");
        com.fasterxml.jackson.core.JsonToken jsonToken69 = objectNode55.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = objectNode55.path(32);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = objectNode40.replace("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}", jsonNode71);
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = objectNode1.put("hi!", jsonNode71);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + jsonNodeType29 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType29.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNull(jsonNode43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(objectNode55);
        org.junit.Assert.assertNull(byteArray56);
        org.junit.Assert.assertNotNull(jsonNodeItor57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(objectNode66);
        org.junit.Assert.assertNull(objectNode68);
        org.junit.Assert.assertTrue("'" + jsonToken69 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken69.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode71);
        org.junit.Assert.assertNull(jsonNode72);
        org.junit.Assert.assertNull(jsonNode73);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        boolean boolean6 = objectNode1.isNumber();
        boolean boolean7 = objectNode1.isBigDecimal();
        boolean boolean8 = objectNode1.isArray();
        java.lang.String[] strArray12 = new java.lang.String[] { "{\"hi!\":{\"\":{}}}", "{\"hi!\":{\"\":{}}}", "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode1.retain(strArray12);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        boolean boolean18 = objectNode17.isPojo();
        boolean boolean19 = objectNode17.isValueNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode1.set("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode17);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode22 = objectNode17.numberNode((java.lang.Byte) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "{\"hi!\":{\"\":{}}}", "{\"hi!\":{\"\":{}}}", "" });
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        int int4 = objectNode1.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.at("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = jsonNode6.findValues("{\"hi!\":{\"\":{}}}");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = jsonNode6.findParents("{\"hi!\":{}}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertNotNull(jsonNodeList10);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        double double6 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType7 = objectNode1.getNodeType();
        boolean boolean9 = objectNode1.has("hi!");
        boolean boolean11 = objectNode1.has((int) (byte) -1);
        boolean boolean12 = objectNode1.isFloat();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        long long15 = objectNode14.longValue();
        java.lang.String str16 = objectNode14.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType17 = objectNode14.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        boolean boolean21 = objectNode19.has("");
        boolean boolean22 = objectNode19.isContainerNode();
        boolean boolean23 = objectNode19.isFloatingPointNumber();
        boolean boolean24 = objectNode19.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode14.putAll(objectNode19);
        int int26 = objectNode19.intValue();
        boolean boolean27 = objectNode19.isArray();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        boolean boolean32 = objectNode30.has("");
        boolean boolean33 = objectNode30.isContainerNode();
        boolean boolean34 = objectNode30.isFloatingPointNumber();
        boolean boolean35 = objectNode30.isNumber();
        boolean boolean36 = objectNode30.isBigDecimal();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory38 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory38);
        long long40 = objectNode39.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode39.get(1);
        double double43 = objectNode39.doubleValue();
        boolean boolean44 = objectNode39.isNull();
        boolean boolean45 = objectNode39.canConvertToLong();
        java.lang.Number number46 = objectNode39.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList48 = objectNode39.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList49 = objectNode30.findParents("", jsonNodeList48);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList50 = objectNode19.findParents("hi!", jsonNodeList48);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        long long54 = objectNode53.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = objectNode53.get(1);
        double double57 = objectNode53.doubleValue();
        boolean boolean58 = objectNode53.canConvertToInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory60 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory60);
        long long62 = objectNode61.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode61.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = objectNode61.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser67 = objectNode61.traverse();
        boolean boolean68 = objectNode61.isBinary();
        java.util.List<java.lang.String> strList70 = objectNode61.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList71 = objectNode53.findValuesAsText("hi!", strList70);
        java.util.List<java.lang.String> strList72 = objectNode19.findValuesAsText("{\"hi!\":{\"\":{}}}", strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode1.retain((java.util.Collection<java.lang.String>) strList72);
        double double75 = objectNode1.asDouble((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType7 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType7.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + jsonNodeType17 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType17.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(number46);
        org.junit.Assert.assertNotNull(jsonNodeList48);
        org.junit.Assert.assertNotNull(jsonNodeList49);
        org.junit.Assert.assertNotNull(jsonNodeList50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNull(jsonNode56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNull(jsonNode64);
        org.junit.Assert.assertNull(jsonNode66);
        org.junit.Assert.assertNotNull(jsonParser67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + (-1.0d) + "'", double75 == (-1.0d));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = objectNode3.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.findValue("");
        com.fasterxml.jackson.core.JsonParser jsonParser17 = objectNode3.traverse();
        int int18 = objectNode3.intValue();
        boolean boolean19 = objectNode3.isDouble();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.putAll(objectNode6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        long long15 = objectNode14.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode14.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode14.remove("");
        boolean boolean20 = objectNode14.isMissingNode();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = objectNode14.asToken();
        boolean boolean22 = objectNode1._childrenEqual(objectNode14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        boolean boolean31 = objectNode14._childrenEqual(objectNode24);
        long long32 = objectNode14.longValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        long long35 = objectNode34.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode34.get(1);
        double double38 = objectNode34.doubleValue();
        boolean boolean39 = objectNode34.isNull();
        boolean boolean40 = objectNode34.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap41 = objectNode34._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode14.putAll(strMap41);
        boolean boolean44 = objectNode14.has((int) 'a');
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory46);
        long long48 = objectNode47.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode47.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser50 = objectNode47.traverse();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = objectNode47.deepCopy();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode14._put("{\"\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode47);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory53 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory53);
        long long55 = objectNode54.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode57 = objectNode54.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = objectNode54.remove("");
        boolean boolean60 = objectNode54.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory62 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory62);
        long long64 = objectNode63.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = objectNode63.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser66 = objectNode63.traverse();
        boolean boolean68 = objectNode63.has((-1));
        int int69 = objectNode63.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = objectNode54.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode63);
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = objectNode54.findValue("hi!");
        boolean boolean73 = objectNode54.isIntegralNumber();
        boolean boolean74 = objectNode54.isBoolean();
        boolean boolean75 = objectNode54.isBinary();
        long long76 = objectNode54.longValue();
        boolean boolean77 = objectNode54.isPojo();
        boolean boolean78 = objectNode54.isTextual();
        boolean boolean79 = objectNode47.equals((java.lang.Object) boolean78);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(objectNode51);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNull(jsonNode57);
        org.junit.Assert.assertNull(jsonNode59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(objectNode65);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(jsonNode70);
        org.junit.Assert.assertNull(jsonNode72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.canConvertToInt();
        long long7 = objectNode1.longValue();
        boolean boolean8 = objectNode1.isTextual();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode7.deepCopy();
        byte[] byteArray10 = objectNode9.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor11 = objectNode9.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        int int14 = objectNode13.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap15 = objectNode13._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode9.setAll(strMap15);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        long long19 = objectNode18.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode18.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        boolean boolean25 = objectNode23.has("");
        boolean boolean26 = objectNode23.isContainerNode();
        boolean boolean27 = objectNode23.isFloatingPointNumber();
        boolean boolean28 = objectNode23.isNumber();
        boolean boolean29 = objectNode23.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode20._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode23);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        long long33 = objectNode32.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = objectNode32.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode32.remove("");
        boolean boolean38 = objectNode32.isMissingNode();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode32.without((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode30.remove((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode9.remove((java.util.Collection<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList46 = objectNode1.findValuesAsText("{\"hi!\":{\"\":{}}}", (java.util.List<java.lang.String>) strList41);
        int int47 = objectNode1.asInt();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode1.put("{\"\":{}}", (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(jsonNodeItor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(jsonNode35);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        boolean boolean6 = objectNode1.has((int) (byte) 1);
        boolean boolean7 = objectNode1.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        long long10 = objectNode9.longValue();
        boolean boolean11 = objectNode9.isPojo();
        int int12 = objectNode9.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode9.at("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = objectNode16.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        long long22 = objectNode21.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode21.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        boolean boolean28 = objectNode26.has("");
        boolean boolean29 = objectNode26.isContainerNode();
        boolean boolean30 = objectNode26.isFloatingPointNumber();
        boolean boolean31 = objectNode26.isNumber();
        boolean boolean32 = objectNode26.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode23._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode26);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        long long36 = objectNode35.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode35.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = objectNode35.remove("");
        boolean boolean41 = objectNode35.isMissingNode();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode35.without((java.util.Collection<java.lang.String>) strList44);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode33.remove((java.util.Collection<java.lang.String>) strList44);
        java.util.List<java.lang.String> strList48 = objectNode16.findValuesAsText("", (java.util.List<java.lang.String>) strList44);
        java.util.List<java.lang.String> strList50 = objectNode16.findValuesAsText("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = objectNode9.remove((java.util.Collection<java.lang.String>) strList50);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode1.putAll(objectNode51);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(objectNode51);
        org.junit.Assert.assertNotNull(jsonNode52);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode7.deepCopy();
        byte[] byteArray10 = objectNode9.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor11 = objectNode9.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        int int14 = objectNode13.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap15 = objectNode13._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode9.setAll(strMap15);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        long long19 = objectNode18.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode18.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        boolean boolean25 = objectNode23.has("");
        boolean boolean26 = objectNode23.isContainerNode();
        boolean boolean27 = objectNode23.isFloatingPointNumber();
        boolean boolean28 = objectNode23.isNumber();
        boolean boolean29 = objectNode23.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode20._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode23);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        long long33 = objectNode32.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = objectNode32.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode32.remove("");
        boolean boolean38 = objectNode32.isMissingNode();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode32.without((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode30.remove((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode9.remove((java.util.Collection<java.lang.String>) strList41);
        java.util.List<java.lang.String> strList46 = objectNode1.findValuesAsText("{\"hi!\":{\"\":{}}}", (java.util.List<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory48);
        long long50 = objectNode49.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode49.get(1);
        double double53 = objectNode49.doubleValue();
        boolean boolean54 = objectNode49.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        long long57 = objectNode56.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = objectNode56.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = objectNode56.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser62 = objectNode56.traverse();
        java.lang.String str63 = objectNode56.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory64);
        long long66 = objectNode65.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = objectNode65.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = objectNode65.remove("");
        boolean boolean71 = objectNode65.isMissingNode();
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode76 = objectNode65.without((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode56.retain((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode78 = objectNode49.remove((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory79 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode80 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory79);
        long long81 = objectNode80.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap82 = objectNode80._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode83 = objectNode49.setAll(strMap82);
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = objectNode1.put("", jsonNode83);
        boolean boolean85 = jsonNode83.isBigInteger();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(objectNode9);
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(jsonNodeItor11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(jsonNode35);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNull(jsonNode52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNull(jsonNode59);
        org.junit.Assert.assertNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonParser62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNull(jsonNode68);
        org.junit.Assert.assertNull(jsonNode70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objectNode76);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertNotNull(objectNode78);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(strMap82);
        org.junit.Assert.assertNotNull(jsonNode83);
        org.junit.Assert.assertNull(jsonNode84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        long long7 = objectNode6.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode6.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        boolean boolean13 = objectNode11.has("");
        boolean boolean14 = objectNode11.isContainerNode();
        boolean boolean15 = objectNode11.isFloatingPointNumber();
        boolean boolean16 = objectNode11.isNumber();
        boolean boolean17 = objectNode11.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode8._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode11);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        long long21 = objectNode20.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode20.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode20.remove("");
        boolean boolean26 = objectNode20.isMissingNode();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode20.without((java.util.Collection<java.lang.String>) strList29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode18.remove((java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList33 = objectNode1.findValuesAsText("", (java.util.List<java.lang.String>) strList29);
        double double34 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType35 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode1.without("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}");
        java.math.BigDecimal bigDecimal38 = objectNode1.decimalValue();
        boolean boolean39 = objectNode1.isMissingNode();
        boolean boolean40 = objectNode1.isBoolean();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(jsonNode23);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType35 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType35.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNotNull(jsonNode37);
        org.junit.Assert.assertNotNull(bigDecimal38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        boolean boolean4 = objectNode2.has("");
        boolean boolean5 = objectNode2.isContainerNode();
        boolean boolean6 = objectNode2.isFloatingPointNumber();
        boolean boolean7 = objectNode2.isNumber();
        boolean boolean8 = objectNode2.isBigDecimal();
        boolean boolean9 = objectNode2.isArray();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap10);
        boolean boolean13 = objectNode11.has(97);
        com.fasterxml.jackson.core.ObjectCodec objectCodec14 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser15 = objectNode11.traverse(objectCodec14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode17.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        boolean boolean24 = objectNode22.has("");
        boolean boolean25 = objectNode22.isContainerNode();
        boolean boolean26 = objectNode22.isFloatingPointNumber();
        boolean boolean27 = objectNode22.isNumber();
        boolean boolean28 = objectNode22.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode19._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode22);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType30 = objectNode19.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode19.findValue("");
        boolean boolean33 = objectNode19.isBinary();
        double double35 = objectNode19.asDouble((double) (short) 10);
        long long37 = objectNode19.asLong((long) (byte) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode11.setAll(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNull(numberType30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 10L + "'", long37 == 10L);
        org.junit.Assert.assertNotNull(jsonNode38);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList3 = objectNode1.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        long long7 = objectNode6.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode6.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        boolean boolean13 = objectNode11.has("");
        boolean boolean14 = objectNode11.isContainerNode();
        boolean boolean15 = objectNode11.isFloatingPointNumber();
        boolean boolean16 = objectNode11.isNumber();
        boolean boolean17 = objectNode11.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode8._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode11);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        long long21 = objectNode20.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode20.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode20.remove("");
        boolean boolean26 = objectNode20.isMissingNode();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode20.without((java.util.Collection<java.lang.String>) strList29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode18.remove((java.util.Collection<java.lang.String>) strList29);
        java.util.List<java.lang.String> strList33 = objectNode1.findValuesAsText("", (java.util.List<java.lang.String>) strList29);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor34 = objectNode1.iterator();
        short short35 = objectNode1.shortValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        long long39 = objectNode38.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode38.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        boolean boolean45 = objectNode43.has("");
        boolean boolean46 = objectNode43.isContainerNode();
        boolean boolean47 = objectNode43.isFloatingPointNumber();
        boolean boolean48 = objectNode43.isNumber();
        boolean boolean49 = objectNode43.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode40._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode43);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType51 = objectNode40.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode40.findValue("");
        com.fasterxml.jackson.core.JsonParser jsonParser54 = objectNode40.traverse();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode1.replace("", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor56 = objectNode1.iterator();
        org.junit.Assert.assertNotNull(jsonNodeList3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(jsonNode23);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(jsonNodeItor34);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertNull(numberType51);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonNodeItor56);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        long long9 = objectNode1.asLong();
        boolean boolean10 = objectNode1.isDouble();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = objectNode1.asToken();
        java.lang.String str12 = objectNode1.toString();
        boolean boolean13 = objectNode1.isBigInteger();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList15 = objectNode1.findValues("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}");
        byte[] byteArray16 = objectNode1.binaryValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + jsonToken11 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken11.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{}" + "'", str12, "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonNodeList15);
        org.junit.Assert.assertNull(byteArray16);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap8 = objectNode1._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode1.path(0);
        boolean boolean11 = objectNode1.isNull();
        int int12 = objectNode1.intValue();
        int int13 = objectNode1.asInt();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor14 = objectNode1.fields();
        short short15 = objectNode1.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strEntryItor14);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode7.get(1);
        double double11 = objectNode7.doubleValue();
        boolean boolean12 = objectNode7.isNull();
        boolean boolean13 = objectNode7.canConvertToLong();
        java.lang.Number number14 = objectNode7.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode7.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode7);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor18 = objectNode7.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        long long21 = objectNode20.longValue();
        java.lang.String str22 = objectNode20.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType23 = objectNode20.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        boolean boolean27 = objectNode25.has("");
        boolean boolean28 = objectNode25.isContainerNode();
        boolean boolean29 = objectNode25.isFloatingPointNumber();
        boolean boolean30 = objectNode25.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode20.putAll(objectNode25);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        long long34 = objectNode33.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode33.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode33.remove("");
        boolean boolean39 = objectNode33.isMissingNode();
        com.fasterxml.jackson.core.JsonToken jsonToken40 = objectNode33.asToken();
        boolean boolean41 = objectNode20._childrenEqual(objectNode33);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        boolean boolean45 = objectNode43.has("");
        boolean boolean46 = objectNode43.isContainerNode();
        boolean boolean47 = objectNode43.isFloatingPointNumber();
        boolean boolean48 = objectNode43.isNumber();
        boolean boolean49 = objectNode43.isBigDecimal();
        boolean boolean50 = objectNode33._childrenEqual(objectNode43);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode33.path("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode7.setAll(objectNode33);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor54 = objectNode33.elements();
        boolean boolean55 = objectNode33.isPojo();
        boolean boolean57 = objectNode33.hasNonNull((int) (short) -1);
        boolean boolean58 = objectNode33.isBoolean();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strEntryItor18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + jsonNodeType23 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType23.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + jsonToken40 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken40.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertNotNull(jsonNodeItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.putAll(objectNode6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        long long15 = objectNode14.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode14.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode14.remove("");
        boolean boolean20 = objectNode14.isMissingNode();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = objectNode14.asToken();
        boolean boolean22 = objectNode1._childrenEqual(objectNode14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        boolean boolean31 = objectNode14._childrenEqual(objectNode24);
        boolean boolean33 = objectNode24.asBoolean(false);
        java.lang.String str35 = objectNode24.asText("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory36 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory36);
        long long38 = objectNode37.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode37.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        boolean boolean44 = objectNode42.has("");
        boolean boolean45 = objectNode42.isContainerNode();
        boolean boolean46 = objectNode42.isFloatingPointNumber();
        boolean boolean47 = objectNode42.isNumber();
        boolean boolean48 = objectNode42.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode39._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode42);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType50 = objectNode39.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode39.findValue("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap53 = objectNode39._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode24.setAll(strMap53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertNull(numberType50);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(jsonNode54);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        int int4 = objectNode1.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.at("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode8.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        long long14 = objectNode13.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode13.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        boolean boolean20 = objectNode18.has("");
        boolean boolean21 = objectNode18.isContainerNode();
        boolean boolean22 = objectNode18.isFloatingPointNumber();
        boolean boolean23 = objectNode18.isNumber();
        boolean boolean24 = objectNode18.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode15._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode27.remove("");
        boolean boolean33 = objectNode27.isMissingNode();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode27.without((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode25.remove((java.util.Collection<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList40 = objectNode8.findValuesAsText("", (java.util.List<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList42 = objectNode8.findValuesAsText("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode1.remove((java.util.Collection<java.lang.String>) strList42);
        boolean boolean44 = objectNode1.isFloatingPointNumber();
        java.lang.Number number45 = objectNode1.numberValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode1.deepCopy();
        java.lang.String str47 = objectNode1.asText();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(number45);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.putAll(objectNode6);
        boolean boolean13 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        long long16 = objectNode15.longValue();
        boolean boolean17 = objectNode15.isPojo();
        int int18 = objectNode15.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode15.at("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList24 = objectNode22.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode27.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        boolean boolean34 = objectNode32.has("");
        boolean boolean35 = objectNode32.isContainerNode();
        boolean boolean36 = objectNode32.isFloatingPointNumber();
        boolean boolean37 = objectNode32.isNumber();
        boolean boolean38 = objectNode32.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode29._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode32);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        long long42 = objectNode41.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode41.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode41.remove("");
        boolean boolean47 = objectNode41.isMissingNode();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode41.without((java.util.Collection<java.lang.String>) strList50);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode39.remove((java.util.Collection<java.lang.String>) strList50);
        java.util.List<java.lang.String> strList54 = objectNode22.findValuesAsText("", (java.util.List<java.lang.String>) strList50);
        java.util.List<java.lang.String> strList56 = objectNode22.findValuesAsText("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode15.remove((java.util.Collection<java.lang.String>) strList56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode1.remove((java.util.Collection<java.lang.String>) strList56);
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.BinaryNode binaryNode62 = objectNode1.binaryNode(byteArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertNotNull(jsonNodeList24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNull(jsonNode44);
        org.junit.Assert.assertNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isValueNode();
        java.lang.String str6 = objectNode1.asText("");
        double double7 = objectNode1.asDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = objectNode1.traverse();
        long long10 = objectNode1.asLong((long) (short) 100);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList12 = objectNode1.findValues("{\"\":{}}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(jsonNodeList12);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode10.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = objectNode10.traverse();
        boolean boolean15 = objectNode10.has((-1));
        boolean boolean16 = objectNode1.equals((java.lang.Object) (-1));
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.get(1);
        double double23 = objectNode19.doubleValue();
        boolean boolean24 = objectNode19.isNull();
        boolean boolean25 = objectNode19.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap26 = objectNode19._children;
        int int27 = objectNode19.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode1.replace("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode19);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor29 = objectNode19.iterator();
        boolean boolean30 = objectNode19.isTextual();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType31 = objectNode19.numberType();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap32 = objectNode19._children;
        boolean boolean33 = objectNode19.isLong();
        com.fasterxml.jackson.core.JsonToken jsonToken34 = objectNode19.asToken();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(jsonNode28);
        org.junit.Assert.assertNotNull(jsonNodeItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(numberType31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + jsonToken34 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken34.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode7.get(1);
        double double11 = objectNode7.doubleValue();
        boolean boolean12 = objectNode7.isNull();
        boolean boolean13 = objectNode7.canConvertToLong();
        java.lang.Number number14 = objectNode7.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode7.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode7);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode1.retain(strArray18);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        long long22 = objectNode21.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode21.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        int int26 = objectNode25.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap27 = objectNode25._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode23.putAll(strMap27);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        long long32 = objectNode31.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode31.get(1);
        double double35 = objectNode31.doubleValue();
        boolean boolean36 = objectNode31.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        long long39 = objectNode38.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode38.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode38.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser44 = objectNode38.traverse();
        java.lang.String str45 = objectNode38.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory46);
        long long48 = objectNode47.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode47.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode47.remove("");
        boolean boolean53 = objectNode47.isMissingNode();
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode47.without((java.util.Collection<java.lang.String>) strList56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode38.retain((java.util.Collection<java.lang.String>) strList56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = objectNode31.remove((java.util.Collection<java.lang.String>) strList56);
        java.util.List<java.lang.String> strList61 = objectNode23.findValuesAsText("{\"hi!\":{\"\":{}}}", (java.util.List<java.lang.String>) strList56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = objectNode19.retain((java.util.Collection<java.lang.String>) strList61);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode19.path(0);
        boolean boolean65 = jsonNode64.isFloat();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(jsonNode41);
        org.junit.Assert.assertNull(jsonNode43);
        org.junit.Assert.assertNotNull(jsonParser44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(jsonNode50);
        org.junit.Assert.assertNull(jsonNode52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertNotNull(objectNode60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(objectNode62);
        org.junit.Assert.assertNotNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        double double6 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType7 = objectNode1.getNodeType();
        boolean boolean9 = objectNode1.has("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType10 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.remove("");
        java.lang.String str13 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        long long16 = objectNode15.longValue();
        boolean boolean17 = objectNode15.isPojo();
        boolean boolean18 = objectNode15.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        long long22 = objectNode21.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode21.get(1);
        double double25 = objectNode21.doubleValue();
        boolean boolean26 = objectNode21.isNull();
        boolean boolean27 = objectNode21.canConvertToLong();
        java.lang.Number number28 = objectNode21.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList30 = objectNode21.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode15.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode21);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        long long34 = objectNode33.longValue();
        boolean boolean35 = objectNode33.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode33.findValue("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        long long41 = objectNode40.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode40.deepCopy();
        byte[] byteArray43 = objectNode42.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor44 = objectNode42.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory45 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory45);
        int int47 = objectNode46.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap48 = objectNode46._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode42.setAll(strMap48);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        long long52 = objectNode51.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode51.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        boolean boolean58 = objectNode56.has("");
        boolean boolean59 = objectNode56.isContainerNode();
        boolean boolean60 = objectNode56.isFloatingPointNumber();
        boolean boolean61 = objectNode56.isNumber();
        boolean boolean62 = objectNode56.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = objectNode53._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode56);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory64);
        long long66 = objectNode65.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = objectNode65.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = objectNode65.remove("");
        boolean boolean71 = objectNode65.isMissingNode();
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode76 = objectNode65.without((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode63.remove((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode78 = objectNode42.remove((java.util.Collection<java.lang.String>) strList74);
        boolean boolean80 = objectNode42.hasNonNull("");
        int int81 = objectNode42.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode82 = objectNode33._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode42);
        java.lang.String[] strArray84 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode85 = objectNode42.retain(strArray84);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode86 = objectNode21.retain(strArray84);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode87 = objectNode1.retain(strArray84);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator88 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider89 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode1.serialize(jsonGenerator88, serializerProvider89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType7 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType7.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + jsonNodeType10 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType10.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(number28);
        org.junit.Assert.assertNotNull(jsonNodeList30);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNull(byteArray43);
        org.junit.Assert.assertNotNull(jsonNodeItor44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectNode63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNull(jsonNode68);
        org.junit.Assert.assertNull(jsonNode70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objectNode76);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertNotNull(objectNode78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(objectNode82);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertArrayEquals(strArray84, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode85);
        org.junit.Assert.assertNotNull(objectNode86);
        org.junit.Assert.assertNotNull(objectNode87);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        java.lang.String str8 = objectNode1.textValue();
        boolean boolean9 = objectNode1.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        boolean boolean13 = objectNode11.isPojo();
        boolean boolean14 = objectNode11.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode17.get(1);
        double double21 = objectNode17.doubleValue();
        boolean boolean22 = objectNode17.isNull();
        boolean boolean23 = objectNode17.canConvertToLong();
        java.lang.Number number24 = objectNode17.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode11.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode17);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode11.retain(strArray28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode1.retain(strArray28);
        double double32 = objectNode30.asDouble((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode8.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        boolean boolean15 = objectNode13.has("");
        boolean boolean16 = objectNode13.isContainerNode();
        boolean boolean17 = objectNode13.isFloatingPointNumber();
        boolean boolean18 = objectNode13.isNumber();
        boolean boolean19 = objectNode13.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode10._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        long long23 = objectNode22.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode22.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode22.remove("");
        boolean boolean28 = objectNode22.isMissingNode();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode22.without((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode20.remove((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode1.retain((java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList37 = objectNode1.findValuesAsText("");
        com.fasterxml.jackson.core.JsonParser jsonParser38 = objectNode1.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        long long42 = objectNode41.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode41.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode41.remove("");
        boolean boolean47 = objectNode41.isMissingNode();
        int int49 = objectNode41.asInt((int) (byte) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode1.set("", (com.fasterxml.jackson.databind.JsonNode) objectNode41);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        long long54 = objectNode53.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = objectNode53.get(1);
        double double57 = objectNode53.doubleValue();
        boolean boolean58 = objectNode53.isNull();
        com.fasterxml.jackson.databind.JsonNode jsonNode60 = objectNode53.findPath("hi!");
        boolean boolean61 = jsonNode60.isFloat();
        boolean boolean62 = jsonNode60.isInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode41.replace("", jsonNode60);
        boolean boolean64 = objectNode41.isInt();
        boolean boolean65 = objectNode41.isLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNull(jsonNode44);
        org.junit.Assert.assertNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNull(jsonNode56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jsonNode60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = objectNode1.deepCopy();
        java.util.Iterator<java.lang.String> strItor6 = objectNode1.fieldNames();
        boolean boolean7 = objectNode1.booleanValue();
        boolean boolean8 = objectNode1.isIntegralNumber();
        short short9 = objectNode1.shortValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.findPath("{\"hi!\":{}}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(objectNode5);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertNotNull(jsonNode11);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode7.get(1);
        double double11 = objectNode7.doubleValue();
        boolean boolean12 = objectNode7.isNull();
        boolean boolean13 = objectNode7.canConvertToLong();
        java.lang.Number number14 = objectNode7.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode7.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode7);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode1.retain(strArray18);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        long long23 = objectNode22.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode22.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        int int27 = objectNode26.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap28 = objectNode26._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode24.putAll(strMap28);
        long long31 = jsonNode29.asLong(0L);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList33 = jsonNode29.findParents("{\"hi!\":{\"\":{}}}");
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode19.set("{\"hi!\":{\"\":{}}}", jsonNode29);
        boolean boolean35 = objectNode19.isNumber();
        java.util.Iterator<java.lang.String> strItor36 = objectNode19.fieldNames();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode19.removeAll();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(jsonNodeList33);
        org.junit.Assert.assertNotNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strItor36);
        org.junit.Assert.assertNotNull(objectNode37);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap8 = objectNode1._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode11.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        boolean boolean18 = objectNode16.has("");
        boolean boolean19 = objectNode16.isContainerNode();
        boolean boolean20 = objectNode16.isFloatingPointNumber();
        boolean boolean21 = objectNode16.isNumber();
        boolean boolean22 = objectNode16.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode13._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode16);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        int int27 = objectNode26.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap28 = objectNode26._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode1.setAll(strMap28);
        java.lang.String str30 = objectNode1.toString();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode1.without("{\"hi!\":{}}");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList34 = objectNode1.findValues("{\"hi!\":{\"\":{}}}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "{\"hi!\":{\"\":{}}}" + "'", str30, "{\"hi!\":{\"\":{}}}");
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(jsonNodeList34);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = objectNode3.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.findValue("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap17 = objectNode3._children;
        int int18 = objectNode3.intValue();
        boolean boolean19 = objectNode3.canConvertToLong();
        boolean boolean20 = objectNode3.isFloatingPointNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode3.path("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jsonNode22);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        long long17 = objectNode16.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode16.get(1);
        double double20 = objectNode16.doubleValue();
        boolean boolean21 = objectNode16.isNull();
        boolean boolean22 = objectNode16.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap23 = objectNode16._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode26.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        boolean boolean33 = objectNode31.has("");
        boolean boolean34 = objectNode31.isContainerNode();
        boolean boolean35 = objectNode31.isFloatingPointNumber();
        boolean boolean36 = objectNode31.isNumber();
        boolean boolean37 = objectNode31.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode28._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode16.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode28);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = objectNode16.findValues("{\"hi!\":{\"\":{}}}");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList42 = objectNode3.findValues("hi!", jsonNodeList41);
        java.util.Iterator<java.lang.String> strItor43 = objectNode3.fieldNames();
        boolean boolean44 = objectNode3.isBinary();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonNodeList41);
        org.junit.Assert.assertNotNull(jsonNodeList42);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean2 = objectNode1.isPojo();
        double double3 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        double double11 = objectNode6.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType12 = objectNode6.getNodeType();
        boolean boolean14 = objectNode6.has("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        long long17 = objectNode16.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode16.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode16.remove("");
        boolean boolean22 = objectNode16.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        long long26 = objectNode25.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode25.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = objectNode25.traverse();
        boolean boolean30 = objectNode25.has((-1));
        int int31 = objectNode25.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode16.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode25);
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode16.findValue("hi!");
        boolean boolean35 = objectNode16.isIntegralNumber();
        boolean boolean36 = objectNode16.isBoolean();
        java.math.BigDecimal bigDecimal37 = objectNode16.decimalValue();
        boolean boolean38 = objectNode16.booleanValue();
        boolean boolean39 = objectNode6._childrenEqual(objectNode16);
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = objectNode1.set("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean41 = jsonNode40.booleanValue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType12 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType12.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bigDecimal37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        long long7 = objectNode6.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode6.deepCopy();
        byte[] byteArray9 = objectNode8.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor10 = objectNode8.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        int int13 = objectNode12.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap14 = objectNode12._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode8.setAll(strMap14);
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.setAll(strMap14);
        boolean boolean17 = objectNode3.isBinary();
        java.lang.String str18 = objectNode3.toString();
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = objectNode3.traverse(objectCodec19);
        long long21 = objectNode3.asLong();
        float float22 = objectNode3.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        long long26 = objectNode25.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode25.get(1);
        double double29 = objectNode25.doubleValue();
        boolean boolean30 = objectNode25.isNull();
        boolean boolean31 = objectNode25.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap32 = objectNode25._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        long long36 = objectNode35.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode35.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        boolean boolean42 = objectNode40.has("");
        boolean boolean43 = objectNode40.isContainerNode();
        boolean boolean44 = objectNode40.isFloatingPointNumber();
        boolean boolean45 = objectNode40.isNumber();
        boolean boolean46 = objectNode40.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode37._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = objectNode25.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory49);
        int int51 = objectNode50.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap52 = objectNode50._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode25.setAll(strMap52);
        java.lang.String str54 = objectNode25.toString();
        boolean boolean55 = objectNode25.booleanValue();
        com.fasterxml.jackson.core.JsonParser.NumberType numberType56 = objectNode25.numberType();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode25.removeAll();
        java.math.BigDecimal bigDecimal58 = objectNode57.decimalValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode3.put("{\"hi!\":{}}", bigDecimal58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(jsonNodeItor10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{}" + "'", str18, "{}");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertNull(jsonNode48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(jsonNode53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "{\"hi!\":{\"\":{}}}" + "'", str54, "{\"hi!\":{\"\":{}}}");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(numberType56);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNotNull(bigDecimal58);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        double double14 = objectNode10.doubleValue();
        boolean boolean15 = objectNode10.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode17.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        boolean boolean24 = objectNode22.has("");
        boolean boolean25 = objectNode22.isContainerNode();
        boolean boolean26 = objectNode22.isFloatingPointNumber();
        boolean boolean27 = objectNode22.isNumber();
        boolean boolean28 = objectNode22.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode19._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode22);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        long long32 = objectNode31.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode31.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode31.remove("");
        boolean boolean37 = objectNode31.isMissingNode();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode31.without((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode29.remove((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode10.retain((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        boolean boolean46 = objectNode10.isBinary();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode10.put("hi!", (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isFloat();
        int int5 = objectNode1.intValue();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = objectNode1.asToken();
        boolean boolean7 = objectNode1.isValueNode();
        boolean boolean8 = objectNode1.isIntegralNumber();
        boolean boolean9 = objectNode1.booleanValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        boolean boolean13 = objectNode11.isPojo();
        boolean boolean14 = objectNode11.isFloat();
        boolean boolean15 = objectNode11.isTextual();
        boolean boolean17 = objectNode11.has((int) '#');
        com.fasterxml.jackson.core.JsonParser jsonParser18 = objectNode11.traverse();
        int int20 = objectNode11.asInt((int) ' ');
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        int int23 = objectNode22.intValue();
        boolean boolean24 = objectNode22.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.get(1);
        double double31 = objectNode27.doubleValue();
        boolean boolean32 = objectNode27.isNull();
        boolean boolean33 = objectNode27.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap34 = objectNode27._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory36 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory36);
        long long38 = objectNode37.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode37.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        boolean boolean44 = objectNode42.has("");
        boolean boolean45 = objectNode42.isContainerNode();
        boolean boolean46 = objectNode42.isFloatingPointNumber();
        boolean boolean47 = objectNode42.isNumber();
        boolean boolean48 = objectNode42.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = objectNode39._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode42);
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode27.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode39);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        int int53 = objectNode52.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap54 = objectNode52._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode27.setAll(strMap54);
        java.lang.String str56 = objectNode27.toString();
        boolean boolean57 = objectNode27.booleanValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode22.put("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode27);
        boolean boolean59 = objectNode27.isBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory60 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory60);
        int int62 = objectNode61.intValue();
        boolean boolean63 = objectNode61.isContainerNode();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap64 = objectNode61._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = objectNode27.putAll(strMap64);
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = objectNode11.setAll(strMap64);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode1.setAll(strMap64);
        boolean boolean68 = objectNode1.isBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode70 = objectNode1.numberNode((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(objectNode49);
        org.junit.Assert.assertNull(jsonNode50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "{\"hi!\":{\"\":{}}}" + "'", str56, "{\"hi!\":{\"\":{}}}");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(jsonNode58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(jsonNode65);
        org.junit.Assert.assertNotNull(jsonNode66);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode10.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = objectNode10.traverse();
        boolean boolean15 = objectNode10.has((-1));
        int int16 = objectNode10.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode1.findValue("hi!");
        boolean boolean20 = objectNode1.isIntegralNumber();
        boolean boolean21 = objectNode1.isBoolean();
        java.math.BigDecimal bigDecimal22 = objectNode1.decimalValue();
        boolean boolean23 = objectNode1.booleanValue();
        float float24 = objectNode1.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode26.deepCopy();
        byte[] byteArray29 = objectNode28.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor30 = objectNode28.elements();
        java.lang.String str31 = objectNode28.toString();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        boolean boolean35 = objectNode33.has("");
        boolean boolean36 = objectNode33.isContainerNode();
        boolean boolean37 = objectNode33.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory38 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory38);
        int int40 = objectNode39.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap41 = objectNode39._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode33.setAll(strMap41);
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode28.setAll(objectNode33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode33.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory45 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory45);
        long long47 = objectNode46.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode46.get(1);
        double double50 = objectNode46.doubleValue();
        boolean boolean51 = objectNode46.isNull();
        boolean boolean52 = objectNode46.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap53 = objectNode46._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        long long57 = objectNode56.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode56.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory60 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory60);
        boolean boolean63 = objectNode61.has("");
        boolean boolean64 = objectNode61.isContainerNode();
        boolean boolean65 = objectNode61.isFloatingPointNumber();
        boolean boolean66 = objectNode61.isNumber();
        boolean boolean67 = objectNode61.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = objectNode58._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode61);
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = objectNode46.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode58);
        java.util.List<java.lang.String> strList71 = objectNode46.findValuesAsText("{\"hi!\":{\"\":{}}}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode44.remove((java.util.Collection<java.lang.String>) strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode1.retain((java.util.Collection<java.lang.String>) strList71);
        int int74 = objectNode73.asInt();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bigDecimal22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertNull(byteArray29);
        org.junit.Assert.assertNotNull(jsonNodeItor30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{}" + "'", str31, "{}");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNull(jsonNode49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectNode68);
        org.junit.Assert.assertNull(jsonNode69);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        boolean boolean6 = objectNode1.isNumber();
        boolean boolean7 = objectNode1.isBigDecimal();
        boolean boolean8 = objectNode1.isArray();
        java.lang.String[] strArray12 = new java.lang.String[] { "{\"hi!\":{\"\":{}}}", "{\"hi!\":{\"\":{}}}", "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode1.retain(strArray12);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = objectNode1.traverse();
        boolean boolean15 = objectNode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.path((int) (byte) 0);
        long long18 = objectNode1.asLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap19 = objectNode1._children;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "{\"hi!\":{\"\":{}}}", "{\"hi!\":{\"\":{}}}", "" });
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isContainerNode();
        int int8 = objectNode1.asInt(0);
        java.util.List<java.lang.String> strList10 = objectNode1.findValuesAsText("{\"hi!\":{}}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = objectNode3.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.findValue("");
        boolean boolean17 = objectNode3.isBinary();
        java.lang.String str18 = objectNode3.toString();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode3.deepCopy();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"\":{}}" + "'", str18, "{\"\":{}}");
        org.junit.Assert.assertNotNull(objectNode19);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        boolean boolean9 = objectNode1.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.without("{\"hi!\":{\"\":{}}}");
        long long12 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        long long17 = objectNode16.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode16.get(1);
        boolean boolean20 = objectNode16.isInt();
        float float21 = objectNode16.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        long long24 = objectNode23.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode23.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        int int28 = objectNode27.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap29 = objectNode27._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode25.putAll(strMap29);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode25.without("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        long long35 = objectNode34.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode34.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory38 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory38);
        boolean boolean41 = objectNode39.has("");
        boolean boolean42 = objectNode39.isContainerNode();
        boolean boolean43 = objectNode39.isFloatingPointNumber();
        boolean boolean44 = objectNode39.isNumber();
        boolean boolean45 = objectNode39.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode36._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode39);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory47 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory47);
        long long49 = objectNode48.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = objectNode48.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode48.remove("");
        boolean boolean54 = objectNode48.isMissingNode();
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode48.without((java.util.Collection<java.lang.String>) strList57);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = objectNode46.remove((java.util.Collection<java.lang.String>) strList57);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory61 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory61);
        long long63 = objectNode62.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = objectNode62.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode62.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser68 = objectNode62.traverse();
        java.lang.String str69 = objectNode62.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory70 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory70);
        long long72 = objectNode71.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode74 = objectNode71.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = objectNode71.remove("");
        boolean boolean77 = objectNode71.isMissingNode();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode82 = objectNode71.without((java.util.Collection<java.lang.String>) strList80);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode83 = objectNode62.retain((java.util.Collection<java.lang.String>) strList80);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode84 = objectNode60.remove((java.util.Collection<java.lang.String>) strList80);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode85 = objectNode25.retain((java.util.Collection<java.lang.String>) strList80);
        boolean boolean86 = objectNode25.isInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode87 = objectNode16.setAll(objectNode25);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode88 = objectNode13._put("hi!", jsonNode87);
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = objectNode88.findValue("hi!");
        byte[] byteArray91 = objectNode88.binaryValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode94 = objectNode88.put("{\"hi!\":{}}", (java.lang.Short) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(jsonNode30);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNull(jsonNode51);
        org.junit.Assert.assertNull(jsonNode53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertNotNull(objectNode60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNull(jsonNode65);
        org.junit.Assert.assertNull(jsonNode67);
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNull(jsonNode74);
        org.junit.Assert.assertNull(jsonNode76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objectNode82);
        org.junit.Assert.assertNotNull(objectNode83);
        org.junit.Assert.assertNotNull(objectNode84);
        org.junit.Assert.assertNotNull(objectNode85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jsonNode87);
        org.junit.Assert.assertNotNull(objectNode88);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertNull(byteArray91);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode1.without("");
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor8 = objectNode1.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        double double14 = objectNode10.doubleValue();
        boolean boolean15 = objectNode10.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode17.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        boolean boolean24 = objectNode22.has("");
        boolean boolean25 = objectNode22.isContainerNode();
        boolean boolean26 = objectNode22.isFloatingPointNumber();
        boolean boolean27 = objectNode22.isNumber();
        boolean boolean28 = objectNode22.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode19._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode22);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        long long32 = objectNode31.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode31.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode31.remove("");
        boolean boolean37 = objectNode31.isMissingNode();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode31.without((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode29.remove((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode10.retain((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode1.retain((java.util.Collection<java.lang.String>) strList40);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor46 = objectNode1.iterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode7);
        org.junit.Assert.assertNotNull(strEntryItor8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(jsonNodeItor46);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode1.findPath("hi!");
        boolean boolean9 = objectNode1.isNumber();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode1.deepCopy();
        short short11 = objectNode1.shortValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        long long14 = objectNode13.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode13.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        boolean boolean20 = objectNode18.has("");
        boolean boolean21 = objectNode18.isContainerNode();
        boolean boolean22 = objectNode18.isFloatingPointNumber();
        boolean boolean23 = objectNode18.isNumber();
        boolean boolean24 = objectNode18.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode15._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        java.util.Iterator<java.lang.String> strItor26 = objectNode15.fieldNames();
        boolean boolean27 = objectNode15.isContainerNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode1.setAll(objectNode15);
        double double29 = objectNode1.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        boolean boolean6 = objectNode1.has((-1));
        int int7 = objectNode1.asInt();
        boolean boolean9 = objectNode1.hasNonNull((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        long long13 = objectNode12.longValue();
        boolean boolean14 = objectNode12.isPojo();
        int int15 = objectNode12.size();
        boolean boolean16 = objectNode10._childrenEqual(objectNode12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode19.remove("");
        boolean boolean25 = objectNode19.isMissingNode();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode19.without((java.util.Collection<java.lang.String>) strList28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode10._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode30);
        double double32 = objectNode31.asDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode31.findValue("{}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(jsonNode34);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        boolean boolean9 = objectNode7.isPojo();
        boolean boolean10 = objectNode7.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        long long14 = objectNode13.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode13.get(1);
        double double17 = objectNode13.doubleValue();
        boolean boolean18 = objectNode13.isNull();
        boolean boolean19 = objectNode13.canConvertToLong();
        java.lang.Number number20 = objectNode13.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList22 = objectNode13.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode7.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        java.lang.String[] strArray24 = new java.lang.String[] {};
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode7.retain(strArray24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode1.retain(strArray24);
        int int27 = objectNode26.size();
        boolean boolean29 = objectNode26.hasNonNull("");
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode26.without("{\"hi!\":{}}");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(number20);
        org.junit.Assert.assertNotNull(jsonNodeList22);
        org.junit.Assert.assertNull(jsonNode23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jsonNode31);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isInt();
        boolean boolean5 = objectNode1.isFloat();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = objectNode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode1.remove("{}");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode1.without("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        long long13 = objectNode12.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode12.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode12.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser18 = objectNode12.traverse();
        java.lang.String str19 = objectNode12.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        long long22 = objectNode21.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode21.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode21.remove("");
        boolean boolean27 = objectNode21.isMissingNode();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode21.without((java.util.Collection<java.lang.String>) strList30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode12.retain((java.util.Collection<java.lang.String>) strList30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode1.remove((java.util.Collection<java.lang.String>) strList30);
        int int35 = objectNode1.intValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertNull(jsonNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isFloat();
        int int5 = objectNode1.intValue();
        com.fasterxml.jackson.core.JsonToken jsonToken6 = objectNode1.asToken();
        boolean boolean7 = objectNode1.isValueNode();
        boolean boolean8 = objectNode1.isIntegralNumber();
        boolean boolean9 = objectNode1.asBoolean();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode1.put("{\"\":{}}", (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = objectNode1.elements();
        boolean boolean8 = objectNode1.hasNonNull("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        double double14 = objectNode10.doubleValue();
        boolean boolean15 = objectNode10.isNull();
        boolean boolean16 = objectNode10.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap17 = objectNode10._children;
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap18 = objectNode10._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode1.putAll(strMap18);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode1.remove("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap22 = objectNode1._children;
        java.lang.Number number23 = objectNode1.numberValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(jsonNode19);
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(number23);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode3.elements();
        java.lang.String str6 = objectNode3.toString();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        boolean boolean10 = objectNode8.has("");
        boolean boolean11 = objectNode8.isContainerNode();
        boolean boolean12 = objectNode8.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        int int15 = objectNode14.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap16 = objectNode14._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode8.setAll(strMap16);
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode3.setAll(objectNode8);
        int int19 = objectNode3.intValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode3.objectNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "{}" + "'", str6, "{}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        boolean boolean5 = objectNode1.isNull();
        com.fasterxml.jackson.databind.JsonNode jsonNode7 = objectNode1.get("{}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jsonNode7);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = objectNode3.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.findValue("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap17 = objectNode3._children;
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor18 = objectNode3.iterator();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode3.findParents("");
        double double21 = objectNode3.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(jsonNodeItor18);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap8 = objectNode1._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode11.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        boolean boolean18 = objectNode16.has("");
        boolean boolean19 = objectNode16.isContainerNode();
        boolean boolean20 = objectNode16.isFloatingPointNumber();
        boolean boolean21 = objectNode16.isNumber();
        boolean boolean22 = objectNode16.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode13._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode16);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        boolean boolean25 = objectNode13.isBigInteger();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        long long29 = objectNode28.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode28.get(1);
        double double32 = objectNode28.doubleValue();
        boolean boolean33 = objectNode28.isNull();
        boolean boolean34 = objectNode28.canConvertToLong();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory35);
        long long37 = objectNode36.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode36.get(1);
        double double40 = objectNode36.doubleValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode36.without("");
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode28.setAll(objectNode36);
        boolean boolean44 = objectNode28.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode28.remove("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode13._put("", jsonNode46);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode47.put("{}", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(jsonNode39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(jsonNode46);
        org.junit.Assert.assertNotNull(objectNode47);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        double double6 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType7 = objectNode1.getNodeType();
        boolean boolean9 = objectNode1.has("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType10 = objectNode1.getNodeType();
        boolean boolean12 = objectNode1.has((int) (short) 10);
        boolean boolean13 = objectNode1.isFloatingPointNumber();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode1.setAll(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType7 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType7.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + jsonNodeType10 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType10.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isFloat();
        int int5 = objectNode1.intValue();
        boolean boolean6 = objectNode1.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        long long10 = objectNode9.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode9.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        boolean boolean16 = objectNode14.has("");
        boolean boolean17 = objectNode14.isContainerNode();
        boolean boolean18 = objectNode14.isFloatingPointNumber();
        boolean boolean19 = objectNode14.isNumber();
        boolean boolean20 = objectNode14.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode11._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        long long24 = objectNode23.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode23.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode23.remove("");
        boolean boolean29 = objectNode23.isMissingNode();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode23.without((java.util.Collection<java.lang.String>) strList32);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode21.remove((java.util.Collection<java.lang.String>) strList32);
        java.util.List<java.lang.String> strList36 = objectNode1.findValuesAsText("{\"hi!\":{\"\":{}}}", (java.util.List<java.lang.String>) strList32);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        long long39 = objectNode38.longValue();
        boolean boolean40 = objectNode38.isPojo();
        boolean boolean41 = objectNode38.isFloat();
        int int42 = objectNode38.intValue();
        boolean boolean43 = objectNode38.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory45 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory45);
        long long47 = objectNode46.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = objectNode46.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        boolean boolean53 = objectNode51.has("");
        boolean boolean54 = objectNode51.isContainerNode();
        boolean boolean55 = objectNode51.isFloatingPointNumber();
        boolean boolean56 = objectNode51.isNumber();
        boolean boolean57 = objectNode51.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode48._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode51);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory59 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory59);
        long long61 = objectNode60.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode60.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = objectNode60.remove("");
        boolean boolean66 = objectNode60.isMissingNode();
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = objectNode60.without((java.util.Collection<java.lang.String>) strList69);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode58.remove((java.util.Collection<java.lang.String>) strList69);
        java.util.List<java.lang.String> strList73 = objectNode38.findValuesAsText("{\"hi!\":{\"\":{}}}", (java.util.List<java.lang.String>) strList69);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode1.retain((java.util.Collection<java.lang.String>) strList69);
        long long75 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory76 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory76);
        long long78 = objectNode77.longValue();
        boolean boolean79 = objectNode77.isBigInteger();
        com.fasterxml.jackson.core.JsonParser jsonParser80 = objectNode77.traverse();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.POJONode pOJONode81 = objectNode1.POJONode((java.lang.Object) objectNode77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(jsonNode26);
        org.junit.Assert.assertNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(objectNode48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertNull(jsonNode65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(objectNode71);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jsonParser80);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode3.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        int int8 = objectNode7.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode7._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode3.setAll(strMap9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = objectNode3.traverse();
        long long12 = objectNode3.longValue();
        boolean boolean13 = objectNode3.canConvertToLong();
        java.lang.Number number14 = objectNode3.numberValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        long long17 = objectNode16.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode16.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        int int21 = objectNode20.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap22 = objectNode20._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode18.putAll(strMap22);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        long long26 = objectNode25.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode25.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode25.remove("");
        boolean boolean31 = objectNode25.isMissingNode();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode25.without((java.util.Collection<java.lang.String>) strList34);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        long long39 = objectNode38.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode38.get(1);
        double double42 = objectNode38.doubleValue();
        boolean boolean43 = objectNode38.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory44 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory44);
        long long46 = objectNode45.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode45.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory49);
        boolean boolean52 = objectNode50.has("");
        boolean boolean53 = objectNode50.isContainerNode();
        boolean boolean54 = objectNode50.isFloatingPointNumber();
        boolean boolean55 = objectNode50.isNumber();
        boolean boolean56 = objectNode50.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode47._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode50);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory58);
        long long60 = objectNode59.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = objectNode59.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode59.remove("");
        boolean boolean65 = objectNode59.isMissingNode();
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = objectNode59.without((java.util.Collection<java.lang.String>) strList68);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = objectNode57.remove((java.util.Collection<java.lang.String>) strList68);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode38.retain((java.util.Collection<java.lang.String>) strList68);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode25.without((java.util.Collection<java.lang.String>) strList68);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode18.without((java.util.Collection<java.lang.String>) strList68);
        boolean boolean75 = objectNode3.equals((java.lang.Object) objectNode18);
        boolean boolean77 = objectNode3.asBoolean(false);
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = objectNode3.remove("hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(jsonNode28);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(jsonNode41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNull(jsonNode62);
        org.junit.Assert.assertNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objectNode70);
        org.junit.Assert.assertNotNull(objectNode71);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(jsonNode79);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode10.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = objectNode10.traverse();
        boolean boolean15 = objectNode10.has((-1));
        int int16 = objectNode10.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        java.math.BigDecimal bigDecimal18 = objectNode10.decimalValue();
        short short19 = objectNode10.shortValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode21 = objectNode10.numberNode((short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = objectNode1.findValue("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode8.deepCopy();
        byte[] byteArray11 = objectNode10.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = objectNode10.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        int int15 = objectNode14.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap16 = objectNode14._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode10.setAll(strMap16);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode19.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode21._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode24);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        long long34 = objectNode33.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode33.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode33.remove("");
        boolean boolean39 = objectNode33.isMissingNode();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode33.without((java.util.Collection<java.lang.String>) strList42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode31.remove((java.util.Collection<java.lang.String>) strList42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode10.remove((java.util.Collection<java.lang.String>) strList42);
        boolean boolean48 = objectNode10.hasNonNull("");
        int int49 = objectNode10.intValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode1._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        java.lang.String[] strArray52 = new java.lang.String[] { "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode10.retain(strArray52);
        long long55 = objectNode10.asLong(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        int int5 = objectNode1.asInt((int) (short) 1);
        boolean boolean6 = objectNode1.isContainerNode();
        java.math.BigDecimal bigDecimal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = objectNode1.put("{}", bigDecimal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        boolean boolean4 = objectNode2.has("");
        boolean boolean5 = objectNode2.isContainerNode();
        boolean boolean6 = objectNode2.isFloatingPointNumber();
        boolean boolean7 = objectNode2.isNumber();
        boolean boolean8 = objectNode2.isBigDecimal();
        boolean boolean9 = objectNode2.isArray();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap10);
        com.fasterxml.jackson.core.JsonToken jsonToken12 = objectNode11.asToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode14 = objectNode11.numberNode((java.lang.Long) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        java.lang.String str8 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode10.remove("");
        boolean boolean16 = objectNode10.isMissingNode();
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode10.without((java.util.Collection<java.lang.String>) strList19);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode1.retain((java.util.Collection<java.lang.String>) strList19);
        double double23 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        long long26 = objectNode25.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode25.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        boolean boolean32 = objectNode30.has("");
        boolean boolean33 = objectNode30.isContainerNode();
        boolean boolean34 = objectNode30.isFloatingPointNumber();
        boolean boolean35 = objectNode30.isNumber();
        boolean boolean36 = objectNode30.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode27._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode30);
        boolean boolean38 = objectNode37.isMissingNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode1.setAll(objectNode37);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode41 = objectNode37.numberNode((java.lang.Short) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertNull(jsonNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonNode39);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode8.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        boolean boolean15 = objectNode13.has("");
        boolean boolean16 = objectNode13.isContainerNode();
        boolean boolean17 = objectNode13.isFloatingPointNumber();
        boolean boolean18 = objectNode13.isNumber();
        boolean boolean19 = objectNode13.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode10._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode13);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        long long23 = objectNode22.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode22.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode22.remove("");
        boolean boolean28 = objectNode22.isMissingNode();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode22.without((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode20.remove((java.util.Collection<java.lang.String>) strList31);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode1.retain((java.util.Collection<java.lang.String>) strList31);
        java.util.List<java.lang.String> strList37 = objectNode1.findValuesAsText("");
        com.fasterxml.jackson.core.JsonParser jsonParser38 = objectNode1.traverse();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode1.put("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}", (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objectNode33);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(jsonParser38);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        boolean boolean9 = objectNode1.isArray();
        java.util.Iterator<java.lang.String> strItor10 = objectNode1.fieldNames();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode1.serialize(jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isFloat();
        boolean boolean5 = objectNode1.isTextual();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode8.deepCopy();
        byte[] byteArray11 = objectNode10.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor12 = objectNode10.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        int int15 = objectNode14.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap16 = objectNode14._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode10.setAll(strMap16);
        boolean boolean18 = objectNode10.isBoolean();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode10.findValues("{}");
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode1.set("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        long long25 = objectNode24.longValue();
        boolean boolean26 = objectNode24.isBigInteger();
        boolean boolean27 = objectNode24.isArray();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode10.replace("{\"\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(jsonNodeItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jsonNode28);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.putAll(objectNode6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        long long15 = objectNode14.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode14.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode14.remove("");
        boolean boolean20 = objectNode14.isMissingNode();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = objectNode14.asToken();
        boolean boolean22 = objectNode1._childrenEqual(objectNode14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        boolean boolean31 = objectNode14._childrenEqual(objectNode24);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = objectNode24.findParent("{}");
        java.util.List<java.lang.String> strList35 = objectNode24.findValuesAsText("hi!");
        boolean boolean36 = objectNode24.isContainerNode();
        java.math.BigInteger bigInteger37 = objectNode24.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(objectNode33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(bigInteger37);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        boolean boolean4 = objectNode3.isBigInteger();
        double double6 = objectNode3.asDouble(0.0d);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList10 = objectNode8.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory12 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory12);
        long long14 = objectNode13.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode13.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        boolean boolean20 = objectNode18.has("");
        boolean boolean21 = objectNode18.isContainerNode();
        boolean boolean22 = objectNode18.isFloatingPointNumber();
        boolean boolean23 = objectNode18.isNumber();
        boolean boolean24 = objectNode18.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = objectNode15._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode27.remove("");
        boolean boolean33 = objectNode27.isMissingNode();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode27.without((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode25.remove((java.util.Collection<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList40 = objectNode8.findValuesAsText("", (java.util.List<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode3.without((java.util.Collection<java.lang.String>) strList40);
        java.lang.String str42 = objectNode41.textValue();
        double double43 = objectNode41.doubleValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec44 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser45 = objectNode41.traverse(objectCodec44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNodeList10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectNode25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(objectNode41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(jsonParser45);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        boolean boolean4 = objectNode2.has("");
        boolean boolean5 = objectNode2.isContainerNode();
        boolean boolean6 = objectNode2.isFloatingPointNumber();
        boolean boolean7 = objectNode2.isNumber();
        boolean boolean8 = objectNode2.isBigDecimal();
        boolean boolean9 = objectNode2.isArray();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap10);
        boolean boolean13 = objectNode11.has(97);
        boolean boolean14 = objectNode11.isArray();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode16 = objectNode11.numberNode(32.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap3 = objectNode1._children;
        com.fasterxml.jackson.core.ObjectCodec objectCodec4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = objectNode1.traverse(objectCodec4);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        java.lang.String str9 = objectNode7.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType10 = objectNode7.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        boolean boolean14 = objectNode12.has("");
        boolean boolean15 = objectNode12.isContainerNode();
        boolean boolean16 = objectNode12.isFloatingPointNumber();
        boolean boolean17 = objectNode12.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode7.putAll(objectNode12);
        int int19 = objectNode12.intValue();
        boolean boolean20 = objectNode12.isArray();
        java.lang.String str21 = objectNode12.asText();
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode12.get("");
        boolean boolean24 = objectNode1._childrenEqual(objectNode12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        int int27 = objectNode26.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap28 = objectNode26._children;
        long long29 = objectNode26.asLong();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList31 = objectNode26.findParents("{}");
        java.util.List<java.lang.String> strList33 = objectNode26.findValuesAsText("{}");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode12.retain((java.util.Collection<java.lang.String>) strList33);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.BooleanNode booleanNode36 = objectNode12.booleanNode(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + jsonNodeType10 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType10.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(jsonNodeList31);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(objectNode34);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode3.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        int int8 = objectNode7.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode7._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode3.setAll(strMap9);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = objectNode3.traverse();
        long long12 = objectNode3.longValue();
        java.util.List<java.lang.String> strList14 = objectNode3.findValuesAsText("{}");
        int int15 = objectNode3.asInt();
        boolean boolean16 = objectNode3.canConvertToLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode3.findParent("{\"hi!\":{\"\":{}}}");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = objectNode18.isLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objectNode18);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        boolean boolean9 = objectNode1.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.without("{\"hi!\":{\"\":{}}}");
        long long12 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode1.without("");
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor16 = jsonNode15.iterator();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNodeItor16);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        boolean boolean6 = objectNode1.isNumber();
        boolean boolean7 = objectNode1.isBigDecimal();
        boolean boolean8 = objectNode1.isArray();
        java.lang.String[] strArray12 = new java.lang.String[] { "{\"hi!\":{\"\":{}}}", "{\"hi!\":{\"\":{}}}", "" };
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode1.retain(strArray12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        long long16 = objectNode15.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode15.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode15.remove("");
        boolean boolean21 = objectNode15.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        long long25 = objectNode24.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode24.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser27 = objectNode24.traverse();
        boolean boolean29 = objectNode24.has((-1));
        int int30 = objectNode24.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode15.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode24);
        long long33 = objectNode24.asLong((long) 100);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        int int36 = objectNode35.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap37 = objectNode35._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode24.setAll(strMap37);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode1.putAll(strMap37);
        java.math.BigInteger bigInteger40 = jsonNode39.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "{\"hi!\":{\"\":{}}}", "{\"hi!\":{\"\":{}}}", "" });
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(jsonNode38);
        org.junit.Assert.assertNotNull(jsonNode39);
        org.junit.Assert.assertNotNull(bigInteger40);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap5 = objectNode1._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        boolean boolean9 = objectNode7.isBigInteger();
        int int11 = objectNode7.asInt((int) (short) -1);
        boolean boolean12 = objectNode7.isNumber();
        boolean boolean13 = objectNode1._childrenEqual(objectNode7);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        long long16 = objectNode15.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode15.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode15.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser21 = objectNode15.traverse();
        boolean boolean22 = objectNode15.isBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        long long26 = objectNode25.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode28 = objectNode25.get(1);
        double double29 = objectNode25.doubleValue();
        boolean boolean30 = objectNode25.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        long long33 = objectNode32.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = objectNode32.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory36 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory36);
        boolean boolean39 = objectNode37.has("");
        boolean boolean40 = objectNode37.isContainerNode();
        boolean boolean41 = objectNode37.isFloatingPointNumber();
        boolean boolean42 = objectNode37.isNumber();
        boolean boolean43 = objectNode37.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode34._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode37);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory45 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory45);
        long long47 = objectNode46.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode46.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = objectNode46.remove("");
        boolean boolean52 = objectNode46.isMissingNode();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode46.without((java.util.Collection<java.lang.String>) strList55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode44.remove((java.util.Collection<java.lang.String>) strList55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = objectNode25.retain((java.util.Collection<java.lang.String>) strList55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = objectNode15._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode59);
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = objectNode15.path((int) ' ');
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap63 = objectNode15._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode1.putAll(strMap63);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(jsonNode18);
        org.junit.Assert.assertNull(jsonNode20);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(jsonNode28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(objectNode34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNull(jsonNode49);
        org.junit.Assert.assertNull(jsonNode51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertNotNull(objectNode59);
        org.junit.Assert.assertNotNull(objectNode60);
        org.junit.Assert.assertNotNull(jsonNode62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(jsonNode64);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        boolean boolean4 = objectNode2.has("");
        boolean boolean5 = objectNode2.isContainerNode();
        boolean boolean6 = objectNode2.isFloatingPointNumber();
        boolean boolean7 = objectNode2.isNumber();
        boolean boolean8 = objectNode2.isBigDecimal();
        boolean boolean9 = objectNode2.isArray();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap10);
        java.util.Iterator<java.lang.String> strItor12 = objectNode11.fieldNames();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        long long16 = objectNode15.longValue();
        boolean boolean17 = objectNode15.isBigInteger();
        int int19 = objectNode15.asInt((int) (short) -1);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode15.removeAll();
        boolean boolean21 = objectNode15.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode11.set("", (com.fasterxml.jackson.databind.JsonNode) objectNode15);
        boolean boolean23 = objectNode11.isMissingNode();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode11.removeAll();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isInt();
        java.lang.String str5 = objectNode1.toString();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode8.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode8.remove("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        long long17 = objectNode16.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode16.get(1);
        double double20 = objectNode16.doubleValue();
        boolean boolean21 = objectNode16.isNull();
        boolean boolean22 = objectNode16.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap23 = objectNode16._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = objectNode26.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        boolean boolean33 = objectNode31.has("");
        boolean boolean34 = objectNode31.isContainerNode();
        boolean boolean35 = objectNode31.isFloatingPointNumber();
        boolean boolean36 = objectNode31.isNumber();
        boolean boolean37 = objectNode31.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode28._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode31);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode16.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode28);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList41 = objectNode16.findValues("{\"hi!\":{\"\":{}}}");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList42 = objectNode8.findParents("{\"hi!\":{\"\":{}}}", jsonNodeList41);
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType43 = objectNode8.getNodeType();
        long long45 = objectNode8.asLong((long) (byte) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode1.replace("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode8);
        int int47 = objectNode1.intValue();
        boolean boolean48 = objectNode1.isObject();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{}" + "'", str5, "{}");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(objectNode28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonNodeList41);
        org.junit.Assert.assertNotNull(jsonNodeList42);
        org.junit.Assert.assertTrue("'" + jsonNodeType43 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType43.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = objectNode3.findValue("{\"hi!\":{\"\":{}}}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(jsonNode5);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = objectNode3.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.findValue("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        long long19 = objectNode18.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode18.get(1);
        double double22 = objectNode18.doubleValue();
        boolean boolean23 = objectNode18.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        long long26 = objectNode25.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = objectNode25.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory29 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory29);
        boolean boolean32 = objectNode30.has("");
        boolean boolean33 = objectNode30.isContainerNode();
        boolean boolean34 = objectNode30.isFloatingPointNumber();
        boolean boolean35 = objectNode30.isNumber();
        boolean boolean36 = objectNode30.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode27._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode30);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory38 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory38);
        long long40 = objectNode39.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode39.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode39.remove("");
        boolean boolean45 = objectNode39.isMissingNode();
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode39.without((java.util.Collection<java.lang.String>) strList48);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = objectNode37.remove((java.util.Collection<java.lang.String>) strList48);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode18.retain((java.util.Collection<java.lang.String>) strList48);
        java.util.List<java.lang.String> strList54 = objectNode18.findValuesAsText("");
        com.fasterxml.jackson.core.JsonParser jsonParser55 = objectNode18.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory57);
        long long59 = objectNode58.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = objectNode58.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode58.remove("");
        boolean boolean64 = objectNode58.isMissingNode();
        int int66 = objectNode58.asInt((int) (byte) 10);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode18.set("", (com.fasterxml.jackson.databind.JsonNode) objectNode58);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory69 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory69);
        long long71 = objectNode70.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode73 = objectNode70.get(1);
        double double74 = objectNode70.doubleValue();
        boolean boolean75 = objectNode70.isNull();
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = objectNode70.findPath("hi!");
        boolean boolean78 = jsonNode77.isFloat();
        boolean boolean79 = jsonNode77.isInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode80 = objectNode58.replace("", jsonNode77);
        java.lang.String[] strArray82 = new java.lang.String[] { "{\"hi!\":{\"\":{}}}" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode85 = objectNode58.remove((java.util.Collection<java.lang.String>) strList83);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode86 = objectNode3.without((java.util.Collection<java.lang.String>) strList83);
        boolean boolean87 = objectNode86.isFloat();
        com.fasterxml.jackson.core.JsonToken jsonToken88 = objectNode86.asToken();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType89 = objectNode86.getNodeType();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(objectNode27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNull(jsonNode42);
        org.junit.Assert.assertNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertNotNull(objectNode51);
        org.junit.Assert.assertNotNull(objectNode52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(jsonParser55);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNull(jsonNode61);
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNull(jsonNode73);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(jsonNode80);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "{\"hi!\":{\"\":{}}}" });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(objectNode85);
        org.junit.Assert.assertNotNull(objectNode86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + jsonToken88 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken88.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + jsonNodeType89 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType89.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        long long3 = objectNode2.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = objectNode2.get(1);
        double double6 = objectNode2.doubleValue();
        boolean boolean7 = objectNode2.isNull();
        boolean boolean8 = objectNode2.canConvertToLong();
        double double9 = objectNode2.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode11.deepCopy();
        boolean boolean14 = objectNode13.isBigInteger();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap15 = objectNode13._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode2.setAll(strMap15);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap15);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(jsonNode5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        long long10 = objectNode9.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode9.get(1);
        double double13 = objectNode9.doubleValue();
        boolean boolean14 = objectNode9.isNull();
        boolean boolean15 = objectNode9.canConvertToLong();
        java.lang.Number number16 = objectNode9.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList18 = objectNode9.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = objectNode1.findValues("hi!", jsonNodeList18);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode1.findParent("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser22 = objectNode1.traverse();
        boolean boolean23 = objectNode1.isLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(number16);
        org.junit.Assert.assertNotNull(jsonNodeList18);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNull(objectNode21);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        double double6 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType7 = objectNode1.getNodeType();
        boolean boolean9 = objectNode1.has("hi!");
        boolean boolean11 = objectNode1.has((int) (byte) -1);
        boolean boolean12 = objectNode1.isFloat();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode1.put("{\"hi!\":{\"\":{}}}", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType7 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType7.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode10.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = objectNode10.traverse();
        boolean boolean15 = objectNode10.has((-1));
        int int16 = objectNode10.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        java.util.Iterator<java.lang.String> strItor18 = objectNode10.fieldNames();
        int int19 = objectNode10.asInt();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = objectNode10.traverse();
        boolean boolean22 = objectNode10.asBoolean(false);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode10.get("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}");
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode10.without("{}");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap27 = objectNode10._children;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        boolean boolean5 = objectNode1.isNumber();
        boolean boolean6 = objectNode1.isValueNode();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory4 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode5 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory4);
        int int6 = objectNode5.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap7 = objectNode5._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode3.putAll(strMap7);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode11.get(1);
        double double15 = objectNode11.doubleValue();
        boolean boolean16 = objectNode11.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        long long19 = objectNode18.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode18.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode18.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser24 = objectNode18.traverse();
        java.lang.String str25 = objectNode18.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode27.remove("");
        boolean boolean33 = objectNode27.isMissingNode();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode27.without((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode18.retain((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode11.remove((java.util.Collection<java.lang.String>) strList36);
        java.util.List<java.lang.String> strList41 = objectNode3.findValuesAsText("{\"hi!\":{\"\":{}}}", (java.util.List<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        long long44 = objectNode43.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode43.get(1);
        double double47 = objectNode43.doubleValue();
        boolean boolean48 = objectNode43.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory49);
        long long51 = objectNode50.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode50.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode50.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser56 = objectNode50.traverse();
        java.lang.String str57 = objectNode50.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory58);
        long long60 = objectNode59.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode62 = objectNode59.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode59.remove("");
        boolean boolean65 = objectNode59.isMissingNode();
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = objectNode59.without((java.util.Collection<java.lang.String>) strList68);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = objectNode50.retain((java.util.Collection<java.lang.String>) strList68);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = objectNode43.remove((java.util.Collection<java.lang.String>) strList68);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory73 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory73);
        long long75 = objectNode74.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap76 = objectNode74._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode77 = objectNode43.setAll(strMap76);
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = objectNode3.setAll(strMap76);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode80 = objectNode3.numberNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertNull(jsonNode23);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNull(jsonNode53);
        org.junit.Assert.assertNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNull(jsonNode62);
        org.junit.Assert.assertNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(objectNode70);
        org.junit.Assert.assertNotNull(objectNode71);
        org.junit.Assert.assertNotNull(objectNode72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNotNull(jsonNode77);
        org.junit.Assert.assertNotNull(jsonNode78);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode7.get(1);
        double double11 = objectNode7.doubleValue();
        boolean boolean12 = objectNode7.isNull();
        boolean boolean13 = objectNode7.canConvertToLong();
        java.lang.Number number14 = objectNode7.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode7.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode7);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor18 = objectNode7.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        long long22 = objectNode21.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode21.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = objectNode21.traverse();
        boolean boolean26 = objectNode21.has((-1));
        int int27 = objectNode21.asInt();
        boolean boolean29 = objectNode21.hasNonNull((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode21.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode7.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode21);
        boolean boolean32 = objectNode7.isShort();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        long long35 = objectNode34.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode34.get(1);
        boolean boolean38 = objectNode34.isInt();
        float float39 = objectNode34.floatValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = objectNode7.setAll(objectNode34);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode34.path((int) (byte) 10);
        boolean boolean43 = objectNode34.isBoolean();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode34.removeAll();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strEntryItor18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectNode44);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        boolean boolean8 = objectNode1.isBinary();
        java.util.List<java.lang.String> strList10 = objectNode1.findValuesAsText("hi!");
        boolean boolean11 = objectNode1.isFloatingPointNumber();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode10.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = objectNode10.traverse();
        boolean boolean15 = objectNode10.has((-1));
        int int16 = objectNode10.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        java.util.Iterator<java.lang.String> strItor18 = objectNode10.fieldNames();
        int int19 = objectNode10.asInt();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = objectNode10.traverse();
        boolean boolean22 = objectNode10.asBoolean(false);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        java.lang.String str28 = objectNode26.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType29 = objectNode26.getNodeType();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap30 = objectNode26._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24, strMap30);
        double double32 = objectNode31.asDouble();
        java.lang.String str33 = objectNode31.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory35 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory35);
        long long37 = objectNode36.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode36.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        int int41 = objectNode40.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap42 = objectNode40._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode38.putAll(strMap42);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory45 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory45);
        long long47 = objectNode46.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode46.get(1);
        double double50 = objectNode46.doubleValue();
        boolean boolean51 = objectNode46.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        long long54 = objectNode53.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = objectNode53.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode53.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser59 = objectNode53.traverse();
        java.lang.String str60 = objectNode53.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory61 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory61);
        long long63 = objectNode62.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = objectNode62.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode62.remove("");
        boolean boolean68 = objectNode62.isMissingNode();
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode62.without((java.util.Collection<java.lang.String>) strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode53.retain((java.util.Collection<java.lang.String>) strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode75 = objectNode46.remove((java.util.Collection<java.lang.String>) strList71);
        java.util.List<java.lang.String> strList76 = objectNode38.findValuesAsText("{\"hi!\":{\"\":{}}}", (java.util.List<java.lang.String>) strList71);
        java.util.List<java.lang.String> strList77 = objectNode31.findValuesAsText("{}", (java.util.List<java.lang.String>) strList71);
        java.util.List<java.lang.String> strList78 = objectNode10.findValuesAsText("{\"\":{}}", strList77);
        com.fasterxml.jackson.core.JsonParser jsonParser79 = objectNode10.traverse();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + jsonNodeType29 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType29.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNull(jsonNode49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNull(jsonNode56);
        org.junit.Assert.assertNull(jsonNode58);
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNull(jsonNode65);
        org.junit.Assert.assertNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertNotNull(objectNode75);
        org.junit.Assert.assertNotNull(strList76);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(jsonParser79);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap5 = objectNode1._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        boolean boolean9 = objectNode7.isBigInteger();
        int int11 = objectNode7.asInt((int) (short) -1);
        boolean boolean12 = objectNode7.isNumber();
        boolean boolean13 = objectNode1._childrenEqual(objectNode7);
        boolean boolean14 = objectNode1.canConvertToLong();
        boolean boolean15 = objectNode1.isIntegralNumber();
        boolean boolean16 = objectNode1.isNumber();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap17 = objectNode1._children;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor18 = objectNode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode1.findPath("hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strEntryItor18);
        org.junit.Assert.assertNotNull(jsonNode20);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean15 = objectNode13.asBoolean(false);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode17.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode17.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser23 = objectNode17.traverse();
        java.lang.String str24 = objectNode17.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode26.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode26.remove("");
        boolean boolean32 = objectNode26.isMissingNode();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode26.without((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode17.retain((java.util.Collection<java.lang.String>) strList35);
        double double39 = objectNode17.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        long long42 = objectNode41.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode41.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory45 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory45);
        boolean boolean48 = objectNode46.has("");
        boolean boolean49 = objectNode46.isContainerNode();
        boolean boolean50 = objectNode46.isFloatingPointNumber();
        boolean boolean51 = objectNode46.isNumber();
        boolean boolean52 = objectNode46.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode43._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode46);
        boolean boolean54 = objectNode53.isMissingNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode17.setAll(objectNode53);
        boolean boolean56 = objectNode13._childrenEqual(objectNode53);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(jsonNode20);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(jsonNode29);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jsonNode55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean14 = objectNode13.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode13.without("hi!");
        boolean boolean18 = objectNode13.has(0);
        java.math.BigInteger bigInteger19 = objectNode13.bigIntegerValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bigInteger19);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        boolean boolean6 = objectNode1.has((-1));
        int int7 = objectNode1.asInt();
        boolean boolean9 = objectNode1.hasNonNull((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        long long13 = objectNode12.longValue();
        boolean boolean14 = objectNode12.isPojo();
        int int15 = objectNode12.size();
        boolean boolean16 = objectNode10._childrenEqual(objectNode12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode19.remove("");
        boolean boolean25 = objectNode19.isMissingNode();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode19.without((java.util.Collection<java.lang.String>) strList28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode10._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode30);
        double double32 = objectNode30.asDouble();
        boolean boolean33 = objectNode30.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        long long36 = objectNode35.longValue();
        java.lang.String str37 = objectNode35.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType38 = objectNode35.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory39 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory39);
        boolean boolean42 = objectNode40.has("");
        boolean boolean43 = objectNode40.isContainerNode();
        boolean boolean44 = objectNode40.isFloatingPointNumber();
        boolean boolean45 = objectNode40.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode46 = objectNode35.putAll(objectNode40);
        boolean boolean47 = objectNode35.isPojo();
        int int49 = objectNode35.asInt((int) (short) 10);
        boolean boolean51 = objectNode35.has("hi!");
        int int53 = objectNode35.asInt((int) ' ');
        boolean boolean54 = objectNode35.isNumber();
        boolean boolean55 = objectNode30._childrenEqual(objectNode35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory57 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory57);
        boolean boolean60 = objectNode58.has("");
        boolean boolean61 = objectNode58.isContainerNode();
        boolean boolean62 = objectNode58.isFloatingPointNumber();
        boolean boolean63 = objectNode58.isNumber();
        boolean boolean64 = objectNode58.isBigDecimal();
        java.math.BigDecimal bigDecimal65 = objectNode58.decimalValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode58.findPath("{}");
        boolean boolean68 = objectNode58.isDouble();
        com.fasterxml.jackson.databind.JsonNode jsonNode69 = objectNode30.put("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode58);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + jsonNodeType38 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType38.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jsonNode46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(bigDecimal65);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(jsonNode69);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        boolean boolean5 = objectNode1.isInt();
        float float6 = objectNode1.floatValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = objectNode8.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        int int13 = objectNode12.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap14 = objectNode12._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode15 = objectNode10.putAll(strMap14);
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode10.without("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode19.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode21._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode24);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        long long34 = objectNode33.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode33.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode33.remove("");
        boolean boolean39 = objectNode33.isMissingNode();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode33.without((java.util.Collection<java.lang.String>) strList42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode31.remove((java.util.Collection<java.lang.String>) strList42);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory46);
        long long48 = objectNode47.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode47.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode47.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser53 = objectNode47.traverse();
        java.lang.String str54 = objectNode47.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        long long57 = objectNode56.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = objectNode56.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = objectNode56.remove("");
        boolean boolean62 = objectNode56.isMissingNode();
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = objectNode56.without((java.util.Collection<java.lang.String>) strList65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = objectNode47.retain((java.util.Collection<java.lang.String>) strList65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode69 = objectNode45.remove((java.util.Collection<java.lang.String>) strList65);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode70 = objectNode10.retain((java.util.Collection<java.lang.String>) strList65);
        boolean boolean71 = objectNode10.isInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode72 = objectNode1.setAll(objectNode10);
        int int73 = objectNode1.asInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory74 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode75 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory74);
        long long76 = objectNode75.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode75.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory79 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode80 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory79);
        boolean boolean82 = objectNode80.has("");
        boolean boolean83 = objectNode80.isContainerNode();
        boolean boolean84 = objectNode80.isFloatingPointNumber();
        boolean boolean85 = objectNode80.isNumber();
        boolean boolean86 = objectNode80.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode87 = objectNode77._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode80);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType88 = objectNode77.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode90 = objectNode77.findValue("");
        boolean boolean91 = objectNode1.equals((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode93 = objectNode1.numberNode((java.lang.Float) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(objectNode10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(jsonNode15);
        org.junit.Assert.assertNotNull(jsonNode17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(jsonNode50);
        org.junit.Assert.assertNull(jsonNode52);
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNull(jsonNode59);
        org.junit.Assert.assertNull(jsonNode61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objectNode67);
        org.junit.Assert.assertNotNull(objectNode68);
        org.junit.Assert.assertNotNull(objectNode69);
        org.junit.Assert.assertNotNull(objectNode70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jsonNode72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(objectNode87);
        org.junit.Assert.assertNull(numberType88);
        org.junit.Assert.assertNotNull(jsonNode90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap3 = objectNode1._children;
        java.util.Iterator<java.lang.String> strItor4 = objectNode1.fieldNames();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        long long7 = objectNode6.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = objectNode6.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = objectNode6.traverse();
        boolean boolean11 = objectNode6.has((-1));
        int int12 = objectNode6.asInt();
        boolean boolean14 = objectNode6.hasNonNull((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = objectNode6.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        boolean boolean20 = objectNode18.has("");
        boolean boolean21 = objectNode18.isShort();
        long long23 = objectNode18.asLong((long) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode6._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        double double26 = objectNode24.asDouble(0.0d);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode1.setAll(objectNode24);
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode24.path(0);
        java.math.BigDecimal bigDecimal30 = objectNode24.decimalValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        long long34 = objectNode33.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = objectNode33.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        boolean boolean40 = objectNode38.has("");
        boolean boolean41 = objectNode38.isContainerNode();
        boolean boolean42 = objectNode38.isFloatingPointNumber();
        boolean boolean43 = objectNode38.isNumber();
        boolean boolean44 = objectNode38.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode35._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode38);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType46 = objectNode35.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = objectNode35.findValue("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap49 = objectNode35._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        long long52 = objectNode51.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap53 = objectNode51._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode35.setAll(strMap53);
        boolean boolean55 = objectNode35.isFloat();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode35.findParent("");
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode24.put("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode57);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = objectNode24.put("hi!", (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(objectNode8);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectNode15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode27);
        org.junit.Assert.assertNotNull(jsonNode29);
        org.junit.Assert.assertNotNull(bigDecimal30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(objectNode35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNull(numberType46);
        org.junit.Assert.assertNotNull(jsonNode48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(jsonNode54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNull(jsonNode58);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isContainerNode();
        int int8 = objectNode1.asInt(0);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = objectNode1.asToken();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.path(0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode14.findParents("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = objectNode19.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = objectNode21._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode24);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        long long34 = objectNode33.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode33.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode38 = objectNode33.remove("");
        boolean boolean39 = objectNode33.isMissingNode();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode33.without((java.util.Collection<java.lang.String>) strList42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode31.remove((java.util.Collection<java.lang.String>) strList42);
        java.util.List<java.lang.String> strList46 = objectNode14.findValuesAsText("", (java.util.List<java.lang.String>) strList42);
        double double47 = objectNode14.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType48 = objectNode14.getNodeType();
        com.fasterxml.jackson.databind.JsonNode jsonNode50 = objectNode14.without("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}");
        com.fasterxml.jackson.databind.JsonNode jsonNode51 = objectNode1.set("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken9.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(objectNode21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectNode31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertNull(jsonNode38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType48 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType48.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNotNull(jsonNode50);
        org.junit.Assert.assertNotNull(jsonNode51);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode7.get(1);
        double double11 = objectNode7.doubleValue();
        boolean boolean12 = objectNode7.isNull();
        boolean boolean13 = objectNode7.canConvertToLong();
        java.lang.Number number14 = objectNode7.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode7.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode7);
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor18 = objectNode7.fields();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        long long22 = objectNode21.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode21.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = objectNode21.traverse();
        boolean boolean26 = objectNode21.has((-1));
        int int27 = objectNode21.asInt();
        boolean boolean29 = objectNode21.hasNonNull((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode21.deepCopy();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode7.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode21);
        boolean boolean32 = objectNode7.canConvertToInt();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = objectNode7.traverse();
        com.fasterxml.jackson.core.ObjectCodec objectCodec34 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = objectNode7.traverse(objectCodec34);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        long long39 = objectNode38.longValue();
        java.lang.String str40 = objectNode38.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType41 = objectNode38.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory42 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory42);
        boolean boolean45 = objectNode43.has("");
        boolean boolean46 = objectNode43.isContainerNode();
        boolean boolean47 = objectNode43.isFloatingPointNumber();
        boolean boolean48 = objectNode43.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode49 = objectNode38.putAll(objectNode43);
        int int50 = objectNode43.intValue();
        boolean boolean51 = objectNode43.isArray();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory53 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode54 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory53);
        boolean boolean56 = objectNode54.has("");
        boolean boolean57 = objectNode54.isContainerNode();
        boolean boolean58 = objectNode54.isFloatingPointNumber();
        boolean boolean59 = objectNode54.isNumber();
        boolean boolean60 = objectNode54.isBigDecimal();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory62 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory62);
        long long64 = objectNode63.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode66 = objectNode63.get(1);
        double double67 = objectNode63.doubleValue();
        boolean boolean68 = objectNode63.isNull();
        boolean boolean69 = objectNode63.canConvertToLong();
        java.lang.Number number70 = objectNode63.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList72 = objectNode63.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList73 = objectNode54.findParents("", jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList74 = objectNode43.findParents("hi!", jsonNodeList72);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList75 = objectNode7.findValues("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}", jsonNodeList72);
        boolean boolean76 = objectNode7.isValueNode();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.TextNode textNode78 = objectNode7.textNode("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strEntryItor18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + jsonNodeType41 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType41.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jsonNode49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNull(jsonNode66);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(number70);
        org.junit.Assert.assertNotNull(jsonNodeList72);
        org.junit.Assert.assertNotNull(jsonNodeList73);
        org.junit.Assert.assertNotNull(jsonNodeList74);
        org.junit.Assert.assertNotNull(jsonNodeList75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        double double6 = objectNode1.doubleValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType7 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        long long10 = objectNode9.longValue();
        java.lang.String str11 = objectNode9.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType12 = objectNode9.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        boolean boolean16 = objectNode14.has("");
        boolean boolean17 = objectNode14.isContainerNode();
        boolean boolean18 = objectNode14.isFloatingPointNumber();
        boolean boolean19 = objectNode14.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode9.putAll(objectNode14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        long long23 = objectNode22.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = objectNode22.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode22.remove("");
        boolean boolean28 = objectNode22.isMissingNode();
        com.fasterxml.jackson.core.JsonToken jsonToken29 = objectNode22.asToken();
        boolean boolean30 = objectNode9._childrenEqual(objectNode22);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        boolean boolean34 = objectNode32.has("");
        boolean boolean35 = objectNode32.isContainerNode();
        boolean boolean36 = objectNode32.isFloatingPointNumber();
        boolean boolean37 = objectNode32.isNumber();
        boolean boolean38 = objectNode32.isBigDecimal();
        boolean boolean39 = objectNode22._childrenEqual(objectNode32);
        long long40 = objectNode22.longValue();
        double double41 = objectNode22.doubleValue();
        boolean boolean42 = objectNode22.canConvertToLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode43 = objectNode1.putAll(objectNode22);
        java.lang.String str44 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory46 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory46);
        boolean boolean49 = objectNode47.has("");
        boolean boolean50 = objectNode47.isContainerNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode52 = objectNode47.without("");
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode1.set("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode47);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode55 = objectNode47.numberNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + jsonNodeType7 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType7.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + jsonNodeType12 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType12.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(jsonNode25);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + jsonToken29 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken29.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonNode43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jsonNode52);
        org.junit.Assert.assertNotNull(jsonNode53);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        boolean boolean4 = objectNode3.isBigInteger();
        boolean boolean6 = objectNode3.has(1);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        java.lang.String str10 = objectNode8.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType11 = objectNode8.getNodeType();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap12 = objectNode8._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode3.setAll(strMap12);
        boolean boolean14 = objectNode3.isFloat();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + jsonNodeType11 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType11.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean14 = objectNode13.asBoolean();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode13.without("hi!");
        java.math.BigInteger bigInteger17 = objectNode13.bigIntegerValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = objectNode13.findValues("");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(jsonNodeList19);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isInt();
        boolean boolean5 = objectNode1.isFloat();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor6 = objectNode1.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode1.remove("{}");
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode1.without("hi!");
        boolean boolean12 = objectNode1.equals((java.lang.Object) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ValueNode valueNode14 = objectNode1.numberNode((java.lang.Double) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strEntryItor6);
        org.junit.Assert.assertNull(jsonNode8);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.canConvertToInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        long long10 = objectNode9.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode9.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode9.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser15 = objectNode9.traverse();
        boolean boolean16 = objectNode9.isBinary();
        java.util.List<java.lang.String> strList18 = objectNode9.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList19 = objectNode1.findValuesAsText("hi!", strList18);
        java.lang.String str20 = objectNode1.toString();
        long long21 = objectNode1.longValue();
        boolean boolean22 = objectNode1.canConvertToLong();
        boolean boolean24 = objectNode1.hasNonNull("{\"\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode26 = objectNode1.putArray("{\"hi!\":{\"\":{}}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(jsonNode12);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{}" + "'", str20, "{}");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.canConvertToInt();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList8 = objectNode1.findParents("hi!");
        boolean boolean9 = objectNode1.isNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode11.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        boolean boolean18 = objectNode16.has("");
        boolean boolean19 = objectNode16.isContainerNode();
        boolean boolean20 = objectNode16.isFloatingPointNumber();
        boolean boolean21 = objectNode16.isNumber();
        boolean boolean22 = objectNode16.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode13._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode16);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType24 = objectNode13.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = objectNode13.findValue("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap27 = objectNode13._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        long long30 = objectNode29.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap31 = objectNode29._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode13.setAll(strMap31);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode1.setAll(strMap31);
        int int34 = objectNode1.asInt();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode1.put("{\"{\\\"hi!\\\":{\\\"\\\":{}}}\":{}}", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNodeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNull(numberType24);
        org.junit.Assert.assertNotNull(jsonNode26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertNotNull(jsonNode33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = objectNode10.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = objectNode10.traverse();
        boolean boolean15 = objectNode10.has((-1));
        int int16 = objectNode10.asInt();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.replace("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode1.findValue("hi!");
        boolean boolean20 = objectNode1.isIntegralNumber();
        boolean boolean21 = objectNode1.isBoolean();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode1.serialize(jsonGenerator22, serializerProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(objectNode12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isPojo();
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.BinaryNode binaryNode11 = objectNode1.binaryNode(byteArray8, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        boolean boolean9 = objectNode1.isBigInteger();
        boolean boolean10 = objectNode1.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        boolean boolean14 = objectNode12.has("");
        boolean boolean15 = objectNode12.isContainerNode();
        boolean boolean16 = objectNode12.isFloatingPointNumber();
        boolean boolean17 = objectNode1.equals((java.lang.Object) objectNode12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.get(1);
        double double23 = objectNode19.doubleValue();
        boolean boolean24 = objectNode19.canConvertToInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode27.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser33 = objectNode27.traverse();
        boolean boolean34 = objectNode27.isBinary();
        java.util.List<java.lang.String> strList36 = objectNode27.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList37 = objectNode19.findValuesAsText("hi!", strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode12.without((java.util.Collection<java.lang.String>) strList36);
        boolean boolean40 = objectNode38.asBoolean(false);
        boolean boolean41 = objectNode38.isNull();
        byte[] byteArray44 = new byte[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.BinaryNode binaryNode47 = objectNode38.binaryNode(byteArray44, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 10, (byte) 10 });
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode3.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        int int8 = objectNode7.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode7._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode3.setAll(strMap9);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        long long13 = objectNode12.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode12.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        boolean boolean19 = objectNode17.has("");
        boolean boolean20 = objectNode17.isContainerNode();
        boolean boolean21 = objectNode17.isFloatingPointNumber();
        boolean boolean22 = objectNode17.isNumber();
        boolean boolean23 = objectNode17.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode14._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode17);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode26.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode26.remove("");
        boolean boolean32 = objectNode26.isMissingNode();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode26.without((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode24.remove((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode3.remove((java.util.Collection<java.lang.String>) strList35);
        boolean boolean41 = objectNode3.hasNonNull("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode3.deepCopy();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode42.removeAll();
        boolean boolean45 = objectNode42.asBoolean(false);
        java.lang.Class<?> wildcardClass46 = objectNode42.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(jsonNode29);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        boolean boolean8 = objectNode1.isBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode11.get(1);
        double double15 = objectNode11.doubleValue();
        boolean boolean16 = objectNode11.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        long long19 = objectNode18.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode18.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory22 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory22);
        boolean boolean25 = objectNode23.has("");
        boolean boolean26 = objectNode23.isContainerNode();
        boolean boolean27 = objectNode23.isFloatingPointNumber();
        boolean boolean28 = objectNode23.isNumber();
        boolean boolean29 = objectNode23.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode20._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode23);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        long long33 = objectNode32.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = objectNode32.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode32.remove("");
        boolean boolean38 = objectNode32.isMissingNode();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode32.without((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode30.remove((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode11.retain((java.util.Collection<java.lang.String>) strList41);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode1._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode45);
        short short47 = objectNode1.shortValue();
        java.lang.String str49 = objectNode1.asText("{\"hi!\":{\"\":{}}}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        long long53 = objectNode52.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode52.get(1);
        double double56 = objectNode52.doubleValue();
        boolean boolean57 = objectNode52.isContainerNode();
        int int59 = objectNode52.asInt(0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory61 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory61);
        long long63 = objectNode62.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = objectNode62.get(1);
        double double66 = objectNode62.doubleValue();
        boolean boolean67 = objectNode62.isNull();
        boolean boolean68 = objectNode62.canConvertToLong();
        java.lang.Number number69 = objectNode62.numberValue();
        boolean boolean70 = objectNode62.isBigInteger();
        boolean boolean71 = objectNode62.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory72);
        boolean boolean75 = objectNode73.has("");
        boolean boolean76 = objectNode73.isContainerNode();
        boolean boolean77 = objectNode73.isFloatingPointNumber();
        boolean boolean78 = objectNode62.equals((java.lang.Object) objectNode73);
        com.fasterxml.jackson.databind.JsonNode jsonNode79 = objectNode52.put("", (com.fasterxml.jackson.databind.JsonNode) objectNode62);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory80 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode81 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory80);
        long long82 = objectNode81.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode83 = objectNode81.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser84 = objectNode81.traverse();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode85 = objectNode81.deepCopy();
        java.util.Iterator<java.lang.String> strItor86 = objectNode81.fieldNames();
        boolean boolean87 = objectNode81.booleanValue();
        java.util.List<java.lang.String> strList89 = objectNode81.findValuesAsText("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode90 = objectNode52.without((java.util.Collection<java.lang.String>) strList89);
        int int91 = objectNode90.asInt();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode92 = objectNode1._put("{\"hi!\":{}}", (com.fasterxml.jackson.databind.JsonNode) objectNode90);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType93 = objectNode1.numberType();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(objectNode20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(jsonNode35);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 0 + "'", short47 == (short) 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNull(jsonNode55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNull(jsonNode65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(number69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(jsonNode79);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNotNull(objectNode83);
        org.junit.Assert.assertNotNull(jsonParser84);
        org.junit.Assert.assertNotNull(objectNode85);
        org.junit.Assert.assertNotNull(strItor86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(objectNode90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(objectNode92);
        org.junit.Assert.assertNull(numberType93);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.path("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        long long9 = objectNode8.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode8.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode8.remove("");
        boolean boolean14 = objectNode8.isMissingNode();
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode8.without((java.util.Collection<java.lang.String>) strList17);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = objectNode1.without((java.util.Collection<java.lang.String>) strList17);
        java.math.BigDecimal bigDecimal22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode1.put("{\"\":{}}", bigDecimal22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertNotNull(objectNode20);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        boolean boolean7 = objectNode1.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        double double14 = objectNode10.doubleValue();
        boolean boolean15 = objectNode10.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode17.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory21 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory21);
        boolean boolean24 = objectNode22.has("");
        boolean boolean25 = objectNode22.isContainerNode();
        boolean boolean26 = objectNode22.isFloatingPointNumber();
        boolean boolean27 = objectNode22.isNumber();
        boolean boolean28 = objectNode22.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode19._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode22);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        long long32 = objectNode31.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode31.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode31.remove("");
        boolean boolean37 = objectNode31.isMissingNode();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = objectNode31.without((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode43 = objectNode29.remove((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = objectNode10.retain((java.util.Collection<java.lang.String>) strList40);
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode1.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode10);
        java.math.BigInteger bigInteger46 = objectNode1.bigIntegerValue();
        int int47 = objectNode1.intValue();
        int int49 = objectNode1.asInt(100);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        long long52 = objectNode51.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode51.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = objectNode51.remove("");
        boolean boolean57 = objectNode51.isMissingNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory59 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory59);
        long long61 = objectNode60.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode63 = objectNode60.get(1);
        double double64 = objectNode60.doubleValue();
        boolean boolean65 = objectNode60.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory66 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode67 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory66);
        long long68 = objectNode67.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode69 = objectNode67.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory71 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode72 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory71);
        boolean boolean74 = objectNode72.has("");
        boolean boolean75 = objectNode72.isContainerNode();
        boolean boolean76 = objectNode72.isFloatingPointNumber();
        boolean boolean77 = objectNode72.isNumber();
        boolean boolean78 = objectNode72.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode79 = objectNode69._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode72);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory80 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode81 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory80);
        long long82 = objectNode81.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode84 = objectNode81.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode86 = objectNode81.remove("");
        boolean boolean87 = objectNode81.isMissingNode();
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode92 = objectNode81.without((java.util.Collection<java.lang.String>) strList90);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode93 = objectNode79.remove((java.util.Collection<java.lang.String>) strList90);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode94 = objectNode60.retain((java.util.Collection<java.lang.String>) strList90);
        com.fasterxml.jackson.databind.JsonNode jsonNode95 = objectNode51.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode60);
        java.lang.String str96 = objectNode51.textValue();
        java.math.BigDecimal bigDecimal97 = objectNode51.decimalValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode98 = objectNode1.numberNode(bigDecimal97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(objectNode42);
        org.junit.Assert.assertNotNull(objectNode43);
        org.junit.Assert.assertNotNull(objectNode44);
        org.junit.Assert.assertNotNull(jsonNode45);
        org.junit.Assert.assertNotNull(bigInteger46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNull(jsonNode54);
        org.junit.Assert.assertNull(jsonNode56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNull(jsonNode63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(objectNode69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectNode79);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
        org.junit.Assert.assertNull(jsonNode84);
        org.junit.Assert.assertNull(jsonNode86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertArrayEquals(strArray89, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(objectNode92);
        org.junit.Assert.assertNotNull(objectNode93);
        org.junit.Assert.assertNotNull(objectNode94);
        org.junit.Assert.assertNotNull(jsonNode95);
        org.junit.Assert.assertNull(str96);
        org.junit.Assert.assertNotNull(bigDecimal97);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isContainerNode();
        int int8 = objectNode1.asInt(0);
        com.fasterxml.jackson.core.JsonToken jsonToken9 = objectNode1.asToken();
        boolean boolean10 = objectNode1.isDouble();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken9 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken9.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        int int4 = objectNode1.size();
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.at("");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory8 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode9 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory8);
        long long10 = objectNode9.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = objectNode9.deepCopy();
        byte[] byteArray12 = objectNode11.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor13 = objectNode11.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        int int16 = objectNode15.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap17 = objectNode15._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = objectNode11.setAll(strMap17);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory19 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode20 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory19);
        long long21 = objectNode20.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = objectNode20.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory24 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode25 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory24);
        boolean boolean27 = objectNode25.has("");
        boolean boolean28 = objectNode25.isContainerNode();
        boolean boolean29 = objectNode25.isFloatingPointNumber();
        boolean boolean30 = objectNode25.isNumber();
        boolean boolean31 = objectNode25.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = objectNode22._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode25);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        long long35 = objectNode34.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode34.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode34.remove("");
        boolean boolean40 = objectNode34.isMissingNode();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode45 = objectNode34.without((java.util.Collection<java.lang.String>) strList43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode32.remove((java.util.Collection<java.lang.String>) strList43);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode47 = objectNode11.remove((java.util.Collection<java.lang.String>) strList43);
        com.fasterxml.jackson.databind.JsonNode jsonNode48 = objectNode1.put("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode11);
        boolean boolean49 = objectNode11.isTextual();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = objectNode11.put("{\"hi!\":{\"\":{}}}", (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(jsonNode6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(objectNode11);
        org.junit.Assert.assertNull(byteArray12);
        org.junit.Assert.assertNotNull(jsonNodeItor13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(objectNode22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objectNode32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertNull(jsonNode39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(objectNode45);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertNotNull(objectNode47);
        org.junit.Assert.assertNull(jsonNode48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        boolean boolean9 = objectNode1.isBigInteger();
        boolean boolean10 = objectNode1.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        boolean boolean14 = objectNode12.has("");
        boolean boolean15 = objectNode12.isContainerNode();
        boolean boolean16 = objectNode12.isFloatingPointNumber();
        boolean boolean17 = objectNode1.equals((java.lang.Object) objectNode12);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.get(1);
        double double23 = objectNode19.doubleValue();
        boolean boolean24 = objectNode19.canConvertToInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode27.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser33 = objectNode27.traverse();
        boolean boolean34 = objectNode27.isBinary();
        java.util.List<java.lang.String> strList36 = objectNode27.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList37 = objectNode19.findValuesAsText("hi!", strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode12.without((java.util.Collection<java.lang.String>) strList36);
        double double39 = objectNode12.doubleValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode12.path(0);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory43);
        long long45 = objectNode44.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode46 = objectNode44.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory48 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode49 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory48);
        boolean boolean51 = objectNode49.has("");
        boolean boolean52 = objectNode49.isContainerNode();
        boolean boolean53 = objectNode49.isFloatingPointNumber();
        boolean boolean54 = objectNode49.isNumber();
        boolean boolean55 = objectNode49.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode46._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode49);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType57 = objectNode46.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = objectNode46.findValue("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap60 = objectNode46._children;
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor61 = objectNode46.iterator();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList63 = objectNode46.findParents("");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList64 = objectNode12.findParents("hi!", jsonNodeList63);
        long long65 = objectNode12.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode12.findPath("hi!");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = objectNode12.removeAll();
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = objectNode12.get(32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(objectNode46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertNull(numberType57);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNotNull(jsonNodeItor61);
        org.junit.Assert.assertNotNull(jsonNodeList63);
        org.junit.Assert.assertNotNull(jsonNodeList64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(jsonNode67);
        org.junit.Assert.assertNotNull(objectNode68);
        org.junit.Assert.assertNull(jsonNode70);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        long long3 = objectNode2.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode4 = objectNode2.deepCopy();
        byte[] byteArray5 = objectNode4.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor6 = objectNode4.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        int int9 = objectNode8.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap10 = objectNode8._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode4.setAll(strMap10);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap10);
        int int13 = objectNode12.size();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        long long17 = objectNode16.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = objectNode16.deepCopy();
        byte[] byteArray19 = objectNode18.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor20 = objectNode18.elements();
        boolean boolean22 = objectNode18.hasNonNull((int) (short) -1);
        int int24 = objectNode18.asInt((int) 'a');
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap25 = objectNode18._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode12._put("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(objectNode4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(jsonNodeItor6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(objectNode18);
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNotNull(jsonNodeItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(objectNode26);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        boolean boolean4 = objectNode1.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        long long8 = objectNode7.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode7.get(1);
        double double11 = objectNode7.doubleValue();
        boolean boolean12 = objectNode7.isNull();
        boolean boolean13 = objectNode7.canConvertToLong();
        java.lang.Number number14 = objectNode7.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode7.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode1.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode7);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = objectNode1.retain(strArray18);
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode1.findPath("");
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode1.get((int) (byte) 100);
        boolean boolean24 = objectNode1.isNull();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(number14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objectNode19);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertNull(jsonNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode3.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        int int8 = objectNode7.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode7._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode3.setAll(strMap9);
        boolean boolean11 = objectNode3.isBoolean();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList13 = objectNode3.findValues("{}");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory14 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode15 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory14);
        long long16 = objectNode15.longValue();
        boolean boolean17 = objectNode15.isPojo();
        boolean boolean18 = objectNode15.isInt();
        boolean boolean19 = objectNode15.isFloat();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor20 = objectNode15.fields();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode15.remove("{}");
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode15.without("hi!");
        java.math.BigInteger bigInteger25 = objectNode15.bigIntegerValue();
        java.math.BigDecimal bigDecimal26 = objectNode15.decimalValue();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode27 = objectNode3.numberNode(bigDecimal26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNodeList13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strEntryItor20);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertNotNull(jsonNode24);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertNotNull(bigDecimal26);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isFloatingPointNumber();
        boolean boolean6 = objectNode1.isNumber();
        boolean boolean7 = objectNode1.isBigDecimal();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode10.get(1);
        double double14 = objectNode10.doubleValue();
        boolean boolean15 = objectNode10.isNull();
        boolean boolean16 = objectNode10.canConvertToLong();
        java.lang.Number number17 = objectNode10.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList19 = objectNode10.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList20 = objectNode1.findParents("", jsonNodeList19);
        boolean boolean21 = objectNode1.isBigInteger();
        boolean boolean22 = objectNode1.isIntegralNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        long long25 = objectNode24.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = objectNode24.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory28 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory28);
        boolean boolean31 = objectNode29.has("");
        boolean boolean32 = objectNode29.isContainerNode();
        boolean boolean33 = objectNode29.isFloatingPointNumber();
        boolean boolean34 = objectNode29.isNumber();
        boolean boolean35 = objectNode29.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode36 = objectNode26._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode29);
        boolean boolean38 = objectNode36.asBoolean(false);
        boolean boolean39 = objectNode36.isPojo();
        com.fasterxml.jackson.databind.JsonNode jsonNode40 = objectNode1.putAll(objectNode36);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        long long43 = objectNode42.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode42.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = objectNode42.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser48 = objectNode42.traverse();
        boolean boolean49 = objectNode42.isBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory51 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode52 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory51);
        long long53 = objectNode52.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode52.get(1);
        double double56 = objectNode52.doubleValue();
        boolean boolean57 = objectNode52.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory58 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode59 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory58);
        long long60 = objectNode59.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = objectNode59.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory63 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode64 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory63);
        boolean boolean66 = objectNode64.has("");
        boolean boolean67 = objectNode64.isContainerNode();
        boolean boolean68 = objectNode64.isFloatingPointNumber();
        boolean boolean69 = objectNode64.isNumber();
        boolean boolean70 = objectNode64.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode71 = objectNode61._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode64);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory72 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory72);
        long long74 = objectNode73.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode76 = objectNode73.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode78 = objectNode73.remove("");
        boolean boolean79 = objectNode73.isMissingNode();
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode84 = objectNode73.without((java.util.Collection<java.lang.String>) strList82);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode85 = objectNode71.remove((java.util.Collection<java.lang.String>) strList82);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode86 = objectNode52.retain((java.util.Collection<java.lang.String>) strList82);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode87 = objectNode42._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode86);
        com.fasterxml.jackson.databind.JsonNode jsonNode89 = objectNode42.path((int) ' ');
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap90 = objectNode42._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode91 = objectNode36.putAll(strMap90);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertNotNull(jsonNodeList19);
        org.junit.Assert.assertNotNull(jsonNodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(objectNode26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objectNode36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonNode40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(jsonNode45);
        org.junit.Assert.assertNull(jsonNode47);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNull(jsonNode55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(objectNode61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objectNode71);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNull(jsonNode76);
        org.junit.Assert.assertNull(jsonNode78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(objectNode84);
        org.junit.Assert.assertNotNull(objectNode85);
        org.junit.Assert.assertNotNull(objectNode86);
        org.junit.Assert.assertNotNull(objectNode87);
        org.junit.Assert.assertNotNull(jsonNode89);
        org.junit.Assert.assertNotNull(strMap90);
        org.junit.Assert.assertNotNull(jsonNode91);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        boolean boolean8 = objectNode1.isBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = objectNode11.get(1);
        double double15 = objectNode11.doubleValue();
        boolean boolean16 = objectNode11.isNull();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory17 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode18 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory17);
        long long19 = objectNode18.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = objectNode18.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = objectNode18.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser24 = objectNode18.traverse();
        java.lang.String str25 = objectNode18.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory26 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory26);
        long long28 = objectNode27.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode30 = objectNode27.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = objectNode27.remove("");
        boolean boolean33 = objectNode27.isMissingNode();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode27.without((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode18.retain((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode40 = objectNode11.remove((java.util.Collection<java.lang.String>) strList36);
        com.fasterxml.jackson.databind.JsonNode jsonNode41 = objectNode1.set("{\"hi!\":{\"\":{}}}", (com.fasterxml.jackson.databind.JsonNode) objectNode40);
        boolean boolean43 = objectNode1.hasNonNull((int) 'a');
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider45 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode1.serializeWithType(jsonGenerator44, serializerProvider45, typeSerializer46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(jsonNode14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(jsonNode21);
        org.junit.Assert.assertNull(jsonNode23);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(jsonNode30);
        org.junit.Assert.assertNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertNotNull(objectNode40);
        org.junit.Assert.assertNotNull(jsonNode41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        boolean boolean9 = objectNode1.isBigInteger();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.without("{\"hi!\":{\"\":{}}}");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode1.path("hi!");
        double double14 = jsonNode13.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNode11);
        org.junit.Assert.assertNotNull(jsonNode13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        com.fasterxml.jackson.core.JsonParser.NumberType numberType14 = objectNode3.numberType();
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = objectNode3.findValue("");
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap17 = objectNode3._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap21 = objectNode19._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode3.setAll(strMap21);
        boolean boolean23 = objectNode3.isFloat();
        com.fasterxml.jackson.core.JsonToken jsonToken24 = objectNode3.asToken();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertNull(numberType14);
        org.junit.Assert.assertNotNull(jsonNode16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(jsonNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + jsonToken24 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken24.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        double double8 = objectNode1.doubleValue();
        boolean boolean9 = objectNode1.isBigDecimal();
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.NumericNode numericNode11 = objectNode1.numberNode(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isLong();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = objectNode1.deepCopy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objectNode6);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        boolean boolean7 = objectNode1.canConvertToLong();
        java.lang.Number number8 = objectNode1.numberValue();
        java.util.Iterator<java.lang.String> strItor9 = objectNode1.fieldNames();
        com.fasterxml.jackson.databind.JsonNode jsonNode11 = objectNode1.remove("{}");
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = objectNode1.findValue("");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNull(jsonNode11);
        org.junit.Assert.assertNull(jsonNode13);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        boolean boolean3 = objectNode1.has("");
        boolean boolean4 = objectNode1.isContainerNode();
        boolean boolean5 = objectNode1.isPojo();
        boolean boolean6 = objectNode1.isBoolean();
        boolean boolean7 = objectNode1.isFloat();
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = objectNode1.get("");
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objectNode1.serialize(jsonGenerator10, serializerProvider11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonNode9);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.putAll(objectNode6);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory13 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory13);
        long long15 = objectNode14.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode17 = objectNode14.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode19 = objectNode14.remove("");
        boolean boolean20 = objectNode14.isMissingNode();
        com.fasterxml.jackson.core.JsonToken jsonToken21 = objectNode14.asToken();
        boolean boolean22 = objectNode1._childrenEqual(objectNode14);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        boolean boolean26 = objectNode24.has("");
        boolean boolean27 = objectNode24.isContainerNode();
        boolean boolean28 = objectNode24.isFloatingPointNumber();
        boolean boolean29 = objectNode24.isNumber();
        boolean boolean30 = objectNode24.isBigDecimal();
        boolean boolean31 = objectNode14._childrenEqual(objectNode24);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory33 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode34 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory33);
        long long35 = objectNode34.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode37 = objectNode34.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode39 = objectNode34.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser40 = objectNode34.traverse();
        boolean boolean41 = objectNode34.isBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory43);
        long long45 = objectNode44.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = objectNode44.get(1);
        double double48 = objectNode44.doubleValue();
        boolean boolean49 = objectNode44.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory50 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory50);
        long long52 = objectNode51.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = objectNode51.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory55 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory55);
        boolean boolean58 = objectNode56.has("");
        boolean boolean59 = objectNode56.isContainerNode();
        boolean boolean60 = objectNode56.isFloatingPointNumber();
        boolean boolean61 = objectNode56.isNumber();
        boolean boolean62 = objectNode56.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode63 = objectNode53._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode56);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory64 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory64);
        long long66 = objectNode65.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode68 = objectNode65.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode70 = objectNode65.remove("");
        boolean boolean71 = objectNode65.isMissingNode();
        java.lang.String[] strArray73 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode76 = objectNode65.without((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode63.remove((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode78 = objectNode44.retain((java.util.Collection<java.lang.String>) strList74);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode79 = objectNode34._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode78);
        com.fasterxml.jackson.databind.JsonNode jsonNode80 = objectNode14.set("{}", (com.fasterxml.jackson.databind.JsonNode) objectNode78);
        double double82 = jsonNode80.asDouble(0.0d);
        double double83 = jsonNode80.doubleValue();
        java.util.List<java.lang.String> strList85 = jsonNode80.findValuesAsText("{}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(jsonNode17);
        org.junit.Assert.assertNull(jsonNode19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + jsonToken21 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken21.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(jsonNode37);
        org.junit.Assert.assertNull(jsonNode39);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(jsonNode47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(objectNode53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(objectNode63);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNull(jsonNode68);
        org.junit.Assert.assertNull(jsonNode70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(objectNode76);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertNotNull(objectNode78);
        org.junit.Assert.assertNotNull(objectNode79);
        org.junit.Assert.assertNotNull(jsonNode80);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(strList85);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        java.util.List<java.lang.String> strList3 = objectNode1.findValuesAsText("{\"\":{}}");
        com.fasterxml.jackson.databind.JsonNode jsonNode5 = objectNode1.findPath("{}");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(jsonNode5);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        double double5 = objectNode1.doubleValue();
        boolean boolean6 = objectNode1.isNull();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode1.findPath("hi!");
        boolean boolean10 = jsonNode8.hasNonNull((int) (byte) 100);
        double double11 = jsonNode8.doubleValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        boolean boolean6 = objectNode1.has((-1));
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = objectNode1.path("hi!");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory9 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode10 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory9);
        long long11 = objectNode10.longValue();
        boolean boolean12 = objectNode10.isPojo();
        boolean boolean13 = objectNode10.isFloat();
        int int14 = objectNode10.intValue();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = objectNode10.asToken();
        boolean boolean16 = objectNode10.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory18 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory18);
        long long20 = objectNode19.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode22 = objectNode19.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode24 = objectNode19.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser25 = objectNode19.traverse();
        java.lang.String str26 = objectNode19.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory27 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode28 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory27);
        long long29 = objectNode28.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode28.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode33 = objectNode28.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser34 = objectNode28.traverse();
        java.lang.String str35 = objectNode28.textValue();
        boolean boolean36 = objectNode28.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory37 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory37);
        long long39 = objectNode38.longValue();
        boolean boolean40 = objectNode38.isPojo();
        boolean boolean41 = objectNode38.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory43);
        long long45 = objectNode44.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode47 = objectNode44.get(1);
        double double48 = objectNode44.doubleValue();
        boolean boolean49 = objectNode44.isNull();
        boolean boolean50 = objectNode44.canConvertToLong();
        java.lang.Number number51 = objectNode44.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList53 = objectNode44.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode54 = objectNode38.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode44);
        java.lang.String[] strArray55 = new java.lang.String[] {};
        com.fasterxml.jackson.databind.node.ObjectNode objectNode56 = objectNode38.retain(strArray55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode57 = objectNode28.retain(strArray55);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode58 = objectNode19.retain(strArray55);
        com.fasterxml.jackson.databind.JsonNode jsonNode59 = objectNode10.set("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode19);
        boolean boolean60 = objectNode19.isLong();
        com.fasterxml.jackson.databind.JsonNode jsonNode61 = objectNode1.setAll(objectNode19);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList63 = objectNode19.findParents("{\"\":{}}");
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.ArrayNode arrayNode65 = objectNode19.withArray("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.START_OBJECT + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.START_OBJECT));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(jsonNode22);
        org.junit.Assert.assertNull(jsonNode24);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertNull(jsonNode33);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNull(jsonNode47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(number51);
        org.junit.Assert.assertNotNull(jsonNodeList53);
        org.junit.Assert.assertNull(jsonNode54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objectNode56);
        org.junit.Assert.assertNotNull(objectNode57);
        org.junit.Assert.assertNotNull(objectNode58);
        org.junit.Assert.assertNotNull(jsonNode59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jsonNode61);
        org.junit.Assert.assertNotNull(jsonNodeList63);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        boolean boolean3 = objectNode1.isPojo();
        java.util.Iterator<java.lang.String> strItor4 = objectNode1.fieldNames();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode1.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory7 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode8 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory7);
        boolean boolean10 = objectNode8.has("");
        boolean boolean11 = objectNode8.isContainerNode();
        boolean boolean12 = objectNode8.isFloatingPointNumber();
        boolean boolean13 = objectNode8.isNumber();
        boolean boolean14 = objectNode8.isBigDecimal();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode17.get(1);
        double double21 = objectNode17.doubleValue();
        boolean boolean22 = objectNode17.isNull();
        boolean boolean23 = objectNode17.canConvertToLong();
        java.lang.Number number24 = objectNode17.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode17.findValues("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList27 = objectNode8.findParents("", jsonNodeList26);
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList28 = objectNode1.findValues("", jsonNodeList27);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory30 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode31 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory30);
        long long32 = objectNode31.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode34 = objectNode31.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode36 = objectNode31.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser37 = objectNode31.traverse();
        boolean boolean38 = objectNode31.isBoolean();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory40 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory40);
        long long42 = objectNode41.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode44 = objectNode41.get(1);
        double double45 = objectNode41.doubleValue();
        boolean boolean46 = objectNode41.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory47 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode48 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory47);
        long long49 = objectNode48.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = objectNode48.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        boolean boolean55 = objectNode53.has("");
        boolean boolean56 = objectNode53.isContainerNode();
        boolean boolean57 = objectNode53.isFloatingPointNumber();
        boolean boolean58 = objectNode53.isNumber();
        boolean boolean59 = objectNode53.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode60 = objectNode50._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode53);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory61 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode62 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory61);
        long long63 = objectNode62.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode65 = objectNode62.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode67 = objectNode62.remove("");
        boolean boolean68 = objectNode62.isMissingNode();
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode73 = objectNode62.without((java.util.Collection<java.lang.String>) strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode74 = objectNode60.remove((java.util.Collection<java.lang.String>) strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode75 = objectNode41.retain((java.util.Collection<java.lang.String>) strList71);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode76 = objectNode31._put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode75);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode77 = objectNode1._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode75);
        boolean boolean78 = objectNode75.isObject();
        com.fasterxml.jackson.databind.JsonNode jsonNode80 = objectNode75.get(10);
        java.util.Iterator<java.lang.String> strItor81 = objectNode75.fieldNames();
        int int82 = objectNode75.asInt();
        boolean boolean83 = objectNode75.canConvertToLong();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNotNull(jsonNodeList27);
        org.junit.Assert.assertNotNull(jsonNodeList28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(jsonNode34);
        org.junit.Assert.assertNull(jsonNode36);
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNull(jsonNode44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(objectNode50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objectNode60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNull(jsonNode65);
        org.junit.Assert.assertNull(jsonNode67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objectNode73);
        org.junit.Assert.assertNotNull(objectNode74);
        org.junit.Assert.assertNotNull(objectNode75);
        org.junit.Assert.assertNotNull(objectNode76);
        org.junit.Assert.assertNotNull(objectNode77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(jsonNode80);
        org.junit.Assert.assertNotNull(strItor81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser4 = objectNode1.traverse();
        boolean boolean6 = objectNode1.has((int) (byte) 1);
        boolean boolean7 = objectNode1.isPojo();
        java.lang.Number number8 = objectNode1.numberValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number8);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean14 = objectNode13.asBoolean();
        float float15 = objectNode13.floatValue();
        com.fasterxml.jackson.core.JsonParser jsonParser16 = objectNode13.traverse();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, com.fasterxml.jackson.databind.JsonNode>> strEntryItor17 = objectNode13.fields();
        int int18 = objectNode13.asInt();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(strEntryItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode4 = objectNode1.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode6 = objectNode1.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser7 = objectNode1.traverse();
        java.lang.String str8 = objectNode1.textValue();
        boolean boolean9 = objectNode1.isPojo();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        boolean boolean13 = objectNode11.isPojo();
        boolean boolean14 = objectNode11.isValueNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        long long18 = objectNode17.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = objectNode17.get(1);
        double double21 = objectNode17.doubleValue();
        boolean boolean22 = objectNode17.isNull();
        boolean boolean23 = objectNode17.canConvertToLong();
        java.lang.Number number24 = objectNode17.numberValue();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList26 = objectNode17.findValues("hi!");
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode11.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode17);
        java.lang.String[] strArray28 = new java.lang.String[] {};
        com.fasterxml.jackson.databind.node.ObjectNode objectNode29 = objectNode11.retain(strArray28);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode1.retain(strArray28);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory31 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode32 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory31);
        long long33 = objectNode32.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode35 = objectNode32.get(1);
        double double36 = objectNode32.doubleValue();
        boolean boolean37 = objectNode32.isContainerNode();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory38 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory38);
        long long40 = objectNode39.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode41 = objectNode39.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory43 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode44 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory43);
        boolean boolean46 = objectNode44.has("");
        boolean boolean47 = objectNode44.isContainerNode();
        boolean boolean48 = objectNode44.isFloatingPointNumber();
        boolean boolean49 = objectNode44.isNumber();
        boolean boolean50 = objectNode44.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode51 = objectNode41._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode44);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory52 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode53 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory52);
        long long54 = objectNode53.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode56 = objectNode53.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode58 = objectNode53.remove("");
        boolean boolean59 = objectNode53.isMissingNode();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList62 = new java.util.ArrayList<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList62, strArray61);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode64 = objectNode53.without((java.util.Collection<java.lang.String>) strList62);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode65 = objectNode51.remove((java.util.Collection<java.lang.String>) strList62);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode66 = objectNode32.retain((java.util.Collection<java.lang.String>) strList62);
        java.util.List<java.lang.String> strList68 = objectNode32.findValuesAsText("");
        com.fasterxml.jackson.databind.node.ObjectNode objectNode69 = objectNode1.without((java.util.Collection<java.lang.String>) strList68);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(jsonNode4);
        org.junit.Assert.assertNull(jsonNode6);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(jsonNode20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(number24);
        org.junit.Assert.assertNotNull(jsonNodeList26);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objectNode29);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(jsonNode35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(objectNode41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectNode51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNull(jsonNode56);
        org.junit.Assert.assertNull(jsonNode58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objectNode64);
        org.junit.Assert.assertNotNull(objectNode65);
        org.junit.Assert.assertNotNull(objectNode66);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(objectNode69);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        boolean boolean12 = objectNode6.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode13 = objectNode3._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode6);
        boolean boolean14 = objectNode6.isPojo();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory1 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode2 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory1);
        long long3 = objectNode2.longValue();
        java.lang.String str4 = objectNode2.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType5 = objectNode2.getNodeType();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap6 = objectNode2._children;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0, strMap6);
        double double8 = objectNode7.asDouble();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory10 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory10);
        long long12 = objectNode11.longValue();
        boolean boolean13 = objectNode11.isPojo();
        java.util.Iterator<java.lang.String> strItor14 = objectNode11.fieldNames();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList16 = objectNode11.findParents("hi!");
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList17 = objectNode7.findParents("{\"hi!\":{\"\":{}}}", jsonNodeList16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = objectNode7.traverse(objectCodec18);
        java.math.BigDecimal bigDecimal20 = objectNode7.decimalValue();
        byte[] byteArray21 = objectNode7.binaryValue();
        java.util.Iterator<java.lang.String> strItor22 = objectNode7.fieldNames();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory23 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory23);
        long long25 = objectNode24.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode27 = objectNode24.get(1);
        double double28 = objectNode24.doubleValue();
        boolean boolean29 = objectNode24.isNull();
        boolean boolean30 = objectNode24.canConvertToLong();
        java.lang.Number number31 = objectNode24.numberValue();
        boolean boolean32 = objectNode24.isBigInteger();
        boolean boolean33 = objectNode24.isFloatingPointNumber();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory34 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode35 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory34);
        boolean boolean37 = objectNode35.has("");
        boolean boolean38 = objectNode35.isContainerNode();
        boolean boolean39 = objectNode35.isFloatingPointNumber();
        boolean boolean40 = objectNode24.equals((java.lang.Object) objectNode35);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory41 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode42 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory41);
        long long43 = objectNode42.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode45 = objectNode42.get(1);
        double double46 = objectNode42.doubleValue();
        boolean boolean47 = objectNode42.canConvertToInt();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory49 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode50 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory49);
        long long51 = objectNode50.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode53 = objectNode50.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode55 = objectNode50.remove("");
        com.fasterxml.jackson.core.JsonParser jsonParser56 = objectNode50.traverse();
        boolean boolean57 = objectNode50.isBinary();
        java.util.List<java.lang.String> strList59 = objectNode50.findValuesAsText("hi!");
        java.util.List<java.lang.String> strList60 = objectNode42.findValuesAsText("hi!", strList59);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode61 = objectNode35.without((java.util.Collection<java.lang.String>) strList59);
        double double62 = objectNode35.doubleValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode64 = objectNode35.findValue("{}");
        boolean boolean66 = objectNode35.hasNonNull(1);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory67 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode68 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory67);
        long long69 = objectNode68.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode71 = objectNode68.get(1);
        double double72 = objectNode68.doubleValue();
        boolean boolean73 = objectNode68.isNull();
        boolean boolean74 = objectNode68.canConvertToLong();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap75 = objectNode68._children;
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory77 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode78 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory77);
        long long79 = objectNode78.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode80 = objectNode78.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory82 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode83 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory82);
        boolean boolean85 = objectNode83.has("");
        boolean boolean86 = objectNode83.isContainerNode();
        boolean boolean87 = objectNode83.isFloatingPointNumber();
        boolean boolean88 = objectNode83.isNumber();
        boolean boolean89 = objectNode83.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode90 = objectNode80._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode83);
        com.fasterxml.jackson.databind.JsonNode jsonNode91 = objectNode68.put("hi!", (com.fasterxml.jackson.databind.JsonNode) objectNode80);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory92 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode93 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory92);
        int int94 = objectNode93.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap95 = objectNode93._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode96 = objectNode68.setAll(strMap95);
        com.fasterxml.jackson.databind.JsonNode jsonNode97 = objectNode35.setAll(strMap95);
        com.fasterxml.jackson.databind.JsonNode jsonNode98 = objectNode7.setAll(strMap95);
        java.lang.String str99 = objectNode7.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + jsonNodeType5 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType5.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(jsonNodeList16);
        org.junit.Assert.assertNotNull(jsonNodeList17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(bigDecimal20);
        org.junit.Assert.assertNull(byteArray21);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(jsonNode27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(number31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(jsonNode45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertNull(jsonNode53);
        org.junit.Assert.assertNull(jsonNode55);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(objectNode61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNull(jsonNode64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNull(jsonNode71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(objectNode80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(objectNode90);
        org.junit.Assert.assertNull(jsonNode91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(strMap95);
        org.junit.Assert.assertNotNull(jsonNode96);
        org.junit.Assert.assertNotNull(jsonNode97);
        org.junit.Assert.assertNotNull(jsonNode98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "{}" + "'", str99, "{}");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        java.lang.String str3 = objectNode1.textValue();
        com.fasterxml.jackson.databind.node.JsonNodeType jsonNodeType4 = objectNode1.getNodeType();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory5 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode6 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory5);
        boolean boolean8 = objectNode6.has("");
        boolean boolean9 = objectNode6.isContainerNode();
        boolean boolean10 = objectNode6.isFloatingPointNumber();
        boolean boolean11 = objectNode6.isNumber();
        com.fasterxml.jackson.databind.JsonNode jsonNode12 = objectNode1.putAll(objectNode6);
        int int13 = objectNode6.intValue();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = objectNode6.traverse();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory15 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode16 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory15);
        long long17 = objectNode16.longValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap18 = objectNode16._children;
        java.util.Iterator<java.lang.String> strItor19 = objectNode16.fieldNames();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory20 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode21 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory20);
        long long22 = objectNode21.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode23 = objectNode21.deepCopy();
        com.fasterxml.jackson.core.JsonParser jsonParser24 = objectNode21.traverse();
        boolean boolean26 = objectNode21.has((-1));
        int int27 = objectNode21.asInt();
        boolean boolean29 = objectNode21.hasNonNull((int) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode30 = objectNode21.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory32 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode33 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory32);
        boolean boolean35 = objectNode33.has("");
        boolean boolean36 = objectNode33.isShort();
        long long38 = objectNode33.asLong((long) (byte) 100);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode21._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode33);
        double double41 = objectNode39.asDouble(0.0d);
        com.fasterxml.jackson.databind.JsonNode jsonNode42 = objectNode16.setAll(objectNode39);
        boolean boolean43 = objectNode6._childrenEqual(objectNode39);
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor44 = objectNode6.elements();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + jsonNodeType4 + "' != '" + com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT + "'", jsonNodeType4.equals(com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonNode12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(objectNode23);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectNode30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(jsonNode42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonNodeItor44);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory0 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode1 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory0);
        long long2 = objectNode1.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode3 = objectNode1.deepCopy();
        byte[] byteArray4 = objectNode3.binaryValue();
        java.util.Iterator<com.fasterxml.jackson.databind.JsonNode> jsonNodeItor5 = objectNode3.elements();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory6 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode7 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory6);
        int int8 = objectNode7.intValue();
        java.util.Map<java.lang.String, com.fasterxml.jackson.databind.JsonNode> strMap9 = objectNode7._children;
        com.fasterxml.jackson.databind.JsonNode jsonNode10 = objectNode3.setAll(strMap9);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory11 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory11);
        long long13 = objectNode12.longValue();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode14 = objectNode12.deepCopy();
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory16 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode17 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory16);
        boolean boolean19 = objectNode17.has("");
        boolean boolean20 = objectNode17.isContainerNode();
        boolean boolean21 = objectNode17.isFloatingPointNumber();
        boolean boolean22 = objectNode17.isNumber();
        boolean boolean23 = objectNode17.isBigDecimal();
        com.fasterxml.jackson.databind.node.ObjectNode objectNode24 = objectNode14._put("", (com.fasterxml.jackson.databind.JsonNode) objectNode17);
        com.fasterxml.jackson.databind.node.JsonNodeFactory jsonNodeFactory25 = null;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode26 = new com.fasterxml.jackson.databind.node.ObjectNode(jsonNodeFactory25);
        long long27 = objectNode26.longValue();
        com.fasterxml.jackson.databind.JsonNode jsonNode29 = objectNode26.get(1);
        com.fasterxml.jackson.databind.JsonNode jsonNode31 = objectNode26.remove("");
        boolean boolean32 = objectNode26.isMissingNode();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode37 = objectNode26.without((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode38 = objectNode24.remove((java.util.Collection<java.lang.String>) strList35);
        com.fasterxml.jackson.databind.node.ObjectNode objectNode39 = objectNode3.remove((java.util.Collection<java.lang.String>) strList35);
        long long41 = objectNode39.asLong((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.node.TextNode textNode43 = objectNode39.textNode("{\"hi!\":{\"\":{}}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(objectNode3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(jsonNodeItor5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(jsonNode10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(objectNode14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objectNode24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(jsonNode29);
        org.junit.Assert.assertNull(jsonNode31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(objectNode37);
        org.junit.Assert.assertNotNull(objectNode38);
        org.junit.Assert.assertNotNull(objectNode39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
    }
}

