package com.fasterxml.jackson.databind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = new com.fasterxml.jackson.databind.ObjectMapper();
        com.fasterxml.jackson.databind.ObjectMapper objectMapper1 = objectMapper0.enableDefaultTyping();
        com.fasterxml.jackson.databind.ser.SerializerFactory serializerFactory2 = objectMapper0._serializerFactory;
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping defaultTyping3 = com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT;
        com.fasterxml.jackson.databind.ObjectMapper objectMapper5 = objectMapper0.enableDefaultTypingAsProperty(defaultTyping3, "");
        com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder defaultTypeResolverBuilder6 = new com.fasterxml.jackson.databind.ObjectMapper.DefaultTypeResolverBuilder(defaultTyping3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder stdTypeResolverBuilder8 = defaultTypeResolverBuilder6.typeProperty("");
    }
}

