package com.fasterxml.jackson.databind.deser;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = impl0.getTimeZone();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = impl0.getDefaultNullValueSerializer();
        com.fasterxml.jackson.databind.SerializationConfig serializationConfig2 = impl0.getConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone3 = impl0.getTimeZone();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector1 = impl0.getAnnotationIntrospector();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = impl0.getDefaultNullValueSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone2 = impl0.getTimeZone();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        java.lang.Class<?> wildcardClass1 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = impl0.getAttribute((java.lang.Object) 5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        java.lang.Class<?> wildcardClass1 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale2 = impl0.getLocale();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        java.lang.Class<?> wildcardClass4 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = impl0.hasSerializationFeatures((int) (short) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        java.lang.Class<?> wildcardClass4 = impl0.getActiveView();
        java.lang.Class<?> wildcardClass5 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone6 = impl0.getTimeZone();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig1 = impl0.getConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale2 = impl0.getLocale();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        int int1 = impl0.cachedSerializersCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory2 = impl0.getTypeFactory();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = impl0.getDefaultNullValueSerializer();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        impl0.flushCachedSerializers();
        java.lang.String str5 = com.fasterxml.jackson.databind.util.ClassUtil.quotedOr((java.lang.Object) impl0, "`java.lang.Byte`");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale6 = impl0.getLocale();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = impl0.getDefaultNullValueSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory4 = impl0.getTypeFactory();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        int int1 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.type.TypeFactory typeFactory3 = impl0.getTypeFactory();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = impl0.hasSerializationFeatures((int) ' ');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        int int1 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = impl0.hasSerializationFeatures((int) (short) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        int int1 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.databind.JsonMappingException.Reference reference4 = new com.fasterxml.jackson.databind.JsonMappingException.Reference((java.lang.Object) 0.0f);
        java.lang.String str5 = reference4.getDescription();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj6 = impl0.getAttribute((java.lang.Object) str5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone1 = impl0.getTimeZone();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.databind.cfg.MapperConfig<?> wildcardMapperConfig1 = impl0.getConfig();
        java.lang.Class<?> wildcardClass2 = impl0.getActiveView();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = impl0.hasSerializationFeatures(0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator1 = impl0.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.TimeZone timeZone2 = impl0.getTimeZone();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl impl0 = new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl();
        int int1 = impl0.cachedSerializersCount();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = impl0.getGenerator();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = impl0.getGenerator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Locale locale4 = impl0.getLocale();
    }
}

