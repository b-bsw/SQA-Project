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
        com.fasterxml.jackson.databind.node.POJONode pOJONode1 = new com.fasterxml.jackson.databind.node.POJONode((java.lang.Object) (-1));
        com.fasterxml.jackson.databind.JsonNode jsonNode3 = pOJONode1.findValue("");
        boolean boolean4 = pOJONode1.isDouble();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = pOJONode1.traverse();
        java.util.List<com.fasterxml.jackson.databind.JsonNode> jsonNodeList7 = pOJONode1.findValues("");
        com.fasterxml.jackson.databind.JsonNode jsonNode9 = pOJONode1.findPath("");
        com.fasterxml.jackson.databind.node.ValueNode valueNode10 = pOJONode1.deepCopy();
        boolean boolean11 = pOJONode1.isFloatingPointNumber();
        java.math.BigDecimal bigDecimal12 = pOJONode1.decimalValue();
        java.math.BigInteger bigInteger13 = pOJONode1.bigIntegerValue();
        boolean boolean14 = pOJONode1.isTextual();
        short short15 = pOJONode1.shortValue();
        org.junit.Assert.assertNull(jsonNode3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonNodeList7);
        org.junit.Assert.assertNotNull(jsonNode9);
        org.junit.Assert.assertNotNull(valueNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }
}

