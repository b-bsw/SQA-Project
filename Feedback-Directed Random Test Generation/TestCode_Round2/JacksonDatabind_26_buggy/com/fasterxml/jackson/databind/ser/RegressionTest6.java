package com.fasterxml.jackson.databind.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        java.lang.reflect.Field field6 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.util.Annotations annotations7 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = beanPropertyWriter0.getSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(field6);
        org.junit.Assert.assertNull(annotations7);
        org.junit.Assert.assertNull(objJsonSerializer8);
        org.junit.Assert.assertNull(objJsonSerializer9);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = null;
        beanPropertyWriter0._serializer = objJsonSerializer5;
        java.lang.Class<?> wildcardClass7 = beanPropertyWriter0.getRawSerializationType();
        boolean boolean8 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer9;
        java.lang.reflect.Method method11 = beanPropertyWriter0._accessorMethod;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter5._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter7._internalSettings;
        java.lang.Object obj11 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) objMap10);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        boolean boolean13 = beanPropertyWriter5.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter5.getTypeSerializer();
        java.lang.Object obj15 = beanPropertyWriter5._suppressableValue;
        boolean boolean16 = beanPropertyWriter5.isUnwrapping();
        boolean boolean17 = beanPropertyWriter5._suppressNulls;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean19 = beanPropertyWriter18._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType20 = beanPropertyWriter18.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter18, serializedString21);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector24 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value25 = beanPropertyWriter23.findFormatOverrides(annotationIntrospector24);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean27 = beanPropertyWriter26._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = beanPropertyWriter26._wrapperName;
        java.lang.Object obj29 = beanPropertyWriter26.readResolve();
        java.lang.reflect.Field field30 = null;
        beanPropertyWriter26._field = field30;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean33 = beanPropertyWriter32._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName34 = beanPropertyWriter32._wrapperName;
        java.lang.Object obj35 = beanPropertyWriter32.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer36 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = beanPropertyWriter32.unwrappingWriter(nameTransformer36);
        com.fasterxml.jackson.databind.util.Annotations annotations38 = beanPropertyWriter32._contextAnnotations;
        com.fasterxml.jackson.core.SerializableString serializableString39 = beanPropertyWriter32.getSerializedName();
        java.lang.Object obj40 = beanPropertyWriter23.setInternalSetting((java.lang.Object) field30, (java.lang.Object) beanPropertyWriter32);
        java.lang.Object obj41 = beanPropertyWriter5.setInternalSetting((java.lang.Object) beanPropertyWriter18, (java.lang.Object) beanPropertyWriter23);
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter5.getType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer43 = beanPropertyWriter5._serializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(value25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(propertyName34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(beanPropertyWriter37);
        org.junit.Assert.assertNull(annotations38);
        org.junit.Assert.assertNull(serializableString39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(objJsonSerializer43);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector4);
        com.fasterxml.jackson.annotation.JsonFormat.Value value6 = null;
        beanPropertyWriter0._format = value6;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0._cfgSerializationType;
        boolean boolean9 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter10.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap13 = null;
        beanPropertyWriter10._internalSettings = objMap13;
        com.fasterxml.jackson.databind.util.Annotations annotations15 = beanPropertyWriter10._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter10._cfgSerializationType;
        boolean boolean17 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = null;
        beanPropertyWriter10.assignSerializer(objJsonSerializer18);
        com.fasterxml.jackson.databind.JavaType javaType20 = beanPropertyWriter10._cfgSerializationType;
        java.lang.reflect.Method method21 = beanPropertyWriter10._accessorMethod;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsField((java.lang.Object) method21, jsonGenerator22, serializerProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(value5);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(annotations15);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = beanPropertyWriter0.setInternalSetting(obj7, obj8);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = beanPropertyWriter10._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value13 = beanPropertyWriter10._format;
        java.lang.Object obj14 = beanPropertyWriter0.getInternalSetting((java.lang.Object) value13);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj16 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer17 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer17;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNull(value13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(propertyName15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        java.lang.Class<?>[] wildcardClassArray4 = beanPropertyWriter0._includeInViews;
        java.lang.Object obj5 = beanPropertyWriter0.readResolve();
        java.lang.reflect.Field field6 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap7 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata8 = beanPropertyWriter0._metadata;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(wildcardClassArray4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(field6);
        org.junit.Assert.assertNotNull(propertySerializerMap7);
        org.junit.Assert.assertNull(propertyMetadata8);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = null;
        beanPropertyWriter0._serializer = objJsonSerializer2;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean5 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap7 = null;
        beanPropertyWriter4._internalSettings = objMap7;
        boolean boolean9 = beanPropertyWriter4.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        java.lang.Object obj13 = beanPropertyWriter4.setInternalSetting((java.lang.Object) boolean11, (java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap14 = null;
        beanPropertyWriter4._dynamicSerializers = propertySerializerMap14;
        java.lang.Object obj16 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter4);
        boolean boolean17 = beanPropertyWriter0.hasSerializer();
        java.lang.reflect.Field field18 = null;
        beanPropertyWriter0._field = field18;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = beanPropertyWriter0.unwrappingWriter(nameTransformer20);
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter0.getSerializationType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter21);
        org.junit.Assert.assertNull(javaType22);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer8;
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap11 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = beanPropertyWriter0.getWrapperName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(value10);
        org.junit.Assert.assertNull(propertySerializerMap11);
        org.junit.Assert.assertNull(objJsonSerializer12);
        org.junit.Assert.assertNull(propertyName13);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = null;
        beanPropertyWriter0._internalSettings = objMap2;
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString10 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter8, serializedString10);
        java.lang.reflect.Type type12 = beanPropertyWriter11.getGenericPropertyType();
        java.lang.Object obj14 = beanPropertyWriter11.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter11._declaredType;
        java.lang.Class<?> wildcardClass16 = beanPropertyWriter11.getRawSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap17 = null;
        beanPropertyWriter11._internalSettings = objMap17;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = beanPropertyWriter11.unwrappingWriter(nameTransformer19);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer21 = null;
        beanPropertyWriter20._typeSerializer = typeSerializer21;
        com.fasterxml.jackson.core.io.SerializedString serializedString23 = beanPropertyWriter20._name;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean25 = beanPropertyWriter24._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName26 = beanPropertyWriter24._wrapperName;
        java.lang.Object obj27 = beanPropertyWriter24.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = beanPropertyWriter24.unwrappingWriter(nameTransformer28);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter29);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = null;
        beanPropertyWriter29._typeSerializer = typeSerializer31;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean34 = beanPropertyWriter33._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName35 = beanPropertyWriter33._wrapperName;
        java.lang.Object obj36 = beanPropertyWriter33.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter38 = beanPropertyWriter33.unwrappingWriter(nameTransformer37);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter38);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer40 = null;
        beanPropertyWriter38._typeSerializer = typeSerializer40;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer42 = null;
        beanPropertyWriter38.assignSerializer(objJsonSerializer42);
        java.lang.Object obj44 = beanPropertyWriter29.removeInternalSetting((java.lang.Object) beanPropertyWriter38);
        com.fasterxml.jackson.databind.JavaType javaType45 = null;
        beanPropertyWriter29.setNonTrivialBaseType(javaType45);
        com.fasterxml.jackson.databind.JavaType javaType47 = beanPropertyWriter29._declaredType;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata48 = beanPropertyWriter29.getMetadata();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter49 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean50 = beanPropertyWriter49.willSuppressNulls();
        java.lang.reflect.Method method51 = beanPropertyWriter49._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter52 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean53 = beanPropertyWriter52._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType54 = beanPropertyWriter52.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap55 = null;
        beanPropertyWriter52._internalSettings = objMap55;
        com.fasterxml.jackson.databind.util.Annotations annotations57 = beanPropertyWriter52._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType58 = beanPropertyWriter52._cfgSerializationType;
        java.lang.Object obj59 = beanPropertyWriter52._suppressableValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer60 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter61 = beanPropertyWriter52.unwrappingWriter(nameTransformer60);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter62 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean63 = beanPropertyWriter62.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString64 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter65 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter62, serializedString64);
        java.lang.Object obj67 = beanPropertyWriter62.removeInternalSetting((java.lang.Object) (byte) -1);
        com.fasterxml.jackson.core.io.SerializedString serializedString68 = beanPropertyWriter62._name;
        java.lang.Object obj69 = beanPropertyWriter49.setInternalSetting((java.lang.Object) nameTransformer60, (java.lang.Object) beanPropertyWriter62);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer70 = beanPropertyWriter49.getSerializer();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector71 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value72 = beanPropertyWriter49.findFormatOverrides(annotationIntrospector71);
        java.lang.reflect.Field field73 = null;
        beanPropertyWriter49._field = field73;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer75 = beanPropertyWriter49._typeSerializer;
        com.fasterxml.jackson.databind.JavaType javaType76 = beanPropertyWriter49._declaredType;
        com.fasterxml.jackson.annotation.JsonFormat.Value value77 = beanPropertyWriter49._format;
        java.lang.Object obj78 = beanPropertyWriter20.setInternalSetting((java.lang.Object) beanPropertyWriter29, (java.lang.Object) value77);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter79 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean80 = beanPropertyWriter79.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString81 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter82 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter79, serializedString81);
        java.lang.Object obj84 = beanPropertyWriter79.removeInternalSetting((java.lang.Object) (byte) -1);
        boolean boolean85 = beanPropertyWriter79.hasNullSerializer();
        java.lang.Object obj86 = beanPropertyWriter0.setInternalSetting(obj78, (java.lang.Object) boolean85);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(typeSerializer5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(beanPropertyWriter20);
        org.junit.Assert.assertNull(serializedString23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(propertyName26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(beanPropertyWriter29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(propertyName35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(beanPropertyWriter38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(javaType47);
        org.junit.Assert.assertNull(propertyMetadata48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(method51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(annotations57);
        org.junit.Assert.assertNull(javaType58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(beanPropertyWriter61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(serializedString68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(objJsonSerializer70);
        org.junit.Assert.assertNull(value72);
        org.junit.Assert.assertNull(typeSerializer75);
        org.junit.Assert.assertNull(javaType76);
        org.junit.Assert.assertNotNull(value77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector4);
        com.fasterxml.jackson.core.io.SerializedString serializedString6 = beanPropertyWriter0._name;
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter8.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap11 = beanPropertyWriter8._internalSettings;
        java.lang.Object obj12 = beanPropertyWriter8.readResolve();
        java.lang.Object obj13 = beanPropertyWriter0.setInternalSetting(obj7, (java.lang.Object) beanPropertyWriter8);
        com.fasterxml.jackson.annotation.JsonFormat.Value value14 = beanPropertyWriter8._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean16 = beanPropertyWriter15.willSuppressNulls();
        com.fasterxml.jackson.databind.util.Annotations annotations17 = beanPropertyWriter15._contextAnnotations;
        com.fasterxml.jackson.databind.util.Annotations annotations18 = beanPropertyWriter15._contextAnnotations;
        java.lang.Object obj19 = beanPropertyWriter15._suppressableValue;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap20 = null;
        beanPropertyWriter15._internalSettings = objMap20;
        java.lang.Object obj22 = beanPropertyWriter8.removeInternalSetting((java.lang.Object) objMap20);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter23.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap26 = null;
        beanPropertyWriter23._internalSettings = objMap26;
        boolean boolean28 = beanPropertyWriter23.isVirtual();
        java.lang.Object obj29 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = beanPropertyWriter23.unwrappingWriter(nameTransformer30);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember32 = beanPropertyWriter31._member;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer33 = null;
        beanPropertyWriter31._serializer = objJsonSerializer33;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer35 = beanPropertyWriter31._typeSerializer;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = null;
        beanPropertyWriter31.assignSerializer(objJsonSerializer36);
        java.lang.Object obj38 = beanPropertyWriter8.getInternalSetting((java.lang.Object) objJsonSerializer36);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember39 = beanPropertyWriter8._member;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(value5);
        org.junit.Assert.assertNull(serializedString6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(value14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotations17);
        org.junit.Assert.assertNull(annotations18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(beanPropertyWriter31);
        org.junit.Assert.assertNull(annotatedMember32);
        org.junit.Assert.assertNull(typeSerializer35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(annotatedMember39);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._declaredType;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer6;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer10;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter0.unwrappingWriter(nameTransformer12);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap14 = beanPropertyWriter0._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean16 = beanPropertyWriter15._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter15.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap18 = beanPropertyWriter15._internalSettings;
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter15.getWrapperName();
        java.lang.Object obj20 = beanPropertyWriter15.readResolve();
        java.lang.Object obj21 = beanPropertyWriter15.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = null;
        beanPropertyWriter15.assignNullSerializer(objJsonSerializer22);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata24 = beanPropertyWriter15._metadata;
        java.lang.Object obj25 = beanPropertyWriter0.getInternalSetting((java.lang.Object) beanPropertyWriter15);
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter0._declaredType;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode27 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider28 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.depositSchemaProperty(objectNode27, serializerProvider28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(beanPropertyWriter13);
        org.junit.Assert.assertNull(propertySerializerMap14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(objMap18);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(propertyMetadata24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(javaType26);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = beanPropertyWriter0.getSerializer();
        java.lang.reflect.Method method8 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType9);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata11 = beanPropertyWriter0._metadata;
        boolean boolean12 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean14 = beanPropertyWriter13._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter13.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        boolean boolean18 = beanPropertyWriter13.isVirtual();
        java.lang.Object obj19 = beanPropertyWriter13.readResolve();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap20 = null;
        beanPropertyWriter13._internalSettings = objMap20;
        boolean boolean22 = beanPropertyWriter13.isUnwrapping();
        java.lang.Class<?>[] wildcardClassArray23 = beanPropertyWriter13.getViews();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean25 = beanPropertyWriter24._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter24.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap27 = null;
        beanPropertyWriter24._internalSettings = objMap27;
        boolean boolean29 = beanPropertyWriter24.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean31 = beanPropertyWriter30._suppressNulls;
        java.lang.Object obj33 = beanPropertyWriter24.setInternalSetting((java.lang.Object) boolean31, (java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter34 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean35 = beanPropertyWriter34._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName36 = beanPropertyWriter34._wrapperName;
        java.lang.Object obj37 = beanPropertyWriter34.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer38 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = beanPropertyWriter34.unwrappingWriter(nameTransformer38);
        com.fasterxml.jackson.databind.util.Annotations annotations40 = beanPropertyWriter34._contextAnnotations;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = beanPropertyWriter34.setInternalSetting(obj41, obj42);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer44 = null;
        beanPropertyWriter34._typeSerializer = typeSerializer44;
        java.lang.Object obj46 = beanPropertyWriter24.getInternalSetting((java.lang.Object) beanPropertyWriter34);
        com.fasterxml.jackson.databind.JavaType javaType47 = null;
        beanPropertyWriter24._nonTrivialBaseType = javaType47;
        com.fasterxml.jackson.databind.JavaType javaType49 = beanPropertyWriter24._nonTrivialBaseType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer50 = null;
        beanPropertyWriter24._typeSerializer = typeSerializer50;
        java.lang.Object obj52 = beanPropertyWriter0.setInternalSetting((java.lang.Object) wildcardClassArray23, (java.lang.Object) beanPropertyWriter24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(objJsonSerializer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(propertyMetadata11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(wildcardClassArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(propertyName36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(beanPropertyWriter39);
        org.junit.Assert.assertNull(annotations40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        boolean boolean9 = beanPropertyWriter3.isVirtual();
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        beanPropertyWriter3._nonTrivialBaseType = javaType10;
        java.lang.reflect.Field field12 = null;
        beanPropertyWriter3._field = field12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType10;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer12;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = beanPropertyWriter0._nullSerializer;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = beanPropertyWriter0.rename(nameTransformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objJsonSerializer14);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.willSuppressNulls();
        java.lang.reflect.Method method9 = beanPropertyWriter7._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata10 = beanPropertyWriter7._metadata;
        java.lang.Object obj11 = beanPropertyWriter6.getInternalSetting((java.lang.Object) beanPropertyWriter7);
        java.lang.reflect.Type type12 = beanPropertyWriter6.getGenericPropertyType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter6);
        java.lang.reflect.Field field14 = beanPropertyWriter13._field;
        com.fasterxml.jackson.databind.PropertyName propertyName15 = beanPropertyWriter13._wrapperName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(propertyMetadata10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(field14);
        org.junit.Assert.assertNull(propertyName15);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter0.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        beanPropertyWriter8._nonTrivialBaseType = javaType9;
        java.lang.reflect.Method method11 = beanPropertyWriter8._accessorMethod;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = beanPropertyWriter8.getSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(objJsonSerializer12);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        java.lang.Class<?> wildcardClass8 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor9 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor9);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer11;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = beanPropertyWriter0._new(propertyName13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        java.lang.Object obj4 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean6 = beanPropertyWriter5._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter5.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        beanPropertyWriter5._nonTrivialBaseType = javaType8;
        com.fasterxml.jackson.databind.util.Annotations annotations10 = beanPropertyWriter5._contextAnnotations;
        com.fasterxml.jackson.core.SerializableString serializableString11 = beanPropertyWriter5.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = beanPropertyWriter5.getTypeSerializer();
        java.lang.Object obj13 = beanPropertyWriter0.getInternalSetting((java.lang.Object) typeSerializer12);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        boolean boolean16 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean18 = beanPropertyWriter17._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter17._wrapperName;
        java.lang.Object obj20 = beanPropertyWriter17.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = beanPropertyWriter17.unwrappingWriter(nameTransformer21);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap23 = beanPropertyWriter22._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean25 = beanPropertyWriter24._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter24.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap27 = beanPropertyWriter24._internalSettings;
        java.lang.Object obj28 = beanPropertyWriter22.removeInternalSetting((java.lang.Object) objMap27);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata29 = beanPropertyWriter22._metadata;
        boolean boolean30 = beanPropertyWriter22.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = beanPropertyWriter22.getTypeSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter22.assignNullSerializer(objJsonSerializer32);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = null;
        beanPropertyWriter22.assignSerializer(objJsonSerializer34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = beanPropertyWriter0.get((java.lang.Object) beanPropertyWriter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotations10);
        org.junit.Assert.assertNull(serializableString11);
        org.junit.Assert.assertNull(typeSerializer12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(annotatedMember14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(beanPropertyWriter22);
        org.junit.Assert.assertNotNull(propertySerializerMap23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(objMap27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(propertyMetadata29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(typeSerializer31);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.willSuppressNulls();
        java.lang.reflect.Method method9 = beanPropertyWriter7._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata10 = beanPropertyWriter7._metadata;
        java.lang.Object obj11 = beanPropertyWriter6.getInternalSetting((java.lang.Object) beanPropertyWriter7);
        java.lang.reflect.Type type12 = beanPropertyWriter6.getGenericPropertyType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter6);
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter13._declaredType;
        java.lang.reflect.Field field15 = null;
        beanPropertyWriter13._field = field15;
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter13.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString18 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter13, serializedString18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(propertyMetadata10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(type12);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertNull(javaType17);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = null;
        beanPropertyWriter5.assignSerializer(objJsonSerializer9);
        boolean boolean11 = beanPropertyWriter5.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean14 = beanPropertyWriter13._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter13.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString16 = beanPropertyWriter13.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        beanPropertyWriter13._nonTrivialBaseType = javaType17;
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter13._cfgSerializationType;
        java.lang.Object obj20 = beanPropertyWriter13.readResolve();
        java.lang.Object obj21 = beanPropertyWriter5.getInternalSetting(obj20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertNull(serializableString16);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = null;
        beanPropertyWriter0._serializer = objJsonSerializer2;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean5 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap7 = null;
        beanPropertyWriter4._internalSettings = objMap7;
        boolean boolean9 = beanPropertyWriter4.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        java.lang.Object obj13 = beanPropertyWriter4.setInternalSetting((java.lang.Object) boolean11, (java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap14 = null;
        beanPropertyWriter4._dynamicSerializers = propertySerializerMap14;
        java.lang.Object obj16 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter4);
        java.lang.reflect.Field field17 = beanPropertyWriter4._field;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = beanPropertyWriter4._serializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertNull(objJsonSerializer18);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector4);
        com.fasterxml.jackson.core.io.SerializedString serializedString6 = beanPropertyWriter0._name;
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter8.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap11 = beanPropertyWriter8._internalSettings;
        java.lang.Object obj12 = beanPropertyWriter8.readResolve();
        java.lang.Object obj13 = beanPropertyWriter0.setInternalSetting(obj7, (java.lang.Object) beanPropertyWriter8);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter8.getTypeSerializer();
        boolean boolean15 = beanPropertyWriter8.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter16.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap19 = null;
        beanPropertyWriter16._internalSettings = objMap19;
        com.fasterxml.jackson.databind.util.Annotations annotations21 = beanPropertyWriter16._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter16._cfgSerializationType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = beanPropertyWriter16.getSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor24 = null;
        beanPropertyWriter16.depositSchemaProperty(jsonObjectFormatVisitor24);
        com.fasterxml.jackson.core.SerializableString serializableString26 = beanPropertyWriter16.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer27 = null;
        beanPropertyWriter16.assignTypeSerializer(typeSerializer27);
        java.lang.Object obj29 = beanPropertyWriter8.removeInternalSetting((java.lang.Object) beanPropertyWriter16);
        com.fasterxml.jackson.databind.JavaType javaType30 = beanPropertyWriter16._declaredType;
        boolean boolean31 = beanPropertyWriter16.isVirtual();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata32 = beanPropertyWriter16._metadata;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(value5);
        org.junit.Assert.assertNull(serializedString6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(annotations21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(objJsonSerializer23);
        org.junit.Assert.assertNull(serializableString26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(propertyMetadata32);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata3 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.annotation.JsonFormat.Value value4 = null;
        beanPropertyWriter0._format = value4;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer6);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter0._serializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(propertyMetadata3);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertNull(objJsonSerializer10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata3 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = null;
        beanPropertyWriter0._serializer = objJsonSerializer4;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(propertyMetadata3);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector4);
        com.fasterxml.jackson.core.io.SerializedString serializedString6 = beanPropertyWriter0._name;
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter8.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap11 = beanPropertyWriter8._internalSettings;
        java.lang.Object obj12 = beanPropertyWriter8.readResolve();
        java.lang.Object obj13 = beanPropertyWriter0.setInternalSetting(obj7, (java.lang.Object) beanPropertyWriter8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = null;
        beanPropertyWriter8._serializer = objJsonSerializer14;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = beanPropertyWriter8.wouldConflictWithName(propertyName16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(value5);
        org.junit.Assert.assertNull(serializedString6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.util.Annotations annotations9 = beanPropertyWriter3._contextAnnotations;
        com.fasterxml.jackson.core.io.SerializedString serializedString10 = beanPropertyWriter3._name;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean12 = beanPropertyWriter11._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName13 = beanPropertyWriter11._wrapperName;
        java.lang.Object obj14 = beanPropertyWriter11.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = beanPropertyWriter11.unwrappingWriter(nameTransformer15);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter16);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean19 = beanPropertyWriter18._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType20 = beanPropertyWriter18.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter18, serializedString21);
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter18._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = beanPropertyWriter18.unwrappingWriter(nameTransformer24);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember26 = beanPropertyWriter25.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean28 = beanPropertyWriter27._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName29 = beanPropertyWriter27._wrapperName;
        java.lang.Object obj30 = beanPropertyWriter27.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = beanPropertyWriter27.unwrappingWriter(nameTransformer31);
        com.fasterxml.jackson.databind.util.Annotations annotations33 = beanPropertyWriter27._contextAnnotations;
        java.lang.Object obj34 = beanPropertyWriter27._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter27.getSerializationType();
        boolean boolean36 = beanPropertyWriter27.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean38 = beanPropertyWriter37.willSuppressNulls();
        java.lang.reflect.Method method39 = beanPropertyWriter37._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean41 = beanPropertyWriter40._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter40.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap43 = null;
        beanPropertyWriter40._internalSettings = objMap43;
        com.fasterxml.jackson.databind.util.Annotations annotations45 = beanPropertyWriter40._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType46 = beanPropertyWriter40._cfgSerializationType;
        java.lang.Object obj47 = beanPropertyWriter40._suppressableValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer48 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter49 = beanPropertyWriter40.unwrappingWriter(nameTransformer48);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter50 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean51 = beanPropertyWriter50.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString52 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter53 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter50, serializedString52);
        java.lang.Object obj55 = beanPropertyWriter50.removeInternalSetting((java.lang.Object) (byte) -1);
        com.fasterxml.jackson.core.io.SerializedString serializedString56 = beanPropertyWriter50._name;
        java.lang.Object obj57 = beanPropertyWriter37.setInternalSetting((java.lang.Object) nameTransformer48, (java.lang.Object) beanPropertyWriter50);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata58 = beanPropertyWriter37.getMetadata();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap59 = beanPropertyWriter37._internalSettings;
        beanPropertyWriter27._internalSettings = objMap59;
        beanPropertyWriter25._internalSettings = objMap59;
        beanPropertyWriter16._internalSettings = objMap59;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator63 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider64 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter3.serializeAsPlaceholder((java.lang.Object) beanPropertyWriter16, jsonGenerator63, serializerProvider64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertNull(annotations9);
        org.junit.Assert.assertNull(serializedString10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(propertyName13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(beanPropertyWriter16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNotNull(beanPropertyWriter25);
        org.junit.Assert.assertNull(annotatedMember26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(propertyName29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(beanPropertyWriter32);
        org.junit.Assert.assertNull(annotations33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertNull(annotations45);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(beanPropertyWriter49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(serializedString56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(propertyMetadata58);
        org.junit.Assert.assertNotNull(objMap59);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.util.Annotations annotations9 = beanPropertyWriter0._contextAnnotations;
        boolean boolean10 = beanPropertyWriter0.isUnwrapping();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter0.getFullName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotations9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter5.getSerializationType();
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter5._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter9, serializedString11);
        java.lang.reflect.Type type13 = beanPropertyWriter12.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value14 = null;
        beanPropertyWriter12._format = value14;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = beanPropertyWriter12.unwrappingWriter(nameTransformer16);
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter12.getType();
        java.lang.reflect.Method method19 = null;
        beanPropertyWriter12._accessorMethod = method19;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor21 = null;
        beanPropertyWriter12.depositSchemaProperty(jsonObjectFormatVisitor21);
        com.fasterxml.jackson.core.SerializableString serializableString23 = beanPropertyWriter12.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter12.getSerializationType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter5.serializeAsField((java.lang.Object) beanPropertyWriter12, jsonGenerator25, serializerProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNotNull(beanPropertyWriter17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(serializableString23);
        org.junit.Assert.assertNull(javaType24);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer9;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0._depositSchemaProperty(objectNode12, jsonNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter9._wrapperName;
        java.lang.Object obj12 = beanPropertyWriter9.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = beanPropertyWriter9.unwrappingWriter(nameTransformer13);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        beanPropertyWriter14._typeSerializer = typeSerializer16;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = null;
        beanPropertyWriter14.assignSerializer(objJsonSerializer18);
        java.lang.Object obj20 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter14);
        boolean boolean21 = beanPropertyWriter14._suppressNulls;
        java.lang.Object obj22 = beanPropertyWriter14.readResolve();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(beanPropertyWriter14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        boolean boolean5 = beanPropertyWriter3.isUnwrapping();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        java.lang.Class<?> wildcardClass8 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor9 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor9);
        java.lang.reflect.Type type11 = beanPropertyWriter0.getGenericPropertyType();
        boolean boolean12 = beanPropertyWriter0.hasNullSerializer();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap13 = beanPropertyWriter0._internalSettings;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objMap13);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector4);
        com.fasterxml.jackson.annotation.JsonFormat.Value value6 = null;
        beanPropertyWriter0._format = value6;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.core.SerializableString serializableString11 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter0.getType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor14 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor14);
        boolean boolean16 = beanPropertyWriter0.hasNullSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(value5);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(serializableString11);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        java.lang.Class<?>[] wildcardClassArray7 = beanPropertyWriter0.getViews();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap8 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = beanPropertyWriter0._typeSerializer;
        java.lang.Class<?> wildcardClass10 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector11 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value12 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector11);
        java.lang.reflect.Method method13 = null;
        beanPropertyWriter0._accessorMethod = method13;
        java.lang.Class<?> wildcardClass15 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = beanPropertyWriter0._serializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(wildcardClassArray7);
        org.junit.Assert.assertNull(objMap8);
        org.junit.Assert.assertNull(typeSerializer9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(value12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertNull(objJsonSerializer16);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter3.getType();
        boolean boolean10 = beanPropertyWriter3.willSuppressNulls();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        beanPropertyWriter3._typeSerializer = typeSerializer11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector4 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector4);
        com.fasterxml.jackson.core.io.SerializedString serializedString6 = beanPropertyWriter0._name;
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter8.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap11 = beanPropertyWriter8._internalSettings;
        java.lang.Object obj12 = beanPropertyWriter8.readResolve();
        java.lang.Object obj13 = beanPropertyWriter0.setInternalSetting(obj7, (java.lang.Object) beanPropertyWriter8);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter8.getTypeSerializer();
        boolean boolean15 = beanPropertyWriter8.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter16.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap19 = null;
        beanPropertyWriter16._internalSettings = objMap19;
        com.fasterxml.jackson.databind.util.Annotations annotations21 = beanPropertyWriter16._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter16._cfgSerializationType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = beanPropertyWriter16.getSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor24 = null;
        beanPropertyWriter16.depositSchemaProperty(jsonObjectFormatVisitor24);
        com.fasterxml.jackson.core.SerializableString serializableString26 = beanPropertyWriter16.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer27 = null;
        beanPropertyWriter16.assignTypeSerializer(typeSerializer27);
        java.lang.Object obj29 = beanPropertyWriter8.removeInternalSetting((java.lang.Object) beanPropertyWriter16);
        com.fasterxml.jackson.databind.PropertyName propertyName30 = beanPropertyWriter16._wrapperName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(value5);
        org.junit.Assert.assertNull(serializedString6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(objMap11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertNull(annotations21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(objJsonSerializer23);
        org.junit.Assert.assertNull(serializableString26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(propertyName30);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap2 = null;
        beanPropertyWriter0._internalSettings = objMap2;
        java.lang.Class<?> wildcardClass4 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = null;
        beanPropertyWriter0._serializer = objJsonSerializer5;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardClass4);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.PropertyName propertyName6 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7);
        java.lang.Object obj11 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter7);
        java.lang.Object obj12 = beanPropertyWriter0._suppressableValue;
        java.lang.reflect.Field field13 = null;
        beanPropertyWriter0._field = field13;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean16 = beanPropertyWriter15._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName17 = beanPropertyWriter15._wrapperName;
        java.lang.Object obj18 = beanPropertyWriter15.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = beanPropertyWriter15.unwrappingWriter(nameTransformer19);
        com.fasterxml.jackson.databind.util.Annotations annotations21 = beanPropertyWriter15._contextAnnotations;
        java.lang.Object obj22 = beanPropertyWriter15._suppressableValue;
        java.lang.reflect.Field field23 = null;
        beanPropertyWriter15._field = field23;
        java.lang.Object obj25 = beanPropertyWriter15.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean27 = beanPropertyWriter26.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString28 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter26, serializedString28);
        java.lang.reflect.Type type30 = beanPropertyWriter29.getGenericPropertyType();
        com.fasterxml.jackson.core.io.SerializedString serializedString31 = beanPropertyWriter29._name;
        java.lang.Object obj32 = beanPropertyWriter15.removeInternalSetting((java.lang.Object) beanPropertyWriter29);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean34 = beanPropertyWriter33._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter33.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap36 = null;
        beanPropertyWriter33._internalSettings = objMap36;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer38 = null;
        beanPropertyWriter33.assignTypeSerializer(typeSerializer38);
        java.lang.Class<?>[] wildcardClassArray40 = beanPropertyWriter33.getViews();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap41 = beanPropertyWriter33._internalSettings;
        com.fasterxml.jackson.databind.JavaType javaType42 = null;
        beanPropertyWriter33.setNonTrivialBaseType(javaType42);
        java.lang.Object obj44 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter15, (java.lang.Object) javaType42);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector45 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value46 = beanPropertyWriter15.findFormatOverrides(annotationIntrospector45);
        com.fasterxml.jackson.databind.JavaType javaType47 = beanPropertyWriter15._declaredType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(propertyName17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(beanPropertyWriter20);
        org.junit.Assert.assertNull(annotations21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(type30);
        org.junit.Assert.assertNull(serializedString31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertNull(wildcardClassArray40);
        org.junit.Assert.assertNull(objMap41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(value46);
        org.junit.Assert.assertNull(javaType47);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 10);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter0._declaredType;
        boolean boolean11 = beanPropertyWriter0.isUnwrapping();
        boolean boolean12 = beanPropertyWriter0.willSuppressNulls();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(annotatedMember9);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter5.getSerializationType();
        boolean boolean8 = beanPropertyWriter5.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter9.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap12 = null;
        beanPropertyWriter9._internalSettings = objMap12;
        com.fasterxml.jackson.databind.util.Annotations annotations14 = beanPropertyWriter9._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter9._cfgSerializationType;
        boolean boolean16 = beanPropertyWriter9.hasSerializer();
        com.fasterxml.jackson.annotation.JsonFormat.Value value17 = null;
        beanPropertyWriter9._format = value17;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        beanPropertyWriter9.assignTypeSerializer(typeSerializer19);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember21 = beanPropertyWriter9.getMember();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = null;
        beanPropertyWriter9._serializer = objJsonSerializer22;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata24 = beanPropertyWriter9.getMetadata();
        java.lang.Object obj25 = beanPropertyWriter5.getInternalSetting((java.lang.Object) beanPropertyWriter9);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap26 = beanPropertyWriter5._internalSettings;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotations14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedMember21);
        org.junit.Assert.assertNull(propertyMetadata24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(objMap26);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        java.lang.reflect.Field field6 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = beanPropertyWriter0._nullSerializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(field6);
        org.junit.Assert.assertNull(objJsonSerializer7);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.reflect.Field field1 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = beanPropertyWriter0._serializer;
        java.lang.reflect.Method method3 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor4 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = beanPropertyWriter0.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(field1);
        org.junit.Assert.assertNull(objJsonSerializer2);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = beanPropertyWriter0.removeInternalSetting(obj1);
        java.lang.reflect.Type type3 = beanPropertyWriter0.getGenericPropertyType();
        boolean boolean4 = beanPropertyWriter0._suppressNulls;
        java.lang.Class<?> wildcardClass5 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString6 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = beanPropertyWriter7._wrapperName;
        java.lang.Object obj10 = beanPropertyWriter7.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter7.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter12);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        beanPropertyWriter12._typeSerializer = typeSerializer14;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = beanPropertyWriter16._wrapperName;
        java.lang.Object obj19 = beanPropertyWriter16.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = beanPropertyWriter16.unwrappingWriter(nameTransformer20);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter21);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer23 = null;
        beanPropertyWriter21._typeSerializer = typeSerializer23;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = null;
        beanPropertyWriter21.assignSerializer(objJsonSerializer25);
        java.lang.Object obj27 = beanPropertyWriter12.removeInternalSetting((java.lang.Object) beanPropertyWriter21);
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        beanPropertyWriter12.setNonTrivialBaseType(javaType28);
        com.fasterxml.jackson.databind.JavaType javaType30 = beanPropertyWriter12._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer31 = beanPropertyWriter12._typeSerializer;
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter12.getType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean34 = beanPropertyWriter33.willSuppressNulls();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = null;
        beanPropertyWriter33.assignSerializer(objJsonSerializer35);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer37 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter38 = beanPropertyWriter33.unwrappingWriter(nameTransformer37);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = null;
        beanPropertyWriter38._serializer = objJsonSerializer39;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        beanPropertyWriter38._nonTrivialBaseType = javaType41;
        java.lang.Object obj43 = beanPropertyWriter0.setInternalSetting((java.lang.Object) javaType32, (java.lang.Object) javaType41);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(serializedString6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(beanPropertyWriter21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertNull(typeSerializer31);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter38);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter5.getSerializationType();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember8 = beanPropertyWriter5.getMember();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(annotatedMember8);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector8);
        com.fasterxml.jackson.core.io.SerializedString serializedString10 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString10);
        boolean boolean12 = beanPropertyWriter0.hasNullSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.reflect.Field field1 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean6 = beanPropertyWriter5._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter5._wrapperName;
        java.lang.Object obj8 = beanPropertyWriter5.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = beanPropertyWriter5.unwrappingWriter(nameTransformer9);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter10);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter10._typeSerializer = typeSerializer12;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = null;
        beanPropertyWriter10.assignSerializer(objJsonSerializer14);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter10);
        java.lang.Object obj17 = beanPropertyWriter0.getInternalSetting((java.lang.Object) beanPropertyWriter16);
        boolean boolean18 = beanPropertyWriter16.willSuppressNulls();
        java.lang.reflect.Field field19 = beanPropertyWriter16._field;
        org.junit.Assert.assertNull(field1);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(beanPropertyWriter10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(field19);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.PropertyName propertyName6 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7);
        java.lang.Object obj11 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter7);
        java.lang.Object obj12 = beanPropertyWriter0._suppressableValue;
        java.lang.reflect.Field field13 = null;
        beanPropertyWriter0._field = field13;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = beanPropertyWriter16._wrapperName;
        com.fasterxml.jackson.core.io.SerializedString serializedString19 = beanPropertyWriter16._name;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = beanPropertyWriter16.getSerializer();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata21 = beanPropertyWriter16.getMetadata();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata22 = beanPropertyWriter16.getMetadata();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter23.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap26 = null;
        beanPropertyWriter23._internalSettings = objMap26;
        boolean boolean28 = beanPropertyWriter23.isVirtual();
        java.lang.Object obj29 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = beanPropertyWriter23.unwrappingWriter(nameTransformer30);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer32 = null;
        beanPropertyWriter23.assignTypeSerializer(typeSerializer32);
        java.lang.Object obj34 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter16, (java.lang.Object) beanPropertyWriter23);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap35 = beanPropertyWriter16._internalSettings;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter36 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(objMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNull(serializedString19);
        org.junit.Assert.assertNull(objJsonSerializer20);
        org.junit.Assert.assertNull(propertyMetadata21);
        org.junit.Assert.assertNull(propertyMetadata22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(beanPropertyWriter31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(objMap35);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter8.getSerializationType();
        java.lang.Class<?> wildcardClass10 = beanPropertyWriter8.getRawSerializationType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(wildcardClass10);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._declaredType;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer6;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer10;
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter0.getType();
        boolean boolean13 = beanPropertyWriter0._suppressNulls;
        java.lang.Class<?> wildcardClass14 = beanPropertyWriter0.getRawSerializationType();
        java.lang.Class<?>[] wildcardClassArray15 = beanPropertyWriter0.getViews();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClassArray15);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._declaredType;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean7 = beanPropertyWriter6.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString8 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter6, serializedString8);
        java.lang.reflect.Type type10 = beanPropertyWriter9.getGenericPropertyType();
        java.lang.Object obj12 = beanPropertyWriter9.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter9._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = null;
        beanPropertyWriter9.assignTypeSerializer(typeSerializer14);
        com.fasterxml.jackson.annotation.JsonFormat.Value value16 = null;
        beanPropertyWriter9._format = value16;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean19 = beanPropertyWriter18.willSuppressNulls();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap20 = null;
        beanPropertyWriter18._internalSettings = objMap20;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean23 = beanPropertyWriter22._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName24 = beanPropertyWriter22._wrapperName;
        java.lang.Object obj25 = beanPropertyWriter22.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = beanPropertyWriter22.unwrappingWriter(nameTransformer26);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter27);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = null;
        beanPropertyWriter27._typeSerializer = typeSerializer29;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = null;
        beanPropertyWriter27.assignSerializer(objJsonSerializer31);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap33 = beanPropertyWriter27._dynamicSerializers;
        beanPropertyWriter18._dynamicSerializers = propertySerializerMap33;
        beanPropertyWriter9._dynamicSerializers = propertySerializerMap33;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap33;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        boolean boolean38 = beanPropertyWriter37.hasNullSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer39 = null;
        beanPropertyWriter37.assignNullSerializer(objJsonSerializer39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(propertyName24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(beanPropertyWriter27);
        org.junit.Assert.assertNotNull(propertySerializerMap33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter0._format;
        boolean boolean11 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = beanPropertyWriter0.getSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objMap9);
        org.junit.Assert.assertNull(value10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objJsonSerializer12);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer3;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter0.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter9._wrapperName;
        java.lang.Object obj12 = beanPropertyWriter9.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = beanPropertyWriter9.unwrappingWriter(nameTransformer13);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        beanPropertyWriter14._typeSerializer = typeSerializer16;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = null;
        beanPropertyWriter14.assignSerializer(objJsonSerializer18);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap21 = beanPropertyWriter14._internalSettings;
        boolean boolean22 = beanPropertyWriter14.hasNullSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter23.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString26 = beanPropertyWriter23.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector27 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value28 = beanPropertyWriter23.findFormatOverrides(annotationIntrospector27);
        com.fasterxml.jackson.databind.JavaType javaType29 = beanPropertyWriter23._nonTrivialBaseType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer30 = null;
        beanPropertyWriter23._typeSerializer = typeSerializer30;
        com.fasterxml.jackson.databind.PropertyName propertyName32 = beanPropertyWriter23.getWrapperName();
        java.lang.Object obj33 = beanPropertyWriter8.setInternalSetting((java.lang.Object) boolean22, (java.lang.Object) beanPropertyWriter23);
        java.lang.Object obj34 = beanPropertyWriter8._suppressableValue;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(beanPropertyWriter14);
        org.junit.Assert.assertNull(objMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertNull(serializableString26);
        org.junit.Assert.assertNull(value28);
        org.junit.Assert.assertNull(javaType29);
        org.junit.Assert.assertNull(propertyName32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = beanPropertyWriter0.setInternalSetting(obj7, obj8);
        java.lang.Object obj10 = beanPropertyWriter0.readResolve();
        java.lang.Class<?>[] wildcardClassArray11 = beanPropertyWriter0.getViews();
        java.lang.reflect.Field field12 = beanPropertyWriter0._field;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(wildcardClassArray11);
        org.junit.Assert.assertNull(field12);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter3.getType();
        boolean boolean10 = beanPropertyWriter3.hasNullSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter3, serializedString11);
        boolean boolean13 = beanPropertyWriter3.hasSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        java.lang.Object obj6 = beanPropertyWriter3.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter3._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter3);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata9 = beanPropertyWriter3._metadata;
        boolean boolean10 = beanPropertyWriter3.hasSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = null;
        beanPropertyWriter3._nullSerializer = objJsonSerializer11;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata13 = beanPropertyWriter3._metadata;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = null;
        beanPropertyWriter3.assignSerializer(objJsonSerializer14);
        boolean boolean16 = beanPropertyWriter3.willSuppressNulls();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(propertyMetadata9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(propertyMetadata13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        boolean boolean9 = beanPropertyWriter3.isVirtual();
        com.fasterxml.jackson.core.SerializableString serializableString10 = beanPropertyWriter3.getSerializedName();
        java.lang.Object obj12 = beanPropertyWriter3.removeInternalSetting((java.lang.Object) (byte) 10);
        java.lang.reflect.Method method13 = null;
        beanPropertyWriter3._accessorMethod = method13;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean16 = beanPropertyWriter15._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter15.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap18 = null;
        beanPropertyWriter15._internalSettings = objMap18;
        com.fasterxml.jackson.databind.util.Annotations annotations20 = beanPropertyWriter15._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter15._cfgSerializationType;
        boolean boolean22 = beanPropertyWriter15.hasSerializer();
        com.fasterxml.jackson.annotation.JsonFormat.Value value23 = null;
        beanPropertyWriter15._format = value23;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer25 = null;
        beanPropertyWriter15.assignTypeSerializer(typeSerializer25);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember27 = beanPropertyWriter15.getMember();
        com.fasterxml.jackson.databind.JavaType javaType28 = beanPropertyWriter15.getSerializationType();
        java.lang.reflect.Field field29 = null;
        beanPropertyWriter15._field = field29;
        java.lang.Object obj31 = beanPropertyWriter15._suppressableValue;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator32 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider33 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter3.serializeAsField((java.lang.Object) beanPropertyWriter15, jsonGenerator32, serializerProvider33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(serializableString10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(annotations20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(annotatedMember27);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean15 = beanPropertyWriter14._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType16 = beanPropertyWriter14.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap17 = null;
        beanPropertyWriter14._internalSettings = objMap17;
        boolean boolean19 = beanPropertyWriter14.isVirtual();
        java.lang.Object obj20 = beanPropertyWriter14.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = beanPropertyWriter14.unwrappingWriter(nameTransformer21);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer23 = beanPropertyWriter14._typeSerializer;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = beanPropertyWriter14.getTypeSerializer();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap25 = beanPropertyWriter14._dynamicSerializers;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap25;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(javaType16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(beanPropertyWriter22);
        org.junit.Assert.assertNull(typeSerializer23);
        org.junit.Assert.assertNull(typeSerializer24);
        org.junit.Assert.assertNotNull(propertySerializerMap25);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter5._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter7._internalSettings;
        java.lang.Object obj11 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) objMap10);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        java.lang.reflect.Type type13 = beanPropertyWriter5.getGenericPropertyType();
        java.lang.reflect.Type type14 = beanPropertyWriter5.getGenericPropertyType();
        java.lang.reflect.Type type15 = beanPropertyWriter5.getGenericPropertyType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertNull(type13);
        org.junit.Assert.assertNull(type14);
        org.junit.Assert.assertNull(type15);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = beanPropertyWriter0.removeInternalSetting(obj1);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        java.lang.reflect.Field field4 = null;
        beanPropertyWriter0._field = field4;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter0._dynamicSerializers;
        boolean boolean7 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer9);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter0.unwrappingWriter(nameTransformer12);
        java.lang.Class<?>[] wildcardClassArray14 = beanPropertyWriter0._includeInViews;
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(beanPropertyWriter13);
        org.junit.Assert.assertNull(wildcardClassArray14);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType4;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Object obj7 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = beanPropertyWriter0.unwrappingWriter(nameTransformer8);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = beanPropertyWriter9._typeSerializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(beanPropertyWriter9);
        org.junit.Assert.assertNull(typeSerializer10);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.Object obj5 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) (byte) -1);
        boolean boolean6 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter0._serializer = objJsonSerializer7;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = beanPropertyWriter0._member;
        java.lang.reflect.Field field12 = null;
        beanPropertyWriter0._field = field12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(annotatedMember11);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = beanPropertyWriter0.removeInternalSetting(obj1);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        java.lang.reflect.Field field4 = null;
        beanPropertyWriter0._field = field4;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata6 = beanPropertyWriter0.getMetadata();
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = beanPropertyWriter0.wouldConflictWithName(propertyName8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNull(propertyMetadata6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer2);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        java.lang.Class<?>[] wildcardClassArray6 = beanPropertyWriter5.getViews();
        java.lang.Object obj7 = beanPropertyWriter5.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter5.assignNullSerializer(objJsonSerializer8);
        java.lang.reflect.Field field10 = beanPropertyWriter5._field;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(wildcardClassArray6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(field10);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0._format;
        java.lang.Object obj8 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer9);
        java.lang.reflect.Method method11 = beanPropertyWriter0._accessorMethod;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNull(value7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        java.lang.Object obj6 = beanPropertyWriter3.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter3._declaredType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = beanPropertyWriter3._nullSerializer;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter3.getSerializationType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = beanPropertyWriter3.unwrappingWriter(nameTransformer10);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value13 = beanPropertyWriter11.findFormatOverrides(annotationIntrospector12);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = beanPropertyWriter11._nullSerializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(objJsonSerializer8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNotNull(beanPropertyWriter11);
        org.junit.Assert.assertNull(value13);
        org.junit.Assert.assertNull(objJsonSerializer14);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.annotation.JsonFormat.Value value2 = beanPropertyWriter0._format;
        boolean boolean3 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString4);
        boolean boolean6 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter0.getSerializationType();
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType9;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(value2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.util.Annotations annotations2 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata4 = beanPropertyWriter0.getMetadata();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean6 = beanPropertyWriter5._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter5._wrapperName;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter5.getWrapperName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = beanPropertyWriter5._typeSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = beanPropertyWriter10._wrapperName;
        java.lang.Object obj13 = beanPropertyWriter10.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = beanPropertyWriter10.unwrappingWriter(nameTransformer14);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember16 = beanPropertyWriter10._member;
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter10.getSerializationType();
        java.lang.Object obj18 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter5, (java.lang.Object) beanPropertyWriter10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean20 = beanPropertyWriter19.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter19, serializedString21);
        java.lang.reflect.Type type23 = beanPropertyWriter22.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value24 = null;
        beanPropertyWriter22._format = value24;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer26 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = beanPropertyWriter22.unwrappingWriter(nameTransformer26);
        boolean boolean28 = beanPropertyWriter22.isVirtual();
        com.fasterxml.jackson.core.SerializableString serializableString29 = beanPropertyWriter22.getSerializedName();
        com.fasterxml.jackson.databind.JavaType javaType30 = beanPropertyWriter22.getType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer31 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = beanPropertyWriter22.unwrappingWriter(nameTransformer31);
        java.lang.Object obj33 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) nameTransformer31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(annotations2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(propertyMetadata4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertNull(typeSerializer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(beanPropertyWriter15);
        org.junit.Assert.assertNull(annotatedMember16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(type23);
        org.junit.Assert.assertNotNull(beanPropertyWriter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(serializableString29);
        org.junit.Assert.assertNull(javaType30);
        org.junit.Assert.assertNotNull(beanPropertyWriter32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._declaredType;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter5._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter7._internalSettings;
        java.lang.Object obj11 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) objMap10);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        boolean boolean13 = beanPropertyWriter5.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter5.getTypeSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = beanPropertyWriter5._typeSerializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertNull(typeSerializer15);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer8;
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata11 = beanPropertyWriter0.getMetadata();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(value10);
        org.junit.Assert.assertNull(propertyMetadata11);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.hasSerializer();
        java.lang.reflect.Field field9 = null;
        beanPropertyWriter0._field = field9;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter0.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.PropertyName propertyName13 = beanPropertyWriter12.getWrapperName();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember14 = beanPropertyWriter12.getMember();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertNull(propertyName13);
        org.junit.Assert.assertNull(annotatedMember14);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString3 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer4 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer4);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer6);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer8);
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter0.getSerializationType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(serializableString3);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType3;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._serializer;
        java.lang.reflect.Field field6 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer8);
        com.fasterxml.jackson.core.io.SerializedString serializedString10 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString10);
        com.fasterxml.jackson.databind.util.Annotations annotations12 = beanPropertyWriter0._contextAnnotations;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objJsonSerializer5);
        org.junit.Assert.assertNull(field6);
        org.junit.Assert.assertNull(typeSerializer7);
        org.junit.Assert.assertNull(annotations12);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getSerializationType();
        boolean boolean9 = beanPropertyWriter0.isVirtual();
        java.lang.reflect.Method method10 = null;
        beanPropertyWriter0._accessorMethod = method10;
        java.lang.reflect.Field field12 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = beanPropertyWriter0._member;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(field12);
        org.junit.Assert.assertNull(annotatedMember13);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter5._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter7._internalSettings;
        java.lang.Object obj11 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) objMap10);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        boolean boolean13 = beanPropertyWriter5.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter5.getTypeSerializer();
        java.lang.Object obj15 = beanPropertyWriter5._suppressableValue;
        boolean boolean16 = beanPropertyWriter5.isUnwrapping();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = null;
        beanPropertyWriter5.assignNullSerializer(objJsonSerializer17);
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter5.getWrapperName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector20 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value21 = beanPropertyWriter5.findFormatOverrides(annotationIntrospector20);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean23 = beanPropertyWriter22._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter22.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap25 = null;
        beanPropertyWriter22._internalSettings = objMap25;
        boolean boolean27 = beanPropertyWriter22.isVirtual();
        com.fasterxml.jackson.databind.JavaType javaType28 = beanPropertyWriter22._cfgSerializationType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean30 = beanPropertyWriter29._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = null;
        beanPropertyWriter29._serializer = objJsonSerializer31;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean34 = beanPropertyWriter33._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType35 = beanPropertyWriter33.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap36 = null;
        beanPropertyWriter33._internalSettings = objMap36;
        boolean boolean38 = beanPropertyWriter33.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean40 = beanPropertyWriter39._suppressNulls;
        java.lang.Object obj42 = beanPropertyWriter33.setInternalSetting((java.lang.Object) boolean40, (java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap43 = null;
        beanPropertyWriter33._dynamicSerializers = propertySerializerMap43;
        java.lang.Object obj45 = beanPropertyWriter29.removeInternalSetting((java.lang.Object) beanPropertyWriter33);
        boolean boolean46 = beanPropertyWriter29.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter47 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean48 = beanPropertyWriter47._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType49 = beanPropertyWriter47.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType50 = null;
        beanPropertyWriter47._nonTrivialBaseType = javaType50;
        java.lang.Object obj53 = beanPropertyWriter47.getInternalSetting((java.lang.Object) 10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter54 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean55 = beanPropertyWriter54._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType56 = beanPropertyWriter54.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap57 = null;
        beanPropertyWriter54._internalSettings = objMap57;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer59 = null;
        beanPropertyWriter54.assignTypeSerializer(typeSerializer59);
        java.lang.Class<?>[] wildcardClassArray61 = beanPropertyWriter54.getViews();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap62 = beanPropertyWriter54._internalSettings;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer63 = beanPropertyWriter54._typeSerializer;
        java.lang.Class<?> wildcardClass64 = beanPropertyWriter54.getRawSerializationType();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector65 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value66 = beanPropertyWriter54.findFormatOverrides(annotationIntrospector65);
        java.lang.Object obj67 = beanPropertyWriter54._suppressableValue;
        com.fasterxml.jackson.annotation.JsonFormat.Value value68 = beanPropertyWriter54._format;
        beanPropertyWriter47._format = value68;
        beanPropertyWriter29._format = value68;
        java.lang.Object obj71 = beanPropertyWriter22.getInternalSetting((java.lang.Object) beanPropertyWriter29);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator72 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider73 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter5.serializeAsElement(obj71, jsonGenerator72, serializerProvider73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNull(value21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(javaType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(javaType35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(javaType56);
        org.junit.Assert.assertNull(wildcardClassArray61);
        org.junit.Assert.assertNull(objMap62);
        org.junit.Assert.assertNull(typeSerializer63);
        org.junit.Assert.assertNull(wildcardClass64);
        org.junit.Assert.assertNull(value66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(value68);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = beanPropertyWriter0.removeInternalSetting(obj1);
        java.lang.reflect.Type type3 = beanPropertyWriter0.getGenericPropertyType();
        boolean boolean4 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.core.SerializableString serializableString5 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.core.io.SerializedString serializedString6 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter8.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString11 = beanPropertyWriter8.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector12 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value13 = beanPropertyWriter8.findFormatOverrides(annotationIntrospector12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean15 = beanPropertyWriter14.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14, serializedString16);
        java.lang.reflect.Type type18 = beanPropertyWriter17.getGenericPropertyType();
        java.lang.Object obj20 = beanPropertyWriter17.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType21 = beanPropertyWriter17._declaredType;
        java.lang.Object obj22 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY;
        java.lang.Object obj23 = beanPropertyWriter8.setInternalSetting((java.lang.Object) javaType21, obj22);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = null;
        beanPropertyWriter8.assignSerializer(objJsonSerializer24);
        java.lang.reflect.Method method26 = null;
        beanPropertyWriter8._accessorMethod = method26;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsField((java.lang.Object) method26, jsonGenerator28, serializerProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(serializableString5);
        org.junit.Assert.assertNull(serializedString6);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(javaType10);
        org.junit.Assert.assertNull(serializableString11);
        org.junit.Assert.assertNull(value13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(javaType21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY + "'", obj22.equals(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.util.Annotations annotations9 = beanPropertyWriter0._contextAnnotations;
        java.lang.reflect.Field field10 = null;
        beanPropertyWriter0._field = field10;
        com.fasterxml.jackson.core.SerializableString serializableString12 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean14 = beanPropertyWriter13._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter13.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap16 = null;
        beanPropertyWriter13._internalSettings = objMap16;
        boolean boolean18 = beanPropertyWriter13.isVirtual();
        java.lang.Object obj19 = beanPropertyWriter13.readResolve();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap20 = null;
        beanPropertyWriter13._internalSettings = objMap20;
        boolean boolean22 = beanPropertyWriter13.isUnwrapping();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer23 = null;
        beanPropertyWriter13._typeSerializer = typeSerializer23;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean26 = beanPropertyWriter25._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType27 = beanPropertyWriter25.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap28 = beanPropertyWriter25._internalSettings;
        java.lang.Object obj29 = beanPropertyWriter25.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean31 = beanPropertyWriter30._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter30.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        beanPropertyWriter30._nonTrivialBaseType = javaType33;
        com.fasterxml.jackson.databind.util.Annotations annotations35 = beanPropertyWriter30._contextAnnotations;
        com.fasterxml.jackson.core.SerializableString serializableString36 = beanPropertyWriter30.getSerializedName();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer37 = beanPropertyWriter30.getTypeSerializer();
        java.lang.Object obj38 = beanPropertyWriter25.getInternalSetting((java.lang.Object) typeSerializer37);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember39 = beanPropertyWriter25.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter25);
        java.lang.Object obj41 = beanPropertyWriter0.setInternalSetting((java.lang.Object) typeSerializer23, (java.lang.Object) beanPropertyWriter25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotations9);
        org.junit.Assert.assertNull(serializableString12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertNull(objMap28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(annotations35);
        org.junit.Assert.assertNull(serializableString36);
        org.junit.Assert.assertNull(typeSerializer37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(annotatedMember39);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.util.Annotations annotations2 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.util.Annotations annotations3 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj4 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        boolean boolean7 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = beanPropertyWriter8._internalSettings;
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter8._format;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(annotations2);
        org.junit.Assert.assertNull(annotations3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objMap9);
        org.junit.Assert.assertNull(value10);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        boolean boolean9 = beanPropertyWriter3.isVirtual();
        com.fasterxml.jackson.core.SerializableString serializableString10 = beanPropertyWriter3.getSerializedName();
        boolean boolean11 = beanPropertyWriter3.isVirtual();
        com.fasterxml.jackson.databind.JavaType javaType12 = beanPropertyWriter3.getType();
        com.fasterxml.jackson.core.SerializableString serializableString13 = beanPropertyWriter3.getSerializedName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(serializableString10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(javaType12);
        org.junit.Assert.assertNull(serializableString13);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.core.io.SerializedString serializedString7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString7);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter9.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter9, serializedString12);
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter9._nonTrivialBaseType;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor15 = null;
        beanPropertyWriter9.depositSchemaProperty(jsonObjectFormatVisitor15);
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        beanPropertyWriter9.setNonTrivialBaseType(javaType17);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        beanPropertyWriter9._typeSerializer = typeSerializer19;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter8.serializeAsPlaceholder((java.lang.Object) typeSerializer19, jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(javaType14);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.willSuppressNulls();
        java.lang.reflect.Method method9 = beanPropertyWriter7._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata10 = beanPropertyWriter7._metadata;
        java.lang.Object obj11 = beanPropertyWriter6.getInternalSetting((java.lang.Object) beanPropertyWriter7);
        boolean boolean12 = beanPropertyWriter7.hasNullSerializer();
        boolean boolean13 = beanPropertyWriter7.hasNullSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = null;
        beanPropertyWriter7._nullSerializer = objJsonSerializer14;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = beanPropertyWriter16._wrapperName;
        java.lang.Object obj19 = beanPropertyWriter16.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = beanPropertyWriter16.unwrappingWriter(nameTransformer20);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter21);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer23 = null;
        beanPropertyWriter21._typeSerializer = typeSerializer23;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean26 = beanPropertyWriter25._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName27 = beanPropertyWriter25._wrapperName;
        java.lang.Object obj28 = beanPropertyWriter25.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer29 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = beanPropertyWriter25.unwrappingWriter(nameTransformer29);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter30);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer32 = null;
        beanPropertyWriter30._typeSerializer = typeSerializer32;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer34 = null;
        beanPropertyWriter30.assignSerializer(objJsonSerializer34);
        java.lang.Object obj36 = beanPropertyWriter21.removeInternalSetting((java.lang.Object) beanPropertyWriter30);
        com.fasterxml.jackson.annotation.JsonFormat.Value value37 = null;
        beanPropertyWriter21._format = value37;
        com.fasterxml.jackson.databind.JavaType javaType39 = beanPropertyWriter21.getType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean41 = beanPropertyWriter40._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType42 = beanPropertyWriter40.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap43 = null;
        beanPropertyWriter40._internalSettings = objMap43;
        boolean boolean45 = beanPropertyWriter40.isVirtual();
        java.lang.Object obj46 = beanPropertyWriter40.readResolve();
        com.fasterxml.jackson.annotation.JsonFormat.Value value47 = beanPropertyWriter40._format;
        java.lang.Object obj48 = beanPropertyWriter40.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter49 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean50 = beanPropertyWriter49.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString51 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter52 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter49, serializedString51);
        java.lang.reflect.Type type53 = beanPropertyWriter52.getGenericPropertyType();
        java.lang.Object obj55 = beanPropertyWriter52.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType56 = beanPropertyWriter52._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter57 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter52);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata58 = beanPropertyWriter52._metadata;
        java.lang.Object obj59 = beanPropertyWriter21.setInternalSetting(obj48, (java.lang.Object) beanPropertyWriter52);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer60 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter61 = beanPropertyWriter52.unwrappingWriter(nameTransformer60);
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = beanPropertyWriter52.removeInternalSetting(obj62);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter64 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter52);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter65 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean66 = beanPropertyWriter65.willSuppressNulls();
        java.lang.reflect.Method method67 = beanPropertyWriter65._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType68 = beanPropertyWriter65._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter69 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean70 = beanPropertyWriter69._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType71 = beanPropertyWriter69.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap72 = null;
        beanPropertyWriter69._internalSettings = objMap72;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer74 = null;
        beanPropertyWriter69.assignTypeSerializer(typeSerializer74);
        com.fasterxml.jackson.annotation.JsonFormat.Value value76 = beanPropertyWriter69._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter77 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean78 = beanPropertyWriter77._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName79 = beanPropertyWriter77._wrapperName;
        java.lang.Object obj80 = beanPropertyWriter77.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer81 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter82 = beanPropertyWriter77.unwrappingWriter(nameTransformer81);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter83 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter82);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer84 = null;
        beanPropertyWriter82._typeSerializer = typeSerializer84;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer86 = null;
        beanPropertyWriter82.assignSerializer(objJsonSerializer86);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap88 = beanPropertyWriter82._dynamicSerializers;
        beanPropertyWriter69._dynamicSerializers = propertySerializerMap88;
        beanPropertyWriter65._dynamicSerializers = propertySerializerMap88;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata91 = beanPropertyWriter65._metadata;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer92 = beanPropertyWriter65._serializer;
        com.fasterxml.jackson.databind.JavaType javaType93 = beanPropertyWriter65.getType();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap94 = beanPropertyWriter65._dynamicSerializers;
        beanPropertyWriter64._dynamicSerializers = propertySerializerMap94;
        beanPropertyWriter7._dynamicSerializers = propertySerializerMap94;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(propertyMetadata10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(beanPropertyWriter21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(propertyName27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(beanPropertyWriter30);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(javaType42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNull(value47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(type53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(javaType56);
        org.junit.Assert.assertNull(propertyMetadata58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(beanPropertyWriter61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(method67);
        org.junit.Assert.assertNull(javaType68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(javaType71);
        org.junit.Assert.assertNull(value76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(propertyName79);
        org.junit.Assert.assertNotNull(obj80);
        org.junit.Assert.assertNotNull(beanPropertyWriter82);
        org.junit.Assert.assertNotNull(propertySerializerMap88);
        org.junit.Assert.assertNull(propertyMetadata91);
        org.junit.Assert.assertNull(objJsonSerializer92);
        org.junit.Assert.assertNull(javaType93);
        org.junit.Assert.assertNotNull(propertySerializerMap94);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean5 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap7 = null;
        beanPropertyWriter4._internalSettings = objMap7;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        beanPropertyWriter4.assignTypeSerializer(typeSerializer9);
        com.fasterxml.jackson.annotation.JsonFormat.Value value11 = beanPropertyWriter4._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean13 = beanPropertyWriter12._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName14 = beanPropertyWriter12._wrapperName;
        java.lang.Object obj15 = beanPropertyWriter12.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = beanPropertyWriter12.unwrappingWriter(nameTransformer16);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter17);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        beanPropertyWriter17._typeSerializer = typeSerializer19;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = null;
        beanPropertyWriter17.assignSerializer(objJsonSerializer21);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap23 = beanPropertyWriter17._dynamicSerializers;
        beanPropertyWriter4._dynamicSerializers = propertySerializerMap23;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap23;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata26 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.core.io.SerializedString serializedString28 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.util.Annotations annotations29 = beanPropertyWriter0._contextAnnotations;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(value11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(propertyName14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(beanPropertyWriter17);
        org.junit.Assert.assertNotNull(propertySerializerMap23);
        org.junit.Assert.assertNull(propertyMetadata26);
        org.junit.Assert.assertNull(objJsonSerializer27);
        org.junit.Assert.assertNull(serializedString28);
        org.junit.Assert.assertNull(annotations29);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.PropertyName propertyName6 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7);
        java.lang.Object obj11 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter7);
        java.lang.Object obj12 = beanPropertyWriter0._suppressableValue;
        java.lang.reflect.Field field13 = null;
        beanPropertyWriter0._field = field13;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName18 = beanPropertyWriter16._wrapperName;
        com.fasterxml.jackson.core.io.SerializedString serializedString19 = beanPropertyWriter16._name;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = beanPropertyWriter16.getSerializer();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata21 = beanPropertyWriter16.getMetadata();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata22 = beanPropertyWriter16.getMetadata();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType25 = beanPropertyWriter23.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap26 = null;
        beanPropertyWriter23._internalSettings = objMap26;
        boolean boolean28 = beanPropertyWriter23.isVirtual();
        java.lang.Object obj29 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = beanPropertyWriter23.unwrappingWriter(nameTransformer30);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer32 = null;
        beanPropertyWriter23.assignTypeSerializer(typeSerializer32);
        java.lang.Object obj34 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter16, (java.lang.Object) beanPropertyWriter23);
        java.lang.Object obj35 = beanPropertyWriter23._suppressableValue;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(propertyName6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(objMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(propertyName18);
        org.junit.Assert.assertNull(serializedString19);
        org.junit.Assert.assertNull(objJsonSerializer20);
        org.junit.Assert.assertNull(propertyMetadata21);
        org.junit.Assert.assertNull(propertyMetadata22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(javaType25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(beanPropertyWriter31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = null;
        beanPropertyWriter5.assignSerializer(objJsonSerializer9);
        boolean boolean11 = beanPropertyWriter5.hasNullSerializer();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = beanPropertyWriter5._member;
        java.lang.reflect.Type type13 = beanPropertyWriter5.getGenericPropertyType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(annotatedMember12);
        org.junit.Assert.assertNull(type13);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.willSuppressNulls();
        java.lang.reflect.Method method9 = beanPropertyWriter7._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata10 = beanPropertyWriter7._metadata;
        java.lang.Object obj11 = beanPropertyWriter6.getInternalSetting((java.lang.Object) beanPropertyWriter7);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter6.assignTypeSerializer(typeSerializer12);
        java.lang.reflect.Field field14 = beanPropertyWriter6._field;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = null;
        beanPropertyWriter6._internalSettings = objMap15;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean18 = beanPropertyWriter17._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter17._wrapperName;
        java.lang.Object obj20 = beanPropertyWriter17.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = beanPropertyWriter17.unwrappingWriter(nameTransformer21);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter22);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = null;
        beanPropertyWriter22._typeSerializer = typeSerializer24;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter26 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean27 = beanPropertyWriter26._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName28 = beanPropertyWriter26._wrapperName;
        java.lang.Object obj29 = beanPropertyWriter26.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer30 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = beanPropertyWriter26.unwrappingWriter(nameTransformer30);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter31);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer33 = null;
        beanPropertyWriter31._typeSerializer = typeSerializer33;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer35 = null;
        beanPropertyWriter31.assignSerializer(objJsonSerializer35);
        java.lang.Object obj37 = beanPropertyWriter22.removeInternalSetting((java.lang.Object) beanPropertyWriter31);
        com.fasterxml.jackson.annotation.JsonFormat.Value value38 = null;
        beanPropertyWriter22._format = value38;
        com.fasterxml.jackson.databind.JavaType javaType40 = beanPropertyWriter22.getType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter41 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean42 = beanPropertyWriter41._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType43 = beanPropertyWriter41.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap44 = null;
        beanPropertyWriter41._internalSettings = objMap44;
        boolean boolean46 = beanPropertyWriter41.isVirtual();
        java.lang.Object obj47 = beanPropertyWriter41.readResolve();
        com.fasterxml.jackson.annotation.JsonFormat.Value value48 = beanPropertyWriter41._format;
        java.lang.Object obj49 = beanPropertyWriter41.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter50 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean51 = beanPropertyWriter50.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString52 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter53 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter50, serializedString52);
        java.lang.reflect.Type type54 = beanPropertyWriter53.getGenericPropertyType();
        java.lang.Object obj56 = beanPropertyWriter53.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType57 = beanPropertyWriter53._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter58 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter53);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata59 = beanPropertyWriter53._metadata;
        java.lang.Object obj60 = beanPropertyWriter22.setInternalSetting(obj49, (java.lang.Object) beanPropertyWriter53);
        com.fasterxml.jackson.databind.PropertyName propertyName61 = beanPropertyWriter22._wrapperName;
        java.lang.Object obj62 = beanPropertyWriter22._suppressableValue;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter63 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean64 = beanPropertyWriter63.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString65 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter66 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter63, serializedString65);
        java.lang.reflect.Type type67 = beanPropertyWriter66.getGenericPropertyType();
        java.lang.Object obj69 = beanPropertyWriter66.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType70 = beanPropertyWriter66._declaredType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer71 = beanPropertyWriter66._nullSerializer;
        com.fasterxml.jackson.databind.JavaType javaType72 = beanPropertyWriter66.getSerializationType();
        java.lang.Object obj73 = beanPropertyWriter22.removeInternalSetting((java.lang.Object) javaType72);
        java.lang.Object obj74 = beanPropertyWriter6.getInternalSetting((java.lang.Object) beanPropertyWriter22);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap75 = beanPropertyWriter6._dynamicSerializers;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(propertyMetadata10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(field14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(beanPropertyWriter22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(propertyName28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(beanPropertyWriter31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(javaType40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(javaType43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNull(value48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(type54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(javaType57);
        org.junit.Assert.assertNull(propertyMetadata59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(propertyName61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(type67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(javaType70);
        org.junit.Assert.assertNull(objJsonSerializer71);
        org.junit.Assert.assertNull(javaType72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(propertySerializerMap75);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter9._wrapperName;
        java.lang.Object obj12 = beanPropertyWriter9.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = beanPropertyWriter9.unwrappingWriter(nameTransformer13);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        beanPropertyWriter14._typeSerializer = typeSerializer16;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = null;
        beanPropertyWriter14.assignSerializer(objJsonSerializer18);
        java.lang.Object obj20 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter14);
        java.lang.reflect.Field field21 = beanPropertyWriter14._field;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode22 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter14.depositSchemaProperty(objectNode22, serializerProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(beanPropertyWriter14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(field21);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.util.Annotations annotations9 = beanPropertyWriter0._contextAnnotations;
        boolean boolean10 = beanPropertyWriter0.isUnwrapping();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(annotations9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.core.io.SerializedString serializedString5 = beanPropertyWriter0._name;
        boolean boolean6 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertNull(serializedString5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer8;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(value7);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        boolean boolean4 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName5 = beanPropertyWriter0._wrapperName;
        java.lang.reflect.Field field6 = beanPropertyWriter0._field;
        java.lang.reflect.Field field7 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = beanPropertyWriter0._nullSerializer;
        java.lang.Object obj9 = beanPropertyWriter0.readResolve();
        boolean boolean10 = beanPropertyWriter0.willSuppressNulls();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(propertyName5);
        org.junit.Assert.assertNull(field6);
        org.junit.Assert.assertNull(field7);
        org.junit.Assert.assertNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer8;
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer11);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember13 = beanPropertyWriter0.getMember();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(value10);
        org.junit.Assert.assertNull(annotatedMember13);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        java.lang.Object obj6 = beanPropertyWriter3.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter3._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter3);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata9 = beanPropertyWriter3._metadata;
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter3.getType();
        java.lang.reflect.Method method11 = null;
        beanPropertyWriter3._accessorMethod = method11;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter3);
        java.lang.reflect.Method method14 = null;
        beanPropertyWriter3._accessorMethod = method14;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = null;
        beanPropertyWriter3.assignSerializer(objJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(propertyMetadata9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._declaredType;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer6;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0.assignNullSerializer(objJsonSerializer8);
        com.fasterxml.jackson.databind.PropertyName propertyName10 = beanPropertyWriter0._wrapperName;
        java.lang.reflect.Field field11 = beanPropertyWriter0._field;
        java.lang.reflect.Method method12 = beanPropertyWriter0._accessorMethod;
        java.lang.Object obj13 = beanPropertyWriter0._suppressableValue;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNull(field11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getSerializationType();
        java.lang.Object obj9 = beanPropertyWriter0._suppressableValue;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = null;
        beanPropertyWriter5.assignSerializer(objJsonSerializer9);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember11 = beanPropertyWriter5._member;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean13 = beanPropertyWriter12._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter12.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap15 = null;
        beanPropertyWriter12._internalSettings = objMap15;
        boolean boolean17 = beanPropertyWriter12.isVirtual();
        java.lang.Object obj18 = beanPropertyWriter12.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = beanPropertyWriter12.unwrappingWriter(nameTransformer19);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember21 = beanPropertyWriter20._member;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        beanPropertyWriter20._nonTrivialBaseType = javaType22;
        java.lang.Object obj24 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter20);
        java.lang.reflect.Method method25 = null;
        beanPropertyWriter20._accessorMethod = method25;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        beanPropertyWriter20._nonTrivialBaseType = javaType27;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(annotatedMember11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(beanPropertyWriter20);
        org.junit.Assert.assertNull(annotatedMember21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean7 = beanPropertyWriter6._suppressNulls;
        java.lang.Object obj9 = beanPropertyWriter0.setInternalSetting((java.lang.Object) boolean7, (java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.util.Annotations annotations10 = beanPropertyWriter0._contextAnnotations;
        boolean boolean11 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(annotations10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType3;
        java.lang.Object obj6 = beanPropertyWriter0.getInternalSetting((java.lang.Object) 10);
        com.fasterxml.jackson.databind.JavaType javaType7 = null;
        beanPropertyWriter0.setNonTrivialBaseType(javaType7);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter0._member;
        java.lang.reflect.Method method10 = beanPropertyWriter0._accessorMethod;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = beanPropertyWriter0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(annotatedMember9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter0._nonTrivialBaseType;
        java.lang.Object obj8 = beanPropertyWriter0._suppressableValue;
        java.lang.Object obj9 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata10 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean12 = beanPropertyWriter11._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter11.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap14 = null;
        beanPropertyWriter11._internalSettings = objMap14;
        com.fasterxml.jackson.databind.util.Annotations annotations16 = beanPropertyWriter11._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter11._cfgSerializationType;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = beanPropertyWriter11.getSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor19 = null;
        beanPropertyWriter11.depositSchemaProperty(jsonObjectFormatVisitor19);
        com.fasterxml.jackson.core.SerializableString serializableString21 = beanPropertyWriter11.getSerializedName();
        java.lang.reflect.Type type22 = beanPropertyWriter11.getGenericPropertyType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = null;
        beanPropertyWriter11._nullSerializer = objJsonSerializer23;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider26 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsElement((java.lang.Object) beanPropertyWriter11, jsonGenerator25, serializerProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(propertyMetadata10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertNull(annotations16);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(objJsonSerializer18);
        org.junit.Assert.assertNull(serializableString21);
        org.junit.Assert.assertNull(type22);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = beanPropertyWriter0.setInternalSetting(obj7, obj8);
        java.lang.reflect.Method method10 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.core.io.SerializedString serializedString11 = beanPropertyWriter0._name;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer12;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0);
        java.lang.reflect.Field field15 = beanPropertyWriter14._field;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(serializedString11);
        org.junit.Assert.assertNull(field15);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.reflect.Field field1 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer2 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer2);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean6 = beanPropertyWriter5._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName7 = beanPropertyWriter5._wrapperName;
        java.lang.Object obj8 = beanPropertyWriter5.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = beanPropertyWriter5.unwrappingWriter(nameTransformer9);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter10);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer12 = null;
        beanPropertyWriter10._typeSerializer = typeSerializer12;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = null;
        beanPropertyWriter10.assignSerializer(objJsonSerializer14);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter10);
        java.lang.Object obj17 = beanPropertyWriter0.getInternalSetting((java.lang.Object) beanPropertyWriter16);
        java.lang.Object obj18 = beanPropertyWriter16._suppressableValue;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode19 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode20 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter16._depositSchemaProperty(objectNode19, jsonNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(field1);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(propertyName7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(beanPropertyWriter10);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector8 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value9 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector8);
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter0.getSerializationType();
        java.lang.reflect.Method method12 = null;
        beanPropertyWriter0._accessorMethod = method12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertNull(value9);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(javaType11);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter9._wrapperName;
        java.lang.Object obj12 = beanPropertyWriter9.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = beanPropertyWriter9.unwrappingWriter(nameTransformer13);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        beanPropertyWriter14._typeSerializer = typeSerializer16;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = null;
        beanPropertyWriter14.assignSerializer(objJsonSerializer18);
        java.lang.Object obj20 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter14);
        com.fasterxml.jackson.annotation.JsonFormat.Value value21 = null;
        beanPropertyWriter5._format = value21;
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter5.getType();
        java.lang.reflect.Method method24 = null;
        beanPropertyWriter5._accessorMethod = method24;
        java.lang.reflect.Field field26 = beanPropertyWriter5._field;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean28 = beanPropertyWriter27.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString29 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter27, serializedString29);
        java.lang.reflect.Type type31 = beanPropertyWriter30.getGenericPropertyType();
        java.lang.Object obj33 = beanPropertyWriter30.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType34 = beanPropertyWriter30._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean36 = beanPropertyWriter35._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter35.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString38 = beanPropertyWriter35.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector39 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value40 = beanPropertyWriter35.findFormatOverrides(annotationIntrospector39);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter41 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean42 = beanPropertyWriter41.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString43 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter44 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter41, serializedString43);
        java.lang.reflect.Type type45 = beanPropertyWriter44.getGenericPropertyType();
        java.lang.Object obj47 = beanPropertyWriter44.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType48 = beanPropertyWriter44._declaredType;
        java.lang.Object obj49 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY;
        java.lang.Object obj50 = beanPropertyWriter35.setInternalSetting((java.lang.Object) javaType48, obj49);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer51 = null;
        beanPropertyWriter35.assignSerializer(objJsonSerializer51);
        java.lang.Object obj53 = beanPropertyWriter30.getInternalSetting((java.lang.Object) objJsonSerializer51);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer54 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter55 = beanPropertyWriter30.unwrappingWriter(nameTransformer54);
        java.lang.reflect.Field field56 = null;
        beanPropertyWriter30._field = field56;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = beanPropertyWriter5.get((java.lang.Object) beanPropertyWriter30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(beanPropertyWriter14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(field26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(type31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(javaType34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(serializableString38);
        org.junit.Assert.assertNull(value40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(type45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(javaType48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY + "'", obj49.equals(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(beanPropertyWriter55);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString9 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7, serializedString9);
        java.lang.reflect.Type type11 = beanPropertyWriter10.getGenericPropertyType();
        java.lang.Object obj13 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter10._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter10.assignTypeSerializer(typeSerializer15);
        com.fasterxml.jackson.annotation.JsonFormat.Value value17 = null;
        beanPropertyWriter10._format = value17;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean20 = beanPropertyWriter19.willSuppressNulls();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap21 = null;
        beanPropertyWriter19._internalSettings = objMap21;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = beanPropertyWriter23._wrapperName;
        java.lang.Object obj26 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = beanPropertyWriter23.unwrappingWriter(nameTransformer27);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer30 = null;
        beanPropertyWriter28._typeSerializer = typeSerializer30;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter28.assignSerializer(objJsonSerializer32);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap34 = beanPropertyWriter28._dynamicSerializers;
        beanPropertyWriter19._dynamicSerializers = propertySerializerMap34;
        beanPropertyWriter10._dynamicSerializers = propertySerializerMap34;
        beanPropertyWriter3._dynamicSerializers = propertySerializerMap34;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata38 = beanPropertyWriter3._metadata;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer39 = null;
        beanPropertyWriter3._typeSerializer = typeSerializer39;
        com.fasterxml.jackson.databind.PropertyName propertyName41 = beanPropertyWriter3._wrapperName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(propertyName25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(beanPropertyWriter28);
        org.junit.Assert.assertNotNull(propertySerializerMap34);
        org.junit.Assert.assertNull(propertyMetadata38);
        org.junit.Assert.assertNull(propertyName41);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._declaredType;
        java.lang.reflect.Method method4 = null;
        beanPropertyWriter0._accessorMethod = method4;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter7._cfgSerializationType;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember9 = beanPropertyWriter7.getMember();
        boolean boolean10 = beanPropertyWriter7._suppressNulls;
        boolean boolean11 = beanPropertyWriter7.hasNullSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(annotatedMember9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        boolean boolean3 = beanPropertyWriter0.hasNullSerializer();
        com.fasterxml.jackson.core.io.SerializedString serializedString4 = beanPropertyWriter0._name;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap5 = beanPropertyWriter0._internalSettings;
        java.lang.reflect.Field field6 = null;
        beanPropertyWriter0._field = field6;
        java.lang.Class<?>[] wildcardClassArray8 = beanPropertyWriter0._includeInViews;
        boolean boolean9 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = beanPropertyWriter10._wrapperName;
        java.lang.Object obj13 = beanPropertyWriter10.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = beanPropertyWriter10.unwrappingWriter(nameTransformer14);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter15);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean18 = beanPropertyWriter17.willSuppressNulls();
        java.lang.reflect.Method method19 = beanPropertyWriter17._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata20 = beanPropertyWriter17._metadata;
        java.lang.Object obj21 = beanPropertyWriter16.getInternalSetting((java.lang.Object) beanPropertyWriter17);
        com.fasterxml.jackson.databind.PropertyName propertyName22 = beanPropertyWriter16._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = null;
        beanPropertyWriter16._nullSerializer = objJsonSerializer23;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter25 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean26 = beanPropertyWriter25._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType27 = beanPropertyWriter25.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap28 = null;
        beanPropertyWriter25._internalSettings = objMap28;
        boolean boolean30 = beanPropertyWriter25.isVirtual();
        java.lang.Object obj31 = beanPropertyWriter25.readResolve();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap32 = null;
        beanPropertyWriter25._internalSettings = objMap32;
        java.lang.reflect.Method method34 = beanPropertyWriter25._accessorMethod;
        com.fasterxml.jackson.databind.PropertyName propertyName35 = beanPropertyWriter25._wrapperName;
        java.lang.Object obj36 = beanPropertyWriter16.removeInternalSetting((java.lang.Object) beanPropertyWriter25);
        java.lang.Object obj37 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter25);
        boolean boolean38 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName39 = beanPropertyWriter0._wrapperName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(serializedString4);
        org.junit.Assert.assertNull(objMap5);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(beanPropertyWriter15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(propertyMetadata20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(propertyName22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(javaType27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(propertyName35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(propertyName39);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.util.Annotations annotations2 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType3 = beanPropertyWriter0._cfgSerializationType;
        com.fasterxml.jackson.core.SerializableString serializableString4 = beanPropertyWriter0.getSerializedName();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata5 = beanPropertyWriter0.getMetadata();
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = null;
        beanPropertyWriter7._internalSettings = objMap10;
        boolean boolean12 = beanPropertyWriter7.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean14 = beanPropertyWriter13._suppressNulls;
        java.lang.Object obj16 = beanPropertyWriter7.setInternalSetting((java.lang.Object) boolean14, (java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean18 = beanPropertyWriter17._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter17._wrapperName;
        java.lang.Object obj20 = beanPropertyWriter17.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = beanPropertyWriter17.unwrappingWriter(nameTransformer21);
        com.fasterxml.jackson.databind.util.Annotations annotations23 = beanPropertyWriter17._contextAnnotations;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = beanPropertyWriter17.setInternalSetting(obj24, obj25);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer27 = null;
        beanPropertyWriter17._typeSerializer = typeSerializer27;
        java.lang.Object obj29 = beanPropertyWriter7.getInternalSetting((java.lang.Object) beanPropertyWriter17);
        boolean boolean30 = beanPropertyWriter17.willSuppressNulls();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter31 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean32 = beanPropertyWriter31._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType33 = beanPropertyWriter31.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        beanPropertyWriter31._nonTrivialBaseType = javaType34;
        java.lang.Object obj37 = beanPropertyWriter31.getInternalSetting((java.lang.Object) 10);
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        beanPropertyWriter31.setNonTrivialBaseType(javaType38);
        boolean boolean40 = beanPropertyWriter31.isVirtual();
        java.lang.Object obj41 = beanPropertyWriter0.setInternalSetting((java.lang.Object) boolean30, (java.lang.Object) beanPropertyWriter31);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer42 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter43 = beanPropertyWriter31.unwrappingWriter(nameTransformer42);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter44 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean45 = beanPropertyWriter44._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType46 = beanPropertyWriter44.getSerializationType();
        boolean boolean47 = beanPropertyWriter44.hasNullSerializer();
        boolean boolean48 = beanPropertyWriter44.hasSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName49 = beanPropertyWriter44._wrapperName;
        java.lang.reflect.Field field50 = beanPropertyWriter44._field;
        java.lang.reflect.Field field51 = beanPropertyWriter44._field;
        java.lang.reflect.Method method52 = null;
        beanPropertyWriter44._accessorMethod = method52;
        com.fasterxml.jackson.databind.JavaType javaType54 = beanPropertyWriter44._nonTrivialBaseType;
        java.lang.Object obj55 = beanPropertyWriter31.getInternalSetting((java.lang.Object) javaType54);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(annotations2);
        org.junit.Assert.assertNull(javaType3);
        org.junit.Assert.assertNull(serializableString4);
        org.junit.Assert.assertNull(propertyMetadata5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(beanPropertyWriter22);
        org.junit.Assert.assertNull(annotations23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(javaType33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(beanPropertyWriter43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(javaType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(propertyName49);
        org.junit.Assert.assertNull(field50);
        org.junit.Assert.assertNull(field51);
        org.junit.Assert.assertNull(javaType54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = null;
        beanPropertyWriter0._serializer = objJsonSerializer2;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean5 = beanPropertyWriter4._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter4.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap7 = null;
        beanPropertyWriter4._internalSettings = objMap7;
        boolean boolean9 = beanPropertyWriter4.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        java.lang.Object obj13 = beanPropertyWriter4.setInternalSetting((java.lang.Object) boolean11, (java.lang.Object) (byte) 10);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap14 = null;
        beanPropertyWriter4._dynamicSerializers = propertySerializerMap14;
        java.lang.Object obj16 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter4);
        boolean boolean17 = beanPropertyWriter0.hasSerializer();
        boolean boolean18 = beanPropertyWriter0._suppressNulls;
        boolean boolean19 = beanPropertyWriter0.willSuppressNulls();
        java.lang.Class<?>[] wildcardClassArray20 = beanPropertyWriter0.getViews();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = beanPropertyWriter0.getSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardClassArray20);
        org.junit.Assert.assertNull(objJsonSerializer21);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        boolean boolean7 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.annotation.JsonFormat.Value value8 = null;
        beanPropertyWriter0._format = value8;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer10);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean15 = beanPropertyWriter14._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName16 = beanPropertyWriter14._wrapperName;
        java.lang.Object obj17 = beanPropertyWriter14.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = beanPropertyWriter14.unwrappingWriter(nameTransformer18);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter20 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter19);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer21 = null;
        beanPropertyWriter19._typeSerializer = typeSerializer21;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = beanPropertyWriter23._wrapperName;
        java.lang.Object obj26 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = beanPropertyWriter23.unwrappingWriter(nameTransformer27);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer30 = null;
        beanPropertyWriter28._typeSerializer = typeSerializer30;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter28.assignSerializer(objJsonSerializer32);
        java.lang.Object obj34 = beanPropertyWriter19.removeInternalSetting((java.lang.Object) beanPropertyWriter28);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter35 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean36 = beanPropertyWriter35._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter35.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap38 = null;
        beanPropertyWriter35._internalSettings = objMap38;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer40 = null;
        beanPropertyWriter35.assignTypeSerializer(typeSerializer40);
        java.lang.Class<?>[] wildcardClassArray42 = beanPropertyWriter35.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer43 = null;
        beanPropertyWriter35.assignTypeSerializer(typeSerializer43);
        java.lang.Object obj45 = beanPropertyWriter19.removeInternalSetting((java.lang.Object) beanPropertyWriter35);
        com.fasterxml.jackson.annotation.JsonFormat.Value value46 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.NO_FORMAT;
        beanPropertyWriter19._format = value46;
        beanPropertyWriter0._format = value46;
        com.fasterxml.jackson.databind.JavaType javaType49 = beanPropertyWriter0.getSerializationType();
        java.lang.Object obj50 = beanPropertyWriter0.readResolve();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedMember12);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(propertyName16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(beanPropertyWriter19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(propertyName25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(beanPropertyWriter28);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(wildcardClassArray42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(value46);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString9 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7, serializedString9);
        java.lang.reflect.Type type11 = beanPropertyWriter10.getGenericPropertyType();
        java.lang.Object obj13 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter10._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter10.assignTypeSerializer(typeSerializer15);
        com.fasterxml.jackson.annotation.JsonFormat.Value value17 = null;
        beanPropertyWriter10._format = value17;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean20 = beanPropertyWriter19.willSuppressNulls();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap21 = null;
        beanPropertyWriter19._internalSettings = objMap21;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = beanPropertyWriter23._wrapperName;
        java.lang.Object obj26 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = beanPropertyWriter23.unwrappingWriter(nameTransformer27);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer30 = null;
        beanPropertyWriter28._typeSerializer = typeSerializer30;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter28.assignSerializer(objJsonSerializer32);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap34 = beanPropertyWriter28._dynamicSerializers;
        beanPropertyWriter19._dynamicSerializers = propertySerializerMap34;
        beanPropertyWriter10._dynamicSerializers = propertySerializerMap34;
        beanPropertyWriter3._dynamicSerializers = propertySerializerMap34;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer38 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = beanPropertyWriter3.unwrappingWriter(nameTransformer38);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean41 = beanPropertyWriter40._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName42 = beanPropertyWriter40._wrapperName;
        java.lang.Object obj43 = beanPropertyWriter40.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer44 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter45 = beanPropertyWriter40.unwrappingWriter(nameTransformer44);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap46 = beanPropertyWriter45._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter47 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean48 = beanPropertyWriter47._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType49 = beanPropertyWriter47.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap50 = beanPropertyWriter47._internalSettings;
        java.lang.Object obj51 = beanPropertyWriter45.removeInternalSetting((java.lang.Object) objMap50);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata52 = beanPropertyWriter45._metadata;
        boolean boolean53 = beanPropertyWriter45.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer54 = beanPropertyWriter45.getTypeSerializer();
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata55 = beanPropertyWriter45._metadata;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter56 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer57 = beanPropertyWriter56._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter58 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean59 = beanPropertyWriter58.willSuppressNulls();
        java.lang.reflect.Method method60 = beanPropertyWriter58._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter61 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean62 = beanPropertyWriter61._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType63 = beanPropertyWriter61.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap64 = null;
        beanPropertyWriter61._internalSettings = objMap64;
        com.fasterxml.jackson.databind.util.Annotations annotations66 = beanPropertyWriter61._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType67 = beanPropertyWriter61._cfgSerializationType;
        java.lang.Object obj68 = beanPropertyWriter61._suppressableValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer69 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter70 = beanPropertyWriter61.unwrappingWriter(nameTransformer69);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter71 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean72 = beanPropertyWriter71.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString73 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter74 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter71, serializedString73);
        java.lang.Object obj76 = beanPropertyWriter71.removeInternalSetting((java.lang.Object) (byte) -1);
        com.fasterxml.jackson.core.io.SerializedString serializedString77 = beanPropertyWriter71._name;
        java.lang.Object obj78 = beanPropertyWriter58.setInternalSetting((java.lang.Object) nameTransformer69, (java.lang.Object) beanPropertyWriter71);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata79 = beanPropertyWriter58.getMetadata();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap80 = beanPropertyWriter58._internalSettings;
        beanPropertyWriter56._internalSettings = objMap80;
        beanPropertyWriter45._internalSettings = objMap80;
        beanPropertyWriter39._internalSettings = objMap80;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer84 = beanPropertyWriter39._typeSerializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter85 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean86 = beanPropertyWriter85._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType87 = beanPropertyWriter85.getSerializationType();
        boolean boolean88 = beanPropertyWriter85.hasNullSerializer();
        java.lang.Class<?>[] wildcardClassArray89 = beanPropertyWriter85._includeInViews;
        java.lang.Object obj90 = beanPropertyWriter85.readResolve();
        java.lang.reflect.Field field91 = beanPropertyWriter85._field;
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap92 = beanPropertyWriter85._dynamicSerializers;
        beanPropertyWriter39._dynamicSerializers = propertySerializerMap92;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer94 = beanPropertyWriter39._typeSerializer;
        java.lang.Object obj95 = beanPropertyWriter39._suppressableValue;
        com.fasterxml.jackson.databind.util.Annotations annotations96 = beanPropertyWriter39._contextAnnotations;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(propertyName25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(beanPropertyWriter28);
        org.junit.Assert.assertNotNull(propertySerializerMap34);
        org.junit.Assert.assertNotNull(beanPropertyWriter39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(propertyName42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(beanPropertyWriter45);
        org.junit.Assert.assertNotNull(propertySerializerMap46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(javaType49);
        org.junit.Assert.assertNull(objMap50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(propertyMetadata52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(typeSerializer54);
        org.junit.Assert.assertNull(propertyMetadata55);
        org.junit.Assert.assertNull(objJsonSerializer57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(method60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(javaType63);
        org.junit.Assert.assertNull(annotations66);
        org.junit.Assert.assertNull(javaType67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(beanPropertyWriter70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(serializedString77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(propertyMetadata79);
        org.junit.Assert.assertNotNull(objMap80);
        org.junit.Assert.assertNull(typeSerializer84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(javaType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(wildcardClassArray89);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertNull(field91);
        org.junit.Assert.assertNotNull(propertySerializerMap92);
        org.junit.Assert.assertNull(typeSerializer94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(annotations96);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean4 = beanPropertyWriter3._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter3.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap6 = null;
        beanPropertyWriter3._internalSettings = objMap6;
        com.fasterxml.jackson.databind.util.Annotations annotations8 = beanPropertyWriter3._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter3._cfgSerializationType;
        java.lang.Object obj10 = beanPropertyWriter3._suppressableValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter3.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean14 = beanPropertyWriter13.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString15 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter13, serializedString15);
        java.lang.Object obj18 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) (byte) -1);
        com.fasterxml.jackson.core.io.SerializedString serializedString19 = beanPropertyWriter13._name;
        java.lang.Object obj20 = beanPropertyWriter0.setInternalSetting((java.lang.Object) nameTransformer11, (java.lang.Object) beanPropertyWriter13);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector22 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value23 = beanPropertyWriter0.findFormatOverrides(annotationIntrospector22);
        java.lang.reflect.Field field24 = null;
        beanPropertyWriter0._field = field24;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer26 = beanPropertyWriter0._typeSerializer;
        java.lang.reflect.Type type27 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType28;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean31 = beanPropertyWriter30.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString32 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter33 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter30, serializedString32);
        java.lang.reflect.Type type34 = beanPropertyWriter33.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value35 = null;
        beanPropertyWriter33._format = value35;
        com.fasterxml.jackson.databind.JavaType javaType37 = beanPropertyWriter33._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer38 = null;
        beanPropertyWriter33._typeSerializer = typeSerializer38;
        com.fasterxml.jackson.databind.JavaType javaType40 = beanPropertyWriter33._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer41 = null;
        beanPropertyWriter33._typeSerializer = typeSerializer41;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator43 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider44 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsPlaceholder((java.lang.Object) typeSerializer41, jsonGenerator43, serializerProvider44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNull(annotations8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(serializedString19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(objJsonSerializer21);
        org.junit.Assert.assertNull(value23);
        org.junit.Assert.assertNull(typeSerializer26);
        org.junit.Assert.assertNull(type27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(type34);
        org.junit.Assert.assertNull(javaType37);
        org.junit.Assert.assertNull(javaType40);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer8;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = null;
        beanPropertyWriter0.assignSerializer(objJsonSerializer10);
        boolean boolean12 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap13 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.annotation.JsonFormat.Value value14 = beanPropertyWriter0._format;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objMap13);
        org.junit.Assert.assertNull(value14);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = beanPropertyWriter8._wrapperName;
        java.lang.Object obj11 = beanPropertyWriter8.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter8.unwrappingWriter(nameTransformer12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter13);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter13._typeSerializer = typeSerializer15;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter17 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean18 = beanPropertyWriter17._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter17._wrapperName;
        java.lang.Object obj20 = beanPropertyWriter17.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = beanPropertyWriter17.unwrappingWriter(nameTransformer21);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter22);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = null;
        beanPropertyWriter22._typeSerializer = typeSerializer24;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = null;
        beanPropertyWriter22.assignSerializer(objJsonSerializer26);
        java.lang.Object obj28 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) beanPropertyWriter22);
        boolean boolean29 = beanPropertyWriter22.isVirtual();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer30 = null;
        beanPropertyWriter22.assignSerializer(objJsonSerializer30);
        java.lang.Object obj32 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) beanPropertyWriter22);
        java.lang.reflect.Method method33 = null;
        beanPropertyWriter22._accessorMethod = method33;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(beanPropertyWriter13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(beanPropertyWriter22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType6;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter0.getType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(javaType8);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        java.lang.Object obj7 = beanPropertyWriter6._suppressableValue;
        com.fasterxml.jackson.databind.PropertyName propertyName8 = beanPropertyWriter6._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter9.getSerializationType();
        boolean boolean12 = beanPropertyWriter9.hasNullSerializer();
        boolean boolean13 = beanPropertyWriter9.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap14 = beanPropertyWriter9._internalSettings;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean16 = beanPropertyWriter15.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString17 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter15, serializedString17);
        java.lang.reflect.Type type19 = beanPropertyWriter18.getGenericPropertyType();
        java.lang.Object obj21 = beanPropertyWriter18.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType22 = beanPropertyWriter18._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter18);
        java.lang.Object obj24 = beanPropertyWriter9.getInternalSetting((java.lang.Object) beanPropertyWriter18);
        java.lang.Object obj25 = beanPropertyWriter9._suppressableValue;
        java.lang.reflect.Method method26 = beanPropertyWriter9._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter27 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean28 = beanPropertyWriter27.willSuppressNulls();
        java.lang.reflect.Method method29 = beanPropertyWriter27._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean31 = beanPropertyWriter30._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter30.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap33 = null;
        beanPropertyWriter30._internalSettings = objMap33;
        com.fasterxml.jackson.databind.util.Annotations annotations35 = beanPropertyWriter30._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType36 = beanPropertyWriter30._cfgSerializationType;
        java.lang.Object obj37 = beanPropertyWriter30._suppressableValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer38 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter39 = beanPropertyWriter30.unwrappingWriter(nameTransformer38);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter40 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean41 = beanPropertyWriter40.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString42 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter43 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter40, serializedString42);
        java.lang.Object obj45 = beanPropertyWriter40.removeInternalSetting((java.lang.Object) (byte) -1);
        com.fasterxml.jackson.core.io.SerializedString serializedString46 = beanPropertyWriter40._name;
        java.lang.Object obj47 = beanPropertyWriter27.setInternalSetting((java.lang.Object) nameTransformer38, (java.lang.Object) beanPropertyWriter40);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata48 = beanPropertyWriter27.getMetadata();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap49 = beanPropertyWriter27._internalSettings;
        beanPropertyWriter9._internalSettings = objMap49;
        beanPropertyWriter6._internalSettings = objMap49;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(propertyName8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(objMap14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(type19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(javaType22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(annotations35);
        org.junit.Assert.assertNull(javaType36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(beanPropertyWriter39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(serializedString46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(propertyMetadata48);
        org.junit.Assert.assertNotNull(objMap49);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        boolean boolean5 = beanPropertyWriter0.isVirtual();
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        boolean boolean7 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = null;
        beanPropertyWriter0._typeSerializer = typeSerializer8;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter0._wrapperName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(objJsonSerializer10);
        org.junit.Assert.assertNull(propertyName11);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        java.lang.reflect.Type type8 = beanPropertyWriter0.getGenericPropertyType();
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter0._nonTrivialBaseType;
        boolean boolean10 = beanPropertyWriter0._suppressNulls;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(type8);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        java.lang.Object obj7 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer8;
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter0._internalSettings;
        java.lang.Class<?> wildcardClass11 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter0.unwrappingWriter(nameTransformer12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(beanPropertyWriter13);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.databind.util.Annotations annotations2 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.util.Annotations annotations3 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj4 = beanPropertyWriter0._suppressableValue;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter0.unwrappingWriter(nameTransformer7);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = beanPropertyWriter0.getTypeSerializer();
        com.fasterxml.jackson.databind.JavaType javaType10 = beanPropertyWriter0.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = beanPropertyWriter0.isRequired();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(annotations2);
        org.junit.Assert.assertNull(annotations3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertNull(typeSerializer9);
        org.junit.Assert.assertNull(javaType10);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata3 = beanPropertyWriter0._metadata;
        com.fasterxml.jackson.annotation.JsonFormat.Value value4 = null;
        beanPropertyWriter0._format = value4;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = null;
        beanPropertyWriter0._nullSerializer = objJsonSerializer6;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = null;
        beanPropertyWriter0._serializer = objJsonSerializer8;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(propertyMetadata3);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType3;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._serializer;
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor6 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor6);
        java.lang.Class<?> wildcardClass8 = beanPropertyWriter0.getRawSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter0._cfgSerializationType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objJsonSerializer5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(javaType9);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata8 = beanPropertyWriter7._metadata;
        boolean boolean9 = beanPropertyWriter7.isUnwrapping();
        java.lang.Class<?>[] wildcardClassArray10 = beanPropertyWriter7._includeInViews;
        com.fasterxml.jackson.core.io.SerializedString serializedString11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7, serializedString11);
        java.lang.Class<?>[] wildcardClassArray13 = beanPropertyWriter12.getViews();
        boolean boolean14 = beanPropertyWriter12._suppressNulls;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertNull(propertyMetadata8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardClassArray10);
        org.junit.Assert.assertNull(wildcardClassArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        beanPropertyWriter0._nonTrivialBaseType = javaType3;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = beanPropertyWriter0._serializer;
        java.lang.reflect.Field field6 = beanPropertyWriter0._field;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = beanPropertyWriter0.getTypeSerializer();
        java.lang.Class<?>[] wildcardClassArray8 = beanPropertyWriter0._includeInViews;
        boolean boolean9 = beanPropertyWriter0.isVirtual();
        boolean boolean10 = beanPropertyWriter0.hasSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objJsonSerializer5);
        org.junit.Assert.assertNull(field6);
        org.junit.Assert.assertNull(typeSerializer7);
        org.junit.Assert.assertNull(wildcardClassArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString9 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter7, serializedString9);
        java.lang.reflect.Type type11 = beanPropertyWriter10.getGenericPropertyType();
        java.lang.Object obj13 = beanPropertyWriter10.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType14 = beanPropertyWriter10._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter10.assignTypeSerializer(typeSerializer15);
        com.fasterxml.jackson.annotation.JsonFormat.Value value17 = null;
        beanPropertyWriter10._format = value17;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean20 = beanPropertyWriter19.willSuppressNulls();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap21 = null;
        beanPropertyWriter19._internalSettings = objMap21;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = beanPropertyWriter23._wrapperName;
        java.lang.Object obj26 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = beanPropertyWriter23.unwrappingWriter(nameTransformer27);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer30 = null;
        beanPropertyWriter28._typeSerializer = typeSerializer30;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter28.assignSerializer(objJsonSerializer32);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap34 = beanPropertyWriter28._dynamicSerializers;
        beanPropertyWriter19._dynamicSerializers = propertySerializerMap34;
        beanPropertyWriter10._dynamicSerializers = propertySerializerMap34;
        beanPropertyWriter3._dynamicSerializers = propertySerializerMap34;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata38 = beanPropertyWriter3._metadata;
        java.lang.reflect.Method method39 = null;
        beanPropertyWriter3._accessorMethod = method39;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer41 = beanPropertyWriter3._nullSerializer;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(type11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(javaType14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(propertyName25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(beanPropertyWriter28);
        org.junit.Assert.assertNotNull(propertySerializerMap34);
        org.junit.Assert.assertNull(propertyMetadata38);
        org.junit.Assert.assertNull(objJsonSerializer41);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter2 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean3 = beanPropertyWriter2._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter2._wrapperName;
        java.lang.Object obj5 = beanPropertyWriter2.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter2.unwrappingWriter(nameTransformer6);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer8 = beanPropertyWriter2.getTypeSerializer();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = beanPropertyWriter2._serializer;
        java.lang.Object obj10 = beanPropertyWriter0.getInternalSetting((java.lang.Object) beanPropertyWriter2);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean12 = beanPropertyWriter11._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType13 = beanPropertyWriter11.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap14 = null;
        beanPropertyWriter11._internalSettings = objMap14;
        boolean boolean16 = beanPropertyWriter11.isVirtual();
        java.lang.Object obj17 = beanPropertyWriter11.readResolve();
        boolean boolean18 = beanPropertyWriter11._suppressNulls;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        beanPropertyWriter11._typeSerializer = typeSerializer19;
        boolean boolean21 = beanPropertyWriter11.willSuppressNulls();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = beanPropertyWriter11.getSerializer();
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter11.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = beanPropertyWriter2.get((java.lang.Object) javaType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertNull(typeSerializer8);
        org.junit.Assert.assertNull(objJsonSerializer9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(javaType13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(objJsonSerializer22);
        org.junit.Assert.assertNull(javaType23);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        java.lang.Object obj6 = beanPropertyWriter3.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter3._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter3);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = null;
        beanPropertyWriter8._serializer = objJsonSerializer9;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer11 = null;
        beanPropertyWriter8.assignTypeSerializer(typeSerializer11);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer13 = beanPropertyWriter8.getTypeSerializer();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector14 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value15 = beanPropertyWriter8.findFormatOverrides(annotationIntrospector14);
        java.lang.reflect.Field field16 = beanPropertyWriter8._field;
        java.lang.Class<?>[] wildcardClassArray17 = beanPropertyWriter8._includeInViews;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter18 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean19 = beanPropertyWriter18._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType20 = beanPropertyWriter18.getSerializationType();
        boolean boolean21 = beanPropertyWriter18.hasNullSerializer();
        boolean boolean22 = beanPropertyWriter18.hasSerializer();
        com.fasterxml.jackson.databind.PropertyName propertyName23 = beanPropertyWriter18._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean25 = beanPropertyWriter24._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter24.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap27 = null;
        beanPropertyWriter24._internalSettings = objMap27;
        com.fasterxml.jackson.databind.util.Annotations annotations29 = beanPropertyWriter24._contextAnnotations;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter30 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean31 = beanPropertyWriter30._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType32 = beanPropertyWriter30.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap33 = beanPropertyWriter30._internalSettings;
        java.lang.Object obj34 = beanPropertyWriter30.readResolve();
        java.lang.Object obj35 = beanPropertyWriter18.setInternalSetting((java.lang.Object) annotations29, (java.lang.Object) beanPropertyWriter30);
        java.lang.reflect.Method method36 = beanPropertyWriter18._accessorMethod;
        java.lang.Object obj37 = beanPropertyWriter8.removeInternalSetting((java.lang.Object) method36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertNull(typeSerializer13);
        org.junit.Assert.assertNull(value15);
        org.junit.Assert.assertNull(field16);
        org.junit.Assert.assertNull(wildcardClassArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(javaType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(propertyName23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(annotations29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(javaType32);
        org.junit.Assert.assertNull(objMap33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.annotation.JsonFormat.Value value7 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean9 = beanPropertyWriter8._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName10 = beanPropertyWriter8._wrapperName;
        java.lang.Object obj11 = beanPropertyWriter8.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = beanPropertyWriter8.unwrappingWriter(nameTransformer12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter13);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        beanPropertyWriter13._typeSerializer = typeSerializer15;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = null;
        beanPropertyWriter13.assignSerializer(objJsonSerializer17);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap19 = beanPropertyWriter13._dynamicSerializers;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap19;
        com.fasterxml.jackson.databind.PropertyName propertyName21 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean23 = beanPropertyWriter22._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter22.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap25 = beanPropertyWriter22._internalSettings;
        com.fasterxml.jackson.databind.PropertyName propertyName26 = beanPropertyWriter22.getWrapperName();
        java.lang.Object obj27 = beanPropertyWriter22.readResolve();
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap28 = beanPropertyWriter22._dynamicSerializers;
        beanPropertyWriter0._dynamicSerializers = propertySerializerMap28;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(value7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(propertyName10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(beanPropertyWriter13);
        org.junit.Assert.assertNotNull(propertySerializerMap19);
        org.junit.Assert.assertNull(propertyName21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertNull(objMap25);
        org.junit.Assert.assertNull(propertyName26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(propertySerializerMap28);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter5._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter7._internalSettings;
        java.lang.Object obj11 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) objMap10);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        boolean boolean13 = beanPropertyWriter5.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter5.getTypeSerializer();
        java.lang.Object obj15 = beanPropertyWriter5._suppressableValue;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter16 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean17 = beanPropertyWriter16.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString18 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter16, serializedString18);
        java.lang.reflect.Type type20 = beanPropertyWriter19.getGenericPropertyType();
        java.lang.Object obj22 = beanPropertyWriter19.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter19._declaredType;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer24 = null;
        beanPropertyWriter19.assignTypeSerializer(typeSerializer24);
        com.fasterxml.jackson.annotation.JsonFormat.Value value26 = null;
        beanPropertyWriter19._format = value26;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean29 = beanPropertyWriter28.willSuppressNulls();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap30 = null;
        beanPropertyWriter28._internalSettings = objMap30;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter32 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean33 = beanPropertyWriter32._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName34 = beanPropertyWriter32._wrapperName;
        java.lang.Object obj35 = beanPropertyWriter32.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer36 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = beanPropertyWriter32.unwrappingWriter(nameTransformer36);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter38 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter37);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer39 = null;
        beanPropertyWriter37._typeSerializer = typeSerializer39;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer41 = null;
        beanPropertyWriter37.assignSerializer(objJsonSerializer41);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap43 = beanPropertyWriter37._dynamicSerializers;
        beanPropertyWriter28._dynamicSerializers = propertySerializerMap43;
        beanPropertyWriter19._dynamicSerializers = propertySerializerMap43;
        beanPropertyWriter5._dynamicSerializers = propertySerializerMap43;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter47 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        java.lang.Object obj48 = beanPropertyWriter47._suppressableValue;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(type20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(propertyName34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(beanPropertyWriter37);
        org.junit.Assert.assertNotNull(propertySerializerMap43);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.databind.PropertyName propertyName4 = beanPropertyWriter0.getWrapperName();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = beanPropertyWriter0._format;
        java.lang.Object obj6 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = beanPropertyWriter7._wrapperName;
        java.lang.Object obj10 = beanPropertyWriter7.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = beanPropertyWriter7.unwrappingWriter(nameTransformer11);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter13 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter12);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean15 = beanPropertyWriter14.willSuppressNulls();
        java.lang.reflect.Method method16 = beanPropertyWriter14._accessorMethod;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata17 = beanPropertyWriter14._metadata;
        java.lang.Object obj18 = beanPropertyWriter13.getInternalSetting((java.lang.Object) beanPropertyWriter14);
        com.fasterxml.jackson.databind.PropertyName propertyName19 = beanPropertyWriter13._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = null;
        beanPropertyWriter13._nullSerializer = objJsonSerializer20;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter22 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean23 = beanPropertyWriter22._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType24 = beanPropertyWriter22.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap25 = null;
        beanPropertyWriter22._internalSettings = objMap25;
        boolean boolean27 = beanPropertyWriter22.isVirtual();
        java.lang.Object obj28 = beanPropertyWriter22.readResolve();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap29 = null;
        beanPropertyWriter22._internalSettings = objMap29;
        java.lang.reflect.Method method31 = beanPropertyWriter22._accessorMethod;
        com.fasterxml.jackson.databind.PropertyName propertyName32 = beanPropertyWriter22._wrapperName;
        java.lang.Object obj33 = beanPropertyWriter13.removeInternalSetting((java.lang.Object) beanPropertyWriter22);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider35 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.serializeAsPlaceholder((java.lang.Object) beanPropertyWriter22, jsonGenerator34, serializerProvider35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(objMap3);
        org.junit.Assert.assertNull(propertyName4);
        org.junit.Assert.assertNull(value5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(propertyName9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(beanPropertyWriter12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(propertyMetadata17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(propertyName19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(javaType24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(propertyName32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.JavaType javaType7 = beanPropertyWriter5.getSerializationType();
        boolean boolean8 = beanPropertyWriter5.isVirtual();
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType11 = beanPropertyWriter9.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap12 = null;
        beanPropertyWriter9._internalSettings = objMap12;
        com.fasterxml.jackson.databind.util.Annotations annotations14 = beanPropertyWriter9._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType15 = beanPropertyWriter9._cfgSerializationType;
        boolean boolean16 = beanPropertyWriter9.hasSerializer();
        com.fasterxml.jackson.annotation.JsonFormat.Value value17 = null;
        beanPropertyWriter9._format = value17;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer19 = null;
        beanPropertyWriter9.assignTypeSerializer(typeSerializer19);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember21 = beanPropertyWriter9.getMember();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = null;
        beanPropertyWriter9._serializer = objJsonSerializer22;
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata24 = beanPropertyWriter9.getMetadata();
        java.lang.Object obj25 = beanPropertyWriter5.getInternalSetting((java.lang.Object) beanPropertyWriter9);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = null;
        beanPropertyWriter5.assignSerializer(objJsonSerializer26);
        java.lang.Class<?>[] wildcardClassArray28 = beanPropertyWriter5.getViews();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(javaType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(javaType11);
        org.junit.Assert.assertNull(annotations14);
        org.junit.Assert.assertNull(javaType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(annotatedMember21);
        org.junit.Assert.assertNull(propertyMetadata24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(wildcardClassArray28);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer5 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer5);
        com.fasterxml.jackson.core.io.SerializedString serializedString7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString7);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = beanPropertyWriter8.getTypeSerializer();
        java.lang.Object obj10 = beanPropertyWriter8._suppressableValue;
        java.lang.Object obj11 = beanPropertyWriter8._suppressableValue;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(typeSerializer9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = beanPropertyWriter6.removeInternalSetting(obj7);
        java.lang.reflect.Type type9 = beanPropertyWriter6.getGenericPropertyType();
        java.lang.Object obj10 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) type9);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter11 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean12 = beanPropertyWriter11.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString13 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter11, serializedString13);
        java.lang.reflect.Type type15 = beanPropertyWriter14.getGenericPropertyType();
        java.lang.Object obj17 = beanPropertyWriter14.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType18 = beanPropertyWriter14._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter19 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = null;
        beanPropertyWriter19._serializer = objJsonSerializer20;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer22 = null;
        beanPropertyWriter19._typeSerializer = typeSerializer22;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter24 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean25 = beanPropertyWriter24._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType26 = beanPropertyWriter24.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString27 = beanPropertyWriter24.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector28 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value29 = beanPropertyWriter24.findFormatOverrides(annotationIntrospector28);
        com.fasterxml.jackson.annotation.JsonFormat.Value value30 = null;
        beanPropertyWriter24._format = value30;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter24.assignNullSerializer(objJsonSerializer32);
        java.lang.Object obj34 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter19, (java.lang.Object) beanPropertyWriter24);
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector35 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value36 = beanPropertyWriter19.findFormatOverrides(annotationIntrospector35);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter37 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean38 = beanPropertyWriter37._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType39 = beanPropertyWriter37.getSerializationType();
        boolean boolean40 = beanPropertyWriter37.hasNullSerializer();
        boolean boolean41 = beanPropertyWriter37.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap42 = beanPropertyWriter37._internalSettings;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter43 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean44 = beanPropertyWriter43.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString45 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter46 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter43, serializedString45);
        java.lang.reflect.Type type47 = beanPropertyWriter46.getGenericPropertyType();
        java.lang.Object obj49 = beanPropertyWriter46.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType50 = beanPropertyWriter46._declaredType;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter51 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter46);
        java.lang.Object obj52 = beanPropertyWriter37.getInternalSetting((java.lang.Object) beanPropertyWriter46);
        java.lang.Object obj53 = beanPropertyWriter37._suppressableValue;
        java.lang.reflect.Method method54 = beanPropertyWriter37._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter55 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean56 = beanPropertyWriter55.willSuppressNulls();
        java.lang.reflect.Method method57 = beanPropertyWriter55._accessorMethod;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter58 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean59 = beanPropertyWriter58._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType60 = beanPropertyWriter58.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap61 = null;
        beanPropertyWriter58._internalSettings = objMap61;
        com.fasterxml.jackson.databind.util.Annotations annotations63 = beanPropertyWriter58._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType64 = beanPropertyWriter58._cfgSerializationType;
        java.lang.Object obj65 = beanPropertyWriter58._suppressableValue;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer66 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter67 = beanPropertyWriter58.unwrappingWriter(nameTransformer66);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter68 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean69 = beanPropertyWriter68.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString70 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter71 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter68, serializedString70);
        java.lang.Object obj73 = beanPropertyWriter68.removeInternalSetting((java.lang.Object) (byte) -1);
        com.fasterxml.jackson.core.io.SerializedString serializedString74 = beanPropertyWriter68._name;
        java.lang.Object obj75 = beanPropertyWriter55.setInternalSetting((java.lang.Object) nameTransformer66, (java.lang.Object) beanPropertyWriter68);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata76 = beanPropertyWriter55.getMetadata();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap77 = beanPropertyWriter55._internalSettings;
        beanPropertyWriter37._internalSettings = objMap77;
        beanPropertyWriter19._internalSettings = objMap77;
        com.fasterxml.jackson.core.io.SerializedString serializedString80 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter81 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter19, serializedString80);
        com.fasterxml.jackson.databind.PropertyName propertyName82 = beanPropertyWriter19._wrapperName;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = beanPropertyWriter19.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(type9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(type15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(javaType18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(javaType26);
        org.junit.Assert.assertNull(serializableString27);
        org.junit.Assert.assertNull(value29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(value36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(javaType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(objMap42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(type47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(javaType50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(method54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(method57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(javaType60);
        org.junit.Assert.assertNull(annotations63);
        org.junit.Assert.assertNull(javaType64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(beanPropertyWriter67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(serializedString74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(propertyMetadata76);
        org.junit.Assert.assertNotNull(objMap77);
        org.junit.Assert.assertNull(propertyName82);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.util.Annotations annotations6 = beanPropertyWriter0._contextAnnotations;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = beanPropertyWriter0.setInternalSetting(obj7, obj8);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean11 = beanPropertyWriter10._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName12 = beanPropertyWriter10._wrapperName;
        com.fasterxml.jackson.annotation.JsonFormat.Value value13 = beanPropertyWriter10._format;
        java.lang.Object obj14 = beanPropertyWriter0.getInternalSetting((java.lang.Object) value13);
        com.fasterxml.jackson.databind.PropertyName propertyName15 = beanPropertyWriter0._wrapperName;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = beanPropertyWriter0.getSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer17 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor jsonObjectFormatVisitor19 = null;
        beanPropertyWriter0.depositSchemaProperty(jsonObjectFormatVisitor19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNull(annotations6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(propertyName12);
        org.junit.Assert.assertNull(value13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(propertyName15);
        org.junit.Assert.assertNull(objJsonSerializer16);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap3 = null;
        beanPropertyWriter0._internalSettings = objMap3;
        com.fasterxml.jackson.databind.util.Annotations annotations5 = beanPropertyWriter0._contextAnnotations;
        com.fasterxml.jackson.databind.JavaType javaType6 = beanPropertyWriter0._cfgSerializationType;
        boolean boolean7 = beanPropertyWriter0.hasSerializer();
        com.fasterxml.jackson.annotation.JsonFormat.Value value8 = null;
        beanPropertyWriter0._format = value8;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer10 = null;
        beanPropertyWriter0.assignTypeSerializer(typeSerializer10);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember12 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = null;
        beanPropertyWriter0._serializer = objJsonSerializer13;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean16 = beanPropertyWriter15._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType17 = beanPropertyWriter15.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap18 = null;
        beanPropertyWriter15._internalSettings = objMap18;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer20 = null;
        beanPropertyWriter15.assignTypeSerializer(typeSerializer20);
        com.fasterxml.jackson.annotation.JsonFormat.Value value22 = beanPropertyWriter15._format;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter23 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean24 = beanPropertyWriter23._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName25 = beanPropertyWriter23._wrapperName;
        java.lang.Object obj26 = beanPropertyWriter23.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer27 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter28 = beanPropertyWriter23.unwrappingWriter(nameTransformer27);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter29 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter28);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer30 = null;
        beanPropertyWriter28._typeSerializer = typeSerializer30;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer32 = null;
        beanPropertyWriter28.assignSerializer(objJsonSerializer32);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap34 = beanPropertyWriter28._dynamicSerializers;
        beanPropertyWriter15._dynamicSerializers = propertySerializerMap34;
        com.fasterxml.jackson.annotation.JsonFormat.Value value36 = null;
        beanPropertyWriter15._format = value36;
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = beanPropertyWriter0.setInternalSetting((java.lang.Object) beanPropertyWriter15, obj38);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer40 = null;
        beanPropertyWriter15._nullSerializer = objJsonSerializer40;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotations5);
        org.junit.Assert.assertNull(javaType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(annotatedMember12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(javaType17);
        org.junit.Assert.assertNull(value22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(propertyName25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(beanPropertyWriter28);
        org.junit.Assert.assertNotNull(propertySerializerMap34);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString2 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter3 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString2);
        java.lang.reflect.Type type4 = beanPropertyWriter3.getGenericPropertyType();
        com.fasterxml.jackson.annotation.JsonFormat.Value value5 = null;
        beanPropertyWriter3._format = value5;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter8 = beanPropertyWriter3.unwrappingWriter(nameTransformer7);
        boolean boolean9 = beanPropertyWriter3.isVirtual();
        com.fasterxml.jackson.core.SerializableString serializableString10 = beanPropertyWriter3.getSerializedName();
        java.lang.Object obj12 = beanPropertyWriter3.removeInternalSetting((java.lang.Object) (byte) 10);
        java.lang.reflect.Method method13 = null;
        beanPropertyWriter3._accessorMethod = method13;
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector15 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value16 = beanPropertyWriter3.findFormatOverrides(annotationIntrospector15);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = null;
        beanPropertyWriter3._nullSerializer = objJsonSerializer17;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(type4);
        org.junit.Assert.assertNotNull(beanPropertyWriter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(serializableString10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(value16);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap propertySerializerMap6 = beanPropertyWriter5._dynamicSerializers;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean8 = beanPropertyWriter7._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType9 = beanPropertyWriter7.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap10 = beanPropertyWriter7._internalSettings;
        java.lang.Object obj11 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) objMap10);
        com.fasterxml.jackson.databind.PropertyMetadata propertyMetadata12 = beanPropertyWriter5._metadata;
        boolean boolean13 = beanPropertyWriter5.hasSerializer();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer14 = beanPropertyWriter5.getTypeSerializer();
        java.lang.Object obj15 = beanPropertyWriter5._suppressableValue;
        java.lang.Class<?> wildcardClass16 = beanPropertyWriter5.getRawSerializationType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = beanPropertyWriter5.getSerializer();
        java.lang.reflect.Field field18 = beanPropertyWriter5._field;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertNotNull(propertySerializerMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(javaType9);
        org.junit.Assert.assertNull(objMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(propertyMetadata12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typeSerializer14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(objJsonSerializer17);
        org.junit.Assert.assertNull(field18);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName2 = beanPropertyWriter0._wrapperName;
        java.lang.Object obj3 = beanPropertyWriter0.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter5 = beanPropertyWriter0.unwrappingWriter(nameTransformer4);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter5);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer7 = null;
        beanPropertyWriter5._typeSerializer = typeSerializer7;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter9 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean10 = beanPropertyWriter9._suppressNulls;
        com.fasterxml.jackson.databind.PropertyName propertyName11 = beanPropertyWriter9._wrapperName;
        java.lang.Object obj12 = beanPropertyWriter9.readResolve();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter14 = beanPropertyWriter9.unwrappingWriter(nameTransformer13);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter14);
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer16 = null;
        beanPropertyWriter14._typeSerializer = typeSerializer16;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = null;
        beanPropertyWriter14.assignSerializer(objJsonSerializer18);
        java.lang.Object obj20 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter14);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter21 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean22 = beanPropertyWriter21._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType23 = beanPropertyWriter21.getSerializationType();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap24 = null;
        beanPropertyWriter21._internalSettings = objMap24;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer26 = null;
        beanPropertyWriter21.assignTypeSerializer(typeSerializer26);
        java.lang.Class<?>[] wildcardClassArray28 = beanPropertyWriter21.getViews();
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer29 = null;
        beanPropertyWriter21.assignTypeSerializer(typeSerializer29);
        java.lang.Object obj31 = beanPropertyWriter5.removeInternalSetting((java.lang.Object) beanPropertyWriter21);
        boolean boolean32 = beanPropertyWriter21.hasSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(propertyName2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(beanPropertyWriter5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(propertyName11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(beanPropertyWriter14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(javaType23);
        org.junit.Assert.assertNull(wildcardClassArray28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.JavaType javaType5 = beanPropertyWriter0._nonTrivialBaseType;
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter7 = beanPropertyWriter0.unwrappingWriter(nameTransformer6);
        boolean boolean8 = beanPropertyWriter0.isVirtual();
        java.util.HashMap<java.lang.Object, java.lang.Object> objMap9 = beanPropertyWriter0._internalSettings;
        com.fasterxml.jackson.annotation.JsonFormat.Value value10 = beanPropertyWriter0._format;
        com.fasterxml.jackson.databind.node.ObjectNode objectNode11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            beanPropertyWriter0.depositSchemaProperty(objectNode11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(javaType5);
        org.junit.Assert.assertNotNull(beanPropertyWriter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(objMap9);
        org.junit.Assert.assertNull(value10);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType2 = beanPropertyWriter0.getSerializationType();
        com.fasterxml.jackson.core.io.SerializedString serializedString3 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter4 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter0, serializedString3);
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = beanPropertyWriter4._member;
        com.fasterxml.jackson.core.SerializableString serializableString6 = beanPropertyWriter4.getSerializedName();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = null;
        beanPropertyWriter4._serializer = objJsonSerializer7;
        com.fasterxml.jackson.databind.PropertyName propertyName9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter10 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter4, propertyName9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(javaType2);
        org.junit.Assert.assertNull(annotatedMember5);
        org.junit.Assert.assertNull(serializableString6);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter0 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean1 = beanPropertyWriter0.willSuppressNulls();
        java.lang.reflect.Method method2 = beanPropertyWriter0._accessorMethod;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer3 = beanPropertyWriter0._typeSerializer;
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember4 = beanPropertyWriter0.getMember();
        com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedMember5 = beanPropertyWriter0._member;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter6 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean7 = beanPropertyWriter6._suppressNulls;
        com.fasterxml.jackson.databind.JavaType javaType8 = beanPropertyWriter6.getSerializationType();
        com.fasterxml.jackson.core.SerializableString serializableString9 = beanPropertyWriter6.getSerializedName();
        com.fasterxml.jackson.databind.AnnotationIntrospector annotationIntrospector10 = null;
        com.fasterxml.jackson.annotation.JsonFormat.Value value11 = beanPropertyWriter6.findFormatOverrides(annotationIntrospector10);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter12 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter();
        boolean boolean13 = beanPropertyWriter12.willSuppressNulls();
        com.fasterxml.jackson.core.io.SerializedString serializedString14 = null;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter beanPropertyWriter15 = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter(beanPropertyWriter12, serializedString14);
        java.lang.reflect.Type type16 = beanPropertyWriter15.getGenericPropertyType();
        java.lang.Object obj18 = beanPropertyWriter15.removeInternalSetting((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.JavaType javaType19 = beanPropertyWriter15._declaredType;
        java.lang.Object obj20 = com.fasterxml.jackson.databind.ser.BeanPropertyWriter.MARKER_FOR_EMPTY;
        java.lang.Object obj21 = beanPropertyWriter6.setInternalSetting((java.lang.Object) javaType19, obj20);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = null;
        beanPropertyWriter6.assignSerializer(objJsonSerializer22);
        java.lang.reflect.Method method24 = null;
        beanPropertyWriter6._accessorMethod = method24;
        com.fasterxml.jackson.databind.util.Annotations annotations26 = beanPropertyWriter6._contextAnnotations;
        java.lang.Object obj27 = beanPropertyWriter0.removeInternalSetting((java.lang.Object) annotations26);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer28 = null;
        beanPropertyWriter0._serializer = objJsonSerializer28;
        com.fasterxml.jackson.databind.PropertyName propertyName30 = beanPropertyWriter0.getWrapperName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = propertyName30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(typeSerializer3);
        org.junit.Assert.assertNull(annotatedMember4);
        org.junit.Assert.assertNull(annotatedMember5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(javaType8);
        org.junit.Assert.assertNull(serializableString9);
        org.junit.Assert.assertNull(value11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(javaType19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY + "'", obj20.equals(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(annotations26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(propertyName30);
    }
}

