package com.fasterxml.jackson.databind.ser;

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
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value3 = beanPropertyWriter0._format;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = beanPropertyWriter0.toString();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.reflect.Field field1 = beanPropertyWriter0._field;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        java.lang.reflect.Field field6 = beanPropertyWriter0._field;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass7 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName1 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata3 = beanPropertyWriter0._metadata;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.getName();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0._member;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.util.Annotations annotations2 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.core.SerializableString serializableString4 = beanPropertyWriter0.getSerializedName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.toString();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = beanPropertyWriter0._typeSerializer;
        java.lang.reflect.Field field3 = beanPropertyWriter0._field;
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._serializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = beanPropertyWriter0.isRequired();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.core.io.SerializedString serializedString1 = beanPropertyWriter0._name;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = beanPropertyWriter0.toString();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.util.Annotations annotations2 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getPropertyType();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = beanPropertyWriter4.isRequired();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.PropertyName propertyName3 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = beanPropertyWriter0._typeSerializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = beanPropertyWriter0.toString();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean4 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap5 = beanPropertyWriter0._internalSettings;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = beanPropertyWriter0.toString();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString4 = beanPropertyWriter0._name;
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata6 = beanPropertyWriter0.getMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember2 = beanPropertyWriter0.getMember();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj4 = beanPropertyWriter0.get((java.lang.Object) 1.0f);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = beanPropertyWriter0.getName();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.core.io.SerializedString serializedString5 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata6 = beanPropertyWriter0.getMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter0.getFullName();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._nullSerializer;
        java.lang.reflect.Type type6 = beanPropertyWriter0.getGenericPropertyType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass7 = beanPropertyWriter0.getPropertyType();
    }
}

